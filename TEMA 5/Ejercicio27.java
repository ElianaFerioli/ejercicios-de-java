/**
 * 
 *
 * @author Eliana Ferioli
 */
public class Ejercicio27 {
  public static void main(String[] args) {
    System.out.println("El programa muestra, cuenta y suma los múltiplos de 3 contenidos entre 1 y un número introducido.");
    System.out.print("Por favor, introduzca un número: ");
    int numero = Integer.parseInt(System.console().readLine());
    int multiplo = 0;
    int suma = 0;
    int cuenta = 0;
    
    if (numero < 0) {
      System.out.println("El número introducido tiene que ser mayor a 1.");
    } else {
      for (int x = 1; x <= numero; x++) {
        if ((x % 3) == 0) {
          System.out.println("El número " + x + " es múltiplo de 3.");
          multiplo = x;
          suma = suma + multiplo;
          cuenta++;
        }
      }
      System.out.println("La cantidad de múltiplos contenidos es : " + cuenta);
      System.out.println("La suma total de los múltiplos de 3 es: " + suma);
    }
  }
}
