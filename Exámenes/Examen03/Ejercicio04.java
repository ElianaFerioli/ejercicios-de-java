/**
 * Escribe un programa que pida un número entero (como máximo de 5 cifras) y a continuación un dígito
y que luego nos diga en qué posición del número se encuentra el dígito, contando de izquierda a
derecha y empezando por 1.
 *
 * @author Eliana Ferioli
 */
public class Ejercicio04 {
  public static void main(String[] args) {
    System.out.println("Este programa muestra la posición en la que se encuentra un dígito en un número introducido.");
    System.out.print("Por favor, introduzca un número: ");
    int num = Integer.parseInt(System.console().readLine());
    System.out.print("Por favor, introduzca el dígito que quiere buscar: ");
    int dig = Integer.parseInt(System.console().readLine());
    
    int nuevonum = 1;
    int contador = 1;
    int i = 1;
    int x = 10;
    
    while (i > 0) {
      if ((num >= i) && (num < x)) {
        nuevonum = num / i;
          if (nuevonum == dig) {
            System.out.println("Este número esta en la posición " + contador + ".");
          }
        contador++;
        num = num % i;
        i = i / 10;
        x = x / 10;
      } else {
        i = i * 10;
        x = x * 10;
      }
    }
  }
}
