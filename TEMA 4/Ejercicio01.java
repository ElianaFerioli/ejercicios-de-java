/**
 *
 * @author  Eliana Ferioli
 */

public class Ejercicio01 {
  public static void main(String[] args) {
    System.out.print("Por favor, introduce un día de la semana: ");
    String linea = System.console().readLine();

    if (linea.equals("Lunes")) {
      System.out.println("El lunes hay FOL-FOL-FOL-PROG-ED-ED.");
    }
    if (linea.equals("Martes")) {
      System.out.println("El martes hay PROG-PROG-PROG-BBDD-BBDD-BBDD.");
    }
    if (linea.equals("Miercoles")) {
      System.out.println("El miercoles hay SIN-SIN-SIN-SIN-LM-LM.");
    }
    if (linea.equals("Jueves")) {
      System.out.println("El jueves hay PROG-PROG-PROG-ED-LM-LM.");
    }
    if (linea.equals("Viernes")) {
      System.out.println("El viernes hay BBDD-BBDD-BBDD-PROG-SIN-SIN.");
    }
  }
}
