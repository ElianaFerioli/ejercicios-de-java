/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex12emfn.examen.pkg05;

/**
 *
 * @author eliana
 */
public class Alumno implements Comparable<Alumno> {
    //Atributos de clase
    private static int alumnosTotales;
    private static int alumnosMatriculados;
    
    //Atributos de instancia
    String nombre;
    String apellido;
    String curso = "";
    
    //Constructor
    public Alumno(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        alumnosTotales++;
    }
    
    //Getter
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public static int getAlumnosTotales() {
        return alumnosTotales;
    }
    public static int getAlumnosMatriculados() {
        return alumnosMatriculados;
    }
    
    //Métodos
    /*
    *
    * matricula a los alumnos
    *
    */
    public void matricula(String x) {
        this.curso = x;
        alumnosMatriculados++;
    }
    
    /*
    *
    * Muestra la información de los alumnos
    *
    */
    @Override
    public String toString() {
        String aclaracion;
        if(curso.equals("")) {
            aclaracion = "(no matriculado)";
        } else {
            aclaracion = "(matriculado)";
        }
        return apellido + ", " + nombre + " - " + curso + " " + aclaracion;
    }
    
    /*
    *
    * compara los alumnos
    *
    */    
    @Override
    public int compareTo(Alumno t) {
        if((this.apellido.equals(t.apellido))) {
            return (this.nombre).compareTo(t.getNombre());
        } else {
            return (this.apellido).compareTo(t.getApellido());
        }
    }    
    
}
