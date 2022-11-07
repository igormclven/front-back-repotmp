package co.com.censo.poblacion.service;

import co.com.censo.poblacion.dto.InformacionPoblacionDto;
import co.com.censo.poblacion.model.InformacionPoblacion;
import co.com.censo.poblacion.repository.InformacionPoblacionRepository;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class InformacionPoblacionServiceImplementacion implements InformacionPoblacionService {

    @Autowired
    private final InformacionPoblacionRepository informacionPoblacionRepository;

    @Override
    public List<InformacionPoblacionDto> Listar() {
        return informacionPoblacionRepository.findAll()
                .stream()
                .map(this::convertir).collect(Collectors.toList());
    }

    private InformacionPoblacionDto convertir(InformacionPoblacion info) {

        InformacionPoblacionDto iDto = new InformacionPoblacionDto();
        iDto.setId_registro(info.getId_registro());

        iDto.setPoblacion_mujeres_urb(info.getPoblacion_m_urb());
        iDto.setPoblacion_mujeres_rural(info.getPoblacion_m_rural());

        iDto.setPoblacion_hombres_rural(info.getPoblacion_h_rural());
        iDto.setPoblacion_hombres_urb(info.getPoblacion_h_urb());

        iDto.setPoblacion_rural(info.getPoblacion_h_rural() + info.getPoblacion_m_rural());
        iDto.setPoblacion_urbana(info.getPoblacion_h_urb() + info.getPoblacion_m_urb());

        iDto.setCodigo_municipio(info.getCodigo_municipio());

        long poblacion_total = (info.getPoblacion_m_urb() + info.getPoblacion_h_urb()
                + info.getPoblacion_m_rural() + info.getPoblacion_h_rural());
        iDto.setTotal_poblacion(poblacion_total);

        double porcentajeR;
        porcentajeR = poblacion_total > 0 ? (double) ((info.getPoblacion_m_rural() + info.getPoblacion_h_rural()) * 100) / poblacion_total : 0;
        iDto.setPorcentaje_rural(porcentajeR);

        double porcentajeU;
        porcentajeU = poblacion_total > 0 ? (double) ((info.getPoblacion_m_urb() + info.getPoblacion_h_urb()) * 100) / poblacion_total : 0;
        iDto.setPorcentaje_urbana(porcentajeU);

        String categoria = "";
        if (porcentajeU >= 60) {
            categoria = "Urbana";
        }
        if (porcentajeU >= 40 && porcentajeU < 60) {
            categoria = "Semi urbana";
        }
        if (porcentajeU < 40) {
            categoria = "Rural";
        }
        iDto.setCategoria_municipio(categoria);

        iDto.setFecha(info.getFecha());

        return iDto;
    }

    @Override
    public List<InformacionPoblacionDto> listarId(Long id_registro) {
        return informacionPoblacionRepository.findById(id_registro).stream()
                .map(this::convertir).collect(Collectors.toList());
    }

    @Override
    public InformacionPoblacion agregar(InformacionPoblacion I) {
        return informacionPoblacionRepository.save(I);
    }


    @Override
    public InformacionPoblacion editar(InformacionPoblacion I) {
        return null;
    }

    @Override
    public String Eliminar(Long id_registro) {
        informacionPoblacionRepository.deleteById(id_registro);
        return "Eliminado";
    }
}