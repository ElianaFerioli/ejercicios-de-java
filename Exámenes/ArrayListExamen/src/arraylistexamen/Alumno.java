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
public class Alumno implements Comparable<Alumno> {
    //Atributos
    String nombre;
    String apellido;
    String edad;
    
    
    //Constructor
    public Alumno(String nombre, String apellido, String edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    
    //Getter

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEdad() {
        return edad;
    }
    

    @Override
    public String toString() {
        return "Trabajador\n" + "Nombre: " + nombre + "\nApellido: " + apellido + "\nEdad: " + edad;
    }
    
    @Override
    public int compareTo(Alumno t) {
        if((this.nombre.equals(t.nombre))&&(!this.apellido.equals(t.apellido))) {
            return (this.apellido).compareTo(t.getApellido());
        } else if((this.nombre.equals(t.nombre))&&(this.apellido.equals(t.apellido))) {
            return (this.edad).compareTo(t.getEdad());
        } else {
            return (this.nombre).compareTo(t.getNombre());
        }
    }    
    
}
