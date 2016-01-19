/*
 * Escribe un programa que, dada una posición en un tablero de ajedrez, nos diga a qué casillas
 * podría saltar un alfil que se encuentra en esa posición. Como se indica en la figura, el alfil
 * se mueve siempre en diagonal. El tablero cuenta con 64 casillas. Las columnas se indican
 * con las letras de la “a” a la “h” y las filas se indican del 1 al 8.
 */
package ejercicio08;
import java.util.Scanner;

/**
 *
 * @author eliana
 */
public class Ejercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Este programa define las celdas a las que puede ir un alfil en un tablero de ajedrez.");
        int [][] celda = new int[8][8];
        Scanner s = new Scanner (System.in);
        System.out.println("Por favor, indique la posición del alfil teniendo en cuenta que el tablero tiene 8 filas y 8 columnas (de la a a la h).");
        System.out.print("Número de fila: ");
        int f = Integer.parseInt(s.nextLine());
        System.out.print("Letra de columna (de la A a la H): ");
        String letra = s.nextLine();
        
        //Cambia la letra por una columna
        int c = 0;
        boolean esIncorrecto = false;
        switch (letra) {
            case ("a"):
                c = 0;
            break;
            case ("b"):
                c = 1;
            break;
            case ("c"):
                c = 2;
            break;
            case ("d"):
                c = 3;
            break;
            case ("e"):
                c = 4;
            break;
            case ("f"):
                c = 5;
            break;
            case ("g"):
                c = 6;
            break;
            case ("h"):
                c = 7;
            break;
            default:
                esIncorrecto = true;
            break;
        }
        
        //Busca las filas del cuadrante superior izquierdo
        int fila = 0;
        int col = c;
        String  columna = " ";
        if ((f < 8) && (c > 0)) {
            for(fila = f + 1; fila <= 8; fila ++) {
                col = col -1;
                switch (col) {
                    case 0:
                        columna = "a";
                    break;
                    case 1:
                        columna = "b";
                    break;
                    case 2:
                        columna = "c";
                    break;
                    case 3:
                        columna = "d";
                    break;
                    case 4:
                        columna = "e";
                    break;
                    case 5:
                        columna = "f";
                    break;
                    case 6:
                        columna = "g";
                    break;
                    case 7:
                        columna = "h";
                    break;
                    default:
                    break;
                }
                
                System.out.print(fila + columna + "|");
            }
        }
        
        //Busca las filas del cuadrante superior derecho
        columna = " ";
        col = c;
        if ((f < 8) && (c < 7)) {
            for(fila = f + 1; fila <= 8; fila ++) {
                col = col + 1;
                switch (col) {
                    case 0:
                        columna = "a";
                    break;
                    case 1:
                        columna = "b";
                    break;
                    case 2:
                        columna = "c";
                    break;
                    case 3:
                        columna = "d";
                    break;
                    case 4:
                        columna = "e";
                    break;
                    case 5:
                        columna = "f";
                    break;
                    case 6:
                        columna = "g";
                    break;
                    case 7:
                        columna = "h";
                    break;
                    default:
                    break;
                }
                
                System.out.print(fila + columna + "|");
            }
        }
        
        //Busca las filas del cuadrante inferior izquierdo
        columna = " ";
        col = c;
        if ((f > 1) && (c > 0)) {
            for(fila = f - 1; col > 0; fila--) {
                col = col - 1;
                switch (col) {
                    case 0:
                        columna = "a";
                    break;
                    case 1:
                        columna = "b";
                    break;
                    case 2:
                        columna = "c";
                    break;
                    case 3:
                        columna = "d";
                    break;
                    case 4:
                        columna = "e";
                    break;
                    case 5:
                        columna = "f";
                    break;
                    case 6:
                        columna = "g";
                    break;
                    case 7:
                        columna = "h";
                    break;
                    default:
                    break;
                }
                
                System.out.print(fila + columna + "|");
            }
        }
        
        //Busca las filas del cuadrante inferior derecho
        columna = " ";
        col = c;
        if ((f > 1) && (c < 8)) {
            for(fila = f - 1; col < 7; fila--) {
                col = col + 1;
                switch (col) {
                    case 0:
                        columna = "a";
                    break;
                    case 1:
                        columna = "b";
                    break;
                    case 2:
                        columna = "c";
                    break;
                    case 3:
                        columna = "d";
                    break;
                    case 4:
                        columna = "e";
                    break;
                    case 5:
                        columna = "f";
                    break;
                    case 6:
                        columna = "g";
                    break;
                    case 7:
                        columna = "h";
                    break;
                    default:
                    break;
                }
                
                System.out.print(fila + columna + "|");
            }
        }
        
    }
    
}
