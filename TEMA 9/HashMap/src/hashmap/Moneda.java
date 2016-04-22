/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashmap;

import java.util.ArrayList;

/**
 *
 * @author eliana
 */
public class Moneda {
    
    //Atributos de clase
    public static ArrayList<String> valor = new ArrayList<String>();
    public static ArrayList<String> lado = new ArrayList<String>();
    
    //Atributos de instancia
    String ladoMoneda;
    String valorMoneda;
    
    //Contructores
    public Moneda() {
        valor.add("1 Céntimo");
        valor.add("2 Céntimos");
        valor.add("5 Céntimos");
        valor.add("10 Céntimos");
        valor.add("20 Céntimos");
        valor.add("50 Céntimos");
        valor.add("1 Euro");
        valor.add("2 Euros");
        lado.add("Cara");
        lado.add("Cruz");
        //Determina aleatoriamente el lado
        this.ladoMoneda = lado.get((int)(Math.random()*2));
        //Determina aleatoriamente el valor
        this.valorMoneda = valor.get((int)(Math.random()*8));
    }
    
    public Moneda(String x) {
        valor.add("1 Céntimo");
        valor.add("2 Céntimos");
        valor.add("5 Céntimos");
        valor.add("10 Céntimos");
        valor.add("20 Céntimos");
        valor.add("50 Céntimos");
        valor.add("1 Euro");
        valor.add("2 Euros");
        lado.add("Cara");
        lado.add("Cruz");
        
        if(valor.contains(x)) {
            //Determina aleatoriamente el lado
            this.ladoMoneda = lado.get((int)(Math.random()*2));
            this.valorMoneda = x;
        } else {
            //Determina aleatoriamente el valor
            this.valorMoneda = valor.get((int)(Math.random()*8));
            this.ladoMoneda = x;
        }
    }
    
    //Getters
    public String getLadoMoneda() {
        return ladoMoneda;
    }
    public String getValorMoneda() {
        return valorMoneda;
    }
    
    //Métodos/////////////////   
    
    /*
    *
    *Lanza la moneda
    *
    */
    public static Moneda lanza(String x) {
        Moneda monedaLanzada = new Moneda(x);   
        return monedaLanzada;
    }
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
        return "Moneda: " + ladoMoneda + " " + valorMoneda;
    }
    
    @Override
    public boolean equals(Object d) {
      return (this.valor).equals(((Moneda)d).getValorMoneda());
    }
    
    
}
