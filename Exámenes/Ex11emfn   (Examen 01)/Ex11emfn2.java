/**
 *
 *
 * @author Eliana Ferioli
 */
public class Ex11emfn2 {
  public static void main(String[] args) {
    System.out.println("Este programa pinta una L.");
    System.out.print("Por favor, introduzca la altura de la L: ");
    int alturaFinal = Integer.parseInt(System.console().readLine());
    int altura = 1;
    int ancho = (alturaFinal / 2) + 1;
    
    while (altura <= alturaFinal) {
      if (altura != alturaFinal) {
        System.out.println("*");
      } else {
        for (int x = 1; x <= ancho; x++) {
          System.out.print("*");
        }
      }
      altura++;
    }
  }
}
