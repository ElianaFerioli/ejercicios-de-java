/**
 *Realiza un programa que genere y muestre por pantalla un array con 40 números aleatorios entre el 0 y el 500.
Muestra a continuación todos los números capicúa que contiene el array así como la suma de éstos. Muestra por
último todos los números primos que contiene el array así como la media de éstos.
 *
 * @author Eliana Ferioli
 */
public class Ejercicio01 {
  public static void main(String[] args) {
    System.out.println("Este programa genraa 40 números aleatorios en array y opera con ellos.");
    
    int[] num = new int[40];
    int nuevo = 0;
    int contadorCapicua = 0;
    int sumaCapicua = 0;
    int aux = 0;

    
    //Genera los números y verifica si es capicua
    for (int x = 0; x < 40; x++) {
      num[x] = (int)((Math.random()) * 501);
      aux = num[x];
      while (aux > 0) {
      nuevo = (nuevo * 10) + (aux % 10);
      aux = aux / 10;
      }
      if(num[x] == nuevo) {
        contadorCapicua++;
      }
      nuevo = 0;
    }

    //Los muestra y verifica si son primos
    int resto = 0;
    int suma = 0;
    int contadorPrimo = 0;
    int sumaPrimo = 0;
    int i = 1;
    System.out.println("\n\nArray Original:");
    for (int x = 0; x < 40; x++) {
      System.out.print(num[x] +"|");
      while (i <= num[x]) {
        resto = num[x] % i;
        if (resto == 0) {
          suma++;
        }
        i++;
      } 
      i = 1;
      if (suma == 2) {
        contadorPrimo++;
        sumaPrimo = sumaPrimo + num[x];
      }
      suma = 0;
    }    
    
    //Genera nuevo array con los capicuas
    int[] arrayCapicua = new int[contadorCapicua];
    i = 0;
    for (int x = 0; x < 40; x++) {
      aux = num[x];
      while (aux > 0) {
      nuevo = (nuevo * 10) + (aux % 10);
      aux = aux / 10;
      }
      if(num[x] == nuevo) {
        arrayCapicua[i] = num[x];
        i++;
      }
      nuevo = 0;
    }
    
    //Muestra el array capicua
    System.out.println("\n\nArray Capicua:");
    for (int x = 0; x < contadorCapicua; x++) {
      System.out.print(arrayCapicua[x] +"|");
      sumaCapicua = sumaCapicua + arrayCapicua[x];
    }
    System.out.println("\nLa suma de los capicuas es: " + sumaCapicua);
    
    //Genera nuevo array con los primos
    int[] arrayPrimos = new int[contadorPrimo];
    i = 1;
    int j = 0;
    for (int x = 0; x < 40; x++) {
      aux = num[x];
      while (i <= aux) {
        resto = aux % i;
        if (resto == 0) {
          suma++;
        }
        i++;
      } 
      i = 1;
      if (suma == 2) {
        arrayPrimos[j] = num[x];
        j++;
      }
      suma = 0;
    }
    
    //Muestra el array primo
    System.out.println("\n\nArray Primo:");
    for (int x = 0; x < contadorPrimo; x++) {
      System.out.print(arrayPrimos[x] +"|");
      sumaPrimo = sumaPrimo + arrayPrimos[x];
    }
    System.out.println("\nLa suma de los primos es: " + sumaPrimo);
  }
}
