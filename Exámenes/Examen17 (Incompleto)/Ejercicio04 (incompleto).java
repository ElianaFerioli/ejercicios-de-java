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
    
    System.out.print("Por favor introduzca un número largo: ");
    long numIntroducidoUno = Long.parseLong(System.console().readLine());
    System.out.print("Por favor introduzca un número largo: ");
    long numIntroducidoDos = Long.parseLong(System.console().readLine());
    long numeroParUno = 0;
    long numeroImparUno = 0;
    long numeroParDos = 0;
    long numeroImparDos = 0;
    long digito = 0;
    
    while(numIntroducidoUno > 0) {
        //Busca los pares e impares del segundo número
        digito = numIntroducidoDos % 10;
        numIntroducidoDos = numIntroducidoDos / 10;
        
        if((digito% 2) == 0) {
          numeroParDos = (numeroParDos * 10) + digito;
        } else {
          numeroImparDos = (numeroImparDos * 10) + digito;
        }
      
      //busca los pares e impares del primer número
      digito = numIntroducidoUno % 10;
      numIntroducidoUno = numIntroducidoUno / 10;
      
      if((digito% 2) == 0) {
        numeroParDos = (numeroParDos * 10) + digito;
      } else {
        numeroImparDos= (numeroImparDos * 10) + digito;
      }
      
      
    }
    System.out.println(numeroParUno);
    System.out.println(numeroImparUno);
    System.out.println(numeroParDos);
    System.out.println(numeroImparDos);
      
    
  }
}
