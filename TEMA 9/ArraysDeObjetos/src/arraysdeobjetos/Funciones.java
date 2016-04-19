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
public class Funciones {
    /**
    * Busca un índice de un array de objetos
    *
    * @param x un codigo String
    */
    
    //Busca valor y devuelve indice/////////////////////////////////////////////
    public static int buscaObjeto(String x, ColeccionDiscos[] coleccion) {
        boolean encuentra = false;
        int i = 0;
        
        while(!encuentra) {
            String codigo = coleccion[i].getCodigo();
            if(codigo.equals(x)) {
                encuentra = true;
            } else {
                i++;
            }
        }
        return i;
    }
    
    /**
    * Busca un índice de un array de objetos
    *
    * @param x un codigo String
    */
    
    //Busca valor y devuelve indice/////////////////////////////////////////////
    public static int buscaObjetoArticulo(String x, Articulo[] almacen) {
        boolean encuentra = false;
        int i = 0;
        
        while(!encuentra) {
            String codigo = almacen[i].getCodigo();
            if(codigo.equals(x)) {
                encuentra = true;
            } else {
                i++;
            }
        }
        return i;
    }   
    
    
    /**
    * Busca espacio libre en array de discos
    *
    * @param x un codigo String
    */
    
    //Busca espacio libre/////////////////////////////////////////////
    public static boolean buscaLibre(ColeccionDiscos[] coleccion) {
        boolean hayLibre = false; 
        for(ColeccionDiscos x: coleccion) {
            if(x.getCodigo().equals("Vacio")) {
                hayLibre = true;
            }
        }
        return hayLibre;        
    }
    
    /**
    * Busca espacio libre en array de objetos
    *
    * @param x un codigo String
    */
    
    //Busca espacio libre/////////////////////////////////////////////
    public static boolean buscaLibreArticulo(Articulo[] almacen) {
        boolean hayLibre = false; 
        for(Articulo x: almacen) {
            if(x.getCodigo().equals("Vacio")) {
                hayLibre = true;
            }
        }
        return hayLibre;        
    }
    
    
    
    
    
    /**
    * Busca si un codigo existe
    *
    * @param x un codigo String
    */
    
    //Verifica si un código existe/////////////////////////////////////////////
    public static boolean buscaCodigo(ColeccionDiscos[] coleccion, String codigo) {
        boolean existe = false;
        for(ColeccionDiscos x: coleccion) {
            if(x.getCodigo().equals(codigo)) {
                existe = true;
            }
        }
        return existe;        
    }
    
    /**
    * Busca si un codigo existe
    *
    * @param x un codigo String
    */
    
    //Verifica si un código existe/////////////////////////////////////////////
    public static boolean buscaCodigoArticulo(Articulo[] almacen, String codigo) {
        boolean existe = false;
        for(Articulo x: almacen) {
            if(x.getCodigo().equals(codigo)) {
                existe = true;
            }
        }
        return existe;        
    }
}
