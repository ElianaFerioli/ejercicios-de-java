/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetossimples;

/**
 *
 * @author eliana
 */
public class Ejercicio01Prueba {
    public static void main(String[] args) {
        Caballo rocinante = new Caballo("macho");
        System.out.println("Hola caballo! Come por favor: ");
        rocinante.come();
        System.out.println("Ahora una siesta: ");
        rocinante.duerme();
        System.out.println("Ahora despierta...");
        System.out.println("Salta la vaya: ");
        rocinante.agilidad();
        System.out.println("Que pena!, bueno entonces corre: ");
        rocinante.corre();
        System.out.println("LLama a tu amiga.");
        Caballo hembra = new Caballo("yegua");
        System.out.println("Tu que eres una yegua, corre por favor: ");
        hembra.corre();
        
    }
}
