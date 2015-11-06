/**
 * Realiza un conversor del sistema decimal al sistema de “palotes”.
 *
 * @author Eliana Ferioli
 */
public class Ejercicio03 {
  public static void main(String[] args) {
    System.out.println("Este programa convierte un número al sisyema de palotes");
    System.out.print("Por favor, introduzca un número entero positivo: ");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());
    
    int i = 10;
    int x =  100;
    int numero = 1;
    
    do {
      if((numeroIntroducido >= i) && (numeroIntroducido < x)) { 
        numero = numeroIntroducido / i;
        for (int j = 1; j <= numero; j++) { //imprime los palos.
          System.out.print("|");
        }
        numeroIntroducido = numeroIntroducido % i;
        i = i / 10;
        x = x / 10;
        if (i > 0) {        //evita que el último número imprima una línea al final.
        System.out.print("-");
        }
        } else { //busca el rango de longitud del número.
        i = i * 10;
        x = x * 10;
        }
    } while (numeroIntroducido > 0);
  }
}
