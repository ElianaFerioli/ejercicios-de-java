/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex12emfn.examen.pkg05;

import java.util.ArrayList;

/**
 *
 * @author eliana
 */
public class Ex12emfn1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Este programa lanza un número aleatorio de monedas.");
        ArrayList<Moneda> monedasLanzadas = new ArrayList<Moneda>();
        //Lanza las monedas y las guarda en el array
        int vecesLanzadas = (int)(((Math.random())*8) + 1);
        for(int x = 0; x < vecesLanzadas; x++){
            monedasLanzadas.add(new Moneda());            
        }
        //Muestra las monedas       
        System.out.println("Monedas lanzadas: ");
        for(int i=0; i < monedasLanzadas.size(); i++) {
            System.out.println("Esta es la " + (i+1) + "º moneda: " + monedasLanzadas.get(i));
        }
        //Realiza las sumas
        int sumaCentimos = 0;
        int sumaEuros = 0;
        for(Moneda m: monedasLanzadas){
            if(m.getValorEco().equals("Céntimo")||(m.getValorEco().equals("Céntimos"))){
                sumaCentimos = sumaCentimos + m.getValorNum();
            }
            if(m.getValorEco().equals("Euro")||(m.getValorEco().equals("Euros"))){
                sumaEuros = sumaEuros + m.getValorNum();
            }
        }
        //Suma los céntimos con los euros
        if(sumaCentimos > 99) {
            sumaEuros = sumaEuros + (sumaCentimos/100);
            sumaCentimos = sumaCentimos % 100;
        }        
        if(sumaEuros==0){
            System.out.println("Suma: " + sumaCentimos + " Céntimos.");
        } else if(sumaCentimos==0){
            System.out.println("Suma: " + sumaEuros + " Euros.");
        } else {
            if(sumaEuros==1) {
                System.out.println("Suma: " + sumaEuros + " Euro y " + sumaCentimos + " Céntimos.");
            } else {
                System.out.println("Suma: " + sumaEuros + " Euros y " + sumaCentimos + " Céntimos.");
            }
        }
    }
}
