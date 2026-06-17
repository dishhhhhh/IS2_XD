package com.example.is2_xd.repository;
import com.example.is2_xd.model.entity.HistoriaClinica;
import com.example.is2_xd.model.entity.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface HistoriaClinicaRepository extends JpaRepository<HistoriaClinica, Long> {
    Optional<HistoriaClinica> findByPaciente(Paciente paciente);
}
