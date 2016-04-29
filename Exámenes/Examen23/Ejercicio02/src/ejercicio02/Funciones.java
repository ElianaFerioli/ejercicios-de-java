/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio02;

/**
 *
 * @author eliana
 */
public class Funciones {
    
    public static String letraNIF(int dni) {
        String[] letra = new String[23];
        letra[0] = "T"; 
        letra[1] = "R";
        letra[2] = "W";
        letra[3] = "A";
        letra[4] = "G";
        letra[5] = "M";
        letra[6] = "Y";
        letra[7] = "F"; 
        letra[8] = "P";
        letra[9] = "D";
        letra[10] = "X";
        letra[11] = "B";
        letra[12] = "N";
        letra[13] = "J";
        letra[14] = "Z";
        letra[15] = "S"; 
        letra[16] = "Q";
        letra[17] = "V";
        letra[18] = "H";
        letra[19] = "L";
        letra[20] = "C";
        letra[21] = "K";
        letra[22] = "E";
                                
        int modulo = dni % 23;
        String resultado = "";
        
        for(int x = 0; x < 23; x++){
            if(modulo == x) {
                resultado = letra[x];
            }
        }
        
        return resultado;
    }
}
