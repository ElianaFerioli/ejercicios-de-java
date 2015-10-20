/**
 * 
 *
 * @author Eliana Ferioli
 */
public class Ejercicio21 {
  public static void main(String[] args) {
    System.out.println("Por favor, introducir números.\nEl programa finalizará cuando se introduzca un número negativo.");
    int cantidad = 0;
    double impares = 0;
    double sumaimpares = 0;
    int mayor = 0;
    int num = 0;
    
      for (int x = 1; num >= 0; x++) {
        System.out.print( x + "º número: ");
        num = Integer.parseInt(System.console().readLine());
        if (num >= 0) {
          cantidad++;
        }
        if ((num % 2) == 0) {
          if (num > mayor) {
            mayor = num;
          }
        } else if (num > 0){
          impares++;
          sumaimpares = sumaimpares + num;
        }
      }
      
    System.out.println("La cantidad de números introducidos es: " + cantidad);
    System.out.printf("La media de los números impares es: %.2f", (sumaimpares / impares));
    System.out.println();
    System.out.println("El mayor de los números pares es: " + mayor);
  }
}
