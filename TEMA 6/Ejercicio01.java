/**
 * Escribe un programa que muestre la tirada de tres dados. Se debe mostrar también la suma
 * total (los puntos que suman entre los tres dados).
 *
 * @author Eliana Ferioli
 */
public class Ejercicio01 {
  public static void main(String[] args) {
    System.out.println("Este programa muestra la tirada de tres dados.");
    int dado = 0;
    int suma = 0;
    for (int  x = 1; x <= 3; x++) {
    dado = (int)(Math.random() * 6 ) + 1;
    System.out.println("La tirada del " + x +"º dado es: " + dado);
    suma = suma + dado;
    }
    System.out.println("La suma de las tiradas es: " + suma);
  }
}
