/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pre_p3;


import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 *
 * @author Fernanda
 */
public class Controle {
    public void lerJSON(String arquivo) throws org.json.simple.parser.ParseException{
    JSONParser jsonParser = new JSONParser();

        try (FileReader reader = new FileReader(arquivo)) {
            Object obj = jsonParser.parse(reader);

            JSONArray cervejasLista = (JSONArray) obj;

            for (Object cervejaObj : cervejasLista) {
                if (cervejaObj instanceof JSONObject) {
                    parseCerveja((JSONObject) cervejaObj);
                }
            }
        } catch (IOException | org.json.simple.parser.ParseException e) {
            e.printStackTrace();
        }
    }

    private static void parseCerveja(JSONObject cerveja) {
        System.out.println("Name: "+cerveja.get("name"));
        System.out.println("Tagline: "+cerveja.get("tagline"));
        System.out.println("First_brewed: "+cerveja.get("first_brewed"));
        System.out.println("Description: "+cerveja.get("description"));
        System.out.println("\n");
    }
}
