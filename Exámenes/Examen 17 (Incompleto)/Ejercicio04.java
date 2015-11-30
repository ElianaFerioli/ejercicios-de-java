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
    long numIntroducidoImpUno = numIntroducidoUno;
    long numIntroducidoImpDos = numIntroducidoDos;
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
    int contadorImparUno = contadorUno;
    //Calcula la longitud del número Dos
    do {
      numDos = numDos / 10;
      contadorDos++;
    } while (numDos > 0);
    int contadorImparDos = contadorDos;
    //Genera el divisor uno
    for (int x = 1; x < contadorUno; x++) {
      divisorUno = divisorUno * 10;
    }
    long divisorImparUno = divisorUno;
    //Genera el divisor dos
    for (int x = 1; x < contadorDos; x++) {
      divisorDos = divisorDos * 10;
    }
    long divisorImparDos = divisorDos;
    
    //Genera el número par
    System.out.print("El número par generado es: ");
    while (contadorUno > 0) {
      if (numIntroducidoUno > 0) {
        while ((numUno % 2) != 0); {
          numUno = numIntroducidoUno / divisorUno;
          numIntroducidoUno = numIntroducidoUno % divisorUno;
          divisorUno = divisorUno / 10;
        } 
        System.out.print(numUno);
      }
      if (numIntroducidoDos > 0) {
        do {
          numDos = numIntroducidoDos / divisorDos;
          numIntroducidoDos = numIntroducidoDos % divisorDos;
          divisorDos = divisorDos / 10;
        } while ((numDos % 2) != 0);
        System.out.print(numDos);
      }
      contadorUno--;
    }
    
    //Genera el número impar
    System.out.print("\nEl número impar generado es: ");
    while (contadorImparUno > 0) {
      if (numIntroducidoImpUno > 0) {
        do {
          numUno = numIntroducidoImpUno / divisorImparUno;
          numIntroducidoImpUno = numIntroducidoImpUno % divisorImparUno;
          divisorImparUno = divisorImparUno / 10;
        } while ((numUno % 2) == 0);
        System.out.print(numUno);
        contadorImparUno--;
      }
      if (numIntroducidoImpDos > 0) {
        do {
          numDos = numIntroducidoImpDos / divisorImparDos;
          numIntroducidoImpDos = numIntroducidoImpDos % divisorImparDos;
          divisorImparDos = divisorImparDos / 10;
        } while ((numDos % 2) == 0);
        System.out.print(numDos);
        contadorImparDos--;
      }
    }
    
    
    
    
  }
}
