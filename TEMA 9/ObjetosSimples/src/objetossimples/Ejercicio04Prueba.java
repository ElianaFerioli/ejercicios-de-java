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
public class Ejercicio04Prueba {
    public static void main(String[] args) {
        System.out.println("Este programa maneja funciones.");
        Fraccion fracUno = new Fraccion(10, 2);
        Fraccion fracDos = new Fraccion(1, 2);
        Fraccion fracTres = new Fraccion(3, 5);
        Fraccion fracCuatro = new Fraccion(7, 13);
        System.out.println("Se pintan las fracciones creadas: ");
        System.out.println(fracUno);
        System.out.println(fracDos);
        System.out.println(fracTres);
        System.out.println(fracCuatro);
        System.out.println("Se simplifican las fracciones creadas: ");
        fracUno.simplifica();
        fracDos.simplifica();
        fracTres.simplifica();
        fracCuatro.simplifica();
        System.out.println("Se multiplican: ");
        fracUno.multiplica(fracDos);
        fracDos.multiplica(fracTres);
        fracTres.multiplica(fracCuatro);
        fracCuatro.multiplica(fracUno);
        System.out.println("Las invierte: ");
        fracUno.invierte();
        fracDos.invierte();
        fracTres.invierte();
        fracCuatro.invierte();
        System.out.println("Las divide: ");
        fracUno.divide(fracDos);
        fracDos.divide(fracTres);
        fracTres.divide(fracCuatro);
        fracCuatro.divide(fracUno);
    }
}
