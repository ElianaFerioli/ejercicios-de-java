/**
*
* @author Eliana Ferioli
*/

public class Ejercicio11 {
  public static void main(String[] args) {
    System.out.println("Este programa calcula los segundos que faltan para medianoche.");
    
    System.out.print("Introduce la hora (en formato de 24hs): ");
    int hs = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduce los minutos: ");
    int min = Integer.parseInt(System.console().readLine());
    
    hs = 24 - hs;
    min = 60 - min;
    int segundos = (min * 60) + (hs * 3600);
    
    System.out.println("Quedan " + segundos + " segundos para medianoche.");
  }
}
