/**
*
* @author Eliana Ferioli
*/

public class Ejercicio04 {
  public static void main(String[] args) {    
    
    System.out.print("Introduce el total de horas trabajadas: ");
    double x = Double.parseDouble(System.console().readLine());
    
    if (x <= 40){
    System.out.println("El total del salario semanal es: " + (x * 12));
  } else {
    double extras = x-40;
    double total = (40 * 12) + (extras * 16); 
    
    System.out.println("El total del salario semanal es: " + total);
  }
}
}
