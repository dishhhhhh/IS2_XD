package com.example.is2_xd.model.entity;
import com.example.is2_xd.model.enums.EstadoCita;
import java.util.Date;

public class CitaMedica {
    private int id_cita_medica;
    private Date fecha_registro;
    private EstadoCita estado_cita;

    public void CitaMedica(int a, Date b, EstadoCita c) {
        this.id_cita_medica = a;
        this.fecha_registro = b;
        this.estado_cita = c;
    }
}


