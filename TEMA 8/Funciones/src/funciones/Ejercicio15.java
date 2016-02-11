/*
 * Muestra los números primos que hay entre 1 y 1000.
 */
package funciones;

/**
 *
 * @author eliana
 */
public class Ejercicio15 {
    public static void main(String[] args) {
        System.out.println("Muestra los números primos que hay entre 1 y 1000.");
        int contador = 0;
        
        for(int x = 1; x <= 1000; x++) {
            if(Varias.esPrimo(x)) {
                System.out.print("|" + x);
                contador++;
                if((contador%10 == 0)) {
                    System.out.println();
                }
            }
            
        }
        
    }
}
