import java.util.Arrays;
import java.util.Scanner;

/**
 * Se dispone de un array de números enteros en el que al menos hay dos números que son
 iguales y dos que son distintos. Obtenga una función mayorMinimo que tomando como
 parámetro dicho array, devuelva un elemento del array que sea mayor que el mínimo de éste.
 Crea otra función leer que reciba como parámetro un objeto Scanner asociado al teclado,
 lea del mismo una colección de números enteros (hasta que el usuario introduzca un 0) y
 devuelva un array conteniendo dichos números. Crea también una función main para
 comprobar el correcto funcionamiento de las dos funciones anteriores.

 * Created by SamsungAndroid on 15/06/2016.
 */
public class Ej3_RP7 {
    public static void main(String[] args) {
        System.out.println("Este programa devuelve un elemento del array mayor al elemento requerido.");
        Scanner s = new Scanner(System.in);
        int[] array;
        array = leer(s);
        System.out.println("Un número mayor al menor del array introducido es: " + mayorMinimo(array));
    }
    //Funciones
    /*
     *Lee por teclado y rellena array
     */
    private static int[] leer(Scanner s){
        int[] array = new int[1];
        int n = 1;
        int i = 0;
        while(n!=0){
            if (i == array.length) {
                array = Arrays.copyOf(array, i * 2);
            }
            System.out.print("Por favor, introduce el " + (i + 1) + "º valor del array: ");
            n = s.nextInt();
            array[i] = n;
            i++;
        }
        array = Arrays.copyOf(array, (i-1));
        return array;
    }

    /*
     *Devuelve un número que sea mayor al menor del array
     */
    private static int mayorMinimo(int[]array){
        boolean esMayor = false;
        int x = 0;
        int mayor = 0;
        while((!esMayor)&&(x < array.length - 1)){
            if (array[x] > array[x + 1]) {
                esMayor = true;
            } else {
                x++;
            }
        }
        mayor = array[x];
        return mayor;

    }
}
