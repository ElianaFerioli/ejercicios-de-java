/**
 * Escribe un programa que muestre tres apuestas de la quiniela en tres columnas para los 14
partidos y el pleno al quince (15 filas).
 *
 * @author Eliana Ferioli
 */
public class Ejercicio07 {
  public static void main(String[] args) {
    System.out.println("Este programa muestra las apuestas de la quiniela.");
    String apuestaQuiniela = " ";
    boolean plenoAlquince = false;
    
    for (int i = 1; i <= 15; i++) {
      if ( i == 15) {
        System.out.print("Este es el pleno al quince: \t");
      } else {
      System.out.print("Esta es la " + i + "º fila: \t\t");
      }
      for (int x = 1; (x <= 3) && (!plenoAlquince); x++) {
        int apuesta = (int)(Math.random() * 4);
        switch (apuesta) {
          case 1:
          apuestaQuiniela = "1  |";
          break;
          case 2:
          apuestaQuiniela = "  2|";
          break;
          case 3:
          apuestaQuiniela = " X |";
          break;
        }
        System.out.print(apuestaQuiniela);
        if (i == 15) {
          plenoAlquince = true;
        }
      }
      System.out.println();
    }
  }
}
