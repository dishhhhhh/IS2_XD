package com.example.is2_xd.repository;
import com.example.is2_xd.model.entity.CitaMedica;
import com.example.is2_xd.model.entity.RegistroTriaje;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface TriajeRepository extends JpaRepository<RegistroTriaje, Long> {
    Optional<RegistroTriaje> findByCitaMedica(CitaMedica citaMedica);
}