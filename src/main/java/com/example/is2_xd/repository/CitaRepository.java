package com.example.is2_xd.repository;
import com.example.is2_xd.model.entity.CitaMedica;
import com.example.is2_xd.model.entity.Medico;
import com.example.is2_xd.model.entity.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CitaRepository extends JpaRepository<CitaMedica, Integer> {
    List<CitaMedica> findByPaciente(Paciente paciente);
}