/**
 * Ordena un array de mayor a menor
 *
 *  @Eliana Ferioli
 */

public class MenorAmayor{
  public static void main(String[] args) {
  
      System.out.println("Coloca los numeros de mayor a menor");
      int[] num = new int [10];
      int u = 1;
      int min = 0;
    
      //Pide los números
      for(int x = 0; x < 10; x++) {
        System.out.print(u + ".Por favor, introduzca un número: ");
        num[x] = Integer.parseInt(System.console().readLine());
        if (x == 0) {
          min = num[x];
        } else if (num[x] < min) {
          min = num [x];
        }
        u++;
      }
      
    //Los muestra
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
    
    //Los ordena
    int p = 0;
    int h = 1;
    while ( p < 10){
      while (num[p] != min) {
        int aux = num[9];
        for (int x = 9; x > p; x--) {
          num[x] = num [x - 1];
        }
        num[p] = aux;
      }
      for (int x = h; x < 10; x++) {
        if (x == h) {
          min = num[x];
        } else if (num[x] < min) {
          min = num [x];
        }
      }
      p++;
      h++;    
    }    
    
    //Los muestra
    System.out.println("\n\nArray final:");
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
