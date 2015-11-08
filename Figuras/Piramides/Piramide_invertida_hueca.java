/**
 *
 * @author Eliana Ferioli
 */
public class Piramide_invertida_hueca {
  public static void main(String[] args) {
    System.out.println("Este programa dibuja una piramide invertida hueca.");
    System.out.print("Por favor, introduzca la altura de la piramide: ");
    int alturafinal = Integer.parseInt(System.console().readLine());
    int altura = 1;
    int espacios = 1;
    int i = 1;
    int relleno = alturafinal + (alturafinal -1);
    int hueco = relleno - 2;
            
          while (altura <= (alturafinal)) {   //pinta la parte de arriba
            for (i = 1; i < espacios; i++) {
              System.out.print(" ");
            }
              System.out.print("*");
              for (int j=1; j <= hueco; j++) {
                if (altura == 1) {
                System.out.print("*");
                } else {
                System.out.print(" ");
                }
              }
              if (altura < alturafinal) {
              System.out.print("*");
              }
            System.out.println();
            espacios++;
            altura++;
            relleno = relleno - 2;
            hueco = hueco - 2;
          }
  }
}
