/**
 * Escribe un programa que rellene un array con 10 números aleatorios (números entre 0 y 100) y que luego cree
otro array con esos mismos números “barajados”, es decir, reordenados de forma aleatoria. Puede haber
números repetidos en el array original.
 *
 * @author Eliana Ferioli
 */
public class Ejercicio04 {
  public static void main(String[] args) {
    System.out.println("Este programa genera, aleatoriamente, un array de 10 números y los mezcla.");
    int[] num = new int[10];
    
    //Le asigna valores al array
    for(int x = 0; x < 10; x++) {
      num[x] = (int)(Math.random() * 101);
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
    
    //Los mezcla
    int[] indiceMezclado = new int [10];
    int indice = 0;
    boolean existe = false;
    //Genera el primer valor
    indice = (int)(Math.random()* 10);
    indiceMezclado[0] = indice;
    
    for (int x = 1; x < 10; x++) {
      do {
        indice = (int)(Math.random()* 10);
        existe = false;
        for (int j = 0; j < x; j++) {
          if (indiceMezclado[j] == indice) {
            existe = true;
          }
        }
      } while (existe);
      indiceMezclado[x] = indice;
    }
    
    //Asigna los nuevos índices a un nuevo array
    int[] nuevoArray = new int [10];
    for (int x = 0; x < 10; x++) {
      nuevoArray[x] = num[indiceMezclado[x]];
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
      System.out.printf("│%4d ", nuevoArray[i]);
    }
    System.out.println("│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
  }
}
