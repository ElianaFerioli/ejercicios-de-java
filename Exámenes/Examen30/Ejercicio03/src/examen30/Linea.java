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
public class Linea {
    //Atributos de instancia
    Punto puntoUno;
    Punto puntoDos;
    
    //Constructor
    public Linea(Punto puntoUno, Punto puntoDos) {
        this.puntoUno = puntoUno;
        this.puntoDos = puntoDos;
    }
    
    //Métodos
    @Override
    public String toString() {
        return "Linea formada por los puntos " + puntoUno + " y " + puntoDos;
    }
    
    
    
}
