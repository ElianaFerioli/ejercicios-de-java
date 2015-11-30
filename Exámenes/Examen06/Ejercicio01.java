/**
 * Pepa y Pepe van a tener próximamente trillizas y no saben qué nombre ponerles aunque se debaten
entre 6 nombres distintos: Nicereta, Eufemia, Froilana, Primitiva, Aniceta y Apolonia. Realiza un
programa que decida de forma aleatoria tres nombres. Lógicamente, los nombres no se pueden
repetir.
 *
 * @author Eliana Ferioli
 */
public class Ejercicio01 {
  public static void main(String[] args) {
    System.out.println("Este programa elige de forma aleatoria los nombres de las trillizas.");
    
    int primerNombre = (int)(Math.random() * 6);
    int segundoNombre = (int)(Math.random() * 6);
    int tercerNombre = (int)(Math.random() * 6);
    
    String nombreUno = " ";
    String nombreDos = " ";
    String nombreTres = " ";
    
    while ((primerNombre == segundoNombre) || (primerNombre == tercerNombre) || (segundoNombre == tercerNombre)) {
      primerNombre = (int)(Math.random() * 6);
      segundoNombre = (int)(Math.random() * 6);
      tercerNombre = (int)(Math.random() * 6);
      }     
    
    switch (segundoNombre) {
      case 0:
      nombreDos = "Nicerata";
      break;
      case 1:
      nombreDos = "Eufemia";
      break;
      case 2:
      nombreDos = "Froilana";
      break;
      case 3:
      nombreDos = "Primitiva";
      break;
      case 4:
      nombreDos = "Aniceta";
      break;
      case 5:
      nombreDos = "Apolonia";
      break;
      default:
      break;
    }
    switch (primerNombre) {
      case 0:
      nombreUno = "Nicerata";
      break;
      case 1:
      nombreUno = "Eufemia";
      break;
      case 2:
      nombreUno = "Froilana";
      break;
      case 3:
      nombreUno = "Primitiva";
      break;
      case 4:
      nombreUno = "Aniceta";
      break;
      case 5:
      nombreUno = "Apolonia";
      break;
      default:
      break;
    }
    switch (tercerNombre) {
      case 0:
      nombreTres = "Nicerata";
      break;
      case 1:
      nombreTres = "Eufemia";
      break;
      case 2:
      nombreTres = "Froilana";
      break;
      case 3:
      nombreTres = "Primitiva";
      break;
      case 4:
      nombreTres = "Aniceta";
      break;
      case 5:
      nombreTres = "Apolonia";
      break;
      default:
      break;
    }
    
    System.out.println("El nombre de la primer trilliza es: " + nombreUno);
    System.out.println("El nombre de la primer trilliza es: " + nombreDos);
    System.out.println("El nombre de la primer trilliza es: " + nombreTres);
  }
}
