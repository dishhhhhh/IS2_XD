package com.example.is2_xd.model.entity;
import com.example.is2_xd.model.enums.EstadoTurno;
import java.sql.Time;
import java.util.Date;

public class DisponibilidadMedica {
    private int id_disponibilidad_medica;
    private Date fecha_turno;
    private Time hora_inicio;
    private Time hora_fin;
    private EstadoTurno estado_turno;

    public void DisponibilidadMedica(int a, Date b, Time c, Time d, EstadoTurno e) {
        this.id_disponibilidad_medica = a;
        this.fecha_turno = b;
        this.hora_inicio = c;
        this.hora_fin = d;
        this.estado_turno = e;
    }
}

