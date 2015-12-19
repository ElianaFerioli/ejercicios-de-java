/*
 * Modifica el programa anterior de tal forma que no se repita ningún número en el array.
 */
package ejercicio06;


/**
 *
 * @author eliana
 */
public class Ejercicio06 {
    public static void main(String[] args) {
        System.out.println("Este programa crea un array bidimensional y situa al máximo y el mínimo");
           int [] [] num = new int [6] [10];
           int sumatotal = 0;
           int max = 0;
           int maxx = 0;
           int maxi = 0;
           int min  = 1000;
           int minx = 0;
           int mini = 0;
           boolean esRepetido = false;
           
           for (int x = 0;  x < 6; x++) {
                for(int i = 0; i < 10; i++) {
                    do {
                        int numAleatorio = (int)(Math.random() * 1001);
                        num [x] [i] = numAleatorio;
                        // Comprueba si el número generado ya está en el array.
                        esRepetido = false;
                        for (int j = 0; j < 10 * x + i; j++) {
                            if (num[x][i] == num[j / 10][j % 10]) {
                                esRepetido = true;
                            }
                        }
                     } while (esRepetido);
                    
                    if (x == 0) {
                        max = num[x][i];
                        maxx = x;
                        maxi = i;
                    } else if (num [x][i] > max) {
                        max = num[x][i];
                        maxx = x;
                        maxi = i;
                    }
                    if (num [x][i] < min) {
                        min = num[x][i];
                        minx = x;
                        mini = i;
                    }
                }
            } //Genera los números aleatorios y calcula la posicion del máximo y el mínimo
        
           
        System.out.print("         |");  
        for (int  x = 0; x < 10; x++) {
            System.out.print("  Columna " + x + "|");
        } //Imprime la cabecera de las columnas
          
        System.out.println();

        for(int i = 0;  i < 6; i++) {
            for (int x = 0; x < 11; x++) {
                if (x == 0) {
                    System.out.print("Fila   " + i + " |");
                } else {
                    System.out.print("     " +   num[i][x - 1]  + "    ");
                }
            }
            System.out.println();
        } //Imprime cada fila
       
        System.out.print("El máximo número del array bidimensional es el ");
        System.out.println(max + " en la fila " + maxx + " columna " + maxi);
        System.out.print("El mínimo número del array bidimensional es el ");
        System.out.print(min + " en la fila " + minx + " columna " + mini);
       
    }     
}