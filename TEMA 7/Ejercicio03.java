/**
 * Escribe un programa que lea 10 números por teclado y que luego los muestre en orden
inverso, es decir, el primero que se introduce es el último en mostrarse y viceversa.
 *
 * @author Eliana Ferioli
 */
public class Ejercicio03 {
  public static void main(String[] args) {
    System.out.println("Este programa lee y muestra un array de 10 números.");
    
    int num[] = new int [12];
    
    for (int x = 0; x < 10; x++) {
      System.out.print("Por favor, introduzca la posición " + x + " del array: ");
      num[x] = Integer.parseInt(System.console().readLine());
    }     //recoge los datos del array
    for (int x = 9; x >= 0; x--) {
      System.out.println ("La posición " + x + " del array es: " + num[x]);
    }     //muestra el array de forma inversa
  }
}
