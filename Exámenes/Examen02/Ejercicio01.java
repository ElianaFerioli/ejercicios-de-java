/**
 * Realiza un programa que calcule los kilómetros que puede recorrer un coche híbrido. Los datos que
debe pedir el programa son el consumo medio en litros/100Km y los litros de gasolina que le quedan al
depósito. Suponemos que el 20% del tiempo, el coche funciona con baterías y no gasta nada de
combustible.
 *
 * @author Eliana Ferioli
 */
public class Ejercicio01 {
  public static void main(String[] args) {
    System.out.println("Este programadetermina si los Kilómetros que puede recorrer un coche híbrido.");
    System.out.print("Por favor, introduzca el consumo medio en litros: ");
    double consumomedio = Integer.parseInt(System.console().readLine());
    System.out.print("Por favor, introduzca los litros de gasolina que le quedan al coche: ");
    double litros = Integer.parseInt(System.console().readLine());
    
    double kilometrosnormal = (litros * 100) / consumomedio;
    double kilometroshibrido = (kilometrosnormal * 20) / 100;
    System.out.println("El coche puede recorrer " + (kilometrosnormal + kilometroshibrido));
  }
}
