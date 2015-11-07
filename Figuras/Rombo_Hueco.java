/**
 *
 *
 * @author Eliana Ferioli
 */
public class Rombo_Hueco {
  public static void main(String[] args) {
    System.out.println("Este programa dibuja un rombo.");
    System.out.print("Por favor, introduzca la altura del rombo: ");
    int alturafinal = Integer.parseInt(System.console().readLine());
    int altura = 1;
    int espacios = alturafinal / 2;
    int i = 0;
    int j = 0;
    int relleno = 0;
      
      
      if ((alturafinal < 3) ||  ((alturafinal % 2) == 0)) {
        System.out.println("La altura debe ser impar y mayor o igual a 3.");
      } else {
            while (altura <= (alturafinal / 2)) {
      
            for (i = 1; i <= espacios; i++) {
              System.out.print(" ");
            }
            System.out.print("*");
            for (i = 1; i < relleno; i++) {
              System.out.print(" ");
            }
            if (altura > 1) {
              System.out.print("*");
            }
              
            System.out.println();
            espacios--;
            altura++;
            relleno = relleno + 2;;
          }
          
          System.out.print("*");
          for (int x = 1; x <= (alturafinal - 2); x++) {
            System.out.print(" ");
          }
          System.out.print("*");
          System.out.println();
           
           altura = 1;
           espacios = 1;
           relleno = alturafinal - 4;
          
          while (altura <= (alturafinal / 2)) {
            for (i = 0; i < espacios; i++) {
              System.out.print(" ");
            }
            System.out.print("*");
            for (i = 1; i <= relleno; i++) {
              System.out.print(" ");
            }
            if (altura < (alturafinal / 2)) {
              System.out.print("*");
            }

            System.out.println();
            espacios++;
            altura++;
            relleno = relleno - 2;;
          }
      }
  }
}
