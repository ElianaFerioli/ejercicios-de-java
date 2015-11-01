/**
 * Escribe un programa que piense un número al azar entre 0 y 100. El usuario debe adivinarlo
y tiene para ello 5 oportunidades. Después de cada intento fallido, el programa dirá cuántas
oportunidades quedan y si el número introducido es menor o mayor que el número secreto.
 *
 * @author Eliana Ferioli
 */
public class Ejercicio06 {
  public static void main(String[] args) {
    System.out.println("Usted debe adivinar el número que estoy pensando (entre 0 y 100).\nTiene 5 oportunidades.");
    
    int numeropensado = (int)(Math.random()*101);
    boolean acierto = false;
    System.out.println("El numero pensado es: " + numeropensado);
    
    for(int x = 4; (x >= 0) && (!acierto); x--) {
      System.out.println("Por favor, introduzca un número: ");
      int numeroIntroducido = Integer.parseInt(System.console().readLine());
      if (numeroIntroducido == numeropensado) {
        acierto = true;
        System.out.println("Enhorabuena, has acertado!");
      } else if (numeroIntroducido > numeropensado) {
        System.out.println("El número que estoy pensando es menor al número que has introducido");
        System.out.println("Te quedan " + x + " oportunidades.");
      } else if (numeroIntroducido < numeropensado) {
        System.out.println("El número que estoy pensado es mayor al número que has introducido");
        System.out.println("Te quedan " + x + " oportunidades.");
      }
    }
  }
}
