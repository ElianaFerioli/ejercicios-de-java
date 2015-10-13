/**
 * 
 *
 * @author Eliana Ferioli
 */
public class Ejercicio12 {
  public static void main(String[] args) {
    System.out.print("Por favor, introducir un número y se mostrará la serie Fibonacci: ");
    int x = Integer.parseInt(System.console().readLine());
    int num = 0;
    int serie1 = 1;
    int serie2 = 0;
    int serie3 = serie1 + serie2;
    int cardinal = 3;
    
    if (x > 0) {
      do {
      if (num == 0) {
        System.out.println("Este es el 1º término: " + num);
        serie2 = num;
        num++;
      }
      if (num == 1) {
        System.out.println("Este es el 2º término: " + num);
        serie1 = num;
        num++;
      }
      if (num >= 2) {
        System.out.println("Este es el " + cardinal + "º término: " + serie3);
        serie2 = serie1;
        serie1 = serie3;
        serie3 = serie1 + serie2;
        num++;
        cardinal++;
        }
      } while ((num < x) && (num >= 0));
    } else {
      System.out.println("No es posible mostrar el término de la serie Fibonacci \npara el número introducido");
    }
  }
}
