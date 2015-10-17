/**
 * 
 *
 * @author Eliana Ferioli
 */
public class Ejercicio26 {
  public static void main(String[] args) {
    System.out.println("EL programa mostrará la posición que ocupa un dígito en un número introducido.");
    System.out.print("Por favor introduzca un número: ");
    int num = Math.abs(Integer.parseInt(System.console().readLine()));
    System.out.print("Por favor, introduzca un dígito de ese número: ");
    int dig = Math.abs(Integer.parseInt(System.console().readLine()));
    int nuevo = 0;
    int posicion = 0;
    int i = 1;
    int j = 10;
    int lugar = 0;
    
        
    while (num > 0) {
      if ((num >= i) && (num <= j)) {
          do {
          nuevo = (num / i);
          num = num % i;
          i = i / 10;
          j = j / 10;
          posicion++;
            if (nuevo == dig) {
              lugar =  posicion;
              System.out.println("El dígito está en la posición: " + lugar);
            }
          } while (num > 0);
        }
      else {
        i = i * 10;
        j = j * 10;
      }
    }
  if (lugar == 0 ) {
    System.out.println("El dígito introducido no está contenido en el número.");
  }
  }
}
