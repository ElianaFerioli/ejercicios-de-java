/**
 *
 * @author Eliana Ferioli
 */

public class Ejercicio03 {
  public static void main(String[] args) {
    System.out.print("Por favor, introduce un número y te dirá a que día de la semana corresponde: ");
    int x = Integer.parseInt(System.console().readLine());
    
    if (x == 1) {
      System.out.println("Lunes");
    }
    if (x == 2) {
      System.out.println("Martes");
    }
    if (x == 3) {
      System.out.println("Miercoles");
    }
    if (x == 4) {
      System.out.println("Jueves");
    }
    if (x == 5) {
      System.out.println("Viernes");
    }
    if (x == 6) {
      System.out.println("Sábado");
    }
    if (x == 7) {
      System.out.println("Domingo");
    }
  }
}
