package com.company;

import java.io.FileReader;
import com.google.gson.JsonParser;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import com.google.gson.JsonPrimitive;
import java.util.Map.Entry;

public class LeerJson {

    public static void dumpJSONElement(JsonElement element){

        if (element.isJsonObject()) {
            System.out.println("Is an object");
            JsonObject obj = element.getAsJsonObject();
            java.util.Set<java.util.Map.Entry<String,JsonElement>> entries = obj.entrySet();
            java.util.Iterator<java.util.Map.Entry<String,JsonElement>> iter = entries.iterator();
            while (iter.hasNext()) {
                java.util.Map.Entry<String,JsonElement> entry = iter.next();
                System.out.println("Key: " + entry.getKey());
                System.out.println("Value:");
                dumpJSONElement(entry.getValue());
            }

        } else if (element.isJsonArray()) {
            JsonArray array = element.getAsJsonArray();
            System.out.println("Is an array. Number of values: " + array.size());
            java.util.Iterator<JsonElement> iter = array.iterator();
            while (iter.hasNext()) {
                JsonElement entry = iter.next();
                dumpJSONElement(entry);
            }
        } else if (element.isJsonPrimitive()) {
            System.out.println("Is a primitive");
            JsonPrimitive value = element.getAsJsonPrimitive();
            if (value.isBoolean()) {
                System.out.println("Is boolean: " + value.getAsBoolean());
            } else if (value.isNumber()) {
                System.out.println("Is number: " + value.getAsNumber());
            } else if (value.isString()) {
                System.out.println("Is text string: " + value.getAsString());
            }
        } else if (element.isJsonNull()) {
            System.out.println("Is NULL");
        } else {
            System.out.println("Error. Unknown type of element");
        }

    }

    LeerJson() throws java.io.IOException {
        JsonParser parser = new JsonParser();
        FileReader input_file = new FileReader("./Archivos_entrada/personal.json");
        JsonElement datos = parser.parse(input_file);
        dumpJSONElement(datos);
    }




}
