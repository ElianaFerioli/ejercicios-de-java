/**
 *Escribe un programa que pida 6 palabras y las almacene en un array. A continuación, en otro array se deben
guardar las mismas palabras pero esta vez cambiadas de orden de forma aleatoria.
 *
 * @author Eliana Ferioli
 */
public class Ejercicio02 {
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
    
    //Las cambia
    int[] palabraCambiada = new int [6];
    int indice = 0;
    boolean existe = false;
    //Genera el primer valor
    indice = (int)(Math.random()* 6);
    palabraCambiada[0] = indice;
    
    for (int x = 0; x < 6; x++) {
      do {
        indice = (int)(Math.random()* 6);
        existe = false;
        for (int j = 0; j < x; j++) {
          if (palabraCambiada[j] == indice) {
            existe = true;
          }
        }
      } while (existe);
      palabraCambiada[x] = indice;
    }
    
    //Asigna los nuevos índices a las palabras
    String[] nuevoArray = new String [6];
    for (int x = 0; x < 6; x++) {
      nuevoArray[x] = palabra[palabraCambiada[x]];
    }
    
    //Las muestra
    System.out.println("\n\nArray nuevo:");
    for (int x = 0; x < 6; x++) {
      System.out.printf(nuevoArray[x] + "|");
    }
  }
}
