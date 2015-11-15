/**
 *Realiza un programa que genere una secuencia de cinco monedas de curso legal lanzadas al aire.
 *
 * @author Eliana Ferioli
 */
public class Ejercicio03 {
  public static void main(String[] args) {
    System.out.println("Genera las tiradas de cinco monedas.");
    
    int monedaUno = (int)(Math.random() * 2);
    int monedaDos = (int)(Math.random() * 2);
    int monedaTres = (int)(Math.random() * 2);
    int monedaCuatro = (int)(Math.random() * 2);
    int monedaCinco = (int)(Math.random() * 2);
    
    String monUno = " ";
    String monDos = " ";
    String monTres = " ";
    String monCuatro = " ";
    String monCinco = " ";
    
    switch (monedaUno) {
      case 0:
      monUno = "Cara";
      break;
      case 1:
      monUno = "Cruz";
      break;
      default:
      break;
      }
    switch (monedaDos) {
      case 0:
      monDos = "Cara";
      break;
      case 1:
      monDos = "Cruz";
      break;
      default:
      break;
    }
    switch (monedaTres) {
      case 0:
      monTres = "Cara";
      break;
      case 1:
      monTres = "Cruz";
      break;
      default:
      break;
    }
    switch (monedaCuatro) {
      case 0:
      monCuatro = "Cara";
      break;
      case 1:
      monCuatro = "Cruz";
      break;
      default:
      break;
    }
    switch (monedaCinco) {
      case 0:
      monCinco = "Cara";
      break;
      case 1:
      monCinco = "Cruz";
      break;
      default:
      break;
    }
    System.out.println("2 céntimos: " + monUno);
    System.out.println("20 céntimos: " + monDos);
    System.out.println("50 céntimos: " + monTres);
    System.out.println("1 Euro: " + monCuatro);
    System.out.println("2 Euros: " + monCinco);
  }
}
