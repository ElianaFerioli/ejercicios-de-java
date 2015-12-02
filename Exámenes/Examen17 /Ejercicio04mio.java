/**
* Examen
*Escribe un programa que pida dos números por teclado y que luego mezcle en dos números
*diferentes los dígitos pares y los impares. Se van comprobando los dígitos de la siguiente manera:
*primer dígito del primer número, primer dígito del segundo número, segundo dígito del primer número,
*segundo dígito del segundo número, tercer dígito del primer número... Para facilitar el ejercicio,
*podemos suponer que el usuario introducirá dos números de la misma longitud y que siempre habrá al
*menos un dígito par y uno impar. Usa long en lugar de int donde sea necesario para admitir números
*largos.
*Ejemplo 1:
*Por favor, introduzca un número: 9402
*Introduzca otro número: 6782
*El número formado por los dígitos pares es 640822
*El número formado por los dígitos impares es 97
*Ejemplo 2:
*Por favor, introduzca un número: 137
*Introduzca otro número: 909
*El número formado por los dígitos pares es 0
*El número formado por los dígitos impares es 19379
* 
* 
* @author Eliana Ferioli
*/
public class Ejercicio04mio {
  public static void main(String[] args){
    
    System.out.print("Introduzca un número, por favor:");
    long numUnoIntroducido = Long.parseLong(System.console().readLine());
    
    System.out.print("Introduzca un segundo ńumero, por favor:");
    long numDosIntroducido = Long.parseLong(System.console().readLine());
    
    long numUno = numUnoIntroducido;
    long numDos = numDosIntroducido;
    
    //Se calcula la longitud y el divisor
    int contador = 0;
    int divisorUno = 1;
    while (numUno > 0) {
      numUno = numUno / 10;
      contador++;
    }
    for (int x = 1; x < contador; x++) {
      divisorUno = divisorUno *10;
    }
    numUno = numUnoIntroducido;
    int divisorDos = divisorUno;
    int divisorImparUno = divisorUno;
    int divisorImparDos = divisorUno;
    int contadorDos = contador;
    
    //Operaciones con los pares
    long digitoUno = 0;
    long digitoDos = 0;
    System.out.print("El número par formado es: ");
    while ((contador * 2) >= 0) {
      do {
        if ((numDos > 0) && (divisorDos > 0)) {
          digitoDos = numDos / divisorDos;
          numDos = numDos % divisorDos;
          divisorDos = divisorDos / 10;
          contador--;
        }
      } while ((digitoDos % 2) != 0);
      System.out.print(digitoDos);
      do {
        if ((numUno > 0) && (divisorUno > 0)) {
          digitoUno = numUno / divisorUno;
          numUno = numUno % divisorUno;
          divisorUno = divisorUno / 10;
          contador--;
        }
      } while ((digitoUno % 2) != 0);
      System.out.print(digitoUno);
    }
    
    //Operaciones con impares
    numUno = numUnoIntroducido;
    numDos = numDosIntroducido;
    System.out.println();
    System.out.print("El número impar formado es: ");
    while (contadorDos >= 0) {
      do {
        if ((numDos > 0) && (divisorImparDos > 0)) {
        digitoDos = numDos / divisorImparDos;
        numDos = numDos % divisorImparDos;
        divisorImparDos = divisorImparDos / 10;
        contadorDos--;
        }
      } while ((digitoDos % 2) == 0);
      System.out.print(digitoDos);
      do {
        if ((numUno > 0) && (divisorImparUno > 0)) {
        digitoUno = numUno / divisorImparUno;
        numUno = numUno % divisorImparUno;
        divisorImparUno = divisorImparUno / 10;
        contadorDos--;
        }
      } while ((digitoUno % 2) == 0);
      System.out.print(digitoUno);
    }
    
    


  }
}
