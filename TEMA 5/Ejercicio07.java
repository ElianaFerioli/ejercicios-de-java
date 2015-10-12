/**
 * 
 *
 * @author ELiana Ferioli
 */
public class Ejercicio07 {
  public static void main(String[] args) {
    
    System.out.println("Descubre la contraseña de la caja fuerte.");
    System.out.println("Son cuatro dígos y tienes cuatro oportunidades.");
    
    for (int i = 1; i <= 4; i++) {
      System.out.println("Dime el primer número: ");
      int x1 = Integer.parseInt(System.console().readLine());
      System.out.println("Dime el segundo número: ");
      int x2 = Integer.parseInt(System.console().readLine());
      System.out.println("Dime el tercer número: ");
      int x3 = Integer.parseInt(System.console().readLine());
      System.out.println("Dime el cuarto número: ");
      int x4 = Integer.parseInt(System.console().readLine());
      
      if ((x1 == 1) && (x2 == 1) && (x3 == 1) && (x4 ==1)){
        System.out.println("La caja fuerte se ha abierto sactifactoriamente.");
        i = 4;
      } else {
        System.out.println("Lo siento, esa no es la combinación.");
      }
    }
  }
}
