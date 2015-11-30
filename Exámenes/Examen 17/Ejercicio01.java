/**
 * Calcula la nota de un trimestre de la asignatura Programación. El programa pedirá las dos notas que
ha sacado el alumno en los dos primeros controles. Si la media de los dos controles da un número
mayor o igual a 5, el alumno está aprobado y se mostrará la media. En caso de que la media sea un
número menor que 5, el alumno habrá tenido que hacer el examen de recuperación que se califica
como “apto” o “no apto”, por tanto se debe preguntar al usuario “¿Cuál ha sido el resultado de la
recuperación? (apto/no apto). Si el resultado de la recuperación es “apto”, la nota será un 5; en caso
contrario, se mantiene la nota media anterior.
 *
 * @author Eliana Ferioli
 */
public class Ejercicio01 {
  public static void main(String[] args) {
    System.out.println("Este programa dice si los alumnos están o no aptos en la asignatura.");
    System.out.print("Nota del primer control: ");
    double notaPrimerControl = Integer.parseInt(System.console().readLine());
    System.out.print("Nota del segundo control: ");
    double notaSegundoControl = Integer.parseInt(System.console().readLine());
    double notaMedia = 0;
    
    if (((notaPrimerControl + notaSegundoControl) / 2) < 5) {
      System.out.print("¿Cuál ha sido el resultado de la recuperación? (apto/no apto): ");
      String recuperacion = System.console().readLine();
      if(recuperacion.equals("apto")) {
        notaMedia = 5;
      } else {
      notaMedia = ((notaPrimerControl + notaSegundoControl) / 2);
      }
    } else {
      notaMedia = ((notaPrimerControl + notaSegundoControl) / 2);
    }
    System.out.printf("Tu nota de programación es: %.2f", notaMedia);
  }
}
