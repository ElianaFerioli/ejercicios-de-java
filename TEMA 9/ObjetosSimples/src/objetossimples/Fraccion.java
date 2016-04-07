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
public class Fraccion {
    //Atributos
    int denominador;
    int numerador;
    
    
    //Constructor
    Fraccion (int num, int den) {
        this.denominador = den;
        this.numerador = num;
    }

    //Getter
    public int getDenominador() {
        return denominador;
    }

    public int getNumerador() {
        return numerador;
    }
    
    
    
    //Métodos//////////////////

    /**
    * Invierte la fracción
    */  
    void invierte() {
        String fraccionInvertida = this.denominador + "/" + this.numerador;
        System.out.println(fraccionInvertida);
    }
    
    /**
    * Simplifica la fracción
    */  
    void simplifica() {
        int  num = 2;
        int max;
        int min;
        if(this.numerador > this.denominador) {
            max = this.numerador;
            min = this.denominador;
        } else {
            max = this.denominador;
            min = this.numerador;
        }
        while(((this.numerador % num) != 0) && ((this.denominador % num) != 0) && (num <= max)) {
            num++;
        }
        
        int numerador = this.numerador;
        int denominador = this.denominador;
        String fraccionSimplificada;
        
        if(((this.numerador % num) == 0) && ((this.denominador % num)== 0)) {
            while((min/num) > 0) {
                numerador = numerador / num;
                denominador = denominador / num;
                min = min / num;
            }
        }
        
        fraccionSimplificada = numerador + "/" + denominador;
        System.out.println(fraccionSimplificada);
    }
    
    /**
    * multiplica la fracción
    */ 
    public void multiplica(Fraccion n) {
        int nuevoNumerador = this.numerador * n.getNumerador();
        int nuevoDenominador = this.denominador * n.getDenominador();
        System.out.println(nuevoNumerador + "/" + nuevoDenominador);
    }
    
    /**
    * divide la fracción
    */
    public void divide(Fraccion x) {
        int nuevoNumerador = this.numerador;
        int nuevoDenominador = this.denominador * x.getDenominador();
        System.out.println(nuevoNumerador + "/" + nuevoDenominador);
    }
    
    @Override
    public String toString() {
        return this.numerador + "/" + this.denominador;
    }
}
