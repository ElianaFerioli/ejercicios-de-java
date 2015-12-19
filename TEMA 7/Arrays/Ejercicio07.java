/**
 * Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los muestre
por pantalla separados por espacios. El programa pedirá entonces por teclado dos valores
y a continuación cambiará todas las ocurrencias del primer valor por el segundo en
la lista generada anteriormente. Los números que se han cambiado deben aparecer
entrecomillados.
 *
 * @author Eliana Ferioli
 */
public class Ejercicio07 {
  public static void main(String[] args) {
    System.out.println("Este programa cambia los valores de un array.");
    
    int num[] = new int [100];
    
    for (int x = 0; x <= 99; x++) {
      num[x] = (int)(Math.random() * 21);
    }     //guarda los números
    
    System.out.print("Los números son: ");
    for (int x = 0; x <= 99; x++) {
      System.out.print(num[x] + " ");
    }     //muestra los números
    
    System.out.println();   
    System.out.print("Por favor, introduzca un número del 0 al 20: ");
    int valorUno = Integer.parseInt(System.console().readLine());
    System.out.print("Por favor, introduzca el número que quiera introducir: ");
    int valorDos = Integer.parseInt(System.console().readLine());
    
    System.out.print("Los números son: ");
    for (int x = 0; x <= 99; x++) {
      if (num[x] == valorUno) {
        num[x] = valorDos;
        System.out.print("'" + num[x] + "'");
      } else {
        System.out.print(num[x] + " ");
      }
    }     //muestra los números nuevos
  }
}
