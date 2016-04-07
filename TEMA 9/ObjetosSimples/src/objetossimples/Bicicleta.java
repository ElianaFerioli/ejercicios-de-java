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
public class Bicicleta extends Vehiculo {
    //Atributos
    private int numeroPlatos;
    
    //Cosntructor
    public Bicicleta(int x) {
        super();
        this.numeroPlatos = x;
    }
    
    //Métodos
    
    /**
    * Hace el caballito
    */
    public void haceCaballito() {
       System.out.println("No puedo porque me caigo.");
    }
    
}
