/**
 *
 * @author Eliana Ferioli
 */
public class Ejercicio19alternativo {
  public static void main(String[] args) {
    System.out.println("Este programa dibuja una pirámide.");
    System.out.print("Por favor, introducir el caracter de relleno de la pirámide: ");
    String c = System.console().readLine();
    System.out.print("Por favor, introducir la altura de la pirámide: ");
    int alturainicial = Integer.parseInt(System.console().readLine());
    int altura = 1;
    int espacios = alturainicial - 1;
    int i = 0;

    while (altura <= alturainicial) {
      
      for (i = 1; i <= espacios; i++) {
        System.out.print(" ");
      }
      for (i = 1; i < altura * 2; i++) {
        System.out.print(c);
      }
      System.out.println();
      espacios--;
      altura++;
    }
  }
}
