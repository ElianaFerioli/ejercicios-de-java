/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistexamen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author eliana
 */
public class ArrayListExamenModeloBEj01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        ArrayList<String> a = new ArrayList<String>();
        ArrayList<Trabajador> arrayTrabajador = new ArrayList<Trabajador>();
        
        
        //Toma los datos y los guarda en un arraylist
        for(int x = 1; x <= 5; x++) {
            System.out.println("Por favor, introduzca los datos del " + x + "º trabajador:");
            System.out.print("Nombre: ");
            String nombre = s.nextLine();
            a.add(nombre);
            System.out.print("Cargo: ");
            String cargo = s.nextLine();
            a.add(cargo);
            System.out.print("Antiguedad: ");
            String antiguedad = s.nextLine();
            a.add(antiguedad);
        }
        
        //Vuelca los datos en el contructor de la clase
        int i = 0;
        for(int x = 0; x < 5; x++){
            arrayTrabajador.add(new Trabajador(a.get(i), a.get(i + 1), a.get(i + 2)));
            i = i + 3;
        }
        //Los ordena
        Collections.sort(arrayTrabajador);
        
        //Muestra los datos
        System.out.println("Estos son los datos de los trabajadores ordenados: ");
        for(int x = 0; x < 5; x++){
            System.out.println(arrayTrabajador.get(x));
        }
        
        
    }
    
}
