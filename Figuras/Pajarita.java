/**
 *
 *
 * @author Eliana Ferioli
 */
public class Pajarita {
  public static void main(String[] args) {
    System.out.println("Este programa dibuja una pajarita.");
    System.out.print("Por favor, introduzca la altura de la pajarita: ");
    int alturafinal = Integer.parseInt(System.console().readLine());
    int altura = 1;
    int ladoiz = 1;
    int ladoder = 1;
    int relleno = alturafinal - 2;
    
    if ((alturafinal < 3) || ((alturafinal % 2) == 0)) {
      System.out.println("La altura debe ser impar y mayor a 3.");
    } else {
          
        while (altura <= (alturafinal / 2)) {       //pinta la parte de arriba
          
          for (int x = 1; x <= ladoiz; x++) {
            System.out.print("*");
          }
          for (int x = 1; x <= relleno; x++) {
            System.out.print(" ");
          }
          for (int x = 1; x <= ladoder; x++) {
            System.out.print("*");
          }
          System.out.println();
          altura++;
          relleno = relleno - 2;
          ladoiz++;
          ladoder++;
        }
        
        for(int x = 1; x <= alturafinal; x++) {         //pinta la línea del medio
          System.out.print("*");
        }
        System.out.println();
        
        altura = 1;
        ladoiz = alturafinal / 2;
        ladoder = alturafinal / 2;
        relleno = 1;
        
        while (altura <= (alturafinal / 2)) {         //pinta la parte de abajo
          
          for (int x = 1; x <= ladoiz; x++) {
            System.out.print("*");
          }
          for (int x = 1; x <= relleno; x++) {
            System.out.print(" ");
          }
          for (int x = 1; x <= ladoder; x++) {
            System.out.print("*");
          }
          System.out.println();
          relleno = relleno + 2;
          ladoiz--;
          ladoder--;
          altura++;
        }
    }
  }
}
