/**
 * Realiza un programa que pida 10 números por teclado y que los almacene en un array.
A continuación se mostrará el contenido de ese array junto al índice (0 – 9) utilizando
para ello una tabla. Seguidamente el programa pasará los primos a las primeras posiciones,
desplazando el resto de números (los que no son primos) de tal forma que no se pierda
ninguno. Al final se debe mostrar el array resultante.
 *
 * @author Eliana Ferioli
 */
public class Ejercicio11 {
  public static void main(String[] args) {
    System.out.println("Este genera un nuevo array con numeros primos.");
    
    int num[] = new int [10];
    int nuevo[] = new int [10];
    int contador = 0;
    int j = 0;
    
      for (int x = 0; x < 10; x++) {
        System.out.print("Por favor, introduzca un número: ");
        num[x] = Integer.parseInt(System.console().readLine());
      }   //pide los números
      
      System.out.println("índice\t\t\t\tNúmero");
      for (int x = 0; x < 10; x++) {
        System.out.print(x + "\t\t\t\t" + num[x]);
          for( int i = 2; i <= (num[x]/2); i++) {
            if ((num[x] % i) == 0) {
            contador++;
            }
          }
        if (contador == 0) {
          nuevo[j] = num[x];
          j++;
        }
        contador = 0;
        System.out.println();
      } //Los muestra y pasa los primos a las primeras posiciones
      
      for (int x = 0; x < 10; x++) {
          for( int i = 2; i <= (num[x]/2); i++) {
            if ((num[x] % i) == 0) {
            contador++;
            }
          }
        if (contador != 0) {
          nuevo[j] = num[x];
          j++;
        }
        contador = 0;
      } //pasa el resto de los números al resto de las posiciones
      
      System.out.println("Así queda el nuevo array:");
      System.out.println("índice\t\t\t\tNúmero");
      for (int x = 0; x < 10; x++) {
        System.out.println(x + "\t\t\t\t" + nuevo[x]);
      } //Muestra el nuevo array
  }
}
