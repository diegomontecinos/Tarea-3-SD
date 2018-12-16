package com.company;

import java.util.ArrayList;

public class Requerimientos {

    int tipo;
    int id_tipo;

    ArrayList<Paciente> lista_pacientes = new ArrayList<Paciente>();

    Requerimientos(int t, int id, ArrayList<Paciente> l_p){
        this.tipo = t;
        this.id_tipo = id;
        this.lista_pacientes = l_p;
    }


}
