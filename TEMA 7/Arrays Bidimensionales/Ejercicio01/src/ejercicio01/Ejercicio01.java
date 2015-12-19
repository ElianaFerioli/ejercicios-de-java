/*
 * Define un array de números enteros de 3 filas por 6 columnas con nombre num y asigna
 * los valores según la siguiente tabla. Muestra el contenido de todos los elementos del array
 * dispuestos en forma de tabla como se muestra en la figura.
 */
package ejercicio01;

/**
 *
 * @author eliana
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            int [] [] num = new int [3] [6];
            num [0] [0] = 0;
            num [1] [0]  = 75;
            num [0] [1] = 30;
            num [0] [2] = 2;
            num [2] [2] = -2;
            num [2] [3] = 9;
            num [1] [4] = 0;
            num [0] [5] = 5;
            num [2] [5] = 11;
            
        System.out.print("Array num|");

        for (int  x = 0; x <= 5; x++) {
          System.out.print("Columna " + x + "|");
         }
          System.out.println();

       for(int i = 0;  i <= 2; i++) {
          for (int  x = 0; x <= 6; x++) {
           if (x == 0) {
              System.out.print("Fila  " + i + "  |");
           } else {
               System.out.print("    " +   num[i][x - 1]  + "     ");
           }
         }
          System.out.println();
       }
    }  
  }
