/**
 * 
 *
 * @author ELiana Ferioli
 */
public class Ejercicio09alternativo {
  public static void main(String[] args) {
    // este programa no contempla el 0
    System.out.print("Introduce un número entero: ");
    int num = Math.abs(Integer.parseInt(System.console().readLine()));
    int cifra = 0;
    
      do {
        num = num /10;
        cifra++;
      } while (num > 0);
    System.out.println("El número introducido tiene " + cifra + " cifras.");
  }
}
