package com.example.is2_xd.model.entity;
import com.example.is2_xd.model.enums.EstadoCita;
import java.util.Date;
import jakarta.persistence.*;

@Entity
@Table(name = "cita_medica")
public class CitaMedica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCitaMedica;

    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegistro;

    @Enumerated(EnumType.STRING)
    private EstadoCita estadoCita;

    @ManyToOne
    @JoinColumn(name = "id_paciente")
    private Paciente paciente;

    @ManyToOne
    @JoinColumn(name = "id_disponibilidad")
    private DisponibilidadMedica disponibilidadMedica;

    public CitaMedica() {
    }

    public CitaMedica(Date fechaRegistro, EstadoCita estadoCita) {
        this.fechaRegistro = fechaRegistro;
        this.estadoCita = estadoCita;
    }

    public Integer getIdCitaMedica() {
        return idCitaMedica;
    }

    public void setIdCitaMedica(Integer idCitaMedica) {
        this.idCitaMedica = idCitaMedica;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public EstadoCita getEstadoCita() {
        return estadoCita;
    }

    public void setEstadoCita(EstadoCita estadoCita) {
        this.estadoCita = estadoCita;
    }
}


