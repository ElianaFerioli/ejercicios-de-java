/**
 * 
 *
 * @author Eliana Ferioli
 */
public class Ejercicio23 {
  public static void main(String[] args) {
    System.out.println("El programa permite introducir números mientras su suma total no supere 1000.");
    double suma = 0;
    double contador = 0;
    double total = 0;
    
    
      while (suma <= 10000){
        int num = Integer.parseInt(System.console().readLine());
        suma = suma + num;
        if (suma <= 10000) {
        total = total + num;
        contador++;
        }
      }
      
      System.out.println("Total acumulado: " + (int)total);
      System.out.println("Total de números introducidos: " + (int)contador);
      System.out.printf("Media de números: %.2f", (total / contador));
        
  }
}
