/**
 *Escribe un programa que sea capaz de insertar un dígito dentro de un número indicando la posición.
El nuevo dígito se colocará en la posición indicada y el resto de dígitos se desplazará hacia la
derecha. Las posiciones se cuentan de izquierda a derecha empezando por el 1. Suponemos que el
usuario introduce correctamente los datos. Se recomienda usar long en lugar de int ya que el primero
admite números más largos.
 *
 * @author Eliana Ferioli
 */
public class Ejercicio04 {
  public static void main(String[] args) {
    System.out.println("Este programa coloca un dígito en la posición idicada");
    System.out.print("Por favor, introduzca un número: ");
    long numeroIntroducido = Long.parseLong(System.console().readLine());
    System.out.print("Por favor, introduzca el dígito que quiere introducir: ");
    int digito = Integer.parseInt(System.console().readLine());
    System.out.print("Por favor, introduzca la posición donde quiere colocar el dígito: ");
    int posicion = Integer.parseInt(System.console().readLine());
    
    int contador = 0;
    long numero = numeroIntroducido;
    long dividendo = 1;
    
    while (numero > 0) {
      numero = numero /10;
      contador++;
    }
    
    for (int x = 1; x < contador; x++) {
      dividendo = dividendo * 10;
    }
    
    numero = numeroIntroducido;
    contador = 1;

    while (contador <= posicion) {
      System.out.print((numero / dividendo));
      contador++;
      numero = numero % dividendo;
      dividendo = dividendo / 10;
    }
    System.out.print(digito);
    while (numero > 0) {
      System.out.print((numero / dividendo));
      numero = numero % dividendo;
      dividendo = dividendo / 10;
    }
  }
}
