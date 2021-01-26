package co.edu.udea.arquitectura.modelo;

import co.edu.udea.arquitectura.entity.Usuario;

import javax.validation.constraints.NotNull;

public class SuscripcionDTO {

    private Long id;
    @NotNull
    private String estado;
    @NotNull
    private Usuario fk_usuario;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Usuario getFk_usuario() {
        return fk_usuario;
    }

    public void setFk_usuario(Usuario fk_usuario) {
        this.fk_usuario = fk_usuario;
    }
}
