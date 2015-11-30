/**
 * 
 *Realiza un programa que pinte por pantalla un plano inclinado construido con ladrillos (carácter #) y que tiene la
caída de izquierda a derecha. Sobre este plano inclinado rueda una bolita (la letra O). El dibujo será como una
fotografía de la bolita rodando. La bolita se colocará de forma aleatoria sobre una de las posibles posiciones que
puede ocupar en el plano inclinado desde lo alto hasta tocar el suelo. La altura del plano inclinado será indicada
por el usuario y deberá ser mayor o igual a 3.
 *
 * @author Eliana Ferioli
 */
public class  Ejercicio02 {
  public static void main(String[] args) {
    System.out.println("Este programa muestra un plano inclinado con una pelota.");
    System.out.print("Introduce la altura del plano: ");
    int alturafinal = Integer.parseInt(System.console().readLine());
    int pelota = (int)(Math.random() * alturafinal + 1);
    int relleno = 1;
    int altura = 1;
    
    
    if (alturafinal < 3) {
      System.out.print("La altura debe ser mayor o igual a 3");
    } else {
      while (altura <= alturafinal) {
        for (int x = 1 ; x <= relleno; x++) {
        System.out.print("*");
        }
        if (altura == pelota) {
        System.out.print("@");
        }
        relleno++;
        System.out.println();
        altura++;
      }
    }
  }
}
