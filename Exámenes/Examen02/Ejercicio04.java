/**
 * Escribe un programa que pida un número entero y que diga a continuación si las cifras que lo
componen están en orden, mirando de izquierda a derecha. Se considerarán números positivos o
negativos de 5 dígitos como máximo.
 *
 * @author Eliana Ferioli
 */
public class Ejercicio04 {
  public static void main(String[] args) {
    System.out.println("Este programadetermina si los dígitos que componen un número introducido están en orden.");
    System.out.print("Por favor, introduzcaun número de como máximo 5 dígitos: ");
    int numerointroducido = Integer.parseInt(System.console().readLine());
    int num = Math.abs(numerointroducido);
    int nuevonum = 1;
    boolean orden = true;
    
    while (nuevonum > 0) {
      
      nuevonum = num / 10;
      
      if (((num % 10) >= (nuevonum % 10))) {
        num = num / 10 ;
      } else {
        orden = false;
        nuevonum = 0;
      }
    }
    
    if (!orden) {
      System.out.println("El número " + numerointroducido + " no está en orden.");
    } else {
      System.out.println("El número " + numerointroducido + " está en orden.");
    }
  }
}
