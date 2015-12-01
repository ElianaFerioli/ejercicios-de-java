/**
 *Sinestesio y Casilda van a pintar los tres dormitorios de su casa, quieren sustituir el color blanco por
colores más alegres. Realiza un programa que genere de forma aleatoria una secuencia de tres
colores aleatorios (uno para cada dormitorio) de tal forma que no se repita ninguno. Los colores entre
los que debe elegir el programa son los siguientes: rojo, azul, verde, amarillo, violeta y naranja.
 *
 * @author Eliana Ferioli
 */
public class Ejercicio02 {
  public static void main(String[] args) {
    System.out.println("Este programa elige aleatoriamente entre tres colores.");
    int colorUno = 0;
    int colorDos = 0;
    int colorTres = 0;
    String nombreColorUno = " ";
    String nombreColorDos = " ";
    String nombreColorTres = " ";
    
    do {
      colorUno = (int)(Math.random() * 6);
      colorDos = (int)(Math.random() * 6);
      colorTres = (int)(Math.random() * 6);
    } while ((colorUno == colorDos) || (colorUno == colorTres) || (colorDos == colorTres));
    
    switch (colorUno) {
      case 0:
      nombreColorUno = "Azul";
      break;
      case 1:
      nombreColorUno = "Rojo";
      break;
      case 2:
      nombreColorUno = "Verde";
      break;
      case 3:
      nombreColorUno = "Amarillo";
      break;
      case 4:
      nombreColorUno = "Violeta";
      break;
      case 5:
      nombreColorUno = "Naranja";
      break;
      default:
      break;
    }
        switch (colorDos) {
      case 0:
      nombreColorDos = "Azul";
      break;
      case 1:
      nombreColorDos = "Rojo";
      break;
      case 2:
      nombreColorDos = "Verde";
      break;
      case 3:
      nombreColorDos = "Amarillo";
      break;
      case 4:
      nombreColorDos = "Violeta";
      break;
      case 5:
      nombreColorDos = "Naranja";
      break;
      default:
      break;
    }
        switch (colorTres) {
      case 0:
      nombreColorTres = "Azul";
      break;
      case 1:
      nombreColorTres = "Rojo";
      break;
      case 2:
      nombreColorTres = "Verde";
      break;
      case 3:
      nombreColorTres = "Amarillo";
      break;
      case 4:
      nombreColorTres = "Violeta";
      break;
      case 5:
      nombreColorTres = "Naranja";
      break;
      default:
      break;
    }
    
    System.out.print("Los colores con los que deben pintar son: ");
    System.out.print(nombreColorUno + ", " + nombreColorDos + " y " + nombreColorTres);
    
    
  }
}
