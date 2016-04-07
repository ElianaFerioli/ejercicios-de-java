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
public class Lagarto extends Animal{
    //Atributos
    String tipo;
    boolean patas;
    
    //Constructor
    public Lagarto(String s, String t) {
        super(s);
        this.tipo = t;
    }
    
    //Métodos
    /**
    * Hace que el lagarto nade
    */
    public void nada() {
        if(tipo.equals("serpiente")) {
            System.out.println("Me voy a dar un baño.");
        } else {
            System.out.println("Prefiero quedarme al sol.");
        }
    }
    
    /**
    * Hace que el lagarto diga su nombre
    */
    public void diceNombre() {
        if(sexo.equals("macho")) {
            System.out.println("Mi nombre es juancho.");
        } else {
            System.out.println("Mi nombre es juancha.");
        }
    }
    
    /**
    * Hace que el lagarto coma
    */
    public void come() {
        System.out.println("Me apetece un gusanillo para matar el hambre.");
    }
}
