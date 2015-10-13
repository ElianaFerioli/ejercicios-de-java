/**
*
* @author Eliana Ferioli
*/
public class Ejercicio19 {
  public static void main(String[] args) {
    System.out.println("Este programa descubre cuántos dígitos tiene el número introducido \nSe permiten números de hasta cinco cifras.");
    
    System.out.print("Introduce un número: ");
    int x1 = Math.abs(Integer.parseInt(System.console().readLine()));
    int numcifra = 0;
    
    if (x1 < 10) {
    numcifra = 1;
    }
    if ((x1 >= 10) && (x1 < 100)) {
    numcifra = 2;
    }
    if ((x1 >= 100) && (x1 < 1000)) {
    numcifra = 3;
    }
    if ((x1 >= 1000) && (x1 < 10000)){
    numcifra = 4;
    }
    if ((x1 >= 10000) && (x1 < 100000)) {
    numcifra = 5;
    }
    System.out.println("El número de dígitos es: " + (numcifra));
    
  }
}
