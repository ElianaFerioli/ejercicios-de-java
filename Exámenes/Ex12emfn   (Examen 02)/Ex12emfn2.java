/**
 *
 *
 * @author Eliana Ferioli
 */
public class Ex12emfn2 {
  public static void main(String[] args) {
    System.out.println("Este programa muestra los minutos que faltan para el fin de semana.");
    System.out.print("Por favor, introduzca el día que es (nombre en minúscula): ");
    String primerdia = System.console().readLine();
    System.out.print("Por favor, introduzca la hora del día " + primerdia + ": ");
    int primerahora = Integer.parseInt(System.console().readLine());
    System.out.print("Por favor, introduzca los minutos día: ");
    int minutosPrimeraHora = Integer.parseInt(System.console().readLine());
    
    int diauno = 0;
    int horatranscurrida = 0;
    
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
      default:
      break;
    }
    
    int minutos = 0;
    //Calcula las horas que faltan
    if(diauno != 5) {
        if (diauno < 5) {
          for (int x = primerahora; x < 24; x++) {
            horatranscurrida++;
          }
          diauno++;
          while (diauno < 5) {
            for (int x = 0; x < 24; x++) {
              horatranscurrida++;
            }
            diauno++;
          }
        }
      if (diauno == 5) {
        for (int x = 0; x <= 14; x++) {
          horatranscurrida++;
        }
      }
      minutos = 0;
      if(minutosPrimeraHora > 0) {
        minutos = 60 - minutosPrimeraHora;
      } else {
        minutos = 0;
      }
    } else {
      for (int x = primerahora; x <= 14; x++) {
        horatranscurrida++;
      }
        minutos = 0;
      if(minutosPrimeraHora > 0) {
        minutos = 60 - minutosPrimeraHora;
      } else {
        minutos = 0;
      }
    }
    
    
    System.out.println("Los minutos que faltan para el fin de semana son: " + ((horatranscurrida * 60) - minutos));
  }
}
