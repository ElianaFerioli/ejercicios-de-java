/*
 * El programa GestiMat (gestión de matrículas) necesita almacenar los datos sobre los alumnos que se
 * matriculan en un centro educativo. Crea la clase Alumno de tal forma que de cada uno de ellos se
 * sepa su nombre, sus apellidos y su dirección de correo electrónico. A cada alumno se le asigna de
 * forma automática un número de expediente empezando por el que se decida cada curso.
 */
package examen29;

/**
 *
 * @author eliana
 */
public class Ejercicio01Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Alumno.setExpedienteInicial(5000);
        Alumno a1 = new Alumno("Larisa", "Peláez Almera", "lari@gmail.com");
        Alumno a2 = new Alumno("Benito", "Cruz Santipán", "benito32@yahoo.com");
        System.out.println(a1);
        System.out.println(a2);
    }
}
