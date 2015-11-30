/**
 * Escribe un programa que calcule el sueldo bruto a percibir por un trabajador de la construcción en un
mes. El programa debe pedir el cargo desempeñado (un número del 1 al 3) y el número de horas
trabajadas. Los cargos existentes son peón, albañil y encargado de obra; con un sueldo base de 1000,
1400 y 1700 euros al mes respectivamente. El sueldo base se cobra trabajando exactamente 140
horas al mes. Si un empleado trabaja menos de 140 horas en un mes, cobra la parte proporcional del
sueldo. Si trabaja más de 140 horas, cada hora extra se paga al 2% del salario base, es decir a 20, 28
o 34 euros según el cargo. Por ejemplo, un albañil que haya trabajado 150 horas ganaría 1680 euros
(1400 + 280). Un encargado de obra que haya trabajado 70 horas ganaría 850 euros.
 *
 * @author Eliana Ferioli
 */
public class Ejercicio01 {
  public static void main(String[] args) {
    System.out.println("Este programa calcula el sueldo bruto de un trabajador de la construcción.");
    System.out.println("Por favor, introduzca el cargo del empleado: ");
    System.out.println("1. Peón.");
    System.out.println("2. Albañil.");
    System.out.println("3. Encargado de obra.");
    int cargo = Integer.parseInt(System.console().readLine());
    System.out.print("Por favor, introduzca las horas trabajadas durante el mes: ");
    int horasTrabajadas = Integer.parseInt(System.console().readLine());

    double sueldoBase = 0;
    double sueldoBruto = 0;
    int horasExtra = 0;
    int sueldoExtra = 0;
    
    switch (cargo) {
      case 1:
      sueldoBase = 1000;
      break;
      case 2:
      sueldoBase = 1400;
      break;
      case 3:
      sueldoBase = 1700;
      break;
      default:
      break;
    }
    
    if(horasTrabajadas < 140) {
      sueldoBruto = (sueldoBase * horasTrabajadas) / 140;
    } else if(horasTrabajadas == 140) {
      sueldoBruto = sueldoBase;
    } else if(horasTrabajadas > 140) {
      horasExtra = horasTrabajadas - 140;
      switch (cargo) {
        case 1:
        sueldoExtra = 20;
        break;
        case 2:
        sueldoExtra = 28;
        break;
        case 3:
        sueldoExtra = 34;
        break;
        default:
        break;
      }
      sueldoBruto = sueldoBase + (horasExtra * sueldoExtra);
    }
  
  System.out.println("El sueldo bruto del empleado es: " + sueldoBruto);
    
  }
}
