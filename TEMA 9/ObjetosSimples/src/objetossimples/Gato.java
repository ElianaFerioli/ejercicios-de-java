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
public class Gato extends Mamifero {
    //Atributos
    String raza;
    
    //Constructor
    public Gato(String r, String s, int p) {
        super(s, p);
        this.raza = r;
    }
    
    //Métodos
    /**
    * Hace que el gato maulle
    */
    public void maulla() {
        System.out.println("Miauu");
    }
    
    /**
    * Hace que el gato coma
    */
    public void come() {
        System.out.println("Si no me traes lasaña, no como.");
    }
    
    /**
    * Hace que el gato duerma
    */
    public void duerme() {
        System.out.println("Para que duerma tendrás que acariciarme humano.");
    }
    
}
