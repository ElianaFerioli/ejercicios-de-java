/**
 *
 * @author Eliana Ferioli
 */

public class Ejercicio02 {
  public static void main(String[] args) {
    System.out.print("Por favor, introduce una hora: ");
    int x = Integer.parseInt(System.console().readLine());
    
    if ((x >= 6) && (x <= 12)) {
      System.out.println("Buenos dias!");
    }
    if ((x > 12) && (x <= 20)) {
      System.out.println("Buenas tardes!");
    } 
    if (((x > 20) && (x <= 24))||((x >= 0) && (x <= 5))) {
      System.out.println("Buenas noches!");
    }
    if (x > 24){
      System.out.println("La hora introducida no es válida.");
    }
  }
}
