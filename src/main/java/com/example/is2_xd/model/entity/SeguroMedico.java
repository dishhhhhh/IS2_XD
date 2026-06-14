package com.example.is2_xd.model.entity;
import com.example.is2_xd.model.enums.EstadoCobertura;
import com.example.is2_xd.model.enums.TipoSeguro;

public class SeguroMedico {
    private int id_seguro_medico;
    private EstadoCobertura estado_cobertura;
    private TipoSeguro tipo_seguro;

    public void SeguroMedico(int a, EstadoCobertura b, TipoSeguro c) {
        this.id_seguro_medico = a;
        this.estado_cobertura = b;
        this.tipo_seguro = c;
    }
}
