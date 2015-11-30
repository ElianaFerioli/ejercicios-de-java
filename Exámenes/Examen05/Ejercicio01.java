/* Realiza un programa que pida 10 números por teclado y que los almacene en un array. A continuación
se debe mostrar el contenido de ese array junto al índice (0 – 9). Seguidamente el programa debe
rotar los números hacia la derecha hasta que el máximo se coloque en la posición 0. El elemento que
sale por la derecha deberá entrar por la izquierda tantas veces como sea necesario. Al final se debe
mostrar el array resultante.
 *
 * @author Eliana Ferioli
 */
public class Ejercicio01 {
  public static void main(String[] args) {
    System.out.println("Este programa rota un array poniendo el mayor número al principio.");
    
    int[] num = new int [10];
    int max = 0;
    
    //Recoge los números por teclado
    for (int x = 0; x < 10; x++) {
      num[x] = Integer.parseInt(System.console().readLine());
      if (x == 0) {
        max = num[x];
      }
      if (num[x] > max) {
        max = num[x];
      }     
    }
    
    //Muestra el array original junto con los índices
    System.out.println("\n\nArray original:");
    System.out.println("\n┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
    System.out.print("│ Índice ");
    for (int x = 0; x < 10; x++) {
      System.out.printf("│%4d ", x);
    }
    System.out.println("│\n├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");    
    System.out.print("│ Valor  ");
    for (int x = 0; x < 10; x++) {
      System.out.printf("│%4d ", num[x]);
    }
    System.out.println("│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
    
    //Rota los primeros
    while (num[0] != max) {
      int aux = num[9];
        for (int i = 9; i > 0; i--) {
          num[i] = num[i-1];
        }
        num[0] = aux;
    }

    //Los muestra
    
    System.out.println("\n\nArray Final:");
    System.out.println("\n┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
    System.out.print("│ Índice ");
    for (int i = 0; i < 10; i++) {
      System.out.printf("│%4d ", i);
    }
    System.out.println("│\n├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");    
    System.out.print("│ Valor  ");
    for (int i = 0; i < 10; i++) {
      System.out.printf("│%4d ", num[i]);
    }
    System.out.println("│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
    
  }
}
