/**
 * Coloca Primos al principio
 *
 *  @Eliana Ferioli
 */

public class PrimosPrincipio {
  public static void main(String[] args) {
  
      System.out.println("Coloca los numeros primos al principio.");
      int[] num = new int [10];
      int u = 1;
      int min = 0;
    
      //Pide los números
      for(int x = 0; x < 10; x++) {
        System.out.print(u + ".Por favor, introduzca un número: ");
        num[x] = Integer.parseInt(System.console().readLine());
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
    int[] arrayPrimo = new int[10];
    int resto = 0;
    int suma = 0;
    int contadorPrimo = 0;
    int sumaPrimo = 0;
    int i = 1;
    boolean esPrimo = false;
    int indicePrimo = 0;
    int indiceNoPrimo = 9;
    
    for(int x = 0; x < 10; x++) {
      while (i <= num[x]) {
        resto = num[x] % i;
        if (resto == 0) {
          suma++;
        }
        i++;
      } 
      i = 1;
      if (suma == 2) {
        esPrimo = true;
      }
      if (esPrimo) {
        arrayPrimo[indicePrimo] = num[x];
        indicePrimo++;
      } else {
        arrayPrimo[indiceNoPrimo] = num[x];
        indiceNoPrimo--;
      }
      esPrimo = false;
      suma = 0;
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
      System.out.printf("│%4d ", arrayPrimo[x]);
    }
    System.out.println("│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
  }
}
