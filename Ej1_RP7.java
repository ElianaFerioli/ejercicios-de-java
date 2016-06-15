
import java.util.Arrays;
import java.util.Scanner;

/**
 * Desarrolla una función mayor que tome como parámetro de entrada un array totalmente
 relleno de valores enteros y devuelva como resultado el valor mayor contenido en dicho
 array. Crea también una función leer que reciba como parámetro un objeto Scanner
 asociado al teclado, lea del mismo una colección de MAX (una constante, por ejemplo 10)
 números enteros y devuelva un array conteniendo dichos números. Crea también una
 función main para comprobar el correcto funcionamiento de las dos funciones anteriores.
 * Created by SamsungAndroid on 15/06/2016.
 */
public class Ej1_RP7 {
    public static final int MAX =10;
    public static void main(String[] args) {
        System.out.println("Este programa devuelve el mayor número contenido en un array.");
        Scanner s = new Scanner(System.in);
        //Crea un array
        int [] array;
        //Referencia el array creado a lo que devuelve la función leer
        array = leer(s);
        System.out.println("El mayor número del array es: " + devuelveMayor(array));


    }
    //Funciones
    /*
     *Lee por teclado y rellena array
     */
    private static int[] leer(Scanner s){
        int[] array = new int[MAX];
        for(int x = 0; x < array.length; x++){
            System.out.print("Por favor, introduce el " + (x + 1) + "º valor del array: ");
            array[x] = s.nextInt();
        }
        return array;
    }
    /*
     *Devuelve el máximo número de un array
     */
    public static int devuelveMayor(int[] a){
        Arrays.sort(a);
        return a[MAX-1];
    }
}
