/**
 * Escribe un programa que genere la nómina (bien desglosada) de un empleado según las siguientes
condiciones:
a) Se pregunta el cargo del empleado (1- Prog. junior, 2 – Prog. senior, 3 – Analista), los días que
ha estado de viaje visitando clientes durante el mes y su estado civil (1 – Soltero, 2- Casado)
b) El sueldo base según el cargo es de 950, 1200 y 1600 euros según si se trata de un prog. junior,
un prog. senior o un analista respectivamente.
c) Por cada día de viaje visitando clientes se pagan 30 euros, además de un 3% del sueldo base.
d) Al sueldo neto hay que restarle el IRPF, que será de un 25% en caso de estar soltero y un 20%
en caso de estar casado.
 *
 * @author Eliana Ferioli
 */
public class Ejercicio01 {
  public static void main(String[] args) {
    System.out.println("Este programa calcula la nómina de un empleado.");
    System.out.println("Por favor, introduzca el cargo del empleado: ");
    System.out.println("1. Programador Junior.");
    System.out.println("2. Programador Senior.");
    System.out.println("3. Analista.");
    String cargo = System.console().readLine();
    System.out.print("Por favor, introduzca los días que ha estado de viaje durante el mes: ");
    int diasdeviaje = Integer.parseInt(System.console().readLine());
    System.out.println("Por favor, introduzca el estado civil del empleado: ");
    System.out.println("1. Soltero.");
    System.out.println("2. Casado.");
    String estadocivil = System.console().readLine();
    
    double sueldobase = 0;
    double extras = 0;
    double irpf = 0;
    
    switch (cargo) {
      case "Programador Junior":
      sueldobase = 950;
      break;
      case "Programador Senior":
      sueldobase = 1200;
      break;
      case "Analista":
      sueldobase = 1600;
      break;
      default:
      break;
    }
    
    if (diasdeviaje > 0) {
      
      extras = (diasdeviaje * 30) + ((sueldobase * 3) / 100);
    }
    switch (estadocivil) {
      case "Soltero":
      irpf = 25;
      break;
      case "Casado":
      irpf = 20;
      break;
      default:
      break;
    }
    double sueldobruto = sueldobase + extras;
    irpf = (sueldobruto * irpf) / 100;

    System.out.printf("El sueldo neto del empleado es %.2f", (sueldobruto - irpf));
  
  }
}
