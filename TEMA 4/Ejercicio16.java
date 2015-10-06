/**
*
* @author Eliana Ferioli
*/

public class Ejercicio16 {
  public static void main(String[] args) {
    System.out.println("Test sobre infidelidad.\nContesta con V o F.");
    int nota = 0;
    
    System.out.print("Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente: ");
    String P1 = System.console().readLine();
    if (P1.equals("V")) {
      nota = nota + 3;
    }
    System.out.print("Ha aumentado sus gastos de vestuario: ");
    String P2 = System.console().readLine();
    if (P2.equals("V")) {
      nota = nota + 3;
    }
    System.out.print("Ha perdido el interés que mostraba anteriormente por ti: ");
    String P3 = System.console().readLine();
    if (P3.equals("V")) {
      nota = nota + 1;
    }
    System.out.print("Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer): ");
    String P4 = System.console().readLine();
    if (P4.equals("V")) {
      nota = nota + 3;
    }
    System.out.print("No te deja que mires la agenda de su teléfono móvil: ");
    String P5 = System.console().readLine();
    if (P5.equals("V")) {
      nota = nota + 3;
    }
    System.out.print("A veces tiene llamadas que dice no querer contestar cuando estás tú delante: ");
    String P6 = System.console().readLine();
    if (P6.equals("V")) {
      nota = nota + 3;
    }
    System.out.print("Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a: ");
    String P7 = System.console().readLine();
    if (P7.equals("V")) {
      nota = nota + 3;
    }
    System.out.print("Muchos días viene tarde después de trabajar porque dice tener mucho más \ntrabajo: ");
    String P8 = System.console().readLine();
    if (P8.equals("V")) {
      nota = nota + 3;
    }
    System.out.print("Has notado que últimamente se perfuma más: ");
    String P9 = System.console().readLine();
    if (P9.equals("V")) {
      nota = nota + 3;
    }
    System.out.print("Se confunde y te dice que ha estado en sitios donde no ha ido contigo: ");
    String P10 = System.console().readLine();
    if (P10.equals("V")) {
      nota = nota + 3;
    }
  if ((nota >= 0) && (nota <= 10)) {
  System.out.println("¡Enhorabuena! tu pareja parece ser totalmente fiel."); 
  } else if ((nota >= 11) && (nota <= 22)) {
  System.out.println("Quizás exista el peligro de otra persona en su vida o en su mente,\naunque seguramente será algo sin importancia.\nNo bajes la guardia."); 
  } else if ((nota >= 22) && (nota <= 30)) {
  System.out.println("Tu pareja tiene todos los ingredientes para estar viviendo un romancecon \notra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza."); 
  }
}
}
