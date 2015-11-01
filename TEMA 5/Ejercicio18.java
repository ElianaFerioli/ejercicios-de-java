/**
 *
 * @author Eliana Ferioli
 */
public class Ejercicio18 {
  public static void main(String[] args) {
    System.out.println("Este programa calcula los números enteros comprendidos entre dos\nnúmeros introducidos por teclado.");
    System.out.print("Por favor, introducir el primer número: ");
    int x1 = Integer.parseInt(System.console().readLine());
    System.out.print("Por favor, introducir el segundo número: ");
    int x2 = Integer.parseInt(System.console().readLine());
    int aux = 0;
    
      if (x1 == x2) {
        System.out.println("Los números introducidos deben ser distintos");
      } else {
          if (x1 > x2) {
            aux = x1;
            x1 = x2;
            x2 = aux;
          }
      }
      
      if ((x2-x1) < 7) {
        System.out.println("La diferencia entre los números no es suficiente.");
      } else {
        int i = x1;
        while (i <= x2) {
        System.out.println("Número entero: " + i);
        i = i + 7;
        }
      }
  }
}
