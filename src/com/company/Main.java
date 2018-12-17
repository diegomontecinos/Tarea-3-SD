package com.company;

//imports
import sun.font.TrueTypeFont;


import java.io.IOException;
import java.util.ArrayList;





public class Main {

    public int algoritmo_bully(ArrayList<Medico> mejores_medicos){ //diego

        int id = 0;
        int mayor_exp = 0;
        int estudios = 0;
        for (int i = 0; i < mejores_medicos.size(); i++){

            if ( mejores_medicos.get(i).experiencia > mayor_exp){

                mayor_exp = mejores_medicos.get(i).experiencia;
                estudios = mejores_medicos.get(i).estudios;
                id = mejores_medicos.get(i).id;
            }

            else if (mejores_medicos.get(i).experiencia == mayor_exp ){

                if (mejores_medicos.get(i).estudios > estudios){
                    estudios = mejores_medicos.get(i).estudios;
                    id = mejores_medicos.get(i).id;
                }
            }

        }
        return id;
    }

    public  int establecler_comunicacion(){
    return 0;
    }





    public static void main(String[] args) {

        boolean programa = true;

        ArrayList<Medico> lista_medicos = new ArrayList<Medico>();
        ArrayList<Enfermero> lista_enfermeros = new ArrayList<Enfermero>();
        ArrayList<Paramedico> lista_paramedicos = new ArrayList<Paramedico>();

        try {
            LeerJson leerJson = new LeerJson();
        } catch (IOException e) {
            e.printStackTrace();
        }

        /*
        //leer archivo Json

        while (programa){

            boolean comunicacion = false;

            //establecer comunicacion



            while (comunicacion){

                //hacer lo demas

            }
            */

        }

    }

