package co.com.censo.poblacion.service;

import co.com.censo.poblacion.dto.InformacionPoblacionDto;
import co.com.censo.poblacion.model.InformacionPoblacion;

import java.util.List;

public interface InformacionPoblacionService {
    List<InformacionPoblacionDto> Listar();

    List<InformacionPoblacionDto> listarId(Long id_registro);

    InformacionPoblacion agregar(InformacionPoblacion I);

    InformacionPoblacion editar(InformacionPoblacion I);

    String Eliminar(Long id_registro);
}
