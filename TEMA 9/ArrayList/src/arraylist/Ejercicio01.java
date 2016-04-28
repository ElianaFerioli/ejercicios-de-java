/*
 * Crea un ArrayList con los nombres de 6 compañeros de clase. A continuación, muestra
 * esos nombres por pantalla. Utiliza para ello un bucle for que recorra todo el ArrayList sin
 * usar ningún índice.
 */
package arraylist;

import java.util.ArrayList;

/**
 *
 * @author eliana
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Este programa genera un ArrayList con nombres y los muestra.");
        
        //Genera el Array
        ArrayList<String> nombres = new ArrayList<String>();
        
        //Asignación de nombres
        nombres.add("Elena Tellez");
        nombres.add("José Antonio Arroyo");
        nombres.add("José Navarro Ortiz");
        nombres.add("Eliana Ferioli");
        nombres.add("Constantine Brandus");
        nombres.add("Pablo Giron");
        
        //Muestra el contenido del array
        for(String n: nombres){
            System.out.println(n);
        }
    }
    
}
