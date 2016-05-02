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
public class Piramide extends Figura {
    //Atributos de clase
    private static int piramidesCreadas;
    //Atributos de instancia
    private int altura;
    //Constructor
    public Piramide(int altura, String c) {
        super(c);
        this.altura = altura;
        figurasCreadas++;
        piramidesCreadas++;
    }
    //Getter
    public static int getPiramidesCreadas() {
        return piramidesCreadas;
    }
    
    //Métodos

    @Override
    public String toString() {
        String piramide = "";
        String c = this.getCaracter();
        int altura = 1;
        int espacios = this.altura - 1;
        int i = 0;
        int j = 0;
        int relleno = 0;
        while (altura < this.altura) {
            for (i = 1; i <= espacios; i++) {
                piramide = piramide + " ";
            }
            piramide = piramide + c;
            for (i = 1; i < relleno; i++) {
                piramide = piramide + " ";
            }
            if (altura > 1) {
                piramide = piramide + c;
            }
            piramide = piramide + "\n";
            espacios--;
            altura++;
            relleno = relleno + 2;;
        }
        for (i = 1; i < (this.altura * 2); i++) {
            piramide = piramide + c;
        }
        return piramide;
    }
    
}
