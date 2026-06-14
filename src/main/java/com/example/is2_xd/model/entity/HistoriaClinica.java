package com.example.is2_xd.model.entity;

import com.example.is2_xd.model.enums.TipoSangre;
import java.time.LocalDate;

public class HistoriaClinica {
    private int id_historia_clinica;
    private String alergias;
    private TipoSangre tipo_sangre;
    private LocalDate fecha_creacion = LocalDate.now();
    private String antecedentes_familiares;

    public void HistoriaClinica(int a, String b, TipoSangre c, LocalDate d, String e) {
        this.id_historia_clinica = a;
        this.alergias = b;
        this.tipo_sangre = c;
        this.fecha_creacion = d;
        this.antecedentes_familiares = e;
    }
}
