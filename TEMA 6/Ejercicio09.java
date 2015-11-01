/**
 * Realiza un programa que vaya generando números aleatorios pares entre 0 y 100 y que no
termine de generar números hasta que no saque el 24. El programa deberá decir al final
cuántos números se han generado.
 *
 * @author Eliana Ferioli
 */
public class Ejercicio09 {
  public static void main(String[] args) {
    System.out.println("Este programa, al azar, números pares entre 0 y 100 hasta que salga el 24.");
    int contador = 0;
    
    for (int x = 1; x != 24; x++) {
      int numeroaleatorio = (int)(Math.random() * 101);
      if ((numeroaleatorio % 2) == 0) {
      System.out.println(numeroaleatorio);
      contador++;
      }
    }
    System.out.println("El programa ha generado " + contador + " números.");
  }
}
