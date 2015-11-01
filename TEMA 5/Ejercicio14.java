/**
 * 
 *
 * @author Eliana Ferioli
 */
public class Ejercicio14 {
  public static void main(String[] args) {
    System.out.println("Este programa calculará la potencia de un número a partir \nde su base y su exponente.");
    System.out.print("Por favor, introducir una base: ");
    int base = Integer.parseInt(System.console().readLine());
    System.out.print("Por favor, introducir un exponente (entero y positivo): ");
    int exponente = Integer.parseInt(System.console().readLine());
    int potencia = 1;
   // System.out.println("La potencia es: " + Math.pow(base,exponente));
    if (base == 0) {
       System.out.println("La potencia es 0.");
    } else {
        for (int i = 0; i < exponente; i++) {
            potencia = potencia * base;
          }
    }
        System.out.println("La potencia es: " + potencia);
  }
}
