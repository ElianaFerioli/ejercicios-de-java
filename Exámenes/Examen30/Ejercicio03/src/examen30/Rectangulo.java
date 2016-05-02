/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen30;

/**
 *
 * @author eliana
 */
public class Rectangulo extends Figura {
    //Atributos de clase
    private static int rectangulosCreados;
    //Atributos de instancia
    private int base;
    private int altura;
    //Constructor
    public Rectangulo(int base, int altura, String c) {
        super(c);
        this.base = base;
        this.altura = altura;
        figurasCreadas++;
        rectangulosCreados++;
    }    
    //Getter
    public static int getRectangulosCreados() {
        return rectangulosCreados;
    }
    
    //Métodos
    @Override
    public String toString() {
        String rectangulo = "";
        String c = this.getCaracter();
        for(int x = 0; x < this.altura; x++){
            for(int i = 0; i < this.base; i++){
                if(x==0) {
                    rectangulo = rectangulo + c;
                } else if(x==this.altura-1) {
                    rectangulo = rectangulo + c;
                } else if((i==0)||(i==this.base-1)) {
                    rectangulo = rectangulo + c;
                } else {
                    rectangulo = rectangulo + " ";
                }
                    
            }
            rectangulo = rectangulo + "\n";
        }
        return rectangulo;
    }
    
}
