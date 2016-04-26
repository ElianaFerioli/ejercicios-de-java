/*
 * Escribe un programa que genere una secuencia de 5 cartas de la baraja española y que
 * sume los puntos según el juego de la brisca. El valor de las cartas se debe guardar en una
 * estructura HashMap que debe contener parejas (figura, valor), por ejemplo (“caballo”, 3). La
 * secuencia de cartas debe ser una estructura de la clase ArrayList que contiene objetos de
 * la clase Carta . El valor de las cartas es el siguiente: as → 11, tres → 10, sota → 2, caballo
 * → 3, rey → 4; el resto de cartas no vale nada.
 */
package hashmap;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author eliana
 */
public class Ejercicio12 {
     public static void main(String[] args) {
        System.out.println("Este programa escocge, al azar, 5 cartas de la baraja española.");
        ArrayList<Carta> partida = new ArrayList<>();
        
        //Crea la primer carta y la guarda en el array
        Carta c = Carta.sirve();
        partida.add(c);
        //Genera las siguientes cartas y se fija que no exista repetición
        for(int x = 0; x < 4; x++) {
            do {
                c = Carta.sirve();
            } while(partida.contains(c));
            partida.add(c);
        }
        
        //Genera el diccionario con los valores de las cartas
        HashMap<String, Integer> brisca = new HashMap<>();
        brisca.put("As", 11);
        brisca.put("3", 10);
        brisca.put("Sota", 2);
        brisca.put("Caballo", 3);
        brisca.put("Rey", 4);
        
        //Muestra las cartas y suma la puntuación
        int puntuacion = 0;
        System.out.println("Cartas repartidas: ");
        for(int i=0; i < partida.size(); i++) {
            System.out.println(partida.get(i));
            if(brisca.containsKey((partida.get(i)).getValor())){
                puntuacion = puntuacion + brisca.get(partida.get(i).getValor());
            }
        }
         System.out.println("Su puntuación es: " + puntuacion);
        
     }
}
