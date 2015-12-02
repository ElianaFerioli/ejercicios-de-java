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
    System.out.println("Este programa acomoda un array poniendo en las últimas posiciones los números que terminan en 7.");
    int[] num = new int [10];
    int i = 1;
    int contador = 0;
    
    //Pide los números y cuenta los que tiene que cambiar
    for(int x = 0; x < 10; x++) {
      System.out.print(i + ".Por favor, introduzca un número: ");
      num[x] = Integer.parseInt(System.console().readLine());
      if ((num[x] % 10) == 7) {
        contador++;
      }
      i++;
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
    
    //Los cambia
    int j = 0;
    int indice = 9;
    
    do{
        if (num[indice]%10==7){
          indice--;
        }else{
          int aux = num[indice];
          num[indice] = num[j];
          num[j] = aux;
          j++;
        }
    } while(indice!=j); 
    
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
