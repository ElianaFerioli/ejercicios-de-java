/**
 *Escribe un programa que diga cuántos dígitos pares y cuántos dígitos impares hay dentro de un
número. Se recomienda usar long en lugar de int ya que el primero admite números más largos.
 *
 * @author Eliana Ferioli
 */
public class Ejercicio02 {
  public static void main(String[] args) {
    System.out.println("Este programa dice cuantos dígitos pares y \ncuantos impares hay dentro de un número.");
    System.out.print("Por favor, introduzca un número entero: ");
    long num = Long.parseLong(System.console().readLine());
    
    long nuevonum = 0;
    int contadorpar = 0;
    int contadorimpar = 0;
    
    while (num > 0) {
      nuevonum = num % 10;
      if ((nuevonum % 2) == 0) {
        contadorpar++;
      } else {
        contadorimpar++;
      }
      num = num / 10;
    }
    
    System.out.println("La cantidad de dígitos pares es: " + contadorpar);
    System.out.println("La cantidad de dígitos impares es: " + contadorimpar);
  }
}
