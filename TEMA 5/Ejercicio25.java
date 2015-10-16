/**
 * 
 *
 * @author Eliana Ferioli
 */
public class Ejercicio25 {
  public static void main(String[] args) {
    System.out.println("EL programa mostrará el número introducido leido al revés.");
    System.out.print("Por favor introduzca un número: ");
    int num = Integer.parseInt(System.console().readLine());
    int nuevo = 0;

    
    while (num > 0) {
      nuevo = (nuevo * 10) + (num % 10);
      num = num / 10;
      }
    System.out.println("El número dado vuelta es: " + nuevo);
  }
}
