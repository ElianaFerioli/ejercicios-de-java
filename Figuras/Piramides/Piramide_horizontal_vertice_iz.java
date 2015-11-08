/**
 *
 *
 * @author Eliana Ferioli
 */
public class Piramide_horizontal_vertice_iz {
  public static void main(String[] args) {
    System.out.println("Este programa dibuja una piramide horizontal.");
    System.out.print("Por favor, introduzca la altura de la piramide: ");
    int alturafinal = Integer.parseInt(System.console().readLine());
    int espacios = alturafinal - 1;
    int relleno = 1;
    int altura = 1;
    
    
    while (altura <= alturafinal) {           //pinta la parte de arriba
      for(int x = 1; x <= espacios; x++) {
        System.out.print(" ");
      }
      for (int x = 1; x <= relleno; x++) {
        System.out.print("*");
      }
      System.out.println();
      espacios--;
      relleno++;
      altura++;
    }
    
    altura = 1;
    espacios = 1;
    relleno = alturafinal - 1;
    
    while (altura <= (alturafinal - 1)) {             //pinta la parte de abajo
      for(int x = 1; x <= espacios; x++) {
        System.out.print(" ");
      }
      for (int x = 1; x <= relleno; x++) {
        System.out.print("*");
      }
      System.out.println();
      espacios++;
      relleno--;
      altura++;
    }
    
    
  }
}
