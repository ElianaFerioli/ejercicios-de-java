/**
 * Modifica el programa anterior para que la probabilidad de que salga un 1 sea de 1/2, la
probabilidad de que salga x sea de 1/3 y la probabilidad de que salga 2 sea de 1/6. Pista: 1/2
= 3/6 y 1/3 = 2/6.
 *
 * @author Eliana Ferioli
 */
public class Ejercicio08 {
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
        int apuesta = (int)(Math.random() * 7);
        if ((apuesta == 1) || (apuesta == 2) || (apuesta == 3)) {
          apuestaQuiniela = "1  |";
        } else if ((apuesta == 4) || (apuesta == 5)) {
          apuestaQuiniela = " x |";
        } else if (apuesta == 6){
          apuestaQuiniela = "  2|";
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
