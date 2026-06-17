package com.example.is2_xd.model.entity;
import com.example.is2_xd.model.enums.EstadoCobertura;
import com.example.is2_xd.model.enums.TipoSeguro;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "seguro_medico")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SeguroMedico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idSeguroMedico;

    @Enumerated(EnumType.STRING)
    private EstadoCobertura estadoCobertura;

    @Enumerated(EnumType.STRING)
    private TipoSeguro tipoSeguro;
}
