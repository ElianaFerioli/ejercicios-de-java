/**
 *Realiza un programa que pida 10 números por teclado y que los almacene en un array. A continuación
se debe mostrar el contenido de ese array junto al índice (0 – 9). Seguidamente el programa debe
colocar en las últimas posiciones los números que terminen en 7 dejando el resto en las primeras
posiciones.
 *
 * @author Eliana Ferioli
 */
public class Ejercicio04alternativo {
  public static void main(String[] args) {
    System.out.println("Este programa rota un array hasta que los que terminan en 7 queden al final.");
    
    int[] numeros; 
    numeros = new int[10];
    int numPares = 0;
    int numImpares = 0;
    int indice=9;
    int aux=0;
    int aux2=0;
    int i = 1;
    
    //Pide los números
    for (int x = 0; x < 10; x++) {
      System.out.print(i + ".Por favor introduzca un número: ");
      numeros[x] = Integer.parseInt(System.console().readLine());
      if (((numeros[x] % 10) == 7)) {
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
      System.out.printf("│%4d ", numeros[x]);
    }
    System.out.println("│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
    
    
    do{
        if (numeros[indice]%10==7){
          indice--;
        }else{
          aux = numeros[indice];
          numeros[indice] = numeros[numImpares];
          numeros[numImpares] = aux;
          numImpares++;
          
        }
    } while(indice!=numImpares);
    
    
    
    
    
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
      System.out.printf("│%4d ", numeros[x]);
    }
    System.out.println("│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
    
  }
}
