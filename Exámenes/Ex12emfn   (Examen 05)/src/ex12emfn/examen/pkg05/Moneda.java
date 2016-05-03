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
public class Moneda {
    
    //Atributos de clase
    public static ArrayList<Integer> valorNumerico = new ArrayList<>();
    public static ArrayList<String> valorEconomico = new ArrayList<>();
    
    //Atributos de instancia
    int valorNum;
    String valorEco;
    
    //Contructores
    public Moneda() {
        valorNumerico.clear();
        valorNumerico.add(1);
        valorNumerico.add(2);
        valorNumerico.add(5);
        valorNumerico.add(10);
        valorNumerico.add(20);
        valorNumerico.add(50);
        //Determina el valor numérico
        int valorAleatorio = (int)(Math.random()*6);
        this.valorNum = valorNumerico.get(valorAleatorio);
        //Determina el valor económico
        valorEconomico.clear();
        if((this.valorNum==1)) {
            valorEconomico.add("Céntimo");
            valorEconomico.add("Euro");
            //Determina el valor numérico
            valorAleatorio = (int)(Math.random()*2);
            this.valorEco = valorEconomico.get(valorAleatorio);
        } else if((this.valorNum==2)) {
            valorEconomico.add("Céntimos");
            valorEconomico.add("Euros");
            //Determina el valor numérico
            valorAleatorio = (int)(Math.random()*2);
            this.valorEco = valorEconomico.get(valorAleatorio);
        } else {
            this.valorEco = "Céntimos";    
        }
    }
    
    //Getters
    public String getValorEco() {
        return valorEco;
    }
    public int getValorNum() {
        return valorNum;
    } 

    //Métodos/////////////////
    /*
     *
     *Lanza la moneda
     *
     */
    public static Moneda lanza() {
        Moneda monedaLanzada = new Moneda();   
        return monedaLanzada;
    }     
    /*
    *
    *Muestra la moneda
    *
    */
    @Override
    public String toString() {
        return valorNum + " " + valorEco;
    }
    
}
