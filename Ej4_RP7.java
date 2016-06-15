import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * Diseña una función media para calcular la media de las estaturas de una clase. La función
 recibe como parámetro de entrada un array con las estaturas (en centímetros) de los alumnos
 de una determinada clase. Crea después otras dos funciones para determinar cuántos
 alumnos son más altos y cuántos más bajos que la media. El nombre de las funciones queda
 a criterio del alumno.
 Crea también una función main para comprobar que las tres funciones se han codificado
 correctamente.
 * Created by SamsungAndroid on 15/06/2016.
 */
public class Ej4_RP7 {
    public static void main(String[] args) {
        System.out.println("Este programa determina cuántos alumnos miden por debajo de la media y cuántos por encima.");
        Scanner s = new Scanner(System.in);
        int[] array;
        array = leer(s);
        double media = calculaMedia(array);
        System.out.println(media);
        System.out.println("Existen " + debajoMedia(array, media) + " alumnos por debajo de la media.");
        System.out.println("Existen " + encimaMedia(array, media) + " alumnos por encima de la media.");
    }
    //Funciones
    /*
     *Lee por teclado y rellena array
     */
    private static int[] leer(Scanner s){
        int[] array = new int[1];
        int n = 1;
        int i = 0;
        System.out.println("La lectura de datos finaliza cuando se introduce un \"0\".");
        while(n!=0){
            if (i == array.length) {
                array = Arrays.copyOf(array, i * 2);
            }
            System.out.print("Por favor, introduce la altura del " + (i + 1) + "º alumno: ");
            n = s.nextInt();
            array[i] = n;
            i++;
        }
        array = Arrays.copyOf(array, (i-1));
        return array;
    }
    /*
     *Derermina la media
     */
    private static double calculaMedia(int[] a){
        int suma = 0;
        int contador = 0;
        for(int n : a){
            suma = suma + n;
            contador++;
        }
        double media = suma/contador;
        return media;
    }

    /*
     *Determina cuántos elementos del array estan por debajo de una media
     */
    private static int debajoMedia(int[] a, double m){
        int contador = 0;
        for(int n : a){
            if(n<m){
                contador++;
            }
        }
        return contador++;
    }
    /*
     *Determina cuántos elementos del array están por encima de una media
     */
    private static int encimaMedia(int[] a, double m){
        int contador = 0;
        for(int n : a){
            if(n>m){
                contador++;
            }
        }
        return contador;
    }
}
