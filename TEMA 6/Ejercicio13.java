/**
Escribe un programa que simule la tirada de dos dados. El programa deberá continuar
tirando los dados una y otra vez hasta que en alguna tirada los dos dados tengan el mismo
valor.
 *
 * @author Eliana Ferioli
 */
public class Ejercicio13 {
  public static void main(String[] args) {
    System.out.println("Este programa simula la tirada de dos dados.");
    int dadouno = 0;
    int dadodos = 0;
    int x = 1;
    
    do {
      dadouno = (int)(Math.random() * 6 ) + 1;
      dadodos = (int)(Math.random() * 6 ) + 1;
      System.out.println("La tirada nº" + x + " del primer dado y el segundo es: " + dadouno + " " + dadodos);
      x++;
    } while (dadouno != dadodos);
  }
}
