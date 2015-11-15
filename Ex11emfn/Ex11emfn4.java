/**
 *
 *
 * @author Eliana Ferioli
 */
public class Ex11emfn4 {
  public static void main(String[] args) {
    System.out.println("Este programa dice cuánto suman los dígitos pares de un número introducido.");
    System.out.print("Por favor, introduzca un número (entero positivo): ");
    long numeroIntroducido = Long.parseLong(System.console().readLine());

    int contador = 0;
    long numero = numeroIntroducido;
    long dividendo = 1;
    long suma = 0;

    while (numero > 0) {
      numero = numero /10;
      contador++;
    }

    for (int x = 1; x < contador; x++) {
      dividendo = dividendo * 10;
    }

    numero = 0;
    System.out.print("Los dígitos pares son:");
    
    while (contador > 0) {
      numero = numeroIntroducido / dividendo;
      if ((numero % 2) == 0) {
        System.out.print(" " + numero);
        suma = suma + numero;
      }
      numeroIntroducido = numeroIntroducido % dividendo;
      dividendo = dividendo / 10;
      contador--;
    }
    
    System.out.println();
    System.out.print("La suma de los dígitos pares es: " + suma);
  }
}  
