/*
 * Implementa la clase Caballo vista en un ejercicio anterior. Pruébala creando instancias y
 * aplicándole algunos métodos.
 */
package objetossimples;

/**
 *
 * @author eliana
 */

    public class Caballo {
        //Atributos
       private  String sexo;
       private  String raza;
       private  String pelaje;
       private  int    peso;
        
        //Métodos
        // constructor
        public Caballo (String s) {
          this.sexo = s;
        }
        // getter
        public String getSexo() {
          return this.sexo;
        }

        /**
        * Hace que el Caballo coma
        */
        public void come() {
          System.out.println("Que rica hierba!");
        }

        /**
         * Hace que el caballo duerama
         */  
        public void duerme() {
          System.out.println("ZZzzZZZzzzZZZzzzZZZzzzzZZZ");
        }
        /**
         * Hace que el caballo corra si es yegua sino
         */  
        public void corre() {
          if (this.sexo.equals("macho")) {
              System.out.println("No puedo, las yeguas se reirían de mi.");
          } else if (this.sexo.equals("yegua")) {
              System.out.println("=================>fiummmmmmmmmmmm");
          }
          
        }
        /**
         * Hace que el caballo haga pistas de agilidad
         */  
        public void agilidad() {
          System.out.println("No tengo ganas.");
        }
    }