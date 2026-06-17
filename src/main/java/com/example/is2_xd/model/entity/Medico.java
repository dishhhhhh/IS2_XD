package com.example.is2_xd.model.entity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "medico")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Medico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMedico;

    @Column(unique = true)
    private Integer numeroCmp;

    private String nombres;

    private String apellidos;

    private String especialidad;
}
