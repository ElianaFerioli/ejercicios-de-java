/**
 *
 * @author Eliana Ferioli
 */
public class Ejercicio16 {
  public static void main(String[] args) {
    System.out.println("Este programa calculará si el número introducido es o no primo.");
    System.out.print("Por favor, introducir un número: ");
    int num = Integer.parseInt(System.console().readLine());
    int x = 1;
    int resto = 0;
    int suma = 0;
    
    do {
      resto = num % x;
      if (resto == 0) {
        suma++;
      }
      x++;
    } while (x <= num);
    
    if (suma == 2) {
      System.out.println("El número " + num + " es un número primo.");
    } else {
      System.out.println("El número " + num + " no es un número primo.");
    }
  }
}
