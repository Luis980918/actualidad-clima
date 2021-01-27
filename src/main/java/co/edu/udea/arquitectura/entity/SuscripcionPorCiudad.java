package co.edu.udea.arquitectura.entity;

import javax.persistence.*;

@Entity
@Table(name="estado")
public class SuscripcionPorCiudad {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="fk_suscripcion", nullable=false)
    private Suscripcion fkSuscripcion;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="fk_ciudad", nullable=false)
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
