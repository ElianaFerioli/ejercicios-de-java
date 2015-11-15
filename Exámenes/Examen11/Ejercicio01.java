/**
 *Realiza un programa que pinte por pantalla una cuba con cierta cantidad de agua. La capacidad será
indicada por el usuario. La cuba se llenará con una cantidad aleatoria de agua que puede ir entre 0 y
la capacidad máxima que pueda admitir. El ancho de la cuba no varía.
 *
 * @author Eliana Ferioli
 */
public class Ejercicio01 {
  public static void main(String[] args) {
    System.out.println("Pinta una cuba con agua.");
    
    System.out.print("Por favor, introduzca la capacidad de la cuba: ");
    int capacidad = Integer.parseInt(System.console().readLine());
    
    int altura = 1;
    int agua = (int)(Math.random() * (capacidad + 1));
    int vacio = capacidad - agua;
    
    while (altura <= capacidad) {
      System.out.print("#");
      if (altura <= vacio) {
        for (int x = 1; x <= 4; x++) {
          System.out.print(" ");
        }
      } else {
        for (int x = 1; x <= 4; x++) {
          System.out.print("=");
        }
      }
      System.out.print("#");
      System.out.println();
      altura++;
    }
    
    for (int x = 1; x <= 6; x++) {
      System.out.print("#");
    }
    
    System.out.println();
    System.out.println("La capacidad es: " + capacidad + " y la cantidad de agua es " + agua);
  }
}
