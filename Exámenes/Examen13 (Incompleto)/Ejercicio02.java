/**
 *Escribe un programa que pida un número entero positivo y que diga a continuación si las cifras que lo
componen están ordenadas de menor a mayor, mirando de izquierda a derecha. Se podrán introducir
números de cualquier longitud mientras lo permitan las variables. Usa long en lugar de int donde sea
necesario para admitir números largos. Fíjate bien que no se pide ordenar las cifras, solo saber si
están ordenadas o no.
 *
 * @author Eliana Ferioli
 */
public class Ejercicio02 {
  public static void main(String[] args) {
    System.out.println("Este programa dice si los dígitos de un número positivo están ordenados.");
    
    System.out.print("Por favor, introduzca un número entero positivo: ");
    long numeroIntroducido = Long.parseLong(System.console().readLine());
    long numero = numeroIntroducido;
    int contador = 0;
    int dividendo = 1;
    long numeroUno = 0;
    long numeroDos = 0;
    boolean esOrdenado = true;
    
    while (numero > 0) {
      numero = numero / 10;
      contador++;
      }
    while (contador > 1) {
      dividendo = dividendo * 10;
      contador--;
      }
      
      numeroUno = numeroIntroducido / dividendo;
      numeroIntroducido = numeroIntroducido % dividendo;
      dividendo = dividendo / 10;

    while (dividendo > 0) {
      numeroDos = numeroIntroducido / dividendo;
      if (numeroUno <= numeroDos) {
        numeroUno = numeroDos;
      } else {
        esOrdenado = false;
      }
      numeroIntroducido = numeroIntroducido % dividendo;
      dividendo = dividendo / 10;
    }
    
    if (esOrdenado) {
      System.out.println("El número está ordenado.");
    } else {
      System.out.println("El número no está ordenado.");
    }
  }
}
