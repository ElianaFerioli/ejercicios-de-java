/**
 *
 * @author  Eliana Ferioli
 */

public class Ejercicio01 {
  public static void main(String[] args) {
    System.out.print("Por favor, introduce un día de la semana: ");
    String linea = System.console().readLine().toLowerCase();

    if (linea.equals("lunes")) {
      System.out.println("El lunes a primera hora hay FOL.");
    } else if (linea.equals("martes")) {
      System.out.println("El martes a primera hora hay PROGRAMACION.");
    } else if (linea.equals("miercoles")) {
      System.out.println("El miercoles a primera hora hay SIN.");
    } else if (linea.equals("jueves")) {
      System.out.println("El jueves a primera hora hay PROGRAMACION.");
    } else if (linea.equals("viernes")) {
      System.out.println("El viernes a primera hora hay BBDD.");
    } else {
      System.out.println("Día no válido");
    }
  }
}
