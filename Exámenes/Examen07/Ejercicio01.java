/**
 * Realiza un programa que pinte una X hecha de asteriscos. El programa debe pedir la altura. Se debe
comprobar que la altura sea un número impar mayor o igual a 3, en caso contrario se debe mostrar un
mensaje de error.
 *
 * @author Eliana Ferioli
 */
public class Ejercicio01 {
  public static void main(String[] args) {
    System.out.println("Este programa dibuja una X.");
    System.out.print("Por favor, introduzca la altura de la X: ");
    int alturafinal = Integer.parseInt(System.console().readLine());
    int altura = alturafinal;
    int tope = alturafinal / 2;
    int espacios = 0;
    int relleno = alturafinal - 2;
      
      
      if ((alturafinal < 3) ||  ((alturafinal % 2) == 0)) {
        System.out.println("La altura debe ser impar y mayor o igual a 3.");
      } else {
        while (alturafinal > tope) {
          for (int espaciospintados = espacios; espaciospintados > 0; espaciospintados--) {
            System.out.print(" ");
          }
          espacios++;
          System.out.print("*");
          for (int rellenopintado = relleno; rellenopintado > 0; rellenopintado--) {
            System.out.print(" ");
          }
          if (altura > 1) {
          System.out.print("*");
          }
          System.out.println();
          alturafinal--;
          altura = altura - 2;
          relleno = relleno - 2;
        }
        espacios = espacios - 2;
        relleno = 1;
        
        while (tope > 0) {
          for (int espaciospintados = espacios; espaciospintados > 0; espaciospintados--) {
            System.out.print(" ");
          }
          espacios--;
          System.out.print("*");
          for (int rellenopintado = relleno; rellenopintado > 0; rellenopintado--) {
            System.out.print(" ");
          }
          relleno = relleno + 2;
          System.out.print("*");
          System.out.println();
          tope--;
        }
      }
  }
}
