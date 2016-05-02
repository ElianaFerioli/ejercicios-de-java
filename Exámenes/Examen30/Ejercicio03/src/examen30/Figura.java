/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen30;

/**
 *
 * @author eliana
 */
public abstract class Figura {
    //Atributos de clase
    static int figurasCreadas;
    //Atributos
    private String caracter;
    //Constructor
    public Figura(String c) {
        this.caracter = c;
    }
    //Getter
    public static int getFigurasCreadas() {
        return figurasCreadas;
    }
    public String getCaracter() {
        return caracter;
    }
    
}
