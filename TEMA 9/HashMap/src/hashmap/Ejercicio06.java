/*
 * Implementa el control de acceso al área restringida de un programa. Se debe pedir un
 * nombre de usuario y una contraseña. Si el usuario introduce los datos correctamente,
 * el programa dirá “Ha accedido al área restringida”. El usuario tendrá un máximo de 3
 * oportunidades. Si se agotan las oportunidades el programa dirá “Lo siento, no tiene acceso
 * al área restringida”. Los nombres de usuario con sus correspondientes contraseñas deben
 * estar almacenados en una estructura de la clase HashMap .
 */
package hashmap;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author eliana
 */
public class Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Este programa contrala un acceso mediante diccionarios.");
        HashMap<String, String> m = new HashMap<String, String>();
        Scanner s = new Scanner(System.in);
        
        //Establece los Usuarios y contraseñas válidas
        m.put("Eliana", "root");
        m.put("Usuario", "Usuario");
        m.put("root", "root");
        
        //Pide Usuario y contraseña
        int intentos = 1;
        while(intentos <= 3) {
            System.out.print("Por favor, introduzca el usuario: ");
            String usuario = s.nextLine();
            System.out.print("Por favor, introduzca la contraseña: ");
            String pass = s.nextLine();
            intentos++;
            if((m.containsKey(usuario))){
                if(m.get(usuario).equals(pass)) {
                    System.out.println("Ha accedido al área restringida");
                    intentos = 5;
                } else {
                    System.out.println("Contraseña incorrecta.");
                }
            } else {
                System.out.println("Nombre de usuario y contraseña incorrectos.");
            }
        }
        if(intentos == 4) {
            System.out.println("Lo siento, no tiene acceso al área restringida");
        }
    }
    
}
