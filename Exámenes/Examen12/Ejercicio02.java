/**
 *Escribe un programa que cambie un dígito dentro de un número dando la posición y el valor nuevo.
Las posiciones se cuentan de izquierda a derecha empezando por el 1. Se recomienda usar long en
lugar de int ya que el primero admite números más largos. Suponemos que el usuario introduce
correctamente los datos.
 *
 * @author Eliana Ferioli
 */
public class Ejercicio02 {
  public static void main(String[] args) {
    System.out.println("Este programa cambia un dígito en la posición idicada");
    System.out.print("Por favor, introduzca un número: ");
    long numeroIntroducido = Long.parseLong(System.console().readLine());
    System.out.print("Por favor, introduzca el dígito que quiere colocar: ");
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

    while (contador <= (posicion - 1)) {
      System.out.print((numero / dividendo));
      contador++;
      numero = numero % dividendo;
      dividendo = dividendo / 10;
    }
    System.out.print(digito);
    numero = numero % dividendo;
    dividendo = dividendo / 10;
    
    while (numero > 0) {
      System.out.print((numero / dividendo));
      numero = numero % dividendo;
      dividendo = dividendo / 10;
    }
  }
}
