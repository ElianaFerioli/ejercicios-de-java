/*
 * Crea la clase abstracta Figura con el atributo caracter, que indicará el carácter con el que se debe
 * pintar la figura por pantalla. Crea, a su vez, las clases Rectangulo - con los atributos base y altura – y
 * Piramide – con el atributo altura - como subclases de Figura. Implementa el método toString() para
 * Rectangulo y para Piramide de tal forma que se puedan pintar por pantalla las figuras (huecas)
 * mediante print o println. Debe haber tres variables de clase llamadas figurasCreadas,
 * rectangulosCreados y piramidesCreadas (colócalas donde corresponda) con sus correspondientes
 * getter. Prueba estas clases en un programa para comprobar que todo funciona bien.
 */
package examen30;

/**
 *
 * @author eliana
 */
public class Ejercicio03Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Este programa pinta pirámides y rectángulos.");
        Piramide p1 = new Piramide(5, "8");
        System.out.println(p1);
        Piramide p2 = new Piramide(7, "4");
        System.out.println(p2);
        Rectangulo r1 = new Rectangulo(4, 7 , "c");
        System.out.println(r1);
        Rectangulo r2 = new Rectangulo(5, 8, "T");
        System.out.println(r2);
        
        System.out.println("Las figuras creadas son: " + Figura.getFigurasCreadas());
        System.out.println("Las pirámides creadas son: " + Piramide.getPiramidesCreadas());
        System.out.println("Los rectángulos creados son: " + Rectangulo.getRectangulosCreados());
        
    }
    
}
