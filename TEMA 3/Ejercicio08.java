/**
 * 
 * @author Eliana Ferioli
 */
import java.util.Scanner;

public class Ejercicio08 {
  public static void main(String[] args) {    
    
    System.out.print("Introduce el total de horas trabajadas: ");
    double x1 = Double.parseDouble(System.console().readLine());
    
    System.out.println("El total del salario semanal es: " + (x1 * 12));
  }
}
