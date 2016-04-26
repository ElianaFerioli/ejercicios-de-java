/*
 * Realiza un programa que escoja al azar 10 cartas de la baraja española (10 objetos de la
 * clase Carta ). Emplea un objeto de la clase ArrayList para almacenarlas y asegúrate de que
 * no se repite ninguna.
 */
package hashmap;

import java.util.ArrayList;


/**
 *
 * @author eliana
 */
public class Ejercicio08Prueba {
    public static void main(String[] args) {
        System.out.println("Este programa escocge, al azar, 10 cartas de la baraja española.");
        ArrayList<Carta> partida = new ArrayList<>();
        
        //Crea la primer carta y la guarda en el array
        Carta c = Carta.sirve();
        partida.add(c);
        //Genera las siguientes cartas y se fija que no exista repetición
        for(int x = 0; x < 9; x++) {
            do {
                c = Carta.sirve();
            } while(partida.contains(c));
            partida.add(c);
        }
        
        //Muetstra las cartas
        System.out.println("Cartas repartidas: ");
        for(int i=0; i < partida.size(); i++) {
            System.out.println(partida.get(i));
        }
        
    }
}