/*
 * Una cadena de multicines nos ha encargado una aplicación para la venta on-line de entradas. Como
 * parte de esa aplicación, tenemos que implementar una función que coloque a los espectadores en una
 * fila de butacas. Una fila de butacas es un array de una dimensión. Cada celda se corresponde a una
 * butaca que tiene el valor 0 si está libre y el valor 1 si está ocupada. La función recibe como
 * parámetros el array con la información de la fila de butacas y un número que es la cantidad de gente
 * que se quiere colocar en esa fila. Si se puede colocar a los espectadores con éxito, la función
 * devolverá un 0 y si no se puede, un -1. Lo primero que tiene que hacer la función es comprobar si hay
 * sitio, si no lo hay devolverá -1. Si hay sitio, primero intentará colocar juntos a todo el grupo y, si no
 * puede, los irá colocando en los primeros huecos que encuentre.
 * Por ejemplo, si a = { 0, 1, 0, 0, 0, 1, 0 } y se quieren colocar 3 nuevos espectadores, la función
 * devolverá 0 y el array se habrá modificado quedando así a = { 0, 1, 1, 1, 1, 1, 0 }.
 * Prueba la función desde un programa. La cabecera de la función es la siguiente:
 * public static int ocupa(int[ ] fila, int usuarios)
 *
 * @author eliana
 */

package multicine;

import java.util.Scanner;

public class Multicine {

    public static void main(String[] args) {
        System.out.println("Este programa coloca espectadores en una fila de butacas.");
        Scanner s = new Scanner(System.in);
        System.out.print("Por favor, introduzca la longitud de la fila: ");
        int longitud = Integer.parseInt(s.nextLine());
        int[] filaOriginal = generaArrayInt(longitud);
        System.out.println("Esta es la fila original: ");
        muestraArray(filaOriginal);
        System.out.print("Por favor, introduzca la cantidad de espectadores que quiere ubicar: ");
        int espectadores = Integer.parseInt(s.nextLine());
        if(ocupa(filaOriginal, espectadores)==0) {
            System.out.println("Ha sido posible ubicar a los espectadores.");
        } else {
            System.out.println("No ha sido posible ubicar a los espectadores.");
        }
        
        
    }
    /**
    * Genera un array de tamaño n con números aleatorios cuyo
    * intervalo (mínimo y máximo) se indica como parámetro.
    *
    * @param x un número entero positivo
    *@return array.
    */
    
    //Array aleatorio/////////////////////////////////////////////////////
    public static int[] generaArrayInt(int x) {
        int[] array = new int[x];

        for(int i = 0; i < x; i++) {
          array[i] = (int)(Math.random() * 2);
        }

        return array;
      }
    /**
    * Muestra array
    *
    * @param x un array de enteros
    */
    
    //Muestra array/////////////////////////////////////////////////////
    public static void muestraArray(int x[]) {
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + "|");
        }
        System.out.println();
    }
    /**
    *Ubica espectadores
    *
    * @param fila un array de enteros
    * @param usuarios un numero entero positivo
    * @return un numero entero positivo
    */
    
    //Ubica espectadores/////////////////////////////////////////////////////
    public static int ocupa(int[ ] fila, int usuarios) {
        int sitiosVacios = 0;
        int resultado = -1;
        //Se fija si cuántos hacientos vacíos hay
        for(int x = 0; x < fila.length; x++) {
            if(fila[x] == 0) {
                sitiosVacios++;
            }
        }
        
        if(sitiosVacios >= usuarios) {
            //Se fija cuántos hacientos vacios contiguos hay
            int maximoSitios = 0;
            int hueco = 0;
            for(int x = 0; x < fila.length; x++) {
                int contador = 0;
                int i = x;
                while((i < fila.length - 1)&&(fila[i] == 0)&&(fila[i+1]==0)) {
                    contador++;
                    i++;
                }
                if(contador > maximoSitios) {
                    hueco = x;
                    maximoSitios = contador;
                }
            }
            maximoSitios++;

            //Coloca a todo el grupo junto si es posible
            if(maximoSitios == usuarios) {
                for(int x = hueco; usuarios > 0; x++) {
                    fila[x] = 1;
                    usuarios--;
                }
            } else {//Los coloca separados si no los puede poner juntos
               for(int x = 0; usuarios > 0; x++) {
                   if(fila[x] == 0) { 
                        fila[x] = 1;
                        usuarios--;
                   }
                } 
            }
            muestraArray(fila);
            
            resultado = 0;
        }
        return resultado;
    }
}