/**
 *Escribe un programa que pida 6 palabras y las almacene en un array. A continuación, en otro array se deben
guardar las mismas palabras pero esta vez cambiadas de orden de forma aleatoria.
 *
 * @author Eliana Ferioli
 */
public class Ejercicio02alternativo {
  public static void main(String[] args) {
    System.out.println("Este programa almacena palabras en un array y les cambia el orden");
    
    String[] palabra = new String [6];
    int i = 0;    
    //Recoge las palabras
    for(int x = 1; x <= 6; x++) {
      System.out.print("Por favor, introduzca la " + x + "º palabra: ");
      palabra[i] = System.console().readLine();
      i++;
    }
    
    
    //Las muestra
    System.out.println("\n\nArray original:");
    for (int x = 0; x < 6; x++) {
      System.out.printf(palabra[x] + "|");
    }
    
    //Cambia las palabras
    
    for(int x = 0 ; x <= 100; x++) {
      int inicial = (int)(Math.random() * 6);
      int fin = (int)(Math.random() * 6);
      String aux = palabra[inicial];
      palabra[inicial] = palabra[fin];
      palabra[fin] = aux;
    }
    
    //Las muestra
    System.out.println("\n\nArray nuevo:");
    for (int x = 0; x < 6; x++) {
      System.out.printf(palabra[x] + "|");
    }
    
  }
}
