/**
 *
 * @author Eliana Ferioli
 */
public class Reloj_de_arena_hueco {
  public static void main(String[] args) {
    System.out.println("Este programa dibuja un reloj de arena hueco.");
    System.out.print("Por favor, introduzca la altura del reloj: ");
    int alturafinal = Integer.parseInt(System.console().readLine());
    alturafinal = alturafinal/2;
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
      
      altura = 1;
      espacios = alturafinal - 1;
      relleno = 0;
      
      while (altura < alturafinal) {          //pinta la parte de abajo
      
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
  
    for (i = 1; i < (alturafinal * 2); i++) {
      System.out.print("*");
    }
      
  }
}
