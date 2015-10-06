/**
*
* @author Eliana Ferioli
*/

public class Ejercicio10 {
  public static void main(String[] args) {
    
    System.out.print("Introduce el mes de nacimiento: ");
    String mes = System.console().readLine();
    System.out.print("Introduce día de nacimiento: ");
    int dia = Integer.parseInt(System.console().readLine());
    
    if ((dia>=21) && (dia <= 31)) {
      if (mes.equals("Enero")) {
      System.out.println("Su signo es Acuario");
      } else if (mes.equals("Febrero")) {
      System.out.println("Su signo es Piscis");
      } else if (mes.equals("Marzo")) {
      System.out.println("Su signo es Aries");
      } else if (mes.equals("Abril")) {
      System.out.println("Su signo es Tauro");
      } else if (mes.equals("Mayo")) {
      System.out.println("Su signo es Géminis");
      } else if (mes.equals("Junio")) {
      System.out.println("Su signo es Cáncer");
      } else if (mes.equals("Julio")) {
      System.out.println("Su signo es Leo");
      } else if (mes.equals("Agosto")) {
      System.out.println("Su signo es Virgo");
      } else if (mes.equals("Septiembre")) {
      System.out.println("Su signo es Libra");
      } else if (mes.equals("Octubre")) {
      System.out.println("Su signo es Escorpio");
      } else if (mes.equals("Noviembre")) {
      System.out.println("Su signo es Sagitario");
      } else if (mes.equals("Diciembre")) {
      System.out.println("Su signo es Capricornio");
      } 
    } else {
      if (mes.equals("Enero")) {
      System.out.println("Su signo es Capricornio");
      } else if (mes.equals("Febrero")) {
      System.out.println("Su signo es Acuario");
      } else if (mes.equals("Marzo")) {
      System.out.println("Su signo es Piscis");
      } else if (mes.equals("Abril")) {
      System.out.println("Su signo es Aries");
      } else if (mes.equals("Mayo")) {
      System.out.println("Su signo es Tauro");
      } else if (mes.equals("Junio")) {
      System.out.println("Su signo es Géminis");
      } else if (mes.equals("Julio")) {
      System.out.println("Su signo es Cáncer");
      } else if (mes.equals("Agosto")) {
      System.out.println("Su signo es Leo");
      } else if (mes.equals("Septiembre")) {
      System.out.println("Su signo es Virgo");
      } else if (mes.equals("Octubre")) {
      System.out.println("Su signo es Libra");
      } else if (mes.equals("Noviembre")) {
      System.out.println("Su signo es Escorpio");
      } else if (mes.equals("Diciembre")) {
      System.out.println("Su signo es Sagitario");
      } 
    }
  }
}
