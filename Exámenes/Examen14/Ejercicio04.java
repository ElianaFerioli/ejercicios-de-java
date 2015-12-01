/**
 *Pinta un árbol de Navidad mediante un programa. El follaje del árbol estará hecho con el carácter ^ y estará
adornado con estrellas (asterisco) y bolas (letra O). En la cúspide del árbol siempre habrá una estrella y el
relleno del árbol se pintará de forma aleatoria en función del siguiente patrón: la probabilidad de encontrar un
adorno sobre el follaje es de 1 sobre 3. En caso de pintar un adorno, la probabilidad de que sea una bola es de
2/3 y de que sea una estrella es de 1/3. La estrella de la cúspide se cuenta en la altura. Se debe verificar que
ésta última es mayor o igual que 4.
 *
 * @author Eliana Ferioli
 */
public class Ejercicio04 {
  public static void main(String[] args) {
		
		System.out.print("Por favor, introduzca la altura de la pirámide: ");
		int alturaIntroducida = Integer.parseInt(System.console().readLine());
		
		int altura = 1;
		int i = 0;
		int espacios = alturaIntroducida-1;
    boolean follaje = false;
    String caracter = " ";
		
		while (altura <= alturaIntroducida) {
			
			// inserta espacios
			for (i = 1; i <= espacios; i++) {
				System.out.print(" ");
      }
      if (altura == 1) {
        System.out.print("*");
      } else {
			// pinta la línea
        for (i = 1; i < altura * 2; i++) {
          int relleno = (int)(Math.random() * 3);
          switch (relleno) {
            case 0:
            follaje = true;
            break;
            case 1:
            follaje = true;
            break;
            case 2:
            follaje = false;
            break;
            default:
            break;
          }
          if (follaje) {
            System.out.print("^");
          } else {
            int adorno = (int)(Math.random() * 3);
            switch (adorno) {
              case 0:
              caracter = "o";
              break;
              case 1:
              caracter = "o";
              break;
              case 2:
              caracter = "*";
              break;
              case 3:
              caracter = "o";
              break;
              default:
              break;
            }
            System.out.print(caracter);
          }
        }
      }
      
			System.out.println();
			
			altura++;
			espacios--;
		}
	}
}
