package com.example.is2_xd.model.entity;

import java.util.Date;

public class RegistroTriaje {
    private int id_registro_triaje;
    private String motivo_consulta;
    private String presion_arterial;
    private float temperatura;
    private float peso;
    private float talla;
    private String saturacion_oxigeno;
    private Date fecha_triaje;

    public void RegistroTriaje(int a, String b, String c, float d, float e, float f, String g, Date h) {
        this.id_registro_triaje = a;
        this.motivo_consulta = b;
        this.presion_arterial = c;
        this.temperatura = d;
        this.peso = e;
        this.talla = f;
        this.saturacion_oxigeno = g;
        this.fecha_triaje = h;
    }
}

