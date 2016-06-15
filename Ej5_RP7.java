import java.util.Arrays;
import java.util.Scanner;

/**
 * Diseña un algoritmo que permita invertir el contenido de un array. El algoritmo no podrá
 utilizar arrays auxiliares.
 * Created by SamsungAndroid on 15/06/2016.
 */
public class Ej5_RP7 {
    public static void main(String[] args) {
        System.out.println("Este programa invierte el contenido de un array.");
        Scanner s = new Scanner(System.in);
        int[] array;
        array = leer(s);
        System.out.println("Array original: ");
        for(int n : array){
            System.out.print(n + " ");
        }
        invierteArray(array);
        System.out.println("\nArray invertido: ");
        for(int n : array){
            System.out.print(n + " ");
        }
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
            System.out.print("Por favor, introduce el " + (i + 1) + "º valor: ");
            n = s.nextInt();
            array[i] = n;
            i++;
        }
        array = Arrays.copyOf(array, (i-1));
        return array;
    }
    /*
     *Invierte el contenido de un array
     */
    private static int[] invierteArray(int[] a){
        int contador = a.length - 1;
        for(int x = 0; x < (a.length/2); x++){
            int aux = a[x];
            a[x] = a[contador];
            a[contador] = aux;
            contador--;
        }
        return a;
    }
}
