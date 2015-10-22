/**
Escribe un programa que pida un número entero y un dígito y que diga a continuación cuántas veces aparece el
dígito dentro del número.
 * 
 */
public class Ejemplo04 {
  public static void main(String[] args) {
    int nuevonum = 0;
    int veces = 0;
    int x = 1;
    System.out.println("Este programa calcula las veces que aperece un dígito en un número entero.");
    System.out.print("Por favor introduzca un número entero: ");
    int num = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca un dígito: ");
    int dig = Integer.parseInt(System.console().readLine());
    
   while (num > 0) {
      if ((num % 10) == dig) {
        veces++;
      }
      num /= 10;
    }
  System.out.println("El dígito introducido aparece " + veces + " veces.");
  }
}
