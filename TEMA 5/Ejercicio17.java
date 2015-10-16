/**
 *
 * @author Eliana Ferioli
 */
public class Ejercicio17 {
  public static void main(String[] args) {
    System.out.println("Este programa calcula la suma de los 100 números siguientes al número introducido.");
    System.out.print("Por favor, introducir un número: ");
    int num = Integer.parseInt(System.console().readLine());
    int x = 1;
    long suma = 0;
    
    if (num >= 0) {
        while (x <= 100) {
          suma = suma + (num + x);
          x++;
        }
        System.out.println("La suma de los 100 primeros números al número introducido es: " + suma);
    } else {
      System.out.println("El número introducido no es correcto");
    }
  }
}
