/*
 * Crea la clase Vehiculo , así como las clases Bicicleta y Coche como subclases de la primera.
 * Para la clase Vehiculo , crea los atributos de clase vehiculosCreados y kilometrosTotales ,
 * así como el atributo de instancia kilometrosRecorridos . Crea también algún método
 * específico para cada una de las subclases. Prueba las clases creadas mediante un programa
 * con un menú
 */
package objetossimples;
import java.util.Scanner;

/**
 *
 * @author eliana
 */
public class Ejercicio02Prueba {
    public static void main(String[] args) {
        System.out.println("Este programa crea vehículos.");
        Scanner s = new Scanner (System.in);        
        int menu = 0;        
        Bicicleta biciUno = new Bicicleta(2);
        Coche cocheUno = new Coche(5);
        
        do {
            System.out.println("Elija una opción:");
            System.out.println("1. Anda con la bicicleta");
            System.out.println("2. Haz el caballito con la bicicleta");
            System.out.println("3. Anda con el coche");
            System.out.println("4. Quema rueda con el coche");
            System.out.println("5. Ver kilometraje de la bicicleta");
            System.out.println("6. Ver kilometraje del coche");
            System.out.println("7. Ver kilometraje total");
            System.out.println("8. Salir");
            System.out.print("¿Qué opción desea?: ");
            int x = Integer.parseInt(s.nextLine());
            if(x==1) {
                System.out.print("¿Cuántos km desea recorrer?: ");
                int kmBici = Integer.parseInt(s.nextLine());
                biciUno.recorre(kmBici);
            }
            if(x==2) {
                biciUno.haceCaballito();
            }
            if(x==3) {
                System.out.print("¿Cuántos km desea recorrer?: ");
                int kmCoche = Integer.parseInt(s.nextLine());
                cocheUno.recorre(kmCoche);
            }
            if(x==4) {
                cocheUno.quemaRueda();
            }
            if(x==5) {
                System.out.print("El kilometraje que recorrio la bici es: ");
                System.out.println(biciUno.getkilometrosRecorridos());
            }
            if(x==6) {
                System.out.print("El kilometraje que recorrio el coche es: ");
                System.out.println(cocheUno.getkilometrosRecorridos());
            }
            if(x==7) {
                System.out.print("El kilometraje total es: ");
                System.out.println(Vehiculo.getkilometrosTotales());
            }
            if(x==8) {
                menu = -1;
            }
            System.out.println();
        } while (menu >= 0);
        
    }
}
