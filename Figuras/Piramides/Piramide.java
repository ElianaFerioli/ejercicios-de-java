/**
 *
 * @author Eliana Ferioli
 */
public class Piramide {
  public static void main(String[] args) {
    System.out.println("Este programa dibuja una pirámide.");
    System.out.print("Por favor, introducir el caracter de relleno de la pirámide: ");
    String c = System.console().readLine();
    System.out.print("Por favor, introducir la altura de la pirámide: ");
    int altura = Integer.parseInt(System.console().readLine());
    int x = 0;
    int altinicial= altura;
    int h = 0;
    int i = altinicial - (altura - h);


    while (altura > 0) {
      do {
        System.out.print(" ");
        x++;
      } while (x < altura);
      x = 0;
      while (i >= 0) {
        System.out.print(c);
        i--;
      }
      System.out.println();
      altura--;
      h++;
      i = altinicial - (altura - h);
    }
  }
}
