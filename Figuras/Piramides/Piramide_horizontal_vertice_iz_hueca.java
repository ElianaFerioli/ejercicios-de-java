/**
 *
 *
 * @author Eliana Ferioli
 */
public class Piramide_horizontal_vertice_iz_hueca {
  public static void main(String[] args) {
    System.out.println("Este programa dibuja una piramide horizontal.");
    System.out.print("Por favor, introduzca la altura de la piramide: ");
    int alturafinal = Integer.parseInt(System.console().readLine());
    int espacios = alturafinal - 1;
    int relleno = 1;
    int altura = 1;
    int hueco = 1;
    
    
    while (altura <= alturafinal) {           //pinta la parte de arriba
      for(int x = 1; x <= espacios; x++) {
        System.out.print(" ");
      }
      for (int x = 0; x <= (relleno - hueco); x++) {
        System.out.print("*");
        if (relleno > 2) {
          for (int i = 1; i <= hueco; i++) {
            System.out.print(" ");
          }
          x++;
          hueco++;
        }
      }
      if (relleno > 2) {
        System.out.print("*");
      }
      System.out.println();
      espacios--;
      relleno++;
      altura++;
    }
    
    altura = alturafinal - 1;
    espacios = 1;
    hueco = alturafinal - 3;
    relleno = alturafinal - 1;
    
    while (altura >= 1) {
      for(int x = 1; x <= espacios; x++) {
        System.out.print(" ");
      }
      for(int x = 1; x < relleno; x++) {
        System.out.print("*");
        if (altura > 2) {
          for (int i = 1; i <= hueco; i++) {
            System.out.print(" ");
            x++;
          }
          hueco--;
        }
      }
      System.out.print("*");
      System.out.println();
      espacios++;
      altura--;
      relleno--;
    }
  }
}
