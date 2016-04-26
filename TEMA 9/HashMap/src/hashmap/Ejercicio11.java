/*
 * Realiza un programa que escoja al azar 5 palabras en español del mini-diccionario del
 * ejercicio anterior. El programa irá pidiendo que el usuario teclee la traducción al inglés
 * de cada una de las palabras y comprobará si son correctas. Al final, el programa deberá
 * mostrar cuántas respuestas son válidas y cuántas erróneas.
 */
package hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author eliana
 */
public class Ejercicio11 {
    public static void main(String[] args) {
        System.out.println("Este programa evalua tu nivel de inglés.");
        ArrayList<String> claves = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        int respuestasBien = 0;
        int respuestasMal = 0;
        //Crea el diccionario
        HashMap<String, String> diccionario = creaDiccionario();        
        //Agrega todas las claves a un ArrayList
        for(Map.Entry pareja: diccionario.entrySet()) {
            claves.add((String)pareja.getKey());
        }
        //Muestra aleatoriamente las palabras y pide traducción
        System.out.println("Por favor, traduzca las siguientes palabras: ");
        for(int x = 0; x < 5; x++) {
            String palabra = claves.get((int)(Math.random() * (claves.size())));
            System.out.print("La traducción para " + palabra + " es: ");
            String traduccion = s.nextLine();
            claves.remove(palabra);
            //Corrobora la respuesta
            if(traduccion.equals(diccionario.get(palabra))){
                respuestasBien++;
            } else {
                respuestasMal++;
            }    
        }
        //Muestra el resultado
        System.out.println("Usted ha acertado " + respuestasBien + " palabras.");
        System.out.println("Usted ha fallado " + respuestasMal + " palabras.");   
    }
    
    //Funciones
    public static HashMap<String, String> creaDiccionario() {
        HashMap<String, String> diccionario = new HashMap<>();
        //Carga el diccionario con 20 palabras
        diccionario.put("mesa", "table");
        diccionario.put("perro", "dog");
        diccionario.put("gato", "cat");
        diccionario.put("coche", "car");
        diccionario.put("silla", "chair");
        diccionario.put("madre", "mother");
        diccionario.put("padre", "father");
        diccionario.put("hermana", "sister");
        diccionario.put("hermano", "brother");
        diccionario.put("deporte", "sport");
        diccionario.put("equipo", "team");
        diccionario.put("mochila", "bag");
        diccionario.put("movil", "cellphone");
        diccionario.put("moto", "bike");
        diccionario.put("zapatillas", "shoes");
        diccionario.put("mano", "hand");
        diccionario.put("camiseta", "t-shirt");
        diccionario.put("cama", "bed");
        diccionario.put("pantalones", "pants");
        diccionario.put("calcetines", "socks");
        
        return diccionario;
    }
}
