package com.example.is2_xd.repository;
import com.example.is2_xd.model.entity.Medico;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface MedicoRepository extends JpaRepository<Medico, Long> {
    List<Medico> findByEspecialidad(String especialidad);
}
