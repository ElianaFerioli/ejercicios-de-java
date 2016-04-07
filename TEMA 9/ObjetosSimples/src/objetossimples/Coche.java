/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetossimples;

/**
 *
 * @author eliana
 */
public class Coche extends Vehiculo{
    //Atributos
    private int numeroPuertas;
    
    //Cosntructor
    public Coche(int x) {
        super();
        this.numeroPuertas = x;
    }
    
    //Métodos
    
    /**
    * Quema ruedas con el coche
    */
    public void quemaRueda() {
       System.out.println("No soy un cani, paso.");
    }
}
