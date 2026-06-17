package com.example.is2_xd.model.entity;
import com.example.is2_xd.model.enums.TipoSangre;
import java.time.LocalDate;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "historia_clinica")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class HistoriaClinica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idHistoriaClinica;

    private String alergias;

    @Enumerated(EnumType.STRING)
    private TipoSangre tipoSangre;

    private LocalDate fechaCreacion;

    private String antecedentesFamiliares;

    @OneToOne
    @JoinColumn(name = "id_paciente")
    private Paciente paciente;
}
