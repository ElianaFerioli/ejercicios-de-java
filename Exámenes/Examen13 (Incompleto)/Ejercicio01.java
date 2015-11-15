/**
 *Realiza un programa que calcule el coste mensual del servicio de almacenamiento en la nube de los
datos de nuestra empresa. El programa debe pedir el tipo de servicio (un número del 1 al 3) y el
número de gigabytes que se han transferido durante el mes. El tipo de servicio, según la velocidad de
transferencia, puede ser básico, estándar o premium; con un coste mínimo de 200, 500 y 800 euros al
mes respectivamente. El precio mínimo se cobra cuando la transferencia de datos ha sido de 40
gigabytes o menos. Si se han transferido más de 40 gigabytes, cada gigabyte extra se paga al 5% del
coste base, es decir a 10, 25 o 40 euros según el tipo de servicio. Por ejemplo, un servicio de tipo
básico con un tráfico de 20 gigabytes costaría 200 euros. Un servicio de tipo estándar con un tráfico
de 50 gigabytes costaría 750 euros (500 + 250).
 *
 * @author Eliana Ferioli
 */
public class Ejercicio01 {
  public static void main(String[] args) {
    System.out.println("Este programa calcula el costo mensual de un servicio de almacenamiento.");
    
    System.out.print("Por favor, introduzca el tipo de servicio (1 a 3): ");
    int tiposervicio = Integer.parseInt(System.console().readLine());
    System.out.print("Por favor, introduzca el número de gigabytes transferidos en el mes: ");
    int gigabytes = Integer.parseInt(System.console().readLine());
    int costeservicio = 0;
    int costegigas = 0;
    int total = 0;
    
    switch (tiposervicio) {
      case 1:
      costeservicio = 200;
      costegigas = 10;
      break;
      case 2:
      costeservicio = 500;
      costegigas = 25;
      break;
      case 3:
      costeservicio = 800;
      costegigas = 40;
      break;
      default:
      break;
    }
    
    if (gigabytes <= 40) {
      total = costeservicio;
    } else {
      gigabytes = gigabytes - 40;
      total = (gigabytes * costegigas) + costeservicio;
    }
    
    System.out.println("El total a pagar es: " + total);
  }
}
