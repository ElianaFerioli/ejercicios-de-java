/**
Realiza un programa que pinte por pantalla diez líneas formadas por caracteres. El carácter
con el que se pinta cada línea se elige de forma aleatoria entre uno de los siguientes: *, -, =,
., |, @. Las líneas deben tener una longitud aleatoria entre 1 y 40 caracteres.
 *
 * @author Eliana Ferioli
 */
public class Ejercicio10 {
  public static void main(String[] args) {
    System.out.println("Este programa printa, al azar, caracteres.");
    int longitudLinea = (int)(Math.random() * 40) + 1;
    String caracter = " ";

    for (int i = 1; i <= 10; i++) {
        for (int x = 1; x <= longitudLinea; x++) {
          int numcaracter = (int)(Math.random() * 7) + 1;
          switch (numcaracter) {
            case 1:
            caracter = "*";
            break;
            case 2:
            caracter = "-";
            break;
            case 3:
            caracter = "=";
            break;
            case 4: 
            caracter = ".";
            break;
            case 5:
            caracter = "|";
            break;
            case 6:
            caracter = "@";
            break;
            default:
            break;
          }
        System.out.print(caracter);
      }
      System.out.println();
    }
  }
}
