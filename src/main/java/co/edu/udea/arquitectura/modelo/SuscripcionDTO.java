package co.edu.udea.arquitectura.modelo;

import co.edu.udea.arquitectura.entity.Usuario;

import javax.validation.constraints.NotNull;

public class SuscripcionDTO {

    private Long id;
    @NotNull
    private String estado;
    @NotNull
    private Long fkUsuario;

    private Usuario usuario;

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

    public Long getFkUsuario() {
        return fkUsuario;
    }

    public void setFkUsuario(Long fkUsuario) {
        this.fkUsuario = fkUsuario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
