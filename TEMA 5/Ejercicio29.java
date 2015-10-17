/**
 * 
 *
 * @author Eliana Ferioli
 */
public class Ejercicio29 {
  public static void main(String[] args) {
    System.out.println("Este programa muestra los números enteros positivos menores a un número \nintroducido que sean divisibles por otros número introducido.");
    System.out.print("Por favor, introduzca un número: ");
    int primernumero = Integer.parseInt(System.console().readLine());
    System.out.print("Por favor, introduzca otro número: ");
    int segundonumero = Math.abs(Integer.parseInt(System.console().readLine()));
    
    if (primernumero > 0) {
      for (int x = 0; x <= primernumero; x++) {
        if ( (x % segundonumero) > 0) {
         System.out.println("El número " +  x + " no es divisible por del número " + segundonumero);
        }
      }
    } else {
      System.out.println("El número introducido debe ser positivo.");
    }
  }
}
