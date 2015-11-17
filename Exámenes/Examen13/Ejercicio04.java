/**
 *Realiza un programa que pinte la letra Z hecha de asteriscos. El programa debe pedir la altura de la
letra, que deberá ser un número mayor o igual que 4. En caso de que el usuario introduzca un número
no válido, se mostrará un mensaje de error.
 *
 * @author Eliana Ferioli
 */
public class Ejercicio04 {
  public static void main(String[] args) {
    System.out.println("Este programa pinta una Z.");
    
    System.out.print("Por favor, introduzca la altura de la Z: ");
    int alturaFinal = Integer.parseInt(System.console().readLine());
    
    int altura = 2;
    int espacios = alturaFinal - 2;
    
    if (alturaFinal < 4) {
      System.out.println("El número introducido no es correcto.");
    } else {
        for (int x = 1; x <= alturaFinal; x++) {
          System.out.print("*");
        }
        System.out.println();
        while (altura <= (alturaFinal - 1)) {
          for (int x = 1; x <= espacios; x++) {
          System.out.print(" ");
          }
          System.out.print("*");
          System.out.println();
          espacios--;
          altura++;
        }
        for (int x = 1; x <= alturaFinal; x++) {
          System.out.print("*");
        }
    }
  }
}
