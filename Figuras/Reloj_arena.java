/**
 * Realiza un programa que pinte por pantalla un rombo hueco hecho con asteriscos. El programa debe
 * pedir la altura. Se debe comprobar que la altura sea un número impar mayor o igual a 3, en caso
 * contrario se debe mostrar un mensaje de error.
 *
 * @author Eliana Ferioli
 */
public class Reloj_arena {
  public static void main(String[] args) {
    System.out.println("Este programa dibuja un reloj de arena.");
    System.out.print("Por favor, introduzca la altura del reloj: ");
    int alturafinal = Integer.parseInt(System.console().readLine());
    int altura = 0;
    int espacios = 1;
    int i = 1;
    int j = 0;
    int relleno = alturafinal;
      
      
      if ((alturafinal < 3) ||  ((alturafinal % 2) == 0)) {
        System.out.println("La altura debe ser impar y mayor o igual a 3.");
      } else {
            
          while (altura <= (alturafinal / 2)) {   //pinta la parte de arriba
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
          
          altura = 1;
          espacios = alturafinal / 2;
          i = 0;
          j = 0;
          relleno = 3;
    
          while (altura <= (alturafinal / 2)) {     //pinta la parte de abajo
      
              for (i = 1; i < espacios; i++) {
                System.out.print(" ");
              }
              for (i = 1; i <= relleno; i++) {
                System.out.print("*");
              }
              System.out.println();
              espacios--;
              altura++;
              relleno = relleno + 2;;
          }
          
      }
  }
}
