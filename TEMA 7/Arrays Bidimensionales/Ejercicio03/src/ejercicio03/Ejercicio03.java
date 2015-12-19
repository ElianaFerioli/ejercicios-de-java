/*
 * Modifica el programa anterior de tal forma que los números que se introducen en el array
 * se generen de forma aleatoria (valores entre 100 y 999).
 */
package ejercicio03;
/**
 *
 * @author eliana
 */
public class Ejercicio03 {
    public static void main(String[] args) {
        System.out.println("Este programa crea números en un array bidimensional y los suma.");
       
           int [] [] num = new int [4] [5];
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
        } //IMprime los sumatorios de las columnas y calcula el sumatorio total
       
        System.out.print("   " + sumatotal + "    ");
        //Imprime el sumatorio total
       
    }     
}
