/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistexamen;

/**
 *
 * @author eliana
 */
public class Trabajador implements Comparable<Trabajador>{
    //Atributos
    String nombre;
    String cargo;
    String antiguedad;
    
    
    //Constructor
    public Trabajador(String nombre, String cargo, String antiguedad) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.antiguedad = antiguedad;
    }
    
    //Getter

    public String getNombre() {
        return nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public String getAntiguedad() {
        return antiguedad;
    }
    

    @Override
    public String toString() {
        return "Trabajador\n" + "Nombre: " + nombre + "\nCargo: " + cargo + "\nAntiguedad: " + antiguedad;
    }
    
    
    @Override
    public int compareTo(Trabajador t) {
        if((this.nombre.equals(t.nombre))&&(!this.cargo.equals(t.cargo))) {
            return (this.cargo).compareTo(t.getCargo());
        } else if((this.nombre.equals(t.nombre))&&(this.cargo.equals(t.cargo))) {
            return (this.antiguedad).compareTo(t.getAntiguedad());
        } else {
            return (this.nombre).compareTo(t.getNombre());
        }
    }    
    
}
