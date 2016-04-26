/*
 * Modifica el programa anterior de tal forma que las cartas se muestren ordenadas. Primero
 * se ordenarán por palo: bastos, copas, espadas, oros. Cuando coincida el palo, se ordenará
 * por número: as, 2, 3, 4, 5, 6, 7, sota, caballo, rey.
 */
package hashmap;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author eliana
 */
public class Ejercicio09 {
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
        
        //Muetstra las cartas ordenadas
        Collections.sort(partida);
        System.out.println("Cartas repartidas: ");
        for(int i=0; i < partida.size(); i++) {
            System.out.println(partida.get(i));
        }
    }
}
