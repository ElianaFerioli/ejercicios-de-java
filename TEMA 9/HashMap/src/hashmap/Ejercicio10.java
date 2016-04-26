/*
 * Crea un mini-diccionario español-inglés que contenga, al menos, 20 palabras (con su
 * correspondiente traducción). Utiliza un objeto de la clase HashMap para almacenar las
 * parejas de palabras. El programa pedirá una palabra en español y dará la correspondiente
 * traducción en inglés.
 */
package hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author eliana
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        System.out.println("Este programa crea un pequeño diccionario español-ingles.");
        HashMap<String, String> diccionario = new HashMap<>();
        Scanner s = new Scanner(System.in);
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
        
        //Muestra las palabras del diccionario en español
        System.out.println("Estas son las palabras disponibles: ");
        for (Map.Entry pareja: diccionario.entrySet()) {
            System.out.println(pareja.getKey());
        }
        //Pide una palabra
        System.out.print("¿Qué palabra desea traducir?: ");
        String palabraIntroducida = s.nextLine();
        //Devuelve el resultado
        System.out.print("La palabra " + palabraIntroducida + " en inglés es: ");
        System.out.println(diccionario.get(palabraIntroducida));
        
    }
}
