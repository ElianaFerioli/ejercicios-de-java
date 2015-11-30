/**
 * Escribe un programa que genere la tabla de entrenamiento de un usuario de un gimnasio. El programa
debe pedir el día de la semana (un número del 1 al 7) y debe mostrar de forma aleatoria la secuencia
del entrenamiento en función de las siguientes pautas:
- El entrenamiento empieza siempre con un calentamiento que puede ser bicicleta, elíptica o cinta.
- A continuación sigue el entrenamiento de un grupo muscular grande y de uno pequeño. Los grupos
musculares grandes son espalda, pecho y piernas y los grupos musculares pequeños son biceps,
triceps y hombros.
- El entrenamiento finaliza con abdominales o con ejercicio aeróbico (bicicleta, elíptica o cinta). En
caso de finalizar con aeróbico, no se puede repetir el ejercicio que se hizo en el calentamiento.
- Los miércoles y los domingos son días de descanso.
 *
 * @author Eliana Ferioli
 */
public class Ejercicio03 {
  public static void main(String[] args) {
    System.out.println("Este programa realiza, aleatoriamente, una tabla de ejercicios físicos.");
    System.out.println("Por favor indique el día de la semana (del 1 al 7): ");
    int diaSemana = Integer.parseInt(System.console().readLine());
    String dia = " ";
    int i = 30;
    
    switch (diaSemana) {
      case 1:
      dia = "Lunes";
      break;
      case 2:
      dia = "Martes";
      break;
      case 3:
      dia = "Miercoles";
      break;
      case 4:
      dia = "Jueves";
      break;
      case 5:
      dia = "Vieres";
      break;
      case 6:
      dia = "Sábado";
      break;
      case 7:
      dia = "Domingo";
      break;
      default:
      dia = "Día incorrecto";
      break;
    }
    
    if ((diaSemana == 3) || (diaSemana == 7)) {
      System.out.println("El día " + dia + " es de descanso.");
    } else {
      int calentamiento = (int)(Math.random() * 3);
      int grupoGrande = (int)(Math.random() * 3);
      int grupoPequeño = (int)(Math.random() * 3);
      int finEjercicio = (int)(Math.random () * 2);
      String tipoCalentamiento = " ";
      String tipoMuscularGrande = " ";
      String tipoMuscularPequeño = " ";
      String tipofinEjercicio = " ";
      
      switch (calentamiento) {
        case 0:
        tipoCalentamiento = "Bicileta";
        break;
        case 1:
        tipoCalentamiento = "Elíptica";
        break;
        case 2:
        tipoCalentamiento = "Cinta";
        break;
        default:
        break;
      }
      switch (grupoGrande) {
        case 0:
        tipoMuscularGrande = "Espalda";
        break;
        case 1:
        tipoMuscularGrande = "Pecho";
        break;
        case 2:
        tipoMuscularGrande = "Piernas";
        break;
        default:
        break;
      }
      switch (grupoPequeño) {
        case 0:
        tipoMuscularPequeño = "Bíceps";
        break;
        case 1:
        tipoMuscularPequeño = "Tríceps";
        break;
        case 2:
        tipoMuscularPequeño = "Hombros";
        break;
        default:
        break;
      }
      switch (finEjercicio) {
        case 0:
        tipofinEjercicio = "Abdominales";
        break;
        case 1:
        tipofinEjercicio = "Aeróbico";
        break;
      }
      
      if (tipofinEjercicio.equals("Aeróbico")) {
        int x = 1;
        while (x > 0) {
          finEjercicio = (int)(Math.random() * 3);
            if (finEjercicio == calentamiento) {
              x = 2;
            }
          x--;
        }
        switch (finEjercicio) {
          case 0:
          tipofinEjercicio = "Bicileta";
          break;
          case 1:
          tipofinEjercicio = "Elíptica";
          break;
          case 2:
          tipofinEjercicio = "Cinta";
          break;
          default:
          break;
        }
      }
    System.out.print("El ejercicio que debe realizar el día " + dia + " es: " + tipoCalentamiento);
    System.out.print(" " + tipoMuscularGrande + " " + tipoMuscularPequeño + " " + tipofinEjercicio);
    }
  }
}
