/**
 * 
 *
 * @author ELiana Ferioli
 */
public class Ejercicio07dowhile {
  public static void main(String[] args) {
    
    int i = 0;
    
    System.out.println("Descubre la contraseña de la caja fuerte.");
    System.out.println("Son cuatro dígitos y tienes cuatro oportunidades.");
    
    do {
      i++;
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
        i = 4; //en un bucle for no se debe modificar la variable del bucle. 
      } else {
        System.out.println("Lo siento, esa no es la combinación.");
      } 
      
    } while (i < 4);
  }
}
