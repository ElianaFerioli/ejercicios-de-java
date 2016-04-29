/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen29;

/**
 *
 * @author eliana
 */
public class Alumno {
    //Atributos de clase
    private static int expedienteInicial;
    //Atributos de instancia
    private String nombre;
    private String apellidos;
    private String correo;
    
    //Constructor
    public Alumno(String nombre, String apellidos, String correo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        expedienteInicial++;
    }
    
    //Getters
    public String getApellidos() {
        return apellidos;
    }
    public String getNombre() {
        return nombre;
    }
    public String getCorreo() {
        return correo;
    }
    //Setters
    public static void setExpedienteInicial(int expedienteInicial) {
        Alumno.expedienteInicial = expedienteInicial;
    }
    
    
    /////Métodos
    @Override
    public String toString() {
        return expedienteInicial + ": " + apellidos + ", " + nombre + " <" + correo + ">";
    }   
}
