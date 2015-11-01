/**
 *
 * @author Eliana Ferioli
 */
public class Ejercicio24 {
  public static void main(String[] args) {
    System.out.println("Este programa lee un número n e imprime una pirámide de números con n filas.");
    System.out.print("Por favor, introducir un número entero: ");
    int n = Integer.parseInt(System.console().readLine());
    int alturainicial = n;
    int altura = 1;
    int espacios = alturainicial - 1;
    int i = 0;
    int j = i;

    while (altura <= alturainicial) {
      
      for (i = 0; i < espacios; i++) {
        System.out.print(" ");
      }
      
      for (i = 1; i < altura * 2; i++) {
        
        if ( i <= altura) {
        System.out.print(i);
        } else if (i > altura) {
          j = i -2;
            do{
            System.out.print(j);
            j--;
            } while (j >= 1);
          i = altura * 2;
        }
      }
      System.out.println();
      espacios--;
      altura++;
    }
  }
}
