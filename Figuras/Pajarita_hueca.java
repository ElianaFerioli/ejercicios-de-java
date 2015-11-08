/**
 *
 *
 * @author Eliana Ferioli
 */
public class Pajarita_hueca {
  public static void main(String[] args) {
    System.out.println("Este programa dibuja una pajarita hueca.");
    System.out.print("Por favor, introduzca la altura de la pajarita: ");
    int alturafinal = Integer.parseInt(System.console().readLine());
    int altura = 1;
    int huecoiz = 1;
    int huecoder= 1;
    int relleno = alturafinal - 2;
    
    if ((alturafinal < 3) || ((alturafinal % 2) == 0)) {
      System.out.println("La altura debe ser impar y mayor a 3.");
    } else {
          
      while (altura <= (alturafinal / 2)) {       //pinta la parte de arriba
        if (altura > 1) {                         //pinta el ladoiz
          System.out.print("*");
        }
        if (altura > 2) {
          for (int x = 1; x <= huecoiz; x++) {
            System.out.print(" ");
          }
          huecoiz++;
        }
        System.out.print("*");
        for (int x = 1; x <= relleno; x++) {        //pinta el relleno
          System.out.print(" ");
        }
        if (altura > 1) {                             //pinta el ladoder
          System.out.print("*");
        }
        if (altura > 2) {
          for (int x = 1; x <= huecoder; x++) {
            System.out.print(" ");
          }
        huecoder++;
        }
        System.out.print("*");
        
        
        System.out.println();
        altura++;
        relleno = relleno - 2;
      }
        System.out.print("*");
        for(int x = 1; x <= ((alturafinal - 2) / 2); x++) {         //pinta la línea del medio
          System.out.print(" ");
        }
        System.out.print("*");
        for(int x = 1; x <= ((alturafinal - 2) / 2); x++) {         //pinta la línea del medio
          System.out.print(" ");
        }
        System.out.print("*");
        System.out.println();
        
        altura = alturafinal/2;
        relleno = 1;
        huecoiz = (alturafinal/2) - 2;
        huecoder = (alturafinal /2) - 2;
        
        while (altura > 0) {         //pinta la parte de abajo
          if (altura >= 2) {          //pinta el ladoiz
            System.out.print("*");
          }
          if (altura > 1) {
            for (int x = 1; x <= huecoiz; x++) {
              System.out.print(" ");
            }
            huecoiz--;
          }
            
          System.out.print("*");
          
          for (int x = 1; x <= relleno; x++) {            //pinta los espacios
            System.out.print(" ");
          }
          if (altura >= 2) {                          //pinta el ladoiz
            System.out.print("*");
          }
          if (altura > 1) {
            for (int x = 1; x <= huecoder; x++) {
              System.out.print(" ");
            }
            huecoder--;
          }
            
          System.out.print("*");
          
          System.out.println();
          relleno = relleno + 2;
          altura--;
        }
    }
  }
}
