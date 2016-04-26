/*
 * La máquina Eurocoin genera una moneda de curso legal cada vez que se pulsa un botón
 * siguiendo la siguiente pauta: o bien coincide el valor con la moneda anteriormente generada
 * - 1 céntimo, 2 céntimos, 5 céntimos, 10 céntimos, 25 céntimos, 50 céntimos, 1 euro o 2 euros
 * - o bien coincide la posición – cara o cruz. Simula, mediante un programa, la generación
 * de 6 monedas aleatorias siguiendo la pauta correcta. Cada moneda generada debe ser una
 * instancia de la clase Moneda y la secuencia se debe ir almacenando en una lista.
 */
package hashmap;

import java.util.ArrayList;

/**
 *
 * @author eliana
 */
public class Ejercicio07Prueba {
    public static void main(String[] args) {
        System.out.println("EUROCOIN");
        ArrayList<Moneda> monedasLanzadas = new ArrayList<Moneda>();
        String valorMoneda = null;
        String ladoMoneda = null;
        
        //Lanza las monedas y las guarda en el array
        for(int x = 0; x < 6; x++){
            //Lanza la primer moneda recurriendo al constructor normal ()
            if(x==0) {
                Moneda mon = Moneda.lanza();
                monedasLanzadas.add(mon);                
            } else { //Determina la pauta y va al constructor(string) pasando un parámetro
                int pautaSiguiente = (int)(Math.random()*2);
                if(pautaSiguiente == 0) {
                    valorMoneda = monedasLanzadas.get(x-1).getValorMoneda();
                    Moneda mon = Moneda.lanza(valorMoneda);
                    monedasLanzadas.add(mon);
                } else {
                    ladoMoneda = monedasLanzadas.get(x-1).getLadoMoneda();
                    Moneda mon = Moneda.lanza(ladoMoneda);
                    monedasLanzadas.add(mon);
                }
            }
        }
        
        //Muestra las monedas       
        System.out.println("Monedas lanzadas: ");
        for(int i=0; i < monedasLanzadas.size(); i++) {
            System.out.println(monedasLanzadas.get(i));
        }
    }    
}
