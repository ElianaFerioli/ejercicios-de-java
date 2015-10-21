/**
 * 
 *
 * @author ELiana Ferioli
 */
public class Ejercicio07boolean {
  public static void main(String[] args) {
    
    int i = 0;
    boolean salir = false;
    
    System.out.println("Descubre la contraseña de la caja fuerte.");
    System.out.println("Son cuatro dígitos y tienes cuatro oportunidades.");
    
    do {
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
        salir = true;
      } else {
        System.out.println("Lo siento, esa no es la combinación.");
        i++;
      } 
      
    } while ((i < 4) && (!salir));
  }
}
