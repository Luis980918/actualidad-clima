package co.edu.udea.arquitectura.modelo;

import co.edu.udea.arquitectura.entity.Ciudad;
import co.edu.udea.arquitectura.entity.Suscripcion;


import javax.validation.constraints.NotNull;

public class SuscripcionPorCiudadDTO {


    private Long id;

    @NotNull
    private Suscripcion fkSuscripcion;

    @NotNull
    private Ciudad fkCiudad;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Suscripcion getFkSuscripcion() {
        return fkSuscripcion;
    }

    public void setFkSuscripcion(Suscripcion fkSuscripcion) {
        this.fkSuscripcion = fkSuscripcion;
    }

    public Ciudad getFkCiudad() {
        return fkCiudad;
    }

    public void setFkCiudad(Ciudad fkCiudad) {
        this.fkCiudad = fkCiudad;
    }
}
