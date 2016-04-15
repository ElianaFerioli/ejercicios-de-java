/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysdeobjetos;

import java.util.Scanner;

/**
 *
 * @author eliana
 */
public class Ejercicio01Prueba {
    public static void main(String[] args) {
        System.out.println("Este programa crea cuatro objetos de la clase Gato con un array.");
        Scanner s = new Scanner(System.in);
        Gato[] gato = new Gato[4];
        
        //Crea los objetos pidiendo los datos
        for(int x = 0; x < 4; x++) {
            System.out.print("Por favor, introduce la raza del gato: ");
            String raza = s.nextLine();
            System.out.print("Por favor, introduce el sexo del gato: ");
            String sexo = s.nextLine();
            System.out.print("Por favor, introduce el peso del gato: ");
            int peso = Integer.parseInt(s.nextLine());
            gato[x] = new Gato(raza, sexo, peso);
        }
        
        //Muestra los objetos
        for(int x = 0; x < 4; x++){
            System.out.println("Este es el gato " + x + ": ");
            System.out.println(gato[x].toString());
        }
        
    }
    
}
