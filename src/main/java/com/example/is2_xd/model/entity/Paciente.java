package com.example.is2_xd.model.entity;
import java.util.Date;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "paciente")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPaciente;

    private String nombre;

    private String apellidos;

    private String telefono;

    @Column(unique = true)
    private String dni;

    @Temporal(TemporalType.DATE)
    private Date fechaNacimiento;

    private String correo;

    @ManyToOne
    @JoinColumn(name = "id_seguro_medico")
    private SeguroMedico seguroMedico;
}
