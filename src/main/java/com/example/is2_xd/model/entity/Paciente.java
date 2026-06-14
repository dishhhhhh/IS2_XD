package com.example.is2_xd.model.entity;

import java.util.Date;

public class Paciente {
    private int id_paciente;
    private String nombre;
    private String apellidos;
    private String telefono;
    private String DNI;
    private Date fecha_nacimiento;
    private String correo;
    private int id_seguro_medico; //FK

    public void Paciente(int a, String b, String c, String d, String e, Date f, String g, int h) {
        this.id_paciente = a;
        this.nombre = b;
        this.apellidos = c;
        this.telefono = d;
        this.DNI = e;
        this.fecha_nacimiento = f;
        this.correo = g;
        this.id_seguro_medico = h;
    }

}
