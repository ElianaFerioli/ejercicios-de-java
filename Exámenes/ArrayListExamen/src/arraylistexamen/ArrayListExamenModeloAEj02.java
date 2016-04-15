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
public class ArrayListExamenModeloAEj02 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        ArrayList<String> b = new ArrayList<String>();
        ArrayList<Alumno> arrayAlumno = new ArrayList<Alumno>();
        
        
        //Toma los datos y los guarda en un arraylist
        for(int x = 1; x <= 5; x++) {
            System.out.println("Por favor, introduzca los datos del " + x + "º alumno:");
            System.out.print("Nombre: ");
            String nombre = s.nextLine();
            b.add(nombre);
            System.out.print("Apellido: ");
            String apellido = s.nextLine();
            b.add(apellido);
            System.out.print("Edad: ");
            String edad = s.nextLine();
            b.add(edad);
        }
        
        //Vuelca los datos en el contructor de la clase
        int i = 0;
        for(int x = 0; x < 5; x++){
            arrayAlumno.add(new Alumno(b.get(i), b.get(i + 1), b.get(i + 2)));
            i = i + 3;
        }
        //Los ordena
        Collections.sort(arrayAlumno);
        
        //Muestra los datos
        System.out.println("Estos son los datos de los trabajadores ordenados: ");
        for(int x = 0; x < 5; x++){
            System.out.println(arrayAlumno.get(x));
        }
    }
    
}
