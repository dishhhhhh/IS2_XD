package com.example.is2_xd.service.impl;
import com.example.is2_xd.model.entity.Paciente;
import com.example.is2_xd.repository.PacienteRepository;
import com.example.is2_xd.service.PacienteService;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PacienteServiceImpl implements PacienteService {

    private final PacienteRepository pacienteRepository;

    public PacienteServiceImpl(PacienteRepository pacienteRepository) {
        this.pacienteRepository = pacienteRepository;
    }

    @Override
    public List<Paciente> listarTodos() {
        return pacienteRepository.findAll();
    }

    @Override
    public Paciente buscarPorId(Integer id) {
        return pacienteRepository.findById(Long.valueOf(id)).orElse(null);
    }

    @Override
    public Paciente guardar(Paciente paciente) {
        return pacienteRepository.save(paciente);
    }

    @Override
    public void eliminar(Integer id) {
        pacienteRepository.deleteById(Long.valueOf(id));
    }
}
