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
public class Pinguino extends Ave {
    //Atributos
    String raza;
    
    //Costructor
    public Pinguino(String s) {
        super(s);
    }
    //Métodos
    /**
    * Hace que el pinguino nade
    */
    public void nada() {
        System.out.println("Paso, el agua esta helada.");
    }
    /**
    * Hace que el pinguino salte
    */
    public void salta() {
        System.out.println("Vale pero solo por esta vez. Allí voy!");
    }
    /**
    * Hace que el pinguino hable
    */
    public void habla() {
        System.out.println("¿Que quieres que diga? Déjame seguir pensando como dominar el mundo.");
    }
    
}
