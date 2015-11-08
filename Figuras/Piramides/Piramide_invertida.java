/**
 *
 * @author Eliana Ferioli
 */
public class Piramide_invertida {
  public static void main(String[] args) {
    System.out.println("Este programa dibuja un reloj de arena.");
    System.out.print("Por favor, introduzca la altura de la piramide: ");
    int alturafinal = Integer.parseInt(System.console().readLine());
    int altura = 1;
    int espacios = 1;
    int i = 1;
    int j = 0;
    int relleno = alturafinal + (alturafinal -1);
            
          while (altura <= (alturafinal)) {   //pinta la parte de arriba
            for (i = 1; i < espacios; i++) {
              System.out.print(" ");
            }
            for (i = 1; i <= relleno; i++) {
              System.out.print("*");
            }
            System.out.println();
            espacios++;
            altura++;
            relleno = relleno - 2;;
          }
  }
}
