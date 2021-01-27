package co.edu.udea.arquitectura.repository;

import co.edu.udea.arquitectura.entity.SuscripcionPorCiudad;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SuscripcionPorCiudadRepository extends JpaRepository<SuscripcionPorCiudad, Long> {
    Optional<SuscripcionPorCiudad> findById(Long id);
}
