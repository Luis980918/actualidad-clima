package co.edu.udea.arquitectura.modelo;

import co.edu.udea.arquitectura.entity.TipoTemperatura;
import co.edu.udea.arquitectura.entity.Usuario;

import javax.validation.constraints.NotNull;

public class ClimaDTO {
    private Long id;
    @NotNull
    private String temperatura;
    @NotNull
    private TipoTemperatura fk_TipoTemperatura;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }

    public TipoTemperatura getFk_TipoTemperatura() {
        return fk_TipoTemperatura;
    }

    public void setFk_TipoTemperatura(TipoTemperatura fk_TipoTemperatura) {
        this.fk_TipoTemperatura = fk_TipoTemperatura;
    }
}
