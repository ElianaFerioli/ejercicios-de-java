/**
 *Escribe un programa que diga cuántos dígitos pares y cuántos dígitos impares hay dentro de un
número. Usa long en lugar de int donde sea necesario para admitir números más largos.
 *
 * @author Eliana Ferioli
 */
public class Ejercicio04 {
  public static void main(String[] args) {
    System.out.println("Este programa cuanta los dígitos pares e impares de un número.");
    
    System.out.print("Por favor introduzca un número largo: ");
    long numIntroducido = Long.parseLong(System.console().readLine());
    int contador = 0;
    long divisor = 1;
    long num = numIntroducido;
    int contadorPar = 0;
    int contadorImpar = 0;
    
    //Calcula la longitud del número
    do {
      num = num / 10;
      contador++;
    } while (num > 0);
    //Genera el divisor
    for (int x = 1; x < contador; x++) {
      divisor = divisor * 10;
    }
    //Busca el número y ve si es par o impar
    while (contador > 0) {
      long digitoBuscado = numIntroducido / divisor;
      if ((digitoBuscado % 2) == 0) {
        contadorPar++;
      } else {
        contadorImpar++;
      }
      contador--;
      numIntroducido = numIntroducido % divisor;
      divisor = divisor / 10;
    }
    System.out.println("El número introducido tiene " + contadorPar + " número pares y " + contadorImpar + " números impares.");
  }
}
