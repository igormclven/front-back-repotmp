package co.com.censo.poblacion.service;

import co.com.censo.poblacion.model.Municipio;
import co.com.censo.poblacion.repository.MunicipioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MunicipioServiceImplementacion implements MunicipioService {
    @Autowired
    private MunicipioRepository municipioRepository;

    @Override
    public List<Municipio> Listar() {
        return municipioRepository.findAll();
    }

    @Override
    public Optional<Municipio> listarId(Long id_municipio) {
        return municipioRepository.findById(id_municipio);
    }
}
