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
public class Vehiculo {
    //Atributos instancia
    private int kilometrosRecorridos;
    //Atributos clase
    private static int vehiculosCreados;
    private static int kilometrosTotales;
    
    //Constructor
    public Vehiculo () {
        this.kilometrosRecorridos = 0;
        vehiculosCreados++;
    }
    //Getter
    public int getkilometrosRecorridos() {
        return this.kilometrosRecorridos;
    }
    
    //Getter
    public static int getkilometrosTotales() {
        return Vehiculo.kilometrosTotales;
    }
    
    //Métodos
    
    /**
    * Hace que el vehículo recorra una cantidad de kilómetros
    */
    public void recorre(int x) {
        kilometrosRecorridos = kilometrosRecorridos + x;
        kilometrosTotales = kilometrosTotales + kilometrosRecorridos;
        System.out.println("Que lindo paseo!");
    }
}
    
    
    
