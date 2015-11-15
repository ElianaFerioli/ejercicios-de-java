/**
 *
 *
 * @author Eliana Ferioli
 */
public class Ex11emfn3 {
  public static void main(String[] args) {
    System.out.println("Este programa genera una melodía al azar.");
    String nombreNota = " ";
    int numeroNotas = (int)((Math.random() * 25) + 4);
    int compas = 4;
    String primeraNota = " ";
    int comienzo = 1;

    while ((numeroNotas % 4) != 0) {      //genera el número de notas
    numeroNotas = (int)((Math.random() * 25) + 4);
    }

    while (comienzo <= numeroNotas) {     //genera las notas dentro del compás
        for (int x = 1; x <= compas; x++) {
          int nota = (int)(Math.random() * 7);
          switch (nota) {
            case 0:
            nombreNota = "Do";
            break;
            case 1:
            nombreNota = "Re";
            break;
            case 2:
            nombreNota = "Mi";
            break;
            case 3:
            nombreNota = "Fa";
            break;
            case 4:
            nombreNota = "Sol";
            break;
            case 5:
            nombreNota = "La";
            break;
            case 6:
            nombreNota = "Si";
            break;
            default:
            break;
          }
          if ((comienzo == 1) && (x == 1)) {
            primeraNota = nombreNota;
          }
          if ((comienzo == numeroNotas) && (x == 4)){
            System.out.print(primeraNota);
          } else {
            if (x == 4) {
              System.out.print(nombreNota);
            } else {
              System.out.print(nombreNota + " ");
            }
          }
        }
      if (comienzo == numeroNotas) {
        System.out.print("||");
      } else {
        System.out.print("|");
      }
      comienzo++;
    }
  }
}
