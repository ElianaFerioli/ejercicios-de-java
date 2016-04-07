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
public class Tiempo {
    //Atributos
    private int horas;
    private int minutos;
    private int segundos;
    
    //Constructor
    public Tiempo(int h, int m, int s) {
        this.horas = h;
        this.minutos = m;
        this.segundos = s;
    }
    
    //Getters
    public int getHoras() {
        return horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public int getSegundos() {
        return segundos;
    }
    
    ////Métodos/////////////////////////////

    @Override
    public String toString() {
        return horas + "h " + minutos + "m " + segundos + "s";
    }
    
    
    /**
    * Suma los objetos de la clase tiempo
    */
    public void suma(Tiempo x) {
        int horas = this.horas + x.getHoras();
        int minutos = this.minutos + x.getMinutos();
        int segundos = this.segundos + x.getSegundos();
        
       //Verifica los segundos
       if(segundos > 59) {
           minutos  = minutos + (segundos/60);
           segundos = segundos % 60;
        }
       //Verifica los minutos
       if(minutos > 59) {
           horas  = horas + (minutos/60);
           minutos = minutos % 60;
        }
       
       //Crea el resultado
       Tiempo sumaTiempo = new Tiempo(horas, minutos, segundos);
       
        System.out.println(sumaTiempo);      
    }
    
    /**
    * resta los objetos de la clase tiempo
    */
    public void resta(Tiempo x) {
        int horas = this.horas - x.getHoras();
        int minutos = 0;
        int segundos = 0;
        
        //Verifica en el caso de que el segundo sea mayor
        if(x.getMinutos() > this.getMinutos()) {
            segundos = 60 - x.getSegundos();
            minutos = x.getMinutos() - this.getMinutos() - 1;
        }
        
        //Verifica en el caso de que el primero sea mayor
        if(x.getMinutos() < this.getMinutos()) {
            segundos = 60 - this.getSegundos();
            minutos = this.getMinutos() - x.getMinutos() - 1;
        }
        
       //Crea el resultado
       Tiempo restaTiempo = new Tiempo(horas, minutos, segundos);
       
       if(x.getMinutos() > this.getMinutos()) {
           System.out.println("-(" + restaTiempo + ")"); 
       } else {
           System.out.println(restaTiempo); 
       }
        
    }
}
