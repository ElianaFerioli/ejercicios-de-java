/**
 *
 *
 * @author Eliana Ferioli
 */
public class Ex12emfn1 {
  public static void main(String[] args) {
    System.out.println("Rellena un array y destaca los múltiplos de cinco o de siete.");
    int num[] = new int [20];
    //Guarda los números con números aleatorios
    for (int x = 0; x < 20; x++) {
      num[x] = (int)(Math.random() * 401);
    }
    
    
    //Muestra el array
    System.out.print("El array original es: \n");
    for (int x = 0; x < 20; x++) {
      System.out.print(num[x] + " ");
    }
    
    System.out.print("\n¿Qué números desea destacar (1-Los múltiplos de 5, 2-Los múltiplos de 7): ");
    int multiplo = Integer.parseInt(System.console().readLine());
    
    if (multiplo == 1) {
      System.out.print("El array final es: \n");
      for (int x = 0; x < 20; x++) {
        if ((num[x] % 5) == 0) {
          System.out.print("[" + num[x] + "] ");
        } else {
          System.out.print(num[x] + " ");
        }
      }
    } else if (multiplo == 2) {
      System.out.print("El array final es: \n");
      for (int x = 0; x < 20; x++) {
        if ((num[x] % 7) == 0) {
          System.out.print("[" + num[x] + "] ");
        } else {
          System.out.print(num[x] + " ");
        }
      }
    } else {
      System.out.print("La opción elegida no es correcta.");
    }
  }
}
