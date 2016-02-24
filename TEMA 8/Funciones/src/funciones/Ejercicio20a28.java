/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones;

import java.util.Scanner;

/**
 *
 * @author eliana
 */
public class Ejercicio20a28 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("Este programa genera un array aleatorio.");
        System.out.print("Introduzca la longitud del array: ");
        int x = Integer.parseInt(s.nextLine());        
        System.out.print("Introduzca el número máximo: ");
        int p = Integer.parseInt(s.nextLine());
        System.out.print("Introduzca el número mínimo: " );
        int j = Integer.parseInt(s.nextLine());
        int[] a = Arrays.generaArrayInt(x, p, j);
        Arrays.muestraArray(a);
        System.out.println("El mínimo número del array es: " + Arrays.minimoArrayInt(a));
        System.out.println("El máximo número del array es: " + Arrays.maximoArrayInt(a));
        System.out.println("La media del array es: " + Arrays.mediaArrayInt(a));       
        System.out.print("Introduzca el número que quiere buscar: " );
        int n = Integer.parseInt(s.nextLine());
        if(Arrays.estaEnArrayInt(a, n)) {
            System.out.println("El número " + n + " está en el array.");
        } else {
            System.out.println("El número " + n + " no está en el array.");
        }
        System.out.print("Introduzca el número del que quiere saber la posición: " );
        int h = Integer.parseInt(s.nextLine());
        Arrays.posicionEnArray(a, h);
        System.out.println("Este es el array dado la vuelta: ");
        Arrays.volteaArrayInt(a);
        Arrays.muestraArray(a);
        System.out.print("Introduzca la cantidad de posiciones que desea rotar el array a la derecha: " );
        int d = Integer.parseInt(s.nextLine());
        Arrays.rotaDerechaArrayInt(a, d);
        Arrays.muestraArray(a);
        System.out.print("Introduzca la cantidad de posiciones que desea rotar el array a la izquerda: " );
        int i = Integer.parseInt(s.nextLine());
        Arrays.rotaIzquierdaArrayInt(a, d);
        Arrays.muestraArray(a);
    }
}
