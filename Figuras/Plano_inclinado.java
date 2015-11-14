/**
 * 
 *
 * @author Eliana Ferioli
 */
public class Plano_inclinado {
  public static void main(String[] args) {
    System.out.println("Este programa muestra un plano inclinado con una pelota.");
    System.out.print("Introduce la altura del plano: ");
    int alturafinal = Integer.parseInt(System.console().readLine());
    int pelota = (int)(Math.random() * alturafinal + 1);
    int relleno = 1;
    int altura = 1;
    
    
    
    while (altura <= alturafinal) {
      for (int x = 1 ; x <= relleno; x++) {
      System.out.print("*");
      }
      if (altura == pelota) {
      System.out.print("@");
      }
      relleno++;
      System.out.println();
      altura++;
    }
  }
}
