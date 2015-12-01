/**
 *Realiza un programa que pida 10 números por teclado y que los almacene en un array. A continuación
se debe mostrar el contenido de ese array junto al índice (0 – 9). Seguidamente el programa debe
colocar en las últimas posiciones los números que terminen en 7 dejando el resto en las primeras
posiciones.
 *
 * @author Eliana Ferioli
 */
public class Ejercicio04 {
  public static void main(String[] args) {
    System.out.println("Este programa rota un array hasta que los que terminan en 7 queden al final.");
    
    int[] num = new int[10];
    int i = 1;
    int min = 0;
    int contador = 0;
    
    //Pide los números
    for (int x = 0; x < 10; x++) {
      System.out.print(i + ".Por favor introduzca un número: ");
      num[x] = Integer.parseInt(System.console().readLine());
      if (((num[x] % 10) == 7)) {
        contador++;
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
    
    int[] nuevoArray = new int[10];
    int posInicio = 10 - contador;
    int j = 0;
    //Los cambia
      for(int x = 0; x < 10; x++) {
          if (((num[x] % 10) == 7)) {
            nuevoArray[posInicio] = num[x];
            posInicio++;
          } else {
            nuevoArray[j] = num[x];
            j++;
          }
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
      System.out.printf("│%4d ", nuevoArray[x]);
    }
    System.out.println("│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
    
  }
}
