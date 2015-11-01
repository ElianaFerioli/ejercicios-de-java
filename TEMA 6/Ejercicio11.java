/**
Escribe un programa que muestre 20 notas generadas al azar. Las notas deben aparecer de
la forma: suspenso, suficiente, bien, notable o sobresaliente. Al final aparecerá el número
de suspensos, el número de suficientes, el número de bienes, etc.
 *
 * @author Eliana Ferioli
 */
public class Ejercicio11 {
  public static void main(String[] args) {
    System.out.println("Este programa printa, al azar, notas.");
    String tipodenota = " ";
    int contadorsuspenso = 0;
    int contadorsuficiente = 0;
    int contadorbien = 0;
    int contadornotable = 0;
    int contadorsobresaliente = 0;
    
      for (int x = 1; x <= 20; x++) {
        int nota = (int)(Math.random() * 5);
        switch (nota) {
          case 0:
          tipodenota = "suspenso";
          contadorsuspenso++;
          break;
          case 1:
          tipodenota = "suficiente";
          contadorsuficiente++;
          break;
          case 2:
          tipodenota = "bien";
          contadorbien++;
          break;
          case 3:
          tipodenota = "notable";
          contadornotable++;
          break;
          case 4:
          tipodenota = "sobresaliente";
          contadorsobresaliente++;
          break;
          default:
          break;
        }
        System.out.println("La nota nº" + x + " es: " + tipodenota);
      }
    System.out.println("La cantidad de Suspensos es: " + contadorsuspenso);
    System.out.println("La cantidad de Suficientes es: " + contadorsuficiente);
    System.out.println("La cantidad de Bienes es: " + contadorbien);
    System.out.println("La cantidad de Notables es: " + contadornotable);
    System.out.println("La cantidad de Sobresalientes es: " + contadorsobresaliente);
  }
}
