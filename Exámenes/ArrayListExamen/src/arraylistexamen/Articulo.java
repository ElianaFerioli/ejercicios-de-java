/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistexamen;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author eliana
 */
public class Articulo implements Comparable<Articulo>{
    //Atributos
    String codigo;
    String descripcion;
    String categoria;
    double precioCompra;
    double precioVenta;
    int    stock;

    //Constructor
    public Articulo(String codigo, String descripcion, String categoria, double precioCompra, double precioVenta, int stock) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.stock = stock;
    }

    public Articulo() {
        this.codigo = "Vacio";        
    }
    
    //Getters
    public String getCodigo() {
        return codigo;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public double getPrecioCompra() {
        return precioCompra;
    }
    public double getPrecioVenta() {
        return precioVenta;
    }
    public int getStock() {
        return stock;
    }
    public String getCategoria() {
        return categoria;
    }
    
    
    //Setters
    public void setStock(int stock) {
        this.stock = stock;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }
    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    
    //Métodos
    
    /*
    *
    * Vende y disminuye el stock de ese artículo
    *
    */
    public boolean venta(int cantidad) {
        if(stock < cantidad) {
            System.out.println("Lo siento, no hay suficientes existencias para el artículo " + this.codigo);
            return false;
        } else { 
            this.stock = stock - cantidad;
            return true;
        }
    }
    
    /*
    *
    * Compra y aumenta el stock de ese artículo
    *
    */
    public void compra(int cantidad) {
        this.stock = stock + cantidad;
        System.out.println("El estock de su artículo ha aumentado.");
    }
    
    /*
    *
    * Genera factura
    *
    */
    public static void generaFactura(HashMap<String, Integer> c, ArrayList<Articulo> o) {       
        double totalSinIva = 0;
        System.out.println("Factura--------------------------");
        System.out.println("ARTICULO-----CANTIDAD----TOTAL");
        for (Map.Entry pareja : c.entrySet()) {
            String cod = ((String)pareja.getKey());
            int p = o.indexOf(new Articulo(cod,"", "", 0.0, 0.0, 0));
            System.out.print(o.get(p).getDescripcion() + "------" + c.get(o.get(p).getCodigo()) + "------");
            System.out.println(o.get(p).getPrecioVenta() * c.get(o.get(p).getCodigo()));
            totalSinIva = totalSinIva + o.get(p).getPrecioVenta() * c.get(o.get(p).getCodigo());
        }
        System.out.println("TOTAL:                     " + (((totalSinIva * 21)/100) + totalSinIva)); 
    }

    @Override
    public String toString() {
        return "///Articulo///" + 
                "\nCódigo: " + codigo + 
                "\nDescripción: " + descripcion +
                "\nCategoría: " + categoria +
                "\nPrecio de Compra: " + precioCompra + 
                "\nPrecio de Venta: " + precioVenta + 
                "\nStock: " + stock;
    }
    
    /*
    *
    * Iguala un artículo con otro
    *
    */
    @Override
    public boolean equals(Object d) {
      return (this.codigo).equals(((Articulo)d).getCodigo());
    }
    
    /*
    *
    * Compara un artículo con otro
    *
    */
    @Override
    public int compareTo(Articulo t) {
            return (this.descripcion).compareTo(t.getDescripcion());
    }

}
