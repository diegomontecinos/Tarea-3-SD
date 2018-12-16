package com.company;

import java.util.ArrayList;

public class Paciente {

    String nombre;
    int edad;
    String rut;
    ArrayList<Enfermedad> lista_enfermedades = new ArrayList<Enfermedad>();
    ArrayList<Tratamiento> lista_tratamientos = new ArrayList<Tratamiento>();
    ArrayList<Examen> lista_examenes = new ArrayList<Examen>();
    ArrayList<Medicamento> lista_medicamentos = new ArrayList<Medicamento>();
    Paciente(String name, int age, String r, ArrayList<Enfermedad> l_enf, ArrayList<Tratamiento> l_trat, ArrayList<Examen> l_exam, ArrayList<Medicamento> l_med){

        this.nombre = name;
        this.edad = age;
        this.rut = rut;
        this.lista_enfermedades = l_enf;
        this.lista_tratamientos = l_trat;
        this.lista_examenes = l_exam;
        this.lista_medicamentos = l_med;
    }
}
