/**
 *Escribe un programa que genere el menú del día de un restaurante vegetariano. El programa debe pedir el día
de la semana, que será un número del uno al siete, y a continuación debe mostrar de forma aleatoria la
secuencia de platos en función de las siguientes condiciones: (a) De primer plato puede haber ensalada, pasta
o arroz (b) De segundo plato puede haber hamburguesas de soja, filetes de seitán o albóndigas de tofu que irán
acompañados con una guarnición que puede ser patatas bravas, verduras a la plancha o pimientos asados (c)
De postre puede haber flan, helado o arroz con leche (d) Cuando el primer plato es arroz, el postre no puede ser
arroz con leche (e) Los sábados y domingos no hay menú (se debe mostrar un mensaje que así lo indique).
 *
 * @author Eliana Ferioli
 */
public class Ejercicio01 {
  public static void main(String[] args) {
    System.out.println("Este programa realiza, aleatoriamente, un menú vegetariano.");
    System.out.print("Por favor indique el día de la semana (del 1 al 7): ");
    int diaSemana = Integer.parseInt(System.console().readLine());
    String dia = " ";
    int i = 30;
    
    switch (diaSemana) {
      case 1:
      dia = "Lunes";
      break;
      case 2:
      dia = "Martes";
      break;
      case 3:
      dia = "Miercoles";
      break;
      case 4:
      dia = "Jueves";
      break;
      case 5:
      dia = "Vieres";
      break;
      case 6:
      dia = "Sábado";
      break;
      case 7:
      dia = "Domingo";
      break;
      default:
      dia = "Día incorrecto";
      break;
    }
    
    if ((diaSemana == 6) || (diaSemana == 7)) {
      System.out.println("El día " + dia + " no hay menú.");
    } else {
      int primerPlato = (int)(Math.random() * 3);
      int segundoPlato = (int)(Math.random() * 3);
      int postre = (int)(Math.random() * 3);
      int guarnicion = (int)(Math.random () * 3);
      String tipoprimerPlato = " ";
      String tiposegundoPlato = " ";
      String tipoPostre = " ";
      String tipoGuarnicion = " ";
      
      switch (primerPlato) {
        case 0:
        tipoprimerPlato = "Ensalada";
        break;
        case 1:
        tipoprimerPlato = "Pasta";
        break;
        case 2:
        tipoprimerPlato = "Arroz";
        break;
        default:
        break;
      }
      switch (segundoPlato) {
        case 0:
        tiposegundoPlato = "Hamburgesa de soja";
        break;
        case 1:
        tiposegundoPlato = "Filete de seitán";
        break;
        case 2:
        tiposegundoPlato = "Tofu";
        break;
        default:
        break;
      }

      switch (guarnicion) {
        case 0:
        tipoGuarnicion = "Patatas bravas";
        break;
        case 1:
        tipoGuarnicion = "Verduras a la plancha";
        break;
        case 2:
        tipoGuarnicion = "Pimientos asados";
        break;
      }
      
      if (tipoprimerPlato.equals("Arroz")) {
        int x = 1;
        while (x > 0) {
          postre = (int)(Math.random() * 3);
            if (postre == primerPlato) {
              x = 2;
            }
          x--;
        }
      }
      
      switch (postre) {
        case 0:
        tipoPostre = "Flan";
        break;
        case 1:
        tipoPostre = "Helado";
        break;
        case 2:
        tipoPostre = "Arroz con leche";
        break;
        default:
        break;
      }
      
    System.out.print("El menú del día " + dia + " es: " + tipoprimerPlato);
    System.out.print(", " + tiposegundoPlato + " con " + tipoGuarnicion + " y " + tipoPostre);
    }
  }
}
