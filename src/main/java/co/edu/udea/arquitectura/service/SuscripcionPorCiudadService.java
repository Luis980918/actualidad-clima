package co.edu.udea.arquitectura.service;

import co.edu.udea.arquitectura.entity.Estado;
import co.edu.udea.arquitectura.entity.SuscripcionPorCiudad;
import co.edu.udea.arquitectura.exception.BusinessException;
import co.edu.udea.arquitectura.repository.SuscripcionPorCiudadRepository;
import co.edu.udea.arquitectura.util.Messages;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Objects;
import java.util.Optional;

@Service
@Transactional
public class SuscripcionPorCiudadService {
    private final SuscripcionPorCiudadRepository suscripcionPorCiudadRepository;
    private final Messages messages;

    public SuscripcionPorCiudadService(SuscripcionPorCiudadRepository suscripcionPorCiudadRepository, Messages messages) {
        this.suscripcionPorCiudadRepository = suscripcionPorCiudadRepository;
        this.messages = messages;
    }

    public SuscripcionPorCiudad guardarSuscripcion(SuscripcionPorCiudad suscripcionPorCiudad){
        Optional<SuscripcionPorCiudad> suscripcionPorCiudadConsulta=suscripcionPorCiudadRepository.findById(suscripcionPorCiudad.getId());
        if(suscripcionPorCiudadConsulta.isPresent()){
            throw new BusinessException(messages.get("suscripcion.id.duplicado"));
        }
        return suscripcionPorCiudadRepository.save(suscripcionPorCiudad);
    }

    public SuscripcionPorCiudad actualizarSuscripcionPorCiudad(SuscripcionPorCiudad suscripcionPorCiudad) {
        if (Objects.isNull(suscripcionPorCiudad.getId())) {
            throw new BusinessException(messages.get("suscripcion.id.vacio"));
        }
        consultarPorId(suscripcionPorCiudad.getId());
        return suscripcionPorCiudadRepository.save(suscripcionPorCiudad);
    }

    public SuscripcionPorCiudad consultarPorId(Long id) {
        return suscripcionPorCiudadRepository.findById(id).orElseThrow(
                () -> new BusinessException(messages.get("estado.id.no_encontrado")));
    }

    public void eliminarSuscripcion(Long id) {
        consultarPorId(id);
        suscripcionPorCiudadRepository.deleteById(id);
    }
}
