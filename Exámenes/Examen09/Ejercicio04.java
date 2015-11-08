/**
 *Escribe un programa que pida un número entero positivo por teclado y que muestre a continuación los
5 números consecutivos a partir del número introducido. Al lado de cada número se debe indicar si se
trata de un primo o no. Un número es primo cuando es divisible únicamente entre él mismo y la
unidad.
 *
 * @author Eliana Ferioli
 */
public class Ejercicio04 {
  public static void main(String[] args) {
    System.out.println("Este programa muestra los sinco números consecutivos \nal número introducido.");
    System.out.print("Por favor, introduzca un número entero positivo: ");
    int num = Integer.parseInt(System.console().readLine());
    int contador = 0;
    
    for (int x = num; x < (num + 5); x++) {
      System.out.print(x + ": ");
      for (int i = 1; i <= x; i++) {
        if ((x % i) == 0) {
          contador++;
        }
      }
      if (contador == 2) {
      System.out.print("Este número es primo.");
      } else {
      System.out.print("Este número no es primo.");
      }
      contador = 0;
      System.out.println();
    }
  }
}
