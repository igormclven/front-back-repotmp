package co.com.censo.poblacion.service;

import co.com.censo.poblacion.model.Departamento;
import co.com.censo.poblacion.repository.DepartamentoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DepartamentoServiceImplementacion implements DepartamentoService {
    @Autowired
    private DepartamentoRepository departamentoRepository;

    @Override
    public List<Departamento> Listar() {
        return departamentoRepository.findAll();
    }

    @Override
    public Optional<Departamento> listarId(Long id_departamento) {
        return departamentoRepository.findById(id_departamento);
    }


}
