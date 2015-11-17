/**
 * Escribe un programa que lea 15 números por teclado y que los almacene en un array. Rota
los elementos de ese array, es decir, el elemento de la posición 0 debe pasar a la posición
1, el de la 1 a la 2, etc. El número que se encuentra en la última posición debe pasar a la
posición 0. Finalmente, muestra el contenido del array.
 *
 * @author Eliana Ferioli
 */
public class Ejercicio06 {
  public static void main(String[] args) {
    System.out.println("Este cambia las posiciones del array.");
    
    int num[] = new int [15];
    int nuevo[] = new int [15];
    
    for (int x = 0; x <= 14; x++) {
      System.out.print("Por favor, introduzca un número: ");
      num[x] = Integer.parseInt(System.console().readLine());
    }     //recoge los números
    
    nuevo [0] = num [14];
    
    for (int x = 0; x < 14; x++) {
      nuevo[x + 1] = num[x];
    }     //cambia los números de posición
    
    for (int x = 0; x <= 14; x++) {
     System.out.println("La posición " + x + " del array es: " + nuevo[x]);
    }     //muestra los números del array nuevo
  }
}
