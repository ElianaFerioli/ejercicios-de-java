/**
 *Realiza un programa que pida 10 números por teclado y que los almacene en un array. A continuación
se debe mostrar el contenido de ese array junto al índice (0 – 9). Seguidamente el programa debe
rotar los números hacia la derecha hasta que el mínimo se coloque en la posición 0. El elemento que
sale por la derecha deberá entrar por la izquierda tantas veces como sea necesario. Al final se debe
mostrar el array resultante.
 *
 * @author Eliana Ferioli
 */
public class Ejercicio04 {
  public static void main(String[] args) {
    System.out.println("Este programa rota un array hasta que el múnimo quede en la posición 0");
    
    int[] num = new int[10];
    int i = 1;
    int min = 0;
    
    //Pide los números
    for (int x = 0; x < 10; x++) {
      System.out.print(i + ".Por favor introduzca un número: ");
      num[x] = Integer.parseInt(System.console().readLine());
      if (x == 0) {
        min = num[x];
      } else if (num[x] < min) {
        min = num[x];
      }
      i++;
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
    
    
    //Los cambia
    while (num[0] != min) {
      int aux = num[9];
        for (int x = 9; x > 0; x--) {
          num[x] = num[x-1];
        }
        num[0] = aux;
    }
    
    
    //Los muestra
    System.out.println("\n\nArray Final:");
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
    
  }
}
