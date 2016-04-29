/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio04;

/**
 *
 * @author eliana
 */
public class Zona {
    //Atributos
    private int entradasPorVender;
    private double precioEntrada;
    
    //Constructor
    public Zona(int n, double p){
        this.entradasPorVender = n;
        this.precioEntrada = p;
    }
    
    //Getter
    public int getEntradasPorVender() {
        return entradasPorVender;
    }
    public double getPrecioEntrada(){
        return precioEntrada;
    }
    
    
    //Metodos
    public boolean sePuede(int n) {
        boolean sePuede = false;
        if (this.entradasPorVender >= n) {
            sePuede = true;
        }
        return sePuede;
    }
    
    
     /**
    * calcula el total de la venta.
    * <p>
    * Comprueba si quedan entradas libres antes de realizar la venta.
    */
    public void calcula(int n) {
        if (this.entradasPorVender == 0) {
            System.out.println("Lo siento, las entradas para esa zona están agotadas.");
        } else if (this.entradasPorVender < n) {
            System.out.println("Sólo me quedan " + this.entradasPorVender
            + " entradas para esa zona.");
        }
        if (this.entradasPorVender >= n) {
            System.out.println("Existen entradas disponibles y el total de la venta sería : " + n * this.getPrecioEntrada());
        }
    }

    /**
    * Vende un número de entradas.
    * <p>
    * Comprueba si quedan entradas libres antes de realizar la venta.
    *
    * @param n número de entradas a vender
    */
    public void vender(double d, int n) {
        if (d < n) {
            System.out.println("Lo siento, dinero insuficiente.");
        }
        if (d == n) {
            entradasPorVender -= n;
            System.out.println("Muchas gracias por su compra!");
        }
        if (d > n) {
            entradasPorVender -= n;
            System.out.println("Gracias por su compra! Aquí tiene su vuelto..." + (d-(this.getPrecioEntrada()*n)));
        }
    }
}
