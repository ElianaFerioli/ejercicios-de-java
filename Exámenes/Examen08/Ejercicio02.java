/**
 * Escribe un programa que mezcle los dígitos de dos números de la misma longitud que se introducen
por teclado. Se debe comprobar que los dos números efectivamente tienen la misma longitud. Se
recomienda usar long en lugar de int ya que el primero admite números más largos.
 *
 * @author Eliana Ferioli
 */
public class Ejercicio02 {
  public static void main(String[] args) {
    System.out.println("Este programa mezcla dos números.");
    System.out.print("Por favor, introduzca un número entero positivo: ");
    long numUno = Long.parseLong(System.console().readLine());
    System.out.print("Ahora introduzca uno de la misma longitud: ");
    long numDos = Long.parseLong(System.console().readLine());
    
    long vueltaUno = 0;
    long vueltaDos = 0;
    long comprobadorUno = numUno;
    int contadorUno = 0;
    long comprobadorDos = numDos;
    int contadorDos = 0;
    
    while (comprobadorUno > 0) {
      comprobadorUno = comprobadorUno / 10;
      contadorUno++;
    }
    while (comprobadorDos > 0) {
      comprobadorDos = comprobadorDos / 10;
      contadorDos++;
    }
    
    if (contadorUno == contadorDos) {
        while (numUno > 0) {
          vueltaUno = (vueltaUno * 10) + (numUno % 10);
          numUno /= 10;
        }
        while (numDos > 0) {
          vueltaDos = (vueltaDos * 10) + (numDos % 10);
          numDos /= 10;
        }
        
        System.out.print("El número mezclado es: ");
        while (vueltaDos > 0) {
          System.out.print(vueltaUno % 10);
          System.out.print(vueltaDos % 10);
          vueltaUno = vueltaUno / 10;
          vueltaDos = vueltaDos / 10;
        }
    } else {
      System.out.println("La longitud de los números introducidos no es la correcta");
    }
  }
}
