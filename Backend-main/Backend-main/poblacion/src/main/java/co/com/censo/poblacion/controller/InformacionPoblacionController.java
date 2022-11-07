package co.com.censo.poblacion.controller;

import co.com.censo.poblacion.dto.InformacionPoblacionDto;
import co.com.censo.poblacion.model.InformacionPoblacion;
import co.com.censo.poblacion.service.InformacionPoblacionServiceImplementacion;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:4200/")
public class InformacionPoblacionController {
    @Autowired
    private final InformacionPoblacionServiceImplementacion informacionPoblacionServiceImplementacion;

    @GetMapping("/listarInformacionPoblacion")
    public List<InformacionPoblacionDto> listarInformacion() {
        return informacionPoblacionServiceImplementacion.Listar();
    }

    @GetMapping("/listarInformacionPoblacion/{id_registro}")
    public List<InformacionPoblacionDto> listarInformacionPoblacionId(@PathVariable("id_registro") Long id_registro) {
        return informacionPoblacionServiceImplementacion.listarId(id_registro);
    }

    @PostMapping("/crearInformacionPoblacion")
    public ResponseEntity<InformacionPoblacion> crearInformacionPoblacion(@RequestBody InformacionPoblacion I) {
        //Validación del Request Body
        if (I.getPoblacion_m_rural() == null || I.getPoblacion_h_rural() == null || I.getPoblacion_m_urb() == null
                || I.getPoblacion_h_urb() == null || I.getCodigo_municipio() == null)
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        else {
            return new ResponseEntity<>(informacionPoblacionServiceImplementacion.agregar(I), HttpStatus.CREATED);
        }

    }

    @GetMapping("/EliminarInformacionPoblacion/{id_registro}")
    public ResponseEntity<String> eliminarInformacionPoblacion(@PathVariable("id_registro") Long id_registro) {
        return new ResponseEntity<String>(informacionPoblacionServiceImplementacion.Eliminar(id_registro), HttpStatus.ACCEPTED);
    }
}
