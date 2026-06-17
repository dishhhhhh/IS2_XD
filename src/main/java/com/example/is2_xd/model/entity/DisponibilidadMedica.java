package com.example.is2_xd.model.entity;
import com.example.is2_xd.model.enums.EstadoTurno;
import java.sql.Time;
import java.util.Date;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "disponibilidad_medica")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DisponibilidadMedica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDisponibilidadMedica;

    @Temporal(TemporalType.DATE)
    private Date fechaTurno;

    private Time horaInicio;

    private Time horaFin;

    @Enumerated(EnumType.STRING)
    private EstadoTurno estadoTurno;

    @ManyToOne
    @JoinColumn(name = "id_medico")
    private Medico medico;
}

