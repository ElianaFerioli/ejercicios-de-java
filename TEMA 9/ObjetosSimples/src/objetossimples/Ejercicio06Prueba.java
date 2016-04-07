/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetossimples;

/**
 *
 * @author eliana
 */
public class Ejercicio06Prueba {
    public static void main(String[] args) {
        System.out.println("Este programa maneja intervalos de tiempo.");
        Tiempo tiempoUno = new Tiempo(0, 30, 40);
        Tiempo tiempoDos = new Tiempo(0, 35, 20);
        Tiempo tiempoTres = new Tiempo(1, 50, 30);
        System.out.println("Suma los tiempos: ");
        System.out.print(tiempoUno + " + " + tiempoDos + " = ");
        tiempoUno.suma(tiempoDos);
        System.out.println("Resta los tiempos: ");
        System.out.print(tiempoUno + " - " + tiempoDos + " = ");
        tiempoUno.resta(tiempoDos);
        System.out.print(tiempoTres + " - " + tiempoDos + " = ");
        tiempoTres.resta(tiempoDos);
 
    }
    
}
