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
public class Pizza {
    //Atributos
    String tipo;
    String tamanio;
    String estado;
    
    private static int totalPedidas = 0;
    private static int totalServidas = 0;
    
    //Constructor
    Pizza (String tip, String tam) {
        this.tipo = tip;
        this.tamanio = tam;
        this.estado = "Pedida";
        totalPedidas++;
    }
    
    //Getter
    String getEstado() {
        return this.estado;
    }
    
    //Métodos//////////////////

    /**
    * Cambia el estado de la pizza a "servida"
    */  
    void sirve() {
     if(this.estado.equals("Servida")) {
         System.out.println("esa pizza ya está servida.");
     } else {
        this.estado = "Servida";
        totalServidas++;
     }
    }
    
    /**
    * Devuelve el total de pizzas pedidas
    */  
    public static int getTotalPedidas() {
        return totalPedidas;        
    }
    
    /**
    * Devuelve el total de pizzas servidas
    */  
    public static int getTotalServidas() {
        return totalServidas;        
    }

    @Override
    public String toString() {
        return "Pizza "  + tipo + " " + tamanio + ", " + estado;
    }
    
    
    
}
