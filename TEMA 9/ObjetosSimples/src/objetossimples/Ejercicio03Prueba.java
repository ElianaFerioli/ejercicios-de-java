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
public class Ejercicio03Prueba {
    public static void main(String[] args) {
        Gato michifus = new Gato("siames", "hembra", 7);
        Gato salem = new Gato("negro", "macho", 9);
        michifus.amamanta();
        michifus.ataca();
        michifus.come();
        michifus.corre();
        salem.duerme();
        salem.maulla();
        
        Perro dana = new Perro("labrador", "hembra", 30);
        Perro rex = new Perro("doberman", "macho", 25);
        dana.ataca();
        dana.busca();
        dana.corre();
        dana.duerme();
        rex.amamanta();
        rex.ladra();
        
        Canario felipe = new Canario("macho");
        Canario pio = new Canario ("hembra");
        felipe.busca();
        felipe.canta();
        felipe.come();
        pio.duerme();
        pio.empolla();
        pio.vuela();
        
        Pinguino nestor = new Pinguino("macho");
        Pinguino cristina = new Pinguino("hembra");
        nestor.canta();
        nestor.empolla();
        nestor.habla();
        cristina.nada();
        cristina.salta();
        cristina.vuela();
        
        Lagarto juancho = new Lagarto("macho", "cocodrilo");
        Lagarto juancha = new Lagarto("hembra", "serpiente");
        juancho.come();
        juancho.diceNombre();
        juancho.nada();
        juancha.nada();
    }
}
