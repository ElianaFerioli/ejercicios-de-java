/**
 *
 *
 * @author Eliana Ferioli
 */
public class Piramide_horizontal_vertice_der {
  public static void main(String[] args) {
    System.out.println("Este programa dibuja una piramide horizontal.");
    System.out.print("Por favor, introduzca la altura de la piramide: ");
    int alturafinal = Integer.parseInt(System.console().readLine());
    int altura = 1;
    int relleno = 1;
    
    while (altura <= alturafinal) {
      for(int x = 1; x <= relleno; x++) {
        System.out.print("*");
      }
      System.out.println();
      relleno++;
      altura++;
    }
    
    altura = alturafinal - 1;
    relleno = alturafinal -1;
    
    while (altura >= 1) {
      for (int x = 1; x <= relleno; x++) {
        System.out.print("*");
      }
    System.out.println();
    relleno--;
    altura--;
    }
    
    
  }
}
