/*
 * Muestra los números capicúa que hay entre 1 y 99999.
 */
package funciones;

/**
 *
 * @author eliana
 */
public class Ejercicio16 {
    public static void main(String[] args) {
        System.out.println("Muestra los números capicúa que hay entre 1 y 99999.");
        int contador = 0;
        
        for(int x = 1; x <= 99999; x++) {
            if(Varias.esCapicua(x)) {
                System.out.print("|" + x);
                contador++;
                if((contador%10 == 0)) {
                    System.out.println();
                }
            }
            
        }
        
    }
}
