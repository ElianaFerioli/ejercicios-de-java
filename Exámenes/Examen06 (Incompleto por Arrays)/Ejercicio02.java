/**
 * Realiza un programa que pinte una cruz hecha de asteriscos. El programa debe pedir la longitud del
brazo de la cruz. El asterisco del centro no cuenta en esa longitud.
 *
 * @author Eliana Ferioli
 */
public class Ejercicio02 {
  public static void main(String[] args) {
    System.out.println("Este programa pinta una cruz a partir de una longitud introducida.");
    System.out.print("Introduce la longitud del brazo de la cruz: ");
    int longitudBrazo = Integer.parseInt(System.console().readLine());
    int altura = 0;
    
    while (altura < longitudBrazo) {    //pinta la parte de arriba.
      for(int x = 1; x <= longitudBrazo; x++) {
        System.out.print(" ");
      }
      System.out.print("*");
      System.out.println();
      altura++;
    }
    for(int x = 1; x <= ((altura * 2 ) + 1); x++) {   //pinta la línea media.
      System.out.print("*");
    }
    System.out.println();
    altura = 0;
    while (altura < longitudBrazo) {    //pinta la parte de abajo.
      for(int x = 1; x <= longitudBrazo; x++) {
        System.out.print(" ");
      }
      System.out.print("*");
      System.out.println();
      altura++;
    }
  }
}
    
