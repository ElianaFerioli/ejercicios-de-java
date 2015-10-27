/**
 * Realiza un programa que calcule los litros que caben en una pecera a partir de sus dimensiones
(ancho, alto y largo en centímetros). Tanto los datos introducidos como el resultado pueden contener
decimales.
 *
 * @author Eliana Ferioli
 */
public class Ejercicio01 {
  public static void main(String[] args) {
    System.out.println("Este programa calcula los litros que caben en una pecera.");
    System.out.print("Por favor, introduzca el ancho de la pecera: ");
    double ancho = Double.parseDouble(System.console().readLine());
    System.out.print("Por favor, introduzca el alto de la pecera: ");
    double alto = Double.parseDouble(System.console().readLine());
    System.out.print("Por favor, introduzca el largo de la pecera: ");
    double largo = Double.parseDouble(System.console().readLine());
    
    System.out.printf("La capacidad de la pecera es %.3f litros.", ((ancho * alto * largo) / 1000));
  
  }
}
