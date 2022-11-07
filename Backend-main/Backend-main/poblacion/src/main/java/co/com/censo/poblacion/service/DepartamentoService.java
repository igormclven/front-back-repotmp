package co.com.censo.poblacion.service;

import co.com.censo.poblacion.model.Departamento;

import java.util.List;
import java.util.Optional;

public interface DepartamentoService {
    List<Departamento> Listar();

    Optional<Departamento> listarId(Long id_departamento);
}
