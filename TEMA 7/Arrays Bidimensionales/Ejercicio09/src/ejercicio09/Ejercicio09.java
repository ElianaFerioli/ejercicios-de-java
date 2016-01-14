/*
 * Realiza un programa que sea capaz de rotar todos los elementos de una matriz cuadrada una
 * posición en el sentido de las agujas del reloj. La matriz debe tener 12 filas por 12 columnas
 * y debe contener números generados al azar entre 0 y 100. Se debe mostrar tanto la matriz
 * original como la matriz resultado, ambas con los números convenientemente alineados.
 * 
 * 
 */
package ejercicio09;

/**
 *
 * @author eliana
 */
public class Ejercicio09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[][] num = new int [12][12];
        
        // genera el array y lo muestra /////////////////////////
    
        System.out.println("Array original");
        System.out.println("--------------");
        for(int i = 0; i < 12; i++) {
            for(int j = 0; j < 12; j++) {
                num[i][j] = (int)(Math.random()*101);
                System.out.printf("%5d", num[i][j]);
            }
            System.out.println();
        }
        
        
        //Rota el array
        int cambioMarco = 0;

        for (int j = 1; j <= 6; j++) {
            
            //Rota línea superior
            int auxUno = num[0 + cambioMarco][11 - cambioMarco];
            int x = 0 + cambioMarco;
            for (int i = (11 - cambioMarco); i > cambioMarco; i--) {
                num[x][i] = num[x][i - 1];
            }
 
            
            //Rota línea de la derecha
            int auxDos = num[11 - cambioMarco][11 - cambioMarco];
            int i = 11 - cambioMarco;
            for (x = (11 - cambioMarco); x > cambioMarco; x--) {
                num[x][i] = num[x - 1][i];
            }
            num[1 + cambioMarco][11 - cambioMarco] = auxUno;

            
           
            //Rota línea de abajo
            auxUno = num[11 - cambioMarco][0 + cambioMarco];
            x = 11 - cambioMarco;
            for (i = (0 + cambioMarco); i < (11 - cambioMarco); i++) {
                num[x][i] = num[x][i + 1];
            }
            num[11 - cambioMarco][10 - cambioMarco] = auxDos;

            //Rota línea de la izquierda
            auxDos = num[0 + cambioMarco][0 + cambioMarco];
            i = 0 + cambioMarco;
            for (x = (0 + cambioMarco); x < (11 - cambioMarco); x++) {
                num[x][i] = num[x + 1][i];
            }
            num[10 - cambioMarco][0 + cambioMarco] = auxUno;

            //Aumenta el marco
            cambioMarco++;
        }
        
        //Muestra el array rotado
        System.out.println("\n\nArray modificado");
        System.out.println("--------------");

        for(int i = 0; i < 12; i++) {
            for(int j = 0; j < 12; j++) {
                System.out.printf("%5d", num[i][j]);
            }
            System.out.println();
        }
        
        
        
    }
    
}