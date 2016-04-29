/*
 * Crea la clase Piramide con los atributos altura (de tipo entero) y estaRellena (de tipo booleano). Crea
 * el constructor y el método toString. Prueba la clase mediante un programa que cree y pinte al
 * menos dos pirámides, una rellena y otra hueca. No es necesario utilizar menús ni pedir los datos por
 * teclado, se pueden crear directamente los objetos de prueba en un par de líneas igual que en el
 * ejercicio anterior.
 */
package examen29;

/**
 *
 * @author eliana
 */
public class Ejercicio02Prueba {
    public static void main(String[] args) {
        Piramide p1 = new Piramide(5, false);
        Piramide p2 = new Piramide(5, true);
        System.out.println(p1);
        System.out.println(p2);
    }
}
