package com.company;

import java.util.Iterator;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class lectura {
    public void Leer_Doc(ArrayList<Medico> doc, ArrayList<Enfermero> enf, ArrayList<Paramedico> par ) throws FileNotFoundException { //debe recibir la lista de doctores
        JSONParser parser = new JSONParser();
        try {
            Object obj = parser.parse(new FileReader("personal.json"));
            JSONObject jsonobj = (JSONObject) obj;

            JSONArray docArray = (JSONArray) jsonobj.get("Doctor");
            Iterator<String> iterator = docArray.iterator();

            while (iterator.hasNext()){
                JSONObject job = (JSONObject) iterator;
                int id = (int) job.get("id");
                String nombre = (String) job.get("nombre");
                String apellido = (String) job.get("apellido");
                int estudios = (int) job.get("estudios");
                int experiencia = (int) job.get("experiencia");

                Medico aux = new Medico(id,nombre,apellido,estudios,experiencia);
                doc.add(aux);
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }catch (ParseException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
