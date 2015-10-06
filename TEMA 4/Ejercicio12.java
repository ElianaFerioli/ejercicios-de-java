/**
*
* @author Eliana Ferioli
*/

public class Ejercicio12 {
  public static void main(String[] args) {
    System.out.println("Minicuestionario sobre 1º de DAW.");
    int nota = 0;
    
    System.out.print("¿Métrica V3 es una metodología o un modelo?: ");
    String P1 = System.console().readLine();
    if (P1.equals("metodología")) {
      nota = nota + 1;
    }
    System.out.print("¿Es lo mismo print que println? (contesta SI o NO): ");
    String P2 = System.console().readLine();
    if (P2.equals("NO")) {
      nota = nota + 1;
    }
    System.out.print("¿Con qué tipo de relaciones NO se trabaja en DED?: ");
    String P3 = System.console().readLine();
    if (P3.equals("n-arias")) {
      nota = nota + 1;
    }
    System.out.print("¿Cuál es la parte más importante de un ordenador?: ");
    String P4 = System.console().readLine();
    if (P4.equals("El procesador")) {
      nota = nota + 1;
    }
    System.out.print("¿Cuantas generaciones de ordenadores existen?: ");
    String P5 = System.console().readLine();
    if (P5.equals("Cinco")) {
      nota = nota + 1;
    }
    System.out.print("¿Son las entrevistas un tipo de sesión de trabajo?: ");
    String P6 = System.console().readLine();
    if (P6.equals("SI")) {
      nota = nota + 1;
    }
    System.out.print("¿Qué tipo de herramienta es el MS VISIO?: ");
    String P7 = System.console().readLine();
    if (P7.equals("CASE")) {
      nota = nota + 1;
    }
    System.out.print("¿Puede existir una enfermedad profesional que no este reconocida en el CEP?: ");
    String P8 = System.console().readLine();
    if (P8.equals("NO")) {
      nota = nota + 1;
    }
    System.out.print("¿Qué es HTML?: ");
    String P9 = System.console().readLine();
    if (P9.equals("Un lenguaje de marcas")) {
      nota = nota + 1;
    }
    System.out.print("¿Qué se necesita para traducir un código HTML?: ");
    String P10 = System.console().readLine();
    if (P10.equals("Un explorador")) {
      nota = nota + 1;
    }
  System.out.println("El resultado de su test es: " + nota + " sobre 10."); 
  }
}
