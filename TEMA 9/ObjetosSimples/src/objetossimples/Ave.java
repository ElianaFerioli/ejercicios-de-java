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
public abstract class Ave extends Animal{
    //Atributos
    int    peso;
    String color;
 
    public Ave() {

    }
    
    public Ave(String s) {
        super(s);
    }
    
    //Métodos
    
    /**
    * Hace que el ave vuele
    */
    public void vuela() {
        String nombre = getClass().getName();
        if(nombre.equals("objetossimples.Pinguino")){
            System.out.println("No puedo volar!!");
        } else {
            System.out.println("Hoy no hace día para volar.");
        }
    }
    
    /**
    * Hace que el ave empolle
    */
    public void empolla () {
        if(sexo.equals("macho")) {
            System.out.println("¿Acaso parezco una gallina?");
        }
        if(sexo.equals("hembra")) {
            System.out.println("Tráeme mis huevos.");
        }
    }
    
    /**
    * Hace que el ave cante
    */
    public void canta() {
        String nombre = getClass().getName();
        if(nombre.equals("objetossimples.Canario")) {
            System.out.println("Pipipipipipipipipipiiiiii");
        } else {
            System.out.println("No soy un canario.");
        }
    }
}
