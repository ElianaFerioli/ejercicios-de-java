/**
*Realiza un programa que pida 10 números enteros por teclado y que luego diga cuántos de esos
números son capicúa. Los números capicúa son los que se leen igual hacia delante y hacia atrás. Los
capicúa repetidos también cuentan.
* @author Eliana Ferioli
*/
public class Ejercicio03 {
  public static void main(String[] args) {
    System.out.println("Este programa descubre si un número es capicúa.\nSe permiten números de hasta cinco cifras.");
    int i = 1;
    int j = 10;
    int num = 0;
    int nuevo = 0;
    
    for (int x = 1; x <= 10; x++) {
      System.out.print("Introduce un número: ");
      int numeroIntroducido = Integer.parseInt(System.console().readLine());
      num = numeroIntroducido;
      while (num > 0) {
        nuevo = (nuevo * 10) + (num % 10);
        num = num / 10;
      }
      if (nuevo == numeroIntroducido) {
        System.out.println("El número es capicúa");
      } else {
        System.out.println("El número no es capicúa");
      }
      nuevo = 0;
    }
  }
}
