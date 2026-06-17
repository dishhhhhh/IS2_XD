package com.example.is2_xd.repository;
import com.example.is2_xd.model.entity.DisponibilidadMedica;
import com.example.is2_xd.model.entity.Medico;
import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDate;
import java.util.List;

public interface DisponibilidadRepository extends JpaRepository<DisponibilidadMedica, Long> {
    List<DisponibilidadMedica> findByMedico(Medico medico);
    List<DisponibilidadMedica> findByFechaTurno(LocalDate fecha);
}
