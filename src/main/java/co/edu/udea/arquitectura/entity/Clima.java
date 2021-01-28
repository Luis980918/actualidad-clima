package co.edu.udea.arquitectura.entity;

import javax.persistence.*;


@Entity
@Table(name="clima")
public class Clima {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column
    private String temperatura;


    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="fk_TipoTemperatura", insertable=false, updatable=false)
    private TipoTemperatura fkTipoTemperatura;

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

    public TipoTemperatura getFkTipoTemperatura() {
        return fkTipoTemperatura;
    }

    public void setFkTipoTemperatura(TipoTemperatura fkTipoTemperatura) {
        this.fkTipoTemperatura = fkTipoTemperatura;
    }
}
