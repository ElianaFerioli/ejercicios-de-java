/**
 * 
 *
 * @author Eliana Ferioli
 */
public class Ejercicio11 {
  public static void main(String[] args) {
    System.out.println("Por favor, introducir un número y se mostrará el cubo y el cuadrado de los cinco siguientes.");
    int x = Integer.parseInt(System.console().readLine());
    int fin = x + 5;
    
    do {
    System.out.println(x + "\t" + Math.pow(x,2) + "\t" + Math.pow(x,3));
    x = x + 1;
    } while (x < fin);
  }
}
