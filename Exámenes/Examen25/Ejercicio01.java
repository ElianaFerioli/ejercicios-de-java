/**
 *Escribe un programa que, dado un número introducido por teclado, elija al azar uno de sus dígitos.
 *
 * @author Eliana Ferioli
 */
public class Ejercicio01 {
  public static void main(String[] args) {
    System.out.println("Este programa elige un dígito al azar de un número introducido.");
    System.out.print("Por favor, introduzca un número: ");
    long numIntroducido = Long.parseLong(System.console().readLine());
    
    int contador = 0;
    long num = numIntroducido;
    long divisor = 1;
    
    //Busca el divisor del número
    do {
      num = num / 10;
      contador++;
    } while (num > 0);
    
    for (int x = 1; x < contador; x++) {
      divisor = divisor * 10;
    }
    
    //Genera un array del númeroIntroducido
    long[] arrayNumeroIntroducido = new long[contador];
    for (int x = 0; x < contador; x++) {
      arrayNumeroIntroducido[x] = numIntroducido / divisor;
      numIntroducido = numIntroducido % divisor;
      divisor = divisor / 10;
    }
    
    //Elige un índice del array al azar
    int numAzar = (int)((Math.random() * contador));
    
    //Muestra el número del array correspondiente a ese índice
    System.out.print("El dígito seleccionado al azar es: " + arrayNumeroIntroducido[numAzar]);
  }
}
