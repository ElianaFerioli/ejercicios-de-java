/**
 * Realiza un programa que muestre al azar el nombre de una carta de la baraja francesa. Esta
baraja está dividida en cuatro palos: picas, corazones, diamantes y tréboles. Cada palo está
formado por 13 cartas, de las cuales 9 cartas son numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8,
9, 10, J, Q, K y A (que sería el 1). Para convertir un número en una cadena de caracteres
podemos usar String.valueOf(n) .
 *
 * @author Eliana Ferioli
 */
public class Ejercicio02 {
  public static void main(String[] args) {
    System.out.println("Este programa muestra, al azar, una carta de la baraja francesa.");
    int palo = (int)(Math.random() * 4 )+ 1;
    int carta = (int)(Math.random() * 13) + 1;
    int numerodelacarta = 0;
    String palodelacarta = "";
    String letradelacarta = "";
    
    switch (palo) {
      case 1:
      palodelacarta = "Picas";
      break;
      case 2:
      palodelacarta = "Corazones";
      break;
      case 3:
      palodelacarta = "Diamantes";
      break;
      case 4:
      palodelacarta = "Tréboles";
      break;
    }
    switch (carta) {
      case 1:
      letradelacarta = "A";
      break;
      case 2:
      numerodelacarta = 2;
      break;
      case 3:
      numerodelacarta = 3;
      break;
      case 4:
      numerodelacarta = 4;
      break;
      case 5:
      numerodelacarta = 5;
      break;
      case 6:
      numerodelacarta = 6;
      break;
      case 7:
      numerodelacarta = 7;
      break;
      case 8:
      numerodelacarta = 8;
      break;
      case 9:
      numerodelacarta = 9;
      break;
      case 10:
      letradelacarta = "J";
      break;
      case 11:
      letradelacarta = "Q";
      break;
      case 12:
      letradelacarta = "K";
      break;
    }
    if (numerodelacarta == 0) {
    System.out.println("El palo de la carta es " + palodelacarta + " y la letra es " + letradelacarta);
    } else {
      System.out.println("El palo de la carta es " + palodelacarta + " y el número es " + numerodelacarta);
    }
  }
}
