/**
 * 
 *
 * @author Eliana Ferioli
 */
public class Ejercicio01{
  public static void main(String[] args) {
    System.out.println("Este programa muestra una pecera con un pez. \nLa altura recomendada es 50 y la anchura 7.");
    System.out.print("Introduce la longitud de la pecera: ");
    int largo = Integer.parseInt(System.console().readLine());
    System.out.print("Por favor introduzca la altura de la pecera: ");
    int ancho = Integer.parseInt(System.console().readLine());
    
    int relleno = largo - 2;
    int altura = ancho - 1;
    int pezy = (int)(Math.random() * (ancho - 2) + 1);
    int pezx = (int)(Math.random() * (largo - 2)) + 1;
    boolean alturapez = false;
    
    while (altura > 0) {                      // pinta pecera
      if (pezy == altura) {
        alturapez = true; 
      }
      for (int x = 1; x < largo; x++) {
        System.out.print("*");
        for (int i = 1; i <= relleno; i++) {
          if ((alturapez) && (i == pezx)) {     //pinta pez
          System.out.print("@");
          x++;
          alturapez = false;
          } else {
          System.out.print(" ");
          x++;
          }
        }
      }
      System.out.println("*");
    altura--;
    }
    for (int x = 1; x <= largo; x++) {      //pinta ultima linea de pecera
      System.out.print("*");
    }
  }
}
