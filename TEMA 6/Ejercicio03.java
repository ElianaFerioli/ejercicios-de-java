/**
 * Igual que el ejercicio anterior pero con la baraja española. Se utilizará la baraja de 40 cartas:
2, 3, 4, 5, 6, 7, sota, caballo, rey y as.
 *
 * @author Eliana Ferioli
 */
public class Ejercicio03 {
  public static void main(String[] args) {
    System.out.println("Este programa muestra, al azar, una carta de la baraja española.");
    int palo = (int)(Math.random() * 4 )+ 1;
    int carta = (int)(Math.random() * 11) + 1;
    int numerodelacarta = 0;
    String palodelacarta = "";
    String letradelacarta = "";
    
    switch (palo) {
      case 1:
      palodelacarta = "Espada";
      break;
      case 2:
      palodelacarta = "Basto";
      break;
      case 3:
      palodelacarta = "Oro";
      break;
      case 4:
      palodelacarta = "Copa";
      break;
    }

    switch (carta) {
      case 1:
      letradelacarta = "As";
      break;
      case 10:
      letradelacarta = "Sota";
      break;
      case 11:
      letradelacarta = "Caballo";
      break;
      case 12:
      letradelacarta = "Rey";
      break;
      default:
      numerodelacarta = carta;
      break;
    }
    if (numerodelacarta == 0) {
    System.out.println("El palo de la carta es " + palodelacarta + " y la figura es " + letradelacarta);
    } else {
      System.out.println("El palo de la carta es " + palodelacarta + " y el número es " + numerodelacarta);
    }
  }
}
