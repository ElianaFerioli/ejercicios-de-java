/*
 * Realiza un buscador de sinónimos. Puedes aprovechar el diccionario español-inglés utilizado
 * en los ejercicios de clase, modificándolo o ampliándolo convenientemente. El programa
 * preguntará una palabra y dará una lista de sinónimos (palabras que tienen el mismo
 * significado). Por ejemplo, si se introduce la palabra “caliente”, el programa dará como
 * resultado: ardiente, candente, abrasador. ¿Cómo sabe el programa cuáles son los sinónimos
 * de “caliente”? Muy fácil, en el diccionario debe existir la entrada (“caliente”, “hot”), por tanto
 * solo tendrá que buscar las palabras en español que también signifiquen “hot”; esta
 * información estará en las entradas (“ardiente”, “hot”), (“candente”, “hot”) y (“abrasador”, “hot”).
 * Además de dar la lista de sinónimos, el programa debe ser capaz de aprender. Cuando una
 * palabra no tiene sinónimos, se le preguntará al usuario si quiere añadir uno y, en caso
 * afirmativo, se pedirá la palabra y se añadirá al diccionario.
 */
package arraylistexamen;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author eliana
 */
public class ArrayListExamenModeloAEj03 {
    public static void main(String[] args) {
        System.out.println("Este programa crea un pequeño diccionario de sinónimos.");
        HashMap<String, String> diccionario = new HashMap<>();
        Scanner s = new Scanner(System.in);
        String x = "s";
        //Carga el diccionario con palabras
        diccionario.put("caliente", "caliente");
        diccionario.put("candente", "caliente");
        diccionario.put("ardiente", "caliente");
        diccionario.put("abrasador", "caliente");
        diccionario.put("frio", "frio");
        diccionario.put("gélido", "frio");
        diccionario.put("estudiante", "estudiante");
        diccionario.put("alumno", "estudiante");
        
        //Empieza el programa hasta que el usuario no quiera seguir
        while(x.equals("s")) { 
            //Pide la palabra
            System.out.print("Por favor, indique la palabra: ");
            String palabraRequerida = s.nextLine();
            //Muestra los sinónimos
            if(diccionario.containsKey(palabraRequerida)) { //Muestra los sinónimos si el diccionario contiene la palabra
                System.out.println("Sus sinónimos son: ");
                String valor = diccionario.get(palabraRequerida);
                for (Map.Entry pareja: diccionario.entrySet()) {
                    if(pareja.getValue().equals(valor)) {
                        if(!pareja.getKey().equals(palabraRequerida)) {
                            System.out.println(pareja.getKey());
                        }
                    }
                }
            } else { //Agrega la palabra
                System.out.print("Esa palabra no está en el diccionario ¿Desea agregarla (s/n)?: ");
                String respuesta = s.nextLine();
                if(respuesta.equals("s")) {
                    diccionario.put(palabraRequerida, palabraRequerida);
                    String masSinonimo = "s";
                    while(masSinonimo.equals("s")) { 
                        System.out.print("Introduzca un sinónimo: ");
                        String sinonimo = s.nextLine();
                        diccionario.put(sinonimo, palabraRequerida);
                        System.out.print("¿Desea agregar más sinónimos (s/n)?: ");
                        masSinonimo = s.nextLine();
                    }
                }
            }
            System.out.print("¿Desea seguir viendo el diccionario (s/n)?: ");
            x = s.nextLine();
        }
    }    
}
