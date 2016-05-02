/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen29;

/**
 *
 * @author eliana
 */
public class Ficha {
    //Atributos de intancia
    int ladoIz;
    int ladoDer;
    //Constructor
    public Ficha() {
        this.ladoDer = (int)(Math.random()*7);
        this.ladoIz = (int)(Math.random()*7);
    }
    //Getters
    public int getLadoIz() {
        return ladoIz;
    }
    public int getLadoDer() {
        return ladoDer;
    }
    
    //Métodos
    @Override
    public String toString() {
        return "[" + ladoIz + " " + ladoDer + "]";
    }
    @Override
    public boolean equals(Object d) {
      return ((this.ladoDer)==(((Ficha)d).getLadoDer())&&(this.ladoIz)==(((Ficha)d).getLadoIz())||(this.ladoDer)==(((Ficha)d).getLadoIz())&&(this.ladoIz)==(((Ficha)d).getLadoDer()));
    }
    
    
    
    
}
