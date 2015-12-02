/**
 * @author Luis José Sánchez
 */
public class Ejercicio04alternativo {

  public static void main(String[] args) {

    System.out.print("Introduzca un número: ");
    int numeroUnoIntroducido = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca otro número: ");
    int numeroDosIntroducido = Integer.parseInt(System.console().readLine());

    int numero = numeroUnoIntroducido;
    int numeroDePares = 0;
    int numeroDeImpares = 0;
    int longitud = 0;
    int digito;
    
    while (numero > 0) {
      numero /= 10;
      longitud++;
    } // while
    
    for (int i = longitud - 2; i >= -1; i--) {
      digito = (numeroUnoIntroducido / (int)(10 * Math.pow(10, i))) % 10;
            
      if (digito % 2 == 0) {
        numeroDePares = numeroDePares * 10 + digito;
      } else {
        numeroDeImpares = numeroDeImpares * 10 + digito;
      }
      
      digito = (numeroDosIntroducido / (int)(10 * Math.pow(10, i))) % 10;
      if (digito % 2 == 0) {
        numeroDePares = numeroDePares * 10 + digito;
      } else {
        numeroDeImpares = numeroDeImpares * 10 + digito;
      }
      
    }
    System.out.println("El número formado por los dígitos pares es " + numeroDePares);
    System.out.println("El número formado por los dígitos impares es " + numeroDeImpares);
  }
}

