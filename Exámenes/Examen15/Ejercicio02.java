/**
 * Realiza un programa que pida 10 números enteros por teclado y que luego diga cuántos de esos
números son primos. Los primos repetidos también cuentan. El número 1, por convenio, no se
considera primo (el 0 tampoco es primo).
 *
 * @author Eliana Ferioli
 */
public class Ejercicio02 {
  public static void main(String[] args) {
    System.out.println("Este programa pide 10 número y dice cuántos primos hay.");
    boolean esPrimo = true;
    int contador = 0;
    
    for (int x = 1; x <= 10; x++) {
      System.out.print("Por favor, introduzca el " + x + "º número: ");
      int num = Integer.parseInt(System.console().readLine());
      if ((num != 2) &&(num != 1) && (num != 0)) {
        for (int i = 2; i <= (num / 2); i++) {
          if ((num % i) == 0) {
            esPrimo = false;
          }
        }
        if (esPrimo) {
          contador++;
        }
      }
      esPrimo = true;
    }
    System.out.println("La cantidad de numeros primos introducida es: " + contador);
  }
}
