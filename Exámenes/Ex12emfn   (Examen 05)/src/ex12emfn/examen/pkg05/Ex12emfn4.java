/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex12emfn.examen.pkg05;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author eliana
 */
public class Ex12emfn4 {
    public static void main(String[] args) {
        System.out.println("Este programa crea un catálogo de boticario.");
        HashMap<String, String> diccionarioBoticario = new HashMap<>();
        HashMap<String, String> catalogoPropiedades = new HashMap<>();
        Scanner s = new Scanner(System.in);
        //Carga el diccionarios
        diccionarioBoticario.put("ortiga", "urtica dioica");
        diccionarioBoticario.put("romero", "rosmarinus " +
            "officinalis");
        diccionarioBoticario.put("aloe vera", "aloe barbadensis " +
            "miller");
        diccionarioBoticario.put("ayahuasca", "banisteriopsis caapi");
        //Carga el catálogo
        catalogoPropiedades.put("ortiga", "Es diurética y depurativa. Baja los " +
            "niveles de colesterol.");
        catalogoPropiedades.put("romero", "Tiene efectos estimulantes y tónicos, " +
            "favorece en la recuperación de las " +
            "enfermedades respiratorias y del aparato " +
            "digestivo.");
        catalogoPropiedades.put("aloe vera", "Regenera las células de la piel e incluso " +
            "las de tejidos internos. Elimina hongos y " +
            "virus. Protege el sistema inmunitario.");
        catalogoPropiedades.put("ayahuasca", "Se usa en el tratamiento de la depresión " +
            "y la ansiedad así como en los problemas " +
            "de personalidad y esquizofrenia.");
        
        //Pide las palabras hasta que el usuario desee salir
        boolean sigue = true; 
        while(sigue) {
            System.out.print("Por favor, introduzca el nombre de una planta: ");
            String nombre = s.nextLine();

            if(diccionarioBoticario.containsKey(nombre)){
                System.out.println("Nombre científico: " + diccionarioBoticario.get(nombre));
                System.out.println("Propiedades: " + catalogoPropiedades.get(nombre));
            } else {
                System.out.println("Lo siento, esa planta no existe.");
            }
            
            System.out.print("¿Desea usted seguir consultado?(s/n): ");
            String res = s.nextLine();
            if(res.equals("n")) {
                sigue = false;
            }
        }
    }
    
}
