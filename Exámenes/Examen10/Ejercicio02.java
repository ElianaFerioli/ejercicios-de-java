/**
 *Sinestesio y Casilda van a pintar los tres dormitorios de su casa, quieren sustituir el color blanco por
colores más alegres. Realiza un programa que genere de forma aleatoria una secuencia de tres
colores aleatorios (uno para cada dormitorio) de tal forma que no se repita ninguno. Los colores entre
los que debe elegir el programa son los siguientes: rojo, azul, verde, amarillo, violeta y naranja.
 *
 * @author Eliana Ferioli
 */
public class Ejercicio02{
  public static void main(String[] args) {
    System.out.println("Este programa muestra tres colores aleatorios.");
    
    int colorUno = (int)(Math.random() * 6);
    int colorDos = (int)(Math.random() * 6);
    int colorTres = (int)(Math.random() * 6);
    String nombreUno = " ";
    String nombreDos = " ";
    String nombreTres = " ";
    
    while ((colorUno == colorDos) || (colorUno == colorTres) || (colorDos == colorTres)) {
      
      colorUno = (int)(Math.random() * 6);
      colorDos = (int)(Math.random() * 6);
      colorTres = (int)(Math.random() * 6);
      
    }
    
    switch (colorUno) {
      case 0:
      nombreUno = "Rojo";
      break;
      case 1:
      nombreUno = "Azul";
      break;
      case 2:
      nombreUno = "Verde";
      break;
      case 3:
      nombreUno = "Amarillo";
      break;
      case 4:
      nombreUno = "Violeta";
      break;
      case 5:
      nombreUno = "Naranja";
      break;
      default:
      break;
    }
    
    switch (colorDos) {
      case 0:
      nombreDos = "Rojo";
      break;
      case 1:
      nombreDos = "Azul";
      break;
      case 2:
      nombreDos = "Verde";
      break;
      case 3:
      nombreDos = "Amarillo";
      break;
      case 4:
      nombreDos = "Violeta";
      break;
      case 5:
      nombreDos = "Naranja";
      break;
      default:
      break;
    }
    
    switch (colorTres) {
      case 0:
      nombreTres = "Rojo";
      break;
      case 1:
      nombreTres = "Azul";
      break;
      case 2:
      nombreTres = "Verde";
      break;
      case 3:
      nombreTres = "Amarillo";
      break;
      case 4:
      nombreTres = "Violeta";
      break;
      case 5:
      nombreTres = "Naranja";
      break;
      default:
      break;
    }
    
    System.out.println("Los colores pueden ser: " + nombreUno + ", " + nombreDos + ", " + nombreTres + ".");
      
  }
}
