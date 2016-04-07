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
public class Canario extends Ave {
    //Atributos
    String raza;
    
    //Costructor
    public Canario(String s) {
        super(s);
    }
    
    //Métodos
    /**
    * Hace que el canario coma
    */
    public void come() {
        System.out.println("Tráeme uno de los palitos esos del mercadona.");
    }
    /**
    * Hace que el canario busque
    */
    public void busca() {
        System.out.println("Me pareció ver un lindo gatito.");
    }
    /**
    * Hace que el canario duerma
    */
    public void duerme() {
        System.out.println("Ponme un trapo por arriba.");
    }
}
