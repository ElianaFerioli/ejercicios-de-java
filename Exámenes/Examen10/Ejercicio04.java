/**
 *Escribe un programa que permita partir un número introducido por teclado en dos partes. Las
posiciones se cuentan de izquierda a derecha empezando por el 1. Suponemos que el usuario
introduce correctamente los datos, es decir, el número introducido tiene dos dígitos como mínimo y la
posición en la que se parte el número está entre 2 y la longitud del número. No se permite el uso de
funciones de manejo de String (por ej. para extraer subcadenas dentro de una cadena).
 *
 * @author Eliana Ferioli
 */
public class Ejercicio04 {
  public static void main(String[] args) {
    System.out.println("Parte un número en dos partes.");
    
    System.out.print("Por favor, introduzca un número de más de dos dígitos : ");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());
    System.out.print("Por favor, introduce la posición desde la que quieres partir el número: ");
    int posicionInicial = Integer.parseInt(System.console().readLine());
    
    int numero = numeroIntroducido;
    int posicion = posicionInicial;
    int contador = 0;
    int contadorInicial = 0;
    int dividendo = 1;
    
    while (numero > 0) {
      contador++;
      numero = numero / 10;
    }
    contadorInicial = contador;
    
   // dividendo = (int)(Math.pow(1, contador));
     for (int x = 1; x < contador; x++) {
       dividendo = dividendo *10;
     }
    contador = 1;
    
    while (contador <= posicion) {
     System.out.print(numeroIntroducido / dividendo);
      numeroIntroducido = numeroIntroducido % dividendo;
      dividendo = dividendo / 10;
      contador++;
    }
    contador = posicion;
    System.out.print(" ");
    while (contador < contadorInicial) {
     System.out.print(numeroIntroducido / dividendo);
      numeroIntroducido = numeroIntroducido % dividendo;
      dividendo = dividendo / 10;
      contador++;
    }
  }
}    
    
