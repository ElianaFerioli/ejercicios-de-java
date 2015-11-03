/**
 * Las caras de un dado de poker tienen las siguientes figuras: As, K, Q, J, 7 y 8.
 * Escribe un programa que genere de forma aleatoria la tirada de cinco dados.
 *
 * @author Eliana Ferioli
 */
public class Ejercicio04 {
  public static void main(String[] args) {
    System.out.println("Este programa muestra las tiradas de cinco dados de Poker.");
    String cara = " ";
    
    for (int x = 1; x <= 5; x++) {
      int tiradaAleatoria = (int)(Math.random() * 6) + 1;
      switch (tiradaAleatoria) {
        case 1:
        cara = "As";
        break;
        case 2:
        cara = "K";
        break;
        case 3:
        cara = "Q";
        break;
        case 4:
        cara = "J";
        break;
        case 5:
        cara = "7";
        break;
        case 6:
        cara = "8";
        break;
        default:
        break;
      }
      System.out.println("La tirada del " + x + "º dado es: " + cara);
    }
  }
}
