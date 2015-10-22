/**
Realiza una programa que calcule los segundos transcurridos entre dos horas de un día. Para cada hora del día
se introduce la hora y los minutos. Se da por hecho que el usuario introduce los datos correctamente y que la
segunda hora es posterior a la primera.
 * 
 */
public class Ejemplo03 {
  public static void main(String[] args) {
    int horastranscurridas = 0;
    int minutostranscurridos = 0;
    System.out.println("Este programa calcula los segundos trancurridos entre dos horas de un mismo día.");
    System.out.print("Por favor introduzca la primer hora ((en formato 24hs)): ");
    int primerhora = Integer.parseInt(System.console().readLine());
    System.out.print("Por favor introduzca los minutos respectivos a la primer hora: ");
    int primerminuto = Integer.parseInt(System.console().readLine());
    System.out.print("Por favor introduzca la segunda hora ((en formato 24 hs)): ");
    int segundahora = Integer.parseInt(System.console().readLine());
    System.out.print("Por favor introduzca los minutos respectivos a la segunda hora: ");
    int segundominuto = Integer.parseInt(System.console().readLine());
    
    for (int x = primerhora; x <= segundahora; x++) {
          if (x == primerhora) {
            for (int i = primerminuto; i < 60; i++) {
              minutostranscurridos++;
            }
          } else if (x == segundahora) {
            for (int i = 0; i < segundominuto; i++) {
              minutostranscurridos++;
            }
          } else {
            for (int i = 0; i < 60; i++) {
              minutostranscurridos++;
            }
          } 
    }
    System.out.println("Los segundos transcurridos son:" + (minutostranscurridos * 60));
  }
}
