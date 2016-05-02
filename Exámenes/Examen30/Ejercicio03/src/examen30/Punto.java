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
public class Punto {
    //Atribustos de instancia
    double coordenadaX;
    double coordenadaY;
    
    //Constructor
    public Punto(double coordenadaX, double coordenadaY) {
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
    }    
    
    //Métodos

    @Override
    public String toString() {
        return "(" + coordenadaX + ", " + coordenadaY + ")";
    }
    
}
