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
public class ColeccionDiscos {
    //Atributos
    String codigo;
    String titulo;
    String autor;
    String discografica;
    int duracion;
    int    anio;
    
    //Constructor
    public ColeccionDiscos(String codigo, String titulo, String autor, String discografica, int duracion, int anio) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.discografica = discografica;
        this.duracion = duracion;
        this.anio = anio;
    }
    
    public ColeccionDiscos() {
        this.codigo = "Vacio";
    }
    
    //Getters    
    public String getCodigo() {
        return codigo;
    }
    public String getAutor() {
        return autor;
    }
    public String getTitulo() {
        return titulo;
    }
    public int getAnio() {
        return anio;
    }
    public String getDiscografica() {
        return discografica;
    }
    public int getDuracion() {
        return duracion;
    }
    
    //Seters
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }
    public void setDiscografica(String discografica) {
        this.discografica = discografica;
    }
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    
    /////////////Métodos
    @Override
    public String toString() {
        return "ColeccionDiscos-----------------------" + 
                "\nCódigo: " + this.codigo + 
                "\nAutor: " + this.autor + 
                "\nTítulo: " + this.titulo +                
                "\nDiscográfica: " + this.discografica +
                "\nAño: " + this.anio +
                "\nDuración: " + this.duracion; 
                
    }
    
    
    
    
    
    
    
    
    
}
