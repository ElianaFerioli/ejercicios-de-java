/**
 *Realiza un programa que elimine un determinado dígito de un número introducido por teclado. Utiliza el tipo long
donde sea necesario para aceptar números largos.
Ejemplo:
Introduzca un número entero: 291081756
¿Qué dígito desea eliminar? 1
El número resultante es el 2908756
 *
 * @author Eliana Ferioli
 */
public class Ejercicio03 {
  public static void main(String[] args) {
    System.out.println("Este programa elimina un dígito de un número introducido por teclado.");
    
    System.out.print("Por favor introduzca un número largo: ");
    long numIntroducido = Long.parseLong(System.console().readLine());
    System.out.print("Por favor introduzca el dígito que quiere eliminar: ");
    int dig = Integer.parseInt(System.console().readLine());
    int contador = 0;
    long divisor = 1;
    long num = numIntroducido;
    
    //Calcula la longitud del número
    do {
      num = num / 10;
      contador++;
    } while (num > 0);
    //Genera el divisor
    for (int x = 1; x < contador; x++) {
      divisor = divisor * 10;
    }
    //Busca el número que se quiere eliminar y lo elimina
    System.out.print("El nuevo número es: ");
    while (contador > 0) {
      long digitoBuscado = numIntroducido / divisor;
      if (digitoBuscado != dig) {
        System.out.print(digitoBuscado);
      }
      contador--;
      numIntroducido = numIntroducido % divisor;
      divisor = divisor / 10;
    }
  }
}
