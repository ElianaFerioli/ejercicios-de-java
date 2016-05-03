/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex12emfn.examen.pkg05;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author eliana
 */

public class Ex12emfn3 {
    public static void main(String[] args) {
    ArrayList<Alumno> a = new ArrayList<>();
    
    Alumno a1 = new Alumno("Elba", "Lazo");
    Alumno a2 = new Alumno("Elba", "Quero");
    a2.matricula("2º BACH");
    Alumno a3 = new Alumno("Albert", "Quero");
    Alumno a4 = new Alumno("Mario", "Neta");
    Alumno a5 = new Alumno("Yola", "Prieto");
    a5.matricula("1º DAW");
    Alumno a6 = new Alumno("Monica", "Galindo");
    a6.matricula("2º DAW");
    
    a.add(a1);
    a.add(a2);
    a.add(a3);
    a.add(a4);
    a.add(a5);
    a.add(a6);
            
    Collections.sort(a);
    
    for (Alumno miAlumno: a) {
      System.out.println(miAlumno);
    }
    
    System.out.println("Alumnos totales: " + Alumno.getAlumnosTotales());
    System.out.println("Alumnos matriculados: " + Alumno.getAlumnosMatriculados());
  }
}
