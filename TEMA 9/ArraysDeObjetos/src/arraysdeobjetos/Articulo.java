/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysdeobjetos;

/**
 *
 * @author eliana
 */
public class Articulo {
    //Atributos
    String codigo;
    String descripcion;
    double precioCompra;
    double precioVenta;
    int    stock;
    
    
    //Constructor
    public Articulo(String codigo, String descripcion, double precioCompra, double precioVenta, int stock) {
        this.codigo = codigo;
        this.descripcion = descripcion;
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
    
    
    //Métodos
    
    /*
    *
    * Vende y disminuye el stock de ese artículo
    *
    */
    public void venta(int cantidad) {
        if(stock < cantidad) {
            System.out.println("Lo siento, no hay suficientes existencias para ese artículo.");
        } else { 
            this.stock = stock - cantidad;
            System.out.println("El estock de su artículo ha disminuido.");
        }
    }
    
     /*
    *
    * COmpra y aumenta el stock de ese artículo
    *
    */
    public void compra(int cantidad) {
        this.stock = stock + cantidad;
        System.out.println("El estock de su artículo ha aumentado.");
    }

    @Override
    public String toString() {
        return "///Articulo///" + 
                "\nCódigo: " + codigo + 
                "\nDescripción: " + descripcion + 
                "\nPrecio de Compra: " + precioCompra + 
                "\nPrecio de Venta: " + precioVenta + 
                "\nStock: " + stock;
    }
    
    
    
    
    
}
