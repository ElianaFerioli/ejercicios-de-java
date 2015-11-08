/**
 *
 * @author Eliana Ferioli
 */
public class Piramide_Hueca {
  public static void main(String[] args) {
    System.out.println("Este programa dibuja una pirámide hueca.");
    System.out.print("Por favor, introducir el caracter de relleno de la pirámide: ");
    String c = System.console().readLine();
    System.out.print("Por favor, introducir la altura de la pirámide: ");
    int alturainicial = Integer.parseInt(System.console().readLine());
    int altura = 1;
    int espacios = alturainicial - 1;
    int i = 0;
    int j = 0;
    int relleno = 0;

    while (altura < alturainicial) {
      
      for (i = 1; i <= espacios; i++) {
        System.out.print(" ");
      }
      System.out.print(c);
      for (i = 1; i < relleno; i++) {
        System.out.print(" ");
      }
      if (altura > 1) {
        System.out.print(c);
      }
        
      System.out.println();
      espacios--;
      altura++;
      relleno = relleno + 2;;
    }
  
    for (i = 1; i < (alturainicial * 2); i++) {
      System.out.print(c);
    }
    
  }
}
