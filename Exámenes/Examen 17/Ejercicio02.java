/**
 *Realiza un programa que pinte la letra U por pantalla hecha con asteriscos. El programa pedirá la
altura. Fíjate que el programa inserta un espacio y pinta dos asteriscos menos en la base para simular
la curvatura de las esquinas inferiores.
 *
 * @author Eliana Ferioli
 */
public class Ejercicio02 {
  public static void main(String[] args) {
    System.out.println("Este programa pinta una U a partir de una longitud introducida.");
    System.out.print("Por favor introduce una altura: ");
    int alturaIntroducida = Integer.parseInt(System.console().readLine());
    
    int altura = 1;
    
    while (altura <= alturaIntroducida) {
      if (altura  <= (alturaIntroducida - 1)) {
        System.out.print("*");
        for (int x = 1; x <= alturaIntroducida; x++) {
          System.out.print(" ");
        }
        System.out.print("*");
        System.out.println();
        altura++;
      } else {
        System.out.print("  ");
        for (int x = 1; x <= (alturaIntroducida - 2); x++) {
          System.out.print("*");
        }
        System.out.print("  ");
        altura++;
      }
    }
  }
}
