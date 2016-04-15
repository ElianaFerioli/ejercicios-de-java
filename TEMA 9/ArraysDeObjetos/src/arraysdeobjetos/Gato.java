/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysdeobjetos;

/**
 *
 * @author eliana
 */
public class Gato {
    //Atributos
    String raza;
    String sexo;
    int    peso;
    
    //Constructor
    public Gato(String r, String s, int p) {
        this.raza = r;
        this.sexo = s;
        this.peso = p;
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

    @Override
    public String toString() {
        return "Raza: " +this. raza + "\nSexo: " + this.sexo + "\nPeso: " + this.peso;
    }
    
}
