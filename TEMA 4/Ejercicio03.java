/**
 *
 * @author Eliana Ferioli
 */

public class Ejercicio03 {
  public static void main(String[] args) {
    System.out.print("Por favor, introduce un número y te dirá a que día de la semana corresponde: ");
    int x = Integer.parseInt(System.console().readLine());

    switch (x) {
      case 1:
      System.out.println("Lunes");
      break;
      case 2:
      System.out.println("Martes");
      break;
      case 3:
      System.out.println("Miercoles");
      break;
      case 4:
      System.out.println("Jueves");
      break;
      case 5:
      System.out.println("Viernes");
      break;
      case 6:
      System.out.println("Sábado");
      break;
      case 7:
      System.out.println("Domingo");
      break;
      default:
      System.out.println("Día incorrecto.");
      break;
    }
  }
}
