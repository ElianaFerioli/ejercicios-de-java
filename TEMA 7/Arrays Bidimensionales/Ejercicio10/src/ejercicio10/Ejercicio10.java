/*
 * Realiza el juego de las tres en raya.
 */
package ejercicio10;
import java.util.Scanner;
/**
 *
 * @author eliana
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String nombreFila = "cba";
        int tablero[][] = new int[3][3];
        String tableroChar[][] = new String[3][3];
        Scanner s = new Scanner (System.in);
        int contador = 4;
        boolean esGanadorEl = false;
        boolean esGanadorYo = false;
        
        //Inicializa el tableroChar a espacios " "
        for(int x = 0; x <= 2; x++) {
            for(int i = 0; i <= 2; i++){
                tableroChar[x][i] = " ";
            }
        }
        
        
        //Pinta el tablero
        System.out.println("  ░░░░░░░░░░░░░░░");
        for(int i = 0; i < 3; i++) {
            System.out.print(nombreFila.charAt(i)+ " ░");
                for(int j = 0; j < 3; j++) {
                    System.out.print("░ " + tableroChar[i][j] + " ");
                }
            System.out.println("░░");
            System.out.println("  ░░░░░░░░░░░░░░░");
        }
        System.out.println("     1   2   3\n");
        
        

        while((contador >= 0)&&(!esGanadorEl)&&(!esGanadorYo)) {        
        //Pide coordenadas
            System.out.print("Por favor, indique una la fila (letra): ");
            String fila = s.nextLine();
            int numFila = 0;
            switch (fila) {
                case ("a"):
                    numFila = 2;
                break;
                case ("b"):
                    numFila = 1;
                break;
                case ("c"):
                    numFila = 0;
                break;
                default:
                break;
            }
            
            System.out.print("Por favor, indique una columna (numero): ");
            int columna = Integer.parseInt(s.nextLine());
            int numColumna = 0;
            switch (columna) {
                case 1:
                    numColumna = 0;
                break;
                case 2:
                    numColumna = 1;
                break;
                case 3:
                    numColumna = 2;
                break;
                default:
                break;
            }
            System.out.println();

            //Comprueba cuál va a ser la jugada del ordenador
            tablero[numFila][numColumna] = 1;
            tableroChar[numFila][numColumna] = "#";
            int x = 0;
            int y = 0;
            
                //Crea un número aleatorio mientras el número del tablero sea !=0
            if(contador > 0) {
                do {
                    x = (int)(Math.random()*3);
                    y = (int)(Math.random()*3);
                } while (tablero[x][y] != 0);

                tablero[x][y] = 2;
                tableroChar[x][y] = "@";
            }    
                //Pinta el tablero
            System.out.println("  ░░░░░░░░░░░░░░░");
            for(int i = 0; i < 3; i++) {
                System.out.print(nombreFila.charAt(i)+ " ░");
                for(int j = 0; j < 3; j++) {
                    System.out.print("░ " + tableroChar[i][j] + " ");
                }
                System.out.println("░░");
                System.out.println("  ░░░░░░░░░░░░░░░");
            }
            System.out.println("     1   2   3\n");
            contador--;

            //Comprueba si hay alguna jugada ganadora del jugador
            if((tablero[0][0] == 1)&&(tablero[0][1] == 1)&&(tablero[0][2] == 1)) {
                esGanadorEl = true;
            }
            if((tablero[1][0] == 1)&&(tablero[1][1] == 1)&&(tablero[1][2] == 1)) {
                esGanadorEl = true;
            }
            if((tablero[2][0] == 1)&&(tablero[2][1] == 1)&&(tablero[2][2] == 1)) {
                esGanadorEl = true;
            }
            if((tablero[0][0] == 1)&&(tablero[1][0] == 1)&&(tablero[2][0] == 1)) {
                esGanadorEl = true;
            }
            if((tablero[0][1] == 1)&&(tablero[1][1] == 1)&&(tablero[2][1] == 1)) {
                esGanadorEl = true;
            }
            if((tablero[0][2] == 1)&&(tablero[1][2] == 1)&&(tablero[2][2] == 1)) {
                esGanadorEl = true;
            }
            if((tablero[0][0] == 1)&&(tablero[1][1] == 1)&&(tablero[2][2] == 1)) {
                esGanadorEl = true;
            }
            if((tablero[0][2] == 1)&&(tablero[1][1] == 1)&&(tablero[2][0] == 1)) {
                esGanadorEl = true;
            }
            //Comprueba si hay alguna jugada ganadora del ordenador
            if((tablero[0][0] == 2)&&(tablero[0][1] == 2)&&(tablero[0][2] == 2)) {
               esGanadorYo = true;
            }
            if((tablero[1][0] == 2)&&(tablero[1][1] == 2)&&(tablero[1][2] == 2)) {
                esGanadorYo = true;
            }
            if((tablero[2][0] == 2)&&(tablero[2][1] == 2)&&(tablero[2][2] == 2)) {
                esGanadorYo = true;
            }
            if((tablero[0][0] == 2)&&(tablero[1][0] == 2)&&(tablero[2][0] == 2)) {
                esGanadorYo = true;
            }
            if((tablero[0][1] == 2)&&(tablero[1][1] == 2)&&(tablero[2][1] == 2)) {
                esGanadorYo = true;
            }
            if((tablero[0][2] == 2)&&(tablero[1][2] == 2)&&(tablero[2][2] == 2)) {
                esGanadorYo = true;
            }
            if((tablero[0][0] == 2)&&(tablero[1][1] == 2)&&(tablero[2][2] == 2)) {
                esGanadorYo = true;
            }
            if((tablero[0][2] == 2)&&(tablero[1][1] == 2)&&(tablero[2][0] == 2)) {
                esGanadorYo = true;
            }
        }
        
        if(esGanadorEl){
            System.out.println("Enhorabuena! Has ganado!!");
        }
        if(esGanadorYo){
            System.out.println("Lo siento :(, has perdido.");
        }
    }    
}
 
