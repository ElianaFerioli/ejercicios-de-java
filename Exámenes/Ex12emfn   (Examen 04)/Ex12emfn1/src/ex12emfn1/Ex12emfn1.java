/*
 * 
 */
package ex12emfn1;

import java.util.Scanner;

/**
 *
 * @author eliana
 */
public class Ex12emfn1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Este programa pinta una figura.");
        Scanner s = new Scanner(System.in);
        System.out.print("Por favor, indique si quiere pintar un cuadrado, una pirámide o una pirámide invertida: ");
        String figura = s.nextLine();
        System.out.print("Por favor, indique la altura: ");
        int altura = Integer.parseInt(s.nextLine());
        System.out.print("Por favor, indique si quiere que la figura esté rellena (si o no): ");
        String relleno = s.nextLine();
        boolean esRelleno = false;
        if(relleno.equals("si")) {
            esRelleno = true;
        }
        pintaFigura(figura, altura, esRelleno);
    }
    
    //////////////Funciones
    /**
    * Muestra figura
    *
    * @param nombreFigura un String
    * @param n un número entero positivo
    * @param rellena un valor booleano
    */
    
    //Muestra array/////////////////////////////////////////////////////
    public static void pintaFigura(String nombreFigura, int n, boolean rellena) {
        if((nombreFigura.equals("piramide"))&&(rellena)) {
            int x = 0;
            int altinicial= n;
            int h = 0;
            int i = altinicial - (n - h);
            while (n > 0) {
              do {
                System.out.print(" ");
                x++;
              } while (x < n);
              x = 0;
              while (i >= 0) {
                System.out.print("*");
                i--;
              }
              System.out.println();
              n--;
              h++;
              i = altinicial - (n - h);
            }
        }
        if((nombreFigura.equals("piramide"))&&(!rellena)) {
            int altura = 1;
            int espacios = n - 1;
            int i = 0;
            int j = 0;
            int relleno = 0;

            while (altura < n) {

              for (i = 1; i <= espacios; i++) {
                System.out.print(" ");
              }
              System.out.print("*");
              for (i = 1; i < relleno; i++) {
                System.out.print(" ");
              }
              if (altura > 1) {
                System.out.print("*");
              }

              System.out.println();
              espacios--;
              altura++;
              relleno = relleno + 2;;
            }
            for (i = 1; i < (n * 2); i++) {
              System.out.print("*");
            }
        }
        if((nombreFigura.equals("cuadrado"))&&(rellena)) {
            for(int x = 0; x < n; x++){
                for(int i = 0; i < n; i++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
        if((nombreFigura.equals("cuadrado"))&&(!rellena)) {
            for(int x = 0; x < n; x++){
                for(int i = 0; i < n; i++){
                    if(x==0) {
                        System.out.print("* ");
                    } else if(x==n-1) {
                        System.out.print("* ");
                    } else if((i==0)||(i==n-1)) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                    
                }
                System.out.println();
            }
        }
        if((nombreFigura.equals("piramide invertida"))&&(rellena)) {
            int altura = 1;
            int espacios = 1;
            int i = 1;
            int j = 0;
            int relleno = n + (n -1);
            
          while (altura <= (n)) {   //pinta la parte de arriba
            for (i = 1; i < espacios; i++) {
              System.out.print(" ");
            }
            for (i = 1; i <= relleno; i++) {
              System.out.print("*");
            }
            System.out.println();
            espacios++;
            altura++;
            relleno = relleno - 2;
          }
        }
        if((nombreFigura.equals("piramide invertida"))&&(!rellena)) {
            int altura = 1;
            int espacios = 1;
            int i = 1;
            int relleno = n + (n -1);
            int hueco = relleno - 2;
            
          while (altura <= (n)) {   //pinta la parte de arriba
            for (i = 1; i < espacios; i++) {
              System.out.print(" ");
            }
              System.out.print("*");
              for (int j=1; j <= hueco; j++) {
                if (altura == 1) {
                System.out.print("*");
                } else {
                System.out.print(" ");
                }
              }
              if (altura < n) {
              System.out.print("*");
              }
            System.out.println();
            espacios++;
            altura++;
            relleno = relleno - 2;
            hueco = hueco - 2;
          }
        }
        
    }
}
