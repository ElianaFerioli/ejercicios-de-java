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
public abstract class Animal {
    
    //Atributos
    public String sexo;
    
    //Constructor
    public Animal() {
        //this.sexo = "macho";
    }
    public Animal(String s) {
        this.sexo = s;
    }
    
    //Getter
    public String getSexo() {
        return this.sexo;
    }
    
    
}
