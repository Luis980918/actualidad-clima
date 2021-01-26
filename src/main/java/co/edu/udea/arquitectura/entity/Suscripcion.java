package co.edu.udea.arquitectura.entity;


import javax.persistence.*;

@Entity
@Table(name="suscripcion")
public class Suscripcion {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column
    private String estado;


    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="fk_usuario", insertable=false, updatable=false)
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
