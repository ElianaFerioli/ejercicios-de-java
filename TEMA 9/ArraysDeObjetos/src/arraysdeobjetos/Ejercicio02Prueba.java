/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysdeobjetos;

/**
 *
 * @author eliana
 */
public class Ejercicio02Prueba {
    public static void main(String[] args) {
        System.out.println("Este programa crea cuatro objetos de la clase Gato con un array.");
        Gato[] gato = new Gato[4];
        
        //Crea los objetos desde el programa
        gato[0] = new Gato("Siames", "Macho", 7);
        gato[1] = new Gato("Persa", "Hembra", 8);
        gato[2] = new Gato("Callejero", "Macho", 4);
        gato[3] = new Gato("Siames", "Hembra", 6);
        
        
        //Muestra los objetos
        for(int x = 0; x < 4; x++){
            System.out.println("Este es el gato " + x + ": ");
            System.out.println(gato[x].toString());
        }
        
    }
    
}
