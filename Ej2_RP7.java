import java.util.Scanner;

/**
 * Diseña una función está que recibe como parámetros de entrada un array de números
 enteros a y un número entero num, y devuelve true si el número num está contenido en a,
 y false en otro caso. Crea otra función leer que reciba como parámetro un objeto
 Scanner asociado al teclado, le pida al usuario la cantidad de números a leer, lea la colección
 de números enteros y devuelva un array conteniendo dichos números. Por último, diseña la
 función main para comprobar el correcto funcionamiento de las dos funciones anteriores.

 *
 * Created by SamsungAndroid on 15/06/2016.
 */
public class Ej2_RP7 {
    public static void main(String[] args) {
        System.out.println("Este programa dice si un número está contenido en un array.");
        Scanner s = new Scanner(System.in);
        int[] array;
        array = leer(s);
        System.out.print("Por favor, introduzca el número que quiere buscar: ");
        int num = s.nextInt();
        if(estaEnArray(array, num)){
            System.out.println("El número " + num + " está contenido en el array.");
        } else {
            System.out.println("El número " + num + " no está contenido en el array.");
        }
    }
    //Funciones
    /*
     *Lee por teclado y rellena array
     */
    private static int[] leer(Scanner s){
        System.out.print("¿Cuántos números desea introducir?: ");
        int longitud = s.nextInt();
        int[] array = new int[longitud];
        for(int x = 0; x < array.length; x++){
            System.out.print("Por favor, introduce el " + (x + 1) + "º valor del array: ");
            array[x] = s.nextInt();
        }
        return array;
    }
    /*
     * Determina si un número existe en un array
     */
    private static boolean estaEnArray(int[] array, int num){
        boolean existe = false;
        for(int n : array){
            if(n==num){
                existe = true;
            }
        }
        return existe;
    }
}
