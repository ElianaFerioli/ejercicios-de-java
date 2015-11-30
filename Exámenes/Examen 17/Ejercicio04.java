/**
 *Escribe un programa que pida dos números por teclado y que luego mezcle en dos números
diferentes los dígitos pares y los impares. Se van comprobando los dígitos de la siguiente manera:
primer dígito del primer número, primer dígito del segundo número, segundo dígito del primer número,
segundo dígito del segundo número, tercer dígito del primer número... Para facilitar el ejercicio,
podemos suponer que el usuario introducirá dos números de la misma longitud y que siempre habrá al
menos un dígito par y uno impar. Usa long en lugar de int donde sea necesario para admitir números
 *
 * @author Eliana Ferioli
 */
public class Ejercicio04 {
  public static void main(String[] args) {
    System.out.println("Este programa separa los dígitos pares e impares de dos número.");
    
    System.out.print("Por favor introduzca un número largo: ");
    long numIntroducidoUno = Long.parseLong(System.console().readLine());
    System.out.print("Por favor introduzca otro número largo: ");
    long numIntroducidoDos = Long.parseLong(System.console().readLine());
    int contadorUno = 0;
    long divisorUno = 1;
    int contadorDos = 0;
    long divisorDos = 1;
    long numUno = numIntroducidoUno;
    long numDos = numIntroducidoDos;
    
    //Calcula la longitud del número Uno
    do {
      numUno = numUno / 10;
      contadorUno++;
    } while (numUno > 0);
    //Calcula la longitud del número Dos
    do {
      numDos = numDos / 10;
      contadorDos++;
    } while (numDos > 0);
    //Genera el divisor uno
    for (int x = 1; x < contadorUno; x++) {
      divisorUno = divisorUno * 10;
    }
    //Genera el divisor dos
    for (int x = 1; x < contadorDos; x++) {
      divisorDos = divisorDos * 10;
    }
    
    
    //Busca el número y ve si es par
  }
}
