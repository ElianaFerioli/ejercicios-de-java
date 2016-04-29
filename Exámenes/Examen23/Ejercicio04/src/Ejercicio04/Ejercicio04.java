/*
 * Modifica el ejercicio Expocoches Campanillas realizado en clase añadiendo las siguientes mejoras:
 * a) El precio de la entrada no será el mismo para todas las zonas. En el momento en que se define una zona,
 * se deberá indicar - además del aforo - el precio de la entrada.
 * b) Al realizar la venta, el cajero/a indicará el precio total según la zona elegida y el número de personas,
 * luego aceptará el dinero y por último devolverá el cambio. Realiza las comprobaciones que sean
 * necesarias.
 * Nota: Será necesario modificar tanto la clase Zona como el programa principal.
 */
package Ejercicio04;

import java.util.Scanner;

/**
 *
 * @author eliana
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Este programa gestiona la eventa de entradas para ExpoCochesCampanillas");
        Scanner s = new Scanner (System.in);
        boolean salir = false;
        
        //Definición de zonas con aforo y precio de entrada
        Zona salaPrincipal = new Zona(1000, 50.0);
        Zona compraVenta = new Zona(200, 80.0);
        Zona vip = new Zona(25, 100.0);
        
        do {        
            System.out.println("Por favor, indique una opción: ");
            System.out.println("1. Mostrar el número de entradas libres.");
            System.out.println("2. Vender entradas.");
            System.out.println("3. Salir.");
            System.out.print("La opción elegida es: ");
            int x = Integer.parseInt(s.nextLine());

            if(x==1) {
                System.out.println("El numero de entradas disponibles en la Sala Principal es " +
                        salaPrincipal.getEntradasPorVender() + " y su precio es " + salaPrincipal.getPrecioEntrada() + " euros.");
                System.out.println("El numero de entradas disponibles en la zona de Compra-Venta es " +
                        compraVenta.getEntradasPorVender() + " y su precio es " + compraVenta.getPrecioEntrada() + " euros.");
                System.out.println("El numero de entradas disponibles en la zona VIP es " +
                        vip.getEntradasPorVender() + " y su precio es " + vip.getPrecioEntrada() + " euros.");
            } else if(x==2) {
                System.out.println("¿Para qué zona desea entradas?");
                System.out.println("1. Sala Principal");
                System.out.println("2. Zona de compra-venta");
                System.out.println("3. Zona VIP");
                System.out.print("Elija el número de la zona: ");
                int zona = Integer.parseInt(s.nextLine());
                System.out.print("¿Cuántas entradas desea comprar?: ");
                int numEntradas = Integer.parseInt(s.nextLine());
                if(zona==1){
                    salaPrincipal.calcula(numEntradas);
                    if(salaPrincipal.sePuede(numEntradas)) {
                        System.out.print("¿Desea usted realizar la compra de entradas(s/n)?: ");
                        String i = s.nextLine();
                        if(i.equals("s")) {
                            System.out.print("Inserte el total del dinero: ");
                            double dinero = Integer.parseInt(s.nextLine());
                            salaPrincipal.vender(dinero, numEntradas);
                        }
                    }
                } else if(zona==2) {
                    compraVenta.calcula(numEntradas);
                    if(compraVenta.sePuede(numEntradas)) {
                        System.out.print("¿Desea usted realizar la compra de entradas(s/n)?: ");
                        String i = s.nextLine();
                        if(i.equals("s")) {
                            System.out.print("Inserte el total del dinero: ");
                            double dinero = Integer.parseInt(s.nextLine());
                            compraVenta.vender(dinero, numEntradas);
                        }
                    }
                } else if(zona==3) {
                      vip.calcula(numEntradas);
                      if(vip.sePuede(numEntradas)) {
                        System.out.print("¿Desea usted realizar la compra de entradas(s/n)?: ");
                        String i = s.nextLine();
                        if(i.equals("s")) {
                            System.out.print("Inserte el total del dinero: ");
                            double dinero = Integer.parseInt(s.nextLine());
                            vip.vender(dinero, numEntradas);
                        }
                    }
                } else {
                    System.out.println("La zona elegida no existe.");
                }
            } else if(x==3) {
                salir = true;
            }
        } while(!salir);
    }
    
}
