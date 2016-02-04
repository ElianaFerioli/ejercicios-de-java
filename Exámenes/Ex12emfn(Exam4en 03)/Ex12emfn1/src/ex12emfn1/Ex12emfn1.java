/*
 * Realiza un programa que, a partir de un array de 4 filas por 6 columnas con números generados al
azar entre 10 y 99, muestre a la derecha los máximos de la fila y debajo los mínimos de las columnas.
 */
package ex12emfn1;

/**
 *
 * @author eliana
 */
public class Ex12emfn1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        //Genera el array
        int[][] array = new int[4][6];
        for(int x = 0; x < 4; x++) {
            for(int i = 0; i < 6; i++) {
                int num = (int)(Math.random()*90) + 10;
                array[x][i] = num;
            }
        }
        
        //Calcula máximos y mínimos
        int[] minimos = new int[6];
        int[] maximos = new int[4];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;;
        
        //Pinta el array y los máximos
        System.out.println("Array");
        System.out.println("--------------");
        for(int i = 0; i < 4; i++) {
            max = 0;
            for(int j = 0; j < 6; j++) {
                System.out.printf("%5d", array[i][j]);
                if(max < array[i][j]){
                    max = array[i][j];
                }
                if(j == 5) {
                   System.out.printf("|%5d", max); 
                }
  
            }
            System.out.println();
        }
        
        //Pinta los mínimos
        System.out.println("-------------------------------------");
        for(int i = 0; i < 6; i++) {
            min = 101;
            for(int j = 0; j < 4; j++) {
                if(min > array[j][i]){
                    min = array[j][i];
                }
                
            }
            System.out.printf("%5d", min); 
        }
    }
    
}
