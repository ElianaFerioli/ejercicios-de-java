/**
 *Escribe un programa que muestre por pantalla un array de 10 números enteros generados al azar
entre 0 y 100. A continuación, el programa debe pedir un número al usuario. Se debe comprobar que
el número introducido por teclado se encuentra dentro del array, en caso contrario se mostrará un
mensaje por pantalla y se volverá a pedir un número; así hasta que el usuario introduzca uno
correctamente. A continuación, el programa rotará el array hacia la derecha las veces que haga falta
hasta que el número introducido quede situado en la posición 0 del array. Por último, se mostrará el
array rotado por pantalla.
 *
 * @author Eliana Ferioli
 */
public class Ejercicio02 {
  public static void main(String[] args) {
    System.out.println("Este programa rota un array hasta el número introducido por el usuario.");
    
    int[] num = new int[10];

    
    //Pide los números
    for (int x = 0; x < 10; x++) {
      num[x] = (int)((Math.random()) * 100);
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
    
    
    //Pide un número
    int numIntroducido = 0;
    boolean existe = false;
    do {
      System.out.print("Por favor, introduzca un número: ");
      numIntroducido = Integer.parseInt(System.console().readLine());
      for (int x = 0; x < 10; x++) {
        if (num[x] == numIntroducido) {
          existe = true;
        }
      }
    } while(!existe);
    
    //Rota el array
    while (num[0] != numIntroducido) {
      int aux = num[9];
      for (int i = 9; i > 0; i--) {
        num[i] = num[i-1];
      }
      num[0] = aux;
    }
    
    //Muestra el array final junto con los índices
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
