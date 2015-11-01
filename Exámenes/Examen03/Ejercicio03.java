/**
 * Realiza una programa que calcule las horas transcurridas entre dos horas de dos días de la semana.
No se tendrán en cuenta los minutos ni los segundos. El día de la semana se puede pedir como un
número (del 1 al 7) o como una cadena (de “lunes” a “domingo”). Se da por hecho que el usuario
introduce los datos correctamente y que el segundo día es posterior al primero.
 *
 * @author Eliana Ferioli
 */
public class Ejercicio03 {
  public static void main(String[] args) {
    System.out.println("Este programa muestra las horas transcurridas entre dos días de la semana.");
    System.out.print("Por favor, introduzca el primer día: ");
    String primerdia = System.console().readLine();
    System.out.print("Por favor, introduzca la hora del día " + primerdia + ": ");
    int primerahora = Integer.parseInt(System.console().readLine());
    System.out.print("Por favor, introduzca el segundo día: ");
    String segundodia = System.console().readLine();
    System.out.print("Por favor, introduzca la hora del día: " + segundodia + ": ");
    int segundahora = Integer.parseInt(System.console().readLine());
    
    int diauno = 0;
    int diados = 0;
    int horatranscurrida = 0;
    
    if (((primerahora >= 0) && (primerahora < 24)) && ((segundahora >= 0) && (segundahora < 24))) {
    
            switch (primerdia) {
              case "lunes":
              diauno = 1;
              break;
              case "martes":
              diauno = 2;
              break;
              case "miercoles":
              diauno = 3;
              break;
              case "jueves":
              diauno = 4;
              break;
              case "viernes":
              diauno = 5;
              break;
              case "sabado":
              diauno = 6;
              break;
              case "domingo":
              diauno = 7;
              break;
              default:
              System.out.println ("El primer día es incorrecto");
            }
            switch (segundodia) {
              case "lunes":
              diados = 1;
              break;
              case "martes":
              diados = 2;
              break;
              case "miercoles":
              diados = 3;
              break;
              case "jueves":
              diados = 4;
              break;
              case "viernes":
              diados = 5;
              break;
              case "sabado":
              diados = 6;
              break;
              case "domingo":
              diados = 7;
              break;
              default:
              System.out.println ("El segundo día es incorrecto");
            }
            
            if (diauno < diados) {
                    
                for (int x = primerahora; x < 24; x++) {
                    horatranscurrida++;
                }
                    diauno++;
                while (diauno < diados) {
                      for (int x = 0; x < 24; x++) {
                      horatranscurrida++;
                      }
                    diauno++;
                }
                if (diauno == diados) {
                      for (int x = 1; x <= segundahora; x++) {
                      horatranscurrida++;
                      }
                }
                  System.out.println("Las horas trancurridas entre un día y otro son: " + horatranscurrida + "hs.");
            } else {
                    System.out.println("El primer día debe ser anterior al segundo día.");
            }
  } else {
    System.out.println("Las horas introducidas no son correctas.");
  }
  }
}
