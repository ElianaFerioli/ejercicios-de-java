/**
 *Escribe un programa que rellene un array con 10 números aleatorios (números entre 0 y 100) y que luego cree
otro array con esos mismos números “barajados”, es decir, reordenados de forma aleatoria. Puede haber
números repetidos en el array original.
 *
 * @author Eliana Ferioli
 */
public class Ejercicio04 {
  public static void main(String[] args) {
    System.out.println("Este programa genra 10 números aleatorios en array y los mezcla.");
    
    int[] num = new int[10];
    
    //Genera los números
    for(int x = 0; x < 10; x++) {
      num[x] = (int)(Math.random()*101);
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
    
    //Mezcla los números
    int[] nuevoIndice = new int [10];
    int indice = 0;
    boolean existe = false;
    //Genera el primer valor
    indice = (int)(Math.random()* 10);
    nuevoIndice[0] = num[indice];
    
    for (int x = 0; x < 10; x++) {
      do {
        indice = (int)(Math.random()* 10);
        existe = false;
        for (int j = 0; j < x; j++) {
          if (nuevoIndice[j] == indice) {
            existe = true;
          }
        }
      } while (existe);
      nuevoIndice[x] = indice;
    }
    
    //Asigna los nuevos índices al array
    int[] nuevoArray = new int [10];
    for (int x = 0; x < 10; x++) {
      nuevoArray[x] = num[nuevoIndice[x]];
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
      System.out.printf("│%4d ", nuevoArray[x]);
    }
    System.out.println("│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
    
    
  }
}
