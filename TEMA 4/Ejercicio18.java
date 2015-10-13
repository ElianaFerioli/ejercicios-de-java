/**
*
* @author Eliana Ferioli
*/
public class Ejercicio18 {
  public static void main(String[] args) {
    System.out.println("Este programa descubre cuál es la primera cifra del número introducido \nSe permiten números de hasta cinco cifras.");
    
    System.out.print("Introduce un número: ");
    int x1 = Math.abs(Integer.parseInt(System.console().readLine()));
    int primercifra = 0;
    
    if (x1 < 10) {
    primercifra = x1;
    }
    if ((x1 >= 10) && (x1 < 100)) {
    primercifra = x1/10;
    }
    if ((x1 >= 100) && (x1 < 1000)) {
    primercifra = x1/100;
    }
    if ((x1 >= 1000) && (x1 < 10000)){
    primercifra = x1/1000;
    }
    if ((x1 >= 10000) && (x1 < 100000)) {
    primercifra = x1/10000;
    }
    System.out.println("La primer cifra es: " + (primercifra));
    
  }
}
