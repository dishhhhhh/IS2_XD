package com.example.is2_xd.service;
import com.example.is2_xd.model.entity.Paciente;
import java.util.List;

public interface PacienteService {

    List<Paciente> listarTodos();
    Paciente buscarPorId(Integer id);
    Paciente guardar(Paciente paciente);
    void eliminar(Integer id);
}
