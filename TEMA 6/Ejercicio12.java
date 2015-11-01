/**
Realiza un programa que llene la pantalla de caracteres aleatorios (a lo Matrix) con el código
ascii entre el 32 y el 126. Puedes hacer casting con (char) para convertir un entero en un
carácter.
 *
 * @author Eliana Ferioli
 */
public class Ejercicio12 {
  public static void main(String[] args) {
    System.out.println("Este programa llena la pantalla de caracteres.");
    int x = 1;
    
    while (x > 0) {
      char caracter = (char)((Math.random() * 95) + 32);
      System.out.print(caracter);
      }
  }
}
