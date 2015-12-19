/**
 * Realiza un programa que pida 10 números por teclado y que los almacene en un array. A
continuación se mostrará el contenido de ese array junto al índice (0 – 9). Seguidamente el
programa pedirá dos posiciones a las que llamaremos “inicial” y “final”. Se debe comprobar
que inicial es menor que final y que ambos números están entre 0 y 9. El programa deberá
colocar el número de la posición inicial en la posición final, rotando el resto de números
para que no se pierda ninguno. Al final se debe mostrar el array resultante.
 *
 * @author Eliana Ferioli
 */
public class Ejercicio12 {
  public static void main(String[] args) {
    System.out.println("Este programa genera un nuevo array a partir de una posición final y una inicial indicada.");
    System.out.println("Por favor, introduzca los números que componen el array incial: ");
    
    int[] num = new int [10];
    int[] nuevo = new int [10];
    
      for (int x = 0; x < 10; x++) {
        System.out.print(x + ". Por favor, introduzca un número: ");
        num[x] = Integer.parseInt(System.console().readLine());
      }   //pide los números
      
      System.out.print("Por favor, introduzca una posición inicial: ");
      int posInicial = Integer.parseInt(System.console().readLine());
      System.out.print("Por favor, introduzca una posición final: ");
      int posFinal = Integer.parseInt(System.console().readLine());
      
      if ((posInicial > posFinal) || (posInicial < 0) || (posInicial > 9) || (posFinal < 0) || (posFinal > 9)) {
        System.out.print("Los datos introducidos no son correctos.");
        System.out.print("La posición inicial debe ser menor a la final y ambos deben estar entre 0 y 9.");
      } else {
        
          //Muestra el array inicial
          System.out.print("El array inicial es: ");
          for (int x = 0; x < 10; x++) {
            System.out.print(num[x] + " ");
          }
          System.out.println();
          //
          
          nuevo[posFinal] = num[posInicial];
          nuevo[0] = num [9];
          int i = posFinal;
          
          for (int x = (posFinal + 1); x < 10; x++) {
            nuevo[x] = num[i];
            i++;
          } //rota los últimos a partir de la posicion final + 1
          
          i = 0;
          
          
          for (int x = 1; x < (posFinal); x++) {
            if (x == posInicial) {
              nuevo[x] = num[posInicial - 1];
              i = posInicial + 1;
            } else {
              nuevo[x] = num[i];
              i++;
            }
          } //rota los primeros números
          
          //Muestra el array ordenado
          System.out.print("El array final es: ");
          for (int x = 0; x < 10; x++) {
            System.out.print(nuevo[x] + " ");
          }//
      }
  }
}
