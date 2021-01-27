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
    private Usuario fkUsuario;

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
        return fkUsuario;
    }

    public void setFkUsuario(Usuario fkUsuario) {
        this.fkUsuario = fkUsuario;
    }
}
