/**
 * Realiza un conversor del sistema decimal al sistema de “palotes”.
 *
 * @author Eliana Ferioli
 */
public class Ejercicio03 {
  public static void main(String[] args) {
    System.out.println("Este programa convierte un número al sistema de palotes");
    System.out.print("Por favor, introduzca un número entero positivo: ");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());
    
    int i = 10;
    int x =  100;
    int numero = 1;
    int contador = 2;
    int j = 0;
    
    
    do {
      if((numeroIntroducido >= i) && (numeroIntroducido < x)) { 
        numero = numeroIntroducido / i;
        do { //imprime los palos.
          if (numero == 0) {
            System.out.print(" ");
          } else {
          System.out.print("|");
          }
          j++;
        } while (j < numero);
        j = 0;
        numeroIntroducido = numeroIntroducido % i;
        i = i / 10;
        x = x / 10;
          if (i > 0) {        //evita que el último número imprima una línea al final.
            System.out.print("-");
          }
           contador--;
        } else { //busca el rango de longitud del número.
        i = i * 10;
        x = x * 10;
        contador++;
        }
    } while (contador > 0);
  }
}
