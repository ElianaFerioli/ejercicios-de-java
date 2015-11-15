/**
 *Realiza un programa que pinte por pantalla una serpiente con un “serpenteo” aleatorio. La cabeza se
representará con el carácter @ y se debe colocar exactamente en la posición 13 (con 12 espacios
delante). A partir de ahí, el cuerpo irá serpenteando de la siguiente manera: se generará de forma
aleatoria un valor entre tres posibles que hará que el siguiente carácter se coloque una posición a la
izquierda del anterior, alineado con el anterior o una posición a la derecha del anterior. La longitud de
la serpiente se pedirá por teclado y se supone que el usuario introducirá un dato correcto.
 *
 * @author Eliana Ferioli
 */
public class Ejercicio01 {
  public static void main(String[] args) {
    System.out.println("Este programa dibuja una serpiente.");
    
    System.out.print("Por favor, introduzca la longitud de la serpiente: ");
    int longitud = Integer.parseInt(System.console().readLine());
    int altura = 0;
    int parte = 13;
    int bandera = 13;
    
    while (altura <= longitud) {
      if (altura == 0) {
        for (int x = 1; x <= 13; x++) { //pinta cabeza
          if (x <= 12) {
            System.out.print(" ");
          } else {
            System.out.print("@");
          }
        }     //fin cabeza
      } else {
        int cuerpo = (int)((Math.random() * 3) + 1);
            switch (cuerpo) {
              case 1:
              parte =  bandera - 1;
              break;
              case 2:
              parte = bandera;
              break;
              case 3:
              parte = bandera + 1;
              break;
              default:
              break;
            }
        for (int x = 1; x <= parte; x++) {
          if (parte == x) {
            System.out.print("#");
          } else {
            System.out.print(" ");
          }
        }
        bandera = parte;
      }
      System.out.println();
      altura++;
    }
  }
}
