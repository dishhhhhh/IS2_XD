package com.example.is2_xd.model.entity;

public class Medico {
    private int id_medico;
    private int numero_cmp;
    private String nombres;
    private String apellidos;
    private String especialidad;

    public void Medico(int a, int b, String c, String d, String e) {
        this.id_medico = a;
        this.numero_cmp = b;
        this.nombres = c;
        this.apellidos = d;
        this.especialidad = e;
    }
}
