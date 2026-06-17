package com.example.is2_xd.model.entity;
import java.util.Date;
import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "registro_triaje")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RegistroTriaje {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idRegistroTriaje;

    private String motivoConsulta;

    private String presionArterial;

    private Float temperatura;

    private Float peso;

    private Float talla;

    private String saturacionOxigeno;

    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaTriaje;

    @OneToOne
    @JoinColumn(name = "id_cita_medica")
    private CitaMedica citaMedica;
}

