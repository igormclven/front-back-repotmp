package co.com.censo.poblacion.service;

import co.com.censo.poblacion.model.Municipio;

import java.util.List;
import java.util.Optional;

public interface MunicipioService {
    List<Municipio> Listar();

    Optional<Municipio> listarId(Long id_municipio);
}
