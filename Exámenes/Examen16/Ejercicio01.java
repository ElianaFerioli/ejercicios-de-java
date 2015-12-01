/**
 *ERealiza un programa que trocee un número introducido por teclado en otros dos números. Un trozo se formará
con los dígitos de las posiciones pares y otro trozo con los dígitos de las posiciones impares. Se debe conservar
el orden de los dígitos. Da igual el trozo que se muestre primero con tal de que cada trozo esté bien formado.
Utiliza el tipo long donde sea necesario para aceptar números largos.
 *
 * @author Eliana Ferioli
 */
public class Ejercicio01 {
  public static void main(String[] args) {
    System.out.println("Este programa parte un número en dos trozos (pares e impares).");
    
    System.out.print("Por favor introduzca un número largo: ");
    long numIntroducido = Long.parseLong(System.console().readLine());
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
    
    //Busca el número y ve si es par
    int nuevoContador = contador;
    long nuevoDivisor = divisor;
    long nuevoNumIntroducido = numIntroducido;
    System.out.print("Primer trozo (pares): ");
    while (contador > 0) {
      long digitoBuscado = numIntroducido / divisor;
      if ((digitoBuscado % 2) == 0) {
        System.out.print(digitoBuscado);
      }
      contador--;
      numIntroducido = numIntroducido % divisor;
      divisor = divisor / 10;
    }
    //Busca el número y ve si es impar
    System.out.println();
    System.out.print("Segundo trozo (impares): ");
    while (nuevoContador > 0) {
      long digitoBuscado = nuevoNumIntroducido / nuevoDivisor;
      if ((digitoBuscado % 2) != 0) {
        System.out.print(digitoBuscado);
      }
      nuevoContador--;
      nuevoNumIntroducido = nuevoNumIntroducido % nuevoDivisor;
      nuevoDivisor = nuevoDivisor / 10;
    }
    
  }
}
