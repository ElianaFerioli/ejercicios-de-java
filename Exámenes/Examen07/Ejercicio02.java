/**
 * Escribe un programa que diga si un número introducido por teclado es o no capicúa. Los números capicúa se
leen igual hacia delante y hacia atrás. El programa debe aceptar números de cualquier longitud siempre que lo
permita el tipo, en caso contrario el ejercicio no se dará por bueno. Se recomienda usar long en lugar de int ya
que el primero admite números más largos.
 *
 * @author Eliana Ferioli
 */
public class Ejercicio02 {
  public static void main(String[] args) {
    System.out.println("Este determina si un número es o no capicúa");
    System.out.print("Por favor, introduzca un número entero positivo: ");
    long numeroIntroducido = Long.parseLong(System.console().readLine());
    
    long numero = numeroIntroducido;
    long vuelta = 0;
    
    while (numero > 0) {
      vuelta = (vuelta * 10) + (numero % 10);
      numero /= 10;
    }
    
    if (vuelta == numeroIntroducido) {
      System.out.println("El número introducido es capicúa.");
    } else {
      System.out.println("El número introducido no es capicúa.");
    }
  }
}
