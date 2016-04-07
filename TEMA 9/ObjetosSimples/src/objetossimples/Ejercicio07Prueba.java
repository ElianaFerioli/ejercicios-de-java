/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetossimples;

import java.util.Scanner;

/**
 *
 * @author eliana
 */
public class Ejercicio07Prueba {
    public static void main(String[] args) {
        System.out.println("Este programa gestiona la eventa de entradas para ExpoCochesCampanillas");
        Scanner s = new Scanner (System.in);
        boolean salir = false;
        Zona salaPrincipal = new Zona(1000);
        Zona compraVenta = new Zona(200);
        Zona vip = new Zona(25);
        
        do {        
            System.out.println("Por favor, indique una opción: ");
            System.out.println("1. Mostrar el número de entradas libres.");
            System.out.println("2. Vender entradas.");
            System.out.println("3. Salir.");
            System.out.print("La opción elegida es: ");
            int x = Integer.parseInt(s.nextLine());

            if(x==1) {
                System.out.println("El numero de entradas disponibles en la Sala Principal es: " +
                        salaPrincipal.getEntradasPorVender());
                System.out.println("El numero de entradas disponibles en la zona de Compra-Venta es: " +
                        compraVenta.getEntradasPorVender());
                System.out.println("El numero de entradas disponibles en la zona VIP es: " +
                        vip.getEntradasPorVender());
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
                    salaPrincipal.vender(numEntradas);
                } else if(zona==2) {
                    compraVenta.vender(numEntradas);
                } else if(zona==3) {
                      vip.vender(numEntradas);
                } else {
                    System.out.println("La zona elegida no existe.");
                }
            } else if(x==3) {
                salir = true;
            }
        } while(!salir);
    }
}
