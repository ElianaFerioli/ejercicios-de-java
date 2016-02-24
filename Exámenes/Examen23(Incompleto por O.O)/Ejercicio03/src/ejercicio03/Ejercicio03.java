/*
 * El juego Hundir la Flota se desarrolla en un tablero de 10 filas por 10 columnas donde cada jugador coloca
varios barcos. Realiza un programa que muestre el tablero de juego y que coloque de forma aleatoria uno de los
barcos, el que ocupa 4 casillas. El barco se puede colocar en vertical o en horizontal pero no en diagonal. Hay
que tener en cuenta que el barco no se puede salir del tablero (ni total ni parcialmente). Pinta el agua con un
carácter y el barco con otro distinto.
 */
package ejercicio03;

/**
 *
 * @author eliana
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] tableroNumero = new int[10][10];
        
        //Asigna valor 0 a todo el tablero 
        for(int i = 0; i < 10; i++) {
            for(int x = 0; x < 10; x++) {
                tableroNumero[i][x] = 0;
            }
        }
        
        //Elige si el barco va vertical u horizontal
        int pos = (int)(Math.random() * 2);
        boolean vertical = false;
        switch(pos) {
            case 0:
                vertical = true;
            break;
            case 1:
                vertical = false;
            break;
            default:
            break;
        }    
        
        //Pone el barco
        //Elige la columna y la fila
        int columna = (int)(Math.random() * 10);
        int fila = (int)(Math.random() * 10);
        
        
        for(int i = 0; i < 10; i++) {
            for(int x = 0; x < 10; x++) {
                //Si es vertical pinta el barco hacia abajo a no ser que la fila sea superior a siete
                if((i == fila) && (x==columna)) {
                    if (vertical) {
                        if (i > 6) {
                            tableroNumero[i][columna] = 2;
                            tableroNumero[i - 1][columna] = 2;
                            tableroNumero[i - 2][columna] = 2;
                            tableroNumero[i - 3][columna] = 2;   
                        } else {
                            tableroNumero[i][columna] = 2;
                            tableroNumero[i + 1][columna] = 2;
                            tableroNumero[i + 2][columna] = 2;
                            tableroNumero[i + 3][columna] = 2;
                        }
                    } else { //Si es horizontal pinta el barco a la derecha a no se que la columna sea superior a 7
                        if (x > 6) {
                            tableroNumero[i][columna] = 2;
                            tableroNumero[i][columna - 1] = 2;
                            tableroNumero[i][columna - 2] = 2;
                            tableroNumero[i][columna - 3] = 2;   
                        } else {
                            tableroNumero[i][columna] = 2;
                            tableroNumero[i][columna + 1] = 2;
                            tableroNumero[i][columna + 2] = 2;
                            tableroNumero[i][columna + 3] = 2;
                        }
                    }
                }                    
            }
        }
        
        //Convierte a un tablero de String
        String[][] tableroChar = new String[10][10];
        
        for(int i = 0; i < 10; i++) {
            for(int x = 0; x < 10; x++) {
                if (tableroNumero[i][x] == 0) {
                    tableroChar[i][x] = "O";
                } else {
                    tableroChar[i][x] = "X";
                }
            }
        }
        
        
        //Muestra el tablero
        System.out.println("Tablero");
        System.out.println("--------------");
        for(int i = 0; i < 10; i++) {
            for(int j = 0; j < 10; j++) {
                System.out.printf("%5s", tableroChar[i][j]);
            }
            System.out.println();
        }
        
        
    }
    
}
