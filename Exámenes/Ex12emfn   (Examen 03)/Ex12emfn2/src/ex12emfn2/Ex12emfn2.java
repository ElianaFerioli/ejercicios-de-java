/*
 * Escribe el programa terremoto numérico. En primer lugar, el programa debe generar y mostrar por
pantalla un array de 5 filas por 10 columnas con números aleatorios entre 10 y 99. A continuación se le
preguntará al usuario cómo será el terremoto: horizontal o vertical. Si el terremoto es horizontal, los
números de la primera fila se desplazan hacia la derecha, los de la segunda fila hacia la izquierda, los
de la tercera fila hacia la derecha, etc. Los números que salen por la derecha o por la izquierda entran
por el lado contrario. Si el terremoto es vertical, los números de la primera columna se desplazan
hacia arriba, los de la segunda columna hacia abajo, los de la tercera hacia arriba, etc. Los números
que salen por arriba o por abajo, entran por el lado contrario.
 */
package ex12emfn2;

import java.util.Scanner;

/**
 *
 * @author eliana
 */
public class Ex12emfn2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] array = new int[5][10];
        Scanner s = new Scanner (System.in);
        
        //Genera el array
        for(int x = 0; x < 5; x++) {
            for(int i = 0; i < 10; i++) {
                int num = (int)(Math.random()*90) + 10;
                array[x][i] = num;
            }
        }
        
        //Pinta el array
        System.out.println("Array");
        System.out.println("--------------");
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 10; j++) {
                System.out.printf("%5d", array[i][j]);
            }
            System.out.println();
        }
        
        //Pregunta qué quiere hacer el usuario
        boolean esIncorrecto = false;
        System.out.println();
        System.out.print("Por favor, indique si quiere un terremoto horizontal o vertical: ");
        String terremoto = s.nextLine();
        boolean vertical = false;
        if(terremoto.equals("vertical")) {
            vertical = true;
        } else if (terremoto.equals("horizontal")) {
            vertical = false;
        } else {
            esIncorrecto = true;
        }
        
        if(!esIncorrecto) {
            //Mueve el array
            if(vertical) {
                //Rota línea hacia arriba
                int i = 0;
                for(int j = 0; j < 10; j++) {
                    if((j%2)==0) {
                        int aux = array[0][i];  
                        for (int x = 0; x < 4; x++) {
                            array[x][i] = array[x + 1][i];
                        }
                        array[4][i] = aux;
                    } else { //Rota para abajo
                        int aux = array[4][i];
                        for (int x = 4; x  > 0; x--) {
                            array[x][i] = array[x - 1][i];
                        }
                        array[0][i] = aux;
                    }
                    i++;
                }
            } else if (!vertical) {
                //Rota línea a la derecha
                int x = 0;
                for(int j = 0; j < 5; j++) {
                    if((j%2)==0) {
                        int aux = array[x][9];
                        for (int i = 9; i > 0; i--) {
                            array[x][i] = array[x][i - 1];
                        }
                        array[x][0] = aux;
                    } else { //Rota hacia la izquierda
                        int aux = array[x][0];
                        for (int i = 0; i < 9; i++) {
                            array[x][i] = array[x][i + 1];
                        }
                        array[x][9] = aux;
                    }
                    x++;
                }
            }
            //Pinta el array
            System.out.println("Array");
            System.out.println("--------------");
            for(int i = 0; i < 5; i++) {
                for(int j = 0; j < 10; j++) {
                    System.out.printf("%5d", array[i][j]);
                }
                System.out.println();
            }
            
            //Dice si lo introducido es incorrecto
        } else {
            System.out.println("Los datos introducidos no son correctos.");
        }
        
    }
    
}
