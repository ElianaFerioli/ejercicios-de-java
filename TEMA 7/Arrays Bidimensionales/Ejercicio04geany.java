/**
 * 7.2 Arrays bidimensionales
 * 
 * 4. Modifica el programa anterior de tal forma que las sumas parciales y la suma total
 *    aparezcan en la pantalla con un pequeño retardo, dando la impresión de que el
 *    ordenador se queda pensando antes de mostrar los números.
 * 
 * @author Luis José Sánchez
 */
 
 import java.util.Scanner;
public class Ejercicio04geany {
  public static void main(String[] args) 
    throws InterruptedException { // Se añade esta línea para poder usar sleep
        System.out.println("Este programa recoge números en un array bidimensional y los suma.");
        System.out.println("Por favor, ingrese los números del array de cuatro filas y dos columnas:");
           int [] [] num = new int [4] [5];
           Scanner s = new Scanner (System.in);
           int sumatotal = 0;
           
           for (int x = 0;  x < 4; x++) {
                for(int i = 0; i < 5; i++) {
                    int numAleatorio = (int)((Math.random())*899)+100;
                    num [x] [i] = numAleatorio;
                }
            } //Genera los números aleatorios
           
           
        System.out.print("         |");  
        for (int  x = 0; x < 6; x++) {
           if (x < 5) {
            System.out.print("  Columna " + x + "|");
           } else {
            System.out.print("Sumatorio|"); 
           }
        } //Imprime la cabecera de las columnas
          
        System.out.println();
          
        int sumafila = 0;
        for(int i = 0;  i < 4; i++) {
            for (int x = 0; x < 7; x++) {
                if (x == 0) {
                    System.out.print("Fila   " + i + " |");
                } else if ((x >= 1) && (x < 6)){
                    System.out.print("     " +   num[i][x - 1]  + "    ");
                    sumafila = sumafila + num[i][x - 1];
                } else{
                    System.out.print("   " +sumafila);
                    Thread.sleep(500);
                }
            }
            System.out.println();
            sumafila = 0;
        } //Imprime cada fila y su sumatorio
       
        
        System.out.print("Sumatorio|"); 
        for(int x = 0; x < 5; x++) {
            int sumacolumnas = 0;
            for(int i = 0; i < 4; i++){
                sumacolumnas = sumacolumnas + num[i][x];
            }
            sumatotal = sumacolumnas + sumatotal;
            System.out.print("    " + sumacolumnas + "    "); 
            Thread.sleep(500);
        } //Imprime los sumatorios de las columnas y calcula el sumatorio total
       
        System.out.print("   " + sumatotal + "    ");
        Thread.sleep(700);
        //Imprime el sumatorio total
  }
}
