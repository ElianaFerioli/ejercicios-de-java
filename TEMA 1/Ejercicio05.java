/**
 * Muestra por pantalla la frase "ELiana Mariel Ferioli Núñez"
 *
 * @author Luis J. Sánchez
 */

public class Ejercicio05 { // Clase principal
  public static void main(String[] args) {
  
    String rojo = "\033[31m";
    String verde = "\033[32m";
    String naranja = "\033[33m";
    String azul = "\033[34m";
    String morado = "\033[35m";
    String blanco = "\033[37m";
    String nose = "\033[36m";
 
    System.out.println(nose + "Lunes:    " + rojo + "FOL    FOL    FOL    " + verde + "PROG   " + naranja + "ED     ED");
    System.out.println(nose + "Martes:   " + verde + "PROG   PROG   PROG   " + azul + "BBDD   BBDD   BBDD");
    System.out.println(nose + "Miércoles:" + morado + "SIN    SIN    SIN    SIN    " + blanco + "LM     LM");
    System.out.println(nose + "Jueves:   " + verde + "PROG   PROG   PROG   " + naranja + "ED     " + blanco + "LM     LM");
    System.out.println(nose + "Viernes:  " + azul + "BBDD   BBDD   BBDD   " + verde + "PROG   " + morado + "SIN    SIN");
  }
}
