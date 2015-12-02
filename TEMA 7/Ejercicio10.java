/**
 * Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100 y que los
almacene en un array. El programa debe ser capaz de pasar todos los números pares a las
primeras posiciones del array (del 0 en adelante) y todos los números impares a las celdas
restantes. Utiliza arrays auxiliares si es necesario.
 *
 * @author Eliana Ferioli
 */
public class Ejercicio10 {
  public static void main(String[] args) {
    System.out.println("Este genera un nuevo array con numero pares seguidos de impares.");
    
    int num[] = new int [20];
    int nuevo[] = new int [20];
    int i = 0;
    
    for (int x = 0; x < 20; x++) {
      num[x] = (int)(Math.random()*101);
    }   //crea los números
    
    //Muestra los números generados
    System.out.print("Los números generados son: ");
    for (int x = 0; x < 20; x++) {
      System.out.print(num[x] + " ");
    }
    System.out.println();
    
    for (int n : num) {
      if ((n % 2) == 0) {
        nuevo[i] = n;
        i++;
      }
    } //coloca los pares
    
    for (int n : num) {
      if ((n % 2) != 0) {
        nuevo[i] = n;
        i++;
      }
    } //coloca los impares
    
    for (int x = 0; x < 20; x++) {
      System.out.println("La posición " + x + " es: " + nuevo[x]);
    } // los muestra
  }
}
