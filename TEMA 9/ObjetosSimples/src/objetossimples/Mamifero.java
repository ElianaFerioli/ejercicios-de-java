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
public  abstract class Mamifero extends Animal {
    //Atributos
    private int peso;
    private int edad;
    
    //Constructor
    public Mamifero() {
        super();
    }
    public Mamifero(String s, int p) {
        super(s);
        this.peso = p;
    }
    
    //Métodos
    /**
    * Hace que el mamifero amamante
    */
    public void amamanta() {
        if(sexo.equals("macho")) {
            System.out.println("No puedo, soy macho.");
        }
        if(sexo.equals("hembra")) {
            System.out.println("Ok, tráeme mis crias."); 
        }
    }
    
    /**
    * Hace que el mamifero ataque
    */
    public void ataca() {
        if(peso > 20) {
            System.out.println("Te voy a reventar!");
        }
        if(peso < 21) {
            System.out.println("Mejor no ataco a nadie."); 
        }
    }
    
    /**
    * Hace que el mamifero corra
    */
    public void corre() {
        System.out.println("Ofú que pereza.");
    } 
    
}
