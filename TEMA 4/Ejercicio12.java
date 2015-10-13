/**
*
* @author Eliana Ferioli
*/

public class Ejercicio12 {
  public static void main(String[] args) {
    System.out.println("Minicuestionario sobre 1º de DAW.");
    int nota = 0;
    
    System.out.println("¿Métrica V3 es una metodología o un modelo?: ");
    System.out.println("a. Es una metodología. ");
    System.out.println("b. Es un modelo.");
    System.out.println("c. Ambos.");
    String P1 = System.console().readLine();
    if (P1.equals("a")) {
      nota = nota + 1;
    }
    System.out.println("¿Es lo mismo println que println?: ");
    System.out.println("a. SI ");
    System.out.println("b. NO");
    System.out.println("c. Depende del programa.");
    String P2 = System.console().readLine();
    
    if (P2.equals("b")) {
      nota = nota + 1;
    }
    System.out.println("¿Con qué tipo de relaciones NO se trabaja en DED?: ");
    System.out.println("a. Binarias. ");
    System.out.println("b. Arias.");
    System.out.println("c. n-arias.");
    String P3 = System.console().readLine();
    if (P3.equals("c")) {
      nota = nota + 1;
    }
    System.out.println("¿Cuál es la parte más importante de un ordenador?: ");
    System.out.println("a. La carcasa. ");
    System.out.println("b. El disco duro.");
    System.out.println("c. EL procesador.");
    String P4 = System.console().readLine();
    if (P4.equals("c")) {
      nota = nota + 1;
    }
    System.out.println("¿Cuantas generaciones de ordenadores existen?: ");
    System.out.println("a. Cuatro. ");
    System.out.println("b. Depende del autor del libro.");
    System.out.println("c. Cinco.");
    String P5 = System.console().readLine();
    if (P5.equals("b")) {
      nota = nota + 1;
    }
    System.out.println("¿Son las entrevistas un tipo de sesión de trabajo?: ");
    System.out.println("a. Si, pero solo las JAD y las JRP. ");
    System.out.println("b. Si, todas ellas.");
    System.out.println("c. NO.");
    String P6 = System.console().readLine();
    if (P6.equals("b")) {
      nota = nota + 1;
    }
    System.out.println("¿Qué tipo de herramienta es el MS VISIO?: ");
    System.out.println("a. Es un entrono de desarrollo. ");
    System.out.println("b. Es un gestor de BBDD.");
    System.out.println("c. Es una herramienta CASE.");
    String P7 = System.console().readLine();
    if (P7.equals("c")) {
      nota = nota + 1;
    }
    System.out.println("¿Puede existir una enfermedad profesional que no este reconocida en el CEP?: ");
    System.out.println("a. Si, siempre que se demuestre que fue contraida por culpa del trabajo. ");
    System.out.println("b. No");
    System.out.println("c. Depende del juez.");
    String P8 = System.console().readLine();
    if (P8.equals("b")) {
      nota = nota + 1;
    }
    System.out.println("¿Qué es HTML?: ");
    System.out.println("a. Un lenguaje de marcas.");
    System.out.println("b. Es un lenguaje de programación.");
    System.out.println("c. Ambos.");
    String P9 = System.console().readLine();
    if (P9.equals("a")) {
      nota = nota + 1;
    }
    System.out.println("¿Qué se necesita para traducir un código HTML?: ");
    System.out.println("a. El validador. ");
    System.out.println("b. Comprobarlo en W3School.");
    System.out.println("c. Un explorador.");
    String P10 = System.console().readLine();
    if (P10.equals("c")) {
      nota = nota + 1;
    }
  System.out.println("El resultado de su test es: " + nota + " sobre 10."); 
  }
}
