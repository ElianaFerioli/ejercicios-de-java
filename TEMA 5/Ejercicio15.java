/**
 *
 * @author Eliana Ferioli
 */
public class Ejercicio15 {
  public static void main(String[] args) {
    System.out.println("Este programa calculará las potencias comprendidas entre la base y el exponente \nde un número introducido.");
    System.out.print("Por favor, introducir una base: ");
    double base = Double.parseDouble(System.console().readLine());
    System.out.print("Por favor, introducir un exponente (entero y positivo): ");
    int exponente = Integer.parseInt(System.console().readLine());
    double potencia = 0;
    
    if (exponente == 0) {
       System.out.println("Para el número " + base + " exponente " + exponente + " el resultado es: 1");
      } else {
      int x = 1;
        while (x <= exponente) {
          System.out.print("Para el número " + base + " exponente " + x + " el resultado es: ");
            for (int i = 0; i <= x; i++) {
              if (i == 0) {
               potencia = 1;
              }
              if (i == 1) {
               potencia = base;
              }
              if (i >= 2) {
                potencia = potencia * base;
              }
            }
            System.out.println(potencia);
          x++;
      }
    }
  }
}
