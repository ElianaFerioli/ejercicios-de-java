/**
*
* @author Eliana Ferioli
*/

public class Ejercicio10 {
  public static void main(String[] args) {
    
    System.out.print("Introduce el mes de nacimiento: ");
    String mes = System.console().readLine().toLowerCase();
    System.out.print("Introduce día de nacimiento: ");
    int dia = Integer.parseInt(System.console().readLine());
    
    if ((dia>=21) && (dia <= 31)) {
      if (mes.equals("enero")) {
      System.out.println("Su signo es Acuario");
      } else if (mes.equals("Febrero")) {
      System.out.println("Su signo es Piscis");
      } else if (mes.equals("marzo")) {
      System.out.println("Su signo es Aries");
      } else if (mes.equals("abril")) {
      System.out.println("Su signo es Tauro");
      } else if (mes.equals("mayo")) {
      System.out.println("Su signo es Géminis");
      } else if (mes.equals("junio")) {
      System.out.println("Su signo es Cáncer");
      } else if (mes.equals("julio")) {
      System.out.println("Su signo es Leo");
      } else if (mes.equals("agosto")) {
      System.out.println("Su signo es Virgo");
      } else if (mes.equals("septiembre")) {
      System.out.println("Su signo es Libra");
      } else if (mes.equals("octubre")) {
      System.out.println("Su signo es Escorpio");
      } else if (mes.equals("noviembre")) {
      System.out.println("Su signo es Sagitario");
      } else if (mes.equals("diciembre")) {
      System.out.println("Su signo es Capricornio");
      } 
    } else {
      if (mes.equals("enero")) {
      System.out.println("Su signo es Capricornio");
      } else if (mes.equals("febrero")) {
      System.out.println("Su signo es Acuario");
      } else if (mes.equals("marzo")) {
      System.out.println("Su signo es Piscis");
      } else if (mes.equals("abril")) {
      System.out.println("Su signo es Aries");
      } else if (mes.equals("mayo")) {
      System.out.println("Su signo es Tauro");
      } else if (mes.equals("junio")) {
      System.out.println("Su signo es Géminis");
      } else if (mes.equals("julio")) {
      System.out.println("Su signo es Cáncer");
      } else if (mes.equals("agosto")) {
      System.out.println("Su signo es Leo");
      } else if (mes.equals("septiembre")) {
      System.out.println("Su signo es Virgo");
      } else if (mes.equals("octubre")) {
      System.out.println("Su signo es Libra");
      } else if (mes.equals("noviembre")) {
      System.out.println("Su signo es Escorpio");
      } else if (mes.equals("diciembre")) {
      System.out.println("Su signo es Sagitario");
      } 
    }
  }
}
