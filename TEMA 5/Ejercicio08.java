/**
 * 
 *
 * @author ELiana Ferioli
 */
public class Ejercicio08 {
  public static void main(String[] args) {
    
    System.out.println("Introduce un número y se visualizará su tabla de multiplicar");

    int num = Integer.parseInt(System.console().readLine());
    
    for (int i = 1; i <= 10; i++) {
      System.out.println(num + "x" + i + "=" + (num*i));
    }
  }
}
