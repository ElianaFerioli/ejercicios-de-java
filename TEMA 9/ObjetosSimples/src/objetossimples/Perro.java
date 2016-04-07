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
public class Perro extends Mamifero{
    //Atributos
    String raza;
    
    //Constructor
    public Perro(String r, String s, int p) {
        super(s, p);
        this.raza = r;
    }
    
    //Métodos
    /**
    * Hace que el perro ladre
    */
    public void ladra() {
        System.out.println("Guau...Guau");
    }
    
    /**
    * Hace que el perro busque la pelota
    */
    public void busca() {
        System.out.println("Espero que esta vez la hayas tirado de verdad.");
    }
    
    /**
    * Hace que el perro duerma
    */
    public void duerme() {
        System.out.println("Esperate que voy a dar unas veinte vueltas antes de dormirme.");
    }
    
}

