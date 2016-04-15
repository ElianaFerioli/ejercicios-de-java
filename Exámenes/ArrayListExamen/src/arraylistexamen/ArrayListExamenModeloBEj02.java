/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistexamen;

import java.util.ArrayList;

/**
 *
 * @author eliana
 */
public class ArrayListExamenModeloBEj02 {
    public static void main(String[] args) {
        ArrayList<Integer> original = new ArrayList<Integer>();
        ArrayList<Integer> capicua = new ArrayList<Integer>();
        ArrayList<Integer> noCapicua = new ArrayList<Integer>();
        //Rellena el array
        for(int x = 0; x < 50; x++) {
            int i = ((int)(Math.random()*201) + 200);
            original.add(i);
        }
        
        //Manda los que son capicúa a otro array
        for(int o: original) {
            if(esCapicua(o)) {
                capicua.add(o);                
            }
        }
        
        //Manda los que no son capicua a otro array
        for(int o: original) {
            if(!esCapicua(o)) {
                noCapicua.add(o);                
            }
        }
        
        //Muestra lista original
        System.out.println("Muestra la lista original: ");
        for(int o: original) {
            System.out.print(o + "/");
        }
        
        //Muestra lista capicua
        System.out.println("\nMuestra la lista capicua: ");
        for(int c: capicua) {
            System.out.print(c + "/");
        }
        
        //Muestra lista no capicua
        System.out.println("\nMuestra la lista no capicua: ");
        for(int nc: noCapicua) {
            System.out.print(nc + "/");
        }
        
     
    
}
    /**
    * Devuelve verdadero si el número que se pasa como parámetro es capicúa
    * y falso en caso contrario.
    *
    * @param x un número entero positivo
    * @return verdadero o falso
    */
    
    //Es Capicúa/////////////////////////////////////////////////////
    
    public static boolean esCapicua(int x) {
        int numeroOriginal = x;
        int volteado = 0;
        boolean  esCapicua =  false;
        
        //Le da la vuelta al número
        while (x > 0) {
          volteado = (volteado * 10) + (x % 10);
          x /= 10;
        }
        
        //Comprueba si es capicúa
        if(numeroOriginal == volteado) {
            esCapicua = true;
        }
        
        return esCapicua;
    }
    
}
