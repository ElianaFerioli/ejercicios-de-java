/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen29;

/**
 *
 * @author eliana
 */
public class Piramide {
    //Atributos de instancia
    private int altura;
    private boolean estaRellena;
    
    //Constructor
    public Piramide(int altura, boolean estaRellena) {
        this.altura = altura;
        this.estaRellena = estaRellena;
    }
    
    //Métodos

    /**
     *
     */
    public String toString() {
        String piramide = "";
        if(this.estaRellena){
            int x = 0;
            int altinicial= this.altura;
            int h = 0;
            int i = altinicial - (this.altura - h);
            while (this.altura > 0) {
              do {
                piramide = piramide + " ";
                x++;
              } while (x < this.altura);
              x = 0;
              while (i >= 0) {
                piramide = piramide + "*";
                i--;
              }
              piramide = piramide + "\n";
              this.altura--;
              h++;
              i = altinicial - (this.altura - h);
            }
        } else {
            int altura = 1;
            int espacios = this.altura - 1;
            int i = 0;
            int j = 0;
            int relleno = 0;
            while (altura < this.altura) {
              for (i = 1; i <= espacios; i++) {
                piramide = piramide + " ";
              }
              piramide = piramide + "*";
              for (i = 1; i < relleno; i++) {
                piramide = piramide + " ";
              }
              if (altura > 1) {
                piramide = piramide + "*";
              }
              piramide = piramide + "\n";
              espacios--;
              altura++;
              relleno = relleno + 2;;
            }
            for (i = 1; i < (this.altura * 2); i++) {
              piramide = piramide + "*";
            }
        }
        return piramide;
    }    
}
