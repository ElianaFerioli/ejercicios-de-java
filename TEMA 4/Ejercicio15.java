/** 
 *
 * @author Eliana Ferioli
 */

public class Ejercicio15 {
  public static void main(String[] args) {   
       
    System.out.print("Por favor, introduzca la letra, el número o el símbolo que desee para crear una pirámide: ");
    String c = System.console().readLine();
    
    System.out.println("Por favor, introduzca la dirección del vértice de la pirámide.");
    System.out.println("Introduzca a si desea que el vértice esté hacia arriba.");
    System.out.println("Introduzca b si desea que el vértice esté hacia abajo.");
    System.out.println("Introduzca i si desea que el vértice esté hacia la izquierda.");
    System.out.println("Introduzca d si desea que el vértice esté hacia la derecha : ");
    
    String dir = System.console().readLine();
    
    
   switch (dir) {
    case "a":
      System.out.printf("      %s\n", c);
      System.out.printf("     %s%s%s\n", c, c, c);
      System.out.printf("    %s%s%s%s%s\n", c, c, c, c, c);
      System.out.printf("   %s%s%s%s%s%s%s\n", c, c, c, c, c, c, c);
      System.out.printf(" %s%s%s%s%s%s%s%s%s%s%s\n", c, c, c, c, c, c, c, c, c, c, c);
      break;
    case "b":
      System.out.printf(" %s%s%s%s%s%s%s%s%s%s%s\n", c, c, c, c, c, c, c, c, c, c, c);
      System.out.printf("   %s%s%s%s%s%s%s\n", c, c, c, c, c, c, c);
      System.out.printf("    %s%s%s%s%s\n", c, c, c, c, c);
      System.out.printf("     %s%s%s\n", c, c, c);
      System.out.printf("      %s\n", c);
      break;
    case "i":
      System.out.printf("        %s\n",c);
      System.out.printf("       %s%s\n", c, c);
      System.out.printf("      %s%s%s\n", c, c, c);
      System.out.printf("     %s%s%s%s\n", c, c, c, c);
      System.out.printf("    %s%s%s%s%s\n", c, c, c, c, c);
      System.out.printf("   %s%s%s%s%s%s\n", c, c, c, c, c, c);
      System.out.printf("    %s%s%s%s%s\n", c, c, c, c, c);
      System.out.printf("     %s%s%s%s\n", c, c, c, c);
      System.out.printf("      %s%s%s\n", c, c, c);
      System.out.printf("       %s%s\n", c, c);
      System.out.printf("        %s\n",c);
      break;
    case "d":
      System.out.printf("      %s\n",c);
      System.out.printf("      %s%s\n", c, c);
      System.out.printf("      %s%s%s\n", c, c, c);
      System.out.printf("      %s%s%s%s\n", c, c, c, c);
      System.out.printf("      %s%s%s%s%s\n", c, c, c, c, c);
      System.out.printf("      %s%s%s%s%s%s\n", c, c, c, c, c, c);
      System.out.printf("      %s%s%s%s%s\n", c, c, c, c, c);
      System.out.printf("      %s%s%s%s\n", c, c, c, c);
      System.out.printf("      %s%s%s\n", c, c, c);
      System.out.printf("      %s%s\n", c, c);
      System.out.printf("      %s\n",c);
      break;
    default:
      System.out.println("La dirección elegida no es correcta");
      break;
    }
  }
}
