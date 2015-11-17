/**
 * Define tres arrays de 20 números enteros cada una, con nombres numero , cuadrado y cubo .
Carga el array numero con valores aleatorios entre 0 y 100. En el array cuadrado se deben
almacenar los cuadrados de los valores que hay en el array numero . En el array cubo se
deben almacenar los cubos de los valores que hay en numero . A continuación, muestra el
contenido de los tres arrays dispuesto en tres columnas.
 *
 * @author Eliana Ferioli
 */
public class Ejercicio04 {
  public static void main(String[] args) {
    System.out.println("Este programa muestra el cuadrado y el cubo de numeros aleatrorios.");
    
    int num[] = new int [20];
    int cuadrado[] = new int [20];
    int cubo[] = new int [20];
    
    for (int x = 0; x < 20; x++) {
      num[x] = (int)(Math.random() * 101);
      cuadrado[x] = (int)(Math.pow(num[x],2));
      cubo[x] = (int)(Math.pow(num[x],3));
    }
    System.out.print("Número\t\tCuadrado\tCubo");
      System.out.println();
    
    for (int x = 0; x < 20; x++) {
      System.out.print(num[x] + "\t\t" + cuadrado[x] + "\t\t" + cubo[x]);
      System.out.println();
    }
  }
}
