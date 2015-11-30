/**
 *Realiza un simulador de máquina tragaperras simplificada que cumpla los siguientes requisitos:
a) El ordenador mostrará una tirada que consiste en mostrar 3 figuras. Hay 5 figuras posibles:
corazón, diamante, herradura, campana y limón.
b) Si las tres figuras son diferentes se debe mostrar el mensaje “Lo siento, ha perdido”.
c) Si hay dos figuras iguales y una diferente se debe mostrar el mensaje “Bien, ha recuperado su
moneda”.
d) Si las tres figuras son iguales se debe mostrar “Enhorabuena, ha ganado 10 monedas”.
 *
 * @author Eliana Ferioli
 */
public class Ejercicio03 {
  public static void main(String[] args) {
    System.out.println("Este programa simula la tirada de una máquina tragaperras.");
    int tiradaUno = (int)((Math.random() * 5) + 1);
    int tiradaDos = (int)((Math.random() * 5) + 1);
    int tiradaTres = (int)((Math.random() * 5) + 1);
    String figuraUno = " ";
    String figuraDos = " ";
    String figuraTres = " ";

    //Asigna tiradas
    switch(tiradaUno) {
      case 1:
      figuraUno = "Corazón";
      break;
      case 2:
      figuraUno = "Diamante";
      break;
      case 3:
      figuraUno = "Herradura";
      break;
      case 4:
      figuraUno = "Campana";
      break;
      case 5:
      figuraUno = "Limón";
      break;
      default:
      break;
    }
    switch(tiradaDos) {
      case 1:
      figuraDos = "Corazón";
      break;
      case 2:
      figuraDos = "Diamante";
      break;
      case 3:
      figuraDos = "Herradura";
      break;
      case 4:
      figuraDos = "Campana";
      break;
      case 5:
      figuraDos = "Limón";
      break;
      default:
      break;
    }
  switch(tiradaTres) {
      case 1:
      figuraTres = "Corazón";
      break;
      case 2:
      figuraTres = "Diamante";
      break;
      case 3:
      figuraTres = "Herradura";
      break;
      case 4:
      figuraTres = "Campana";
      break;
      case 5:
      figuraTres = "Limón";
      break;
      default:
      break;
    }
    
    //Muestra tiradas
    System.out.println(figuraUno + "|" + figuraDos + "|" + figuraTres);
    
    if ((tiradaUno != tiradaDos) && (tiradaUno != tiradaTres) && (tiradaDos != tiradaTres)) {
      System.out.println("Lo siento, ha perdido");
    } else if ((tiradaUno == tiradaDos) || (tiradaUno == tiradaTres) || (tiradaDos == tiradaTres)) {
      System.out.println("Bien, ha recuperado su moneda.");
    } else if ((tiradaUno == tiradaDos) && (tiradaUno == tiradaTres)) {
      System.out.println("Enhorabuena, ha ganado 10 monedas.");
    }    
  }
}
