package co.com.censo.poblacion.repository;

import co.com.censo.poblacion.model.InformacionPoblacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InformacionPoblacionRepository extends JpaRepository<InformacionPoblacion, Long> {
}
