/**
 * 
 *
 * @author ELiana Ferioli
 */
public class Ejercicio09 {
  public static void main(String[] args) {
    // este programa no contempla el 0
    System.out.print("Introduce un número entero: ");
    int num = Integer.parseInt(System.console().readLine());
    int x = 1;
    int cifra = 1;
    
    if (num > 0) {
      while (x >= 0) {
        if ((num >= x) && (num < (x*10))) {
        System.out.println("El número introducido tene " + cifra + " cifras.");
        } else {
        cifra = cifra + 1;
        }
      x = x * 10; 
      } 
    } else {
      x = -1;
      while (x < 0) {
      if ((num <= x) && (num > (x*10))) {
      System.out.println("El número introducido tene " + cifra + " cifras.");
      } else {
      cifra = cifra + 1;
      }
     x = x * 10; 
      }
    }
  }
}
