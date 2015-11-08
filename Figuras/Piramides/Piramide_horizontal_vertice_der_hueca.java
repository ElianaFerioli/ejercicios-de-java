/**
 *
 *
 * @author Eliana Ferioli
 */
public class Piramide_horizontal_vertice_der_hueca {
  public static void main(String[] args) {
    System.out.println("Este programa dibuja una piramide horizontal.");
    System.out.print("Por favor, introduzca la altura de la piramide: ");
    int alturafinal = Integer.parseInt(System.console().readLine());
    int altura = 1;
    int relleno = 1;
    int hueco = 1;
    
    while (altura <= alturafinal) {
      for(int x = 1; x <= (relleno - hueco); x++) {
        System.out.print("*");
        for (int i = 1; i < hueco; i++) {
          System.out.print(" ");
          x++;
        }
        hueco++;
      }
      System.out.print("*");
      System.out.println();
      relleno++;
      altura++;
    }
    
    altura = alturafinal - 1;
    relleno = alturafinal - 2;
    hueco = alturafinal - 3;
    
    while (altura >= 1) {
        System.out.print("*");
        for (int i = 1; i <= hueco; i++){
        System.out.print(" ");
       }
      hueco--;
    if (altura > 1) {
    System.out.print("*");
    }
    System.out.println();
    relleno--;
    altura--;
    }
  }
}
