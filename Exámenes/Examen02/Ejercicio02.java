/**
Escribe un programa que genere un albarán bien desglosado a partir del precio inicial, el porcentaje de
descuento y el tipo de IVA aplicado. El precio inicial se debe indicar en euros y puede tener decimales.
El descuento es un porcentaje y se aplica al precio inicial. El tipo de IVA puede ser 1) Superreducido 2)
Reducido 3) General, siendo del 4%, 10% y 21% respectivamente. El IVA se aplica después de haber
calculado el descuento.
 * 
 */
public class Ejercicio02 {
  public static void main(String[] args) {
    double totaldeldescuento = 0;
    System.out.println("Este programa cgenera una factura a partir del precio inicial.");
    System.out.print("Por favor introduzca el precio inicial del artículo: ");
    double precioinicial = Double.parseDouble(System.console().readLine());
    System.out.print("Por favor, introduzca el descuento aplicado: ");
    double descuento = Double.parseDouble(System.console().readLine());
    System.out.println("Introduzca el tipo de IVA ((indicando el número que corresponde)): ");
    System.out.println("1. Superreducido");
    System.out.println("2. Reducido.");
    System.out.println("3. General.");
    int  iva = Integer.parseInt(System.console().readLine());
    
    switch (iva) {
      case 1:
      iva = 4;
      break;
      case 2:
      iva = 10;
      break;
      case 3:
      iva = 21;
      break;
      default:
      iva = 0;
      System.out.println("La opción introducida no es correcta.");
      break;
    }
    
    if (iva > 0) {
      totaldeldescuento = (precioinicial * descuento) / 100;
      double preciocondescuento = precioinicial - totaldeldescuento;
      double total = precioinicial - totaldeldescuento + ((preciocondescuento * iva) / 100);
      System.out.println("FACTURA");
      System.out.print("Precio inicial\t\t");
      System.out.printf("%.2f\n", precioinicial);
      System.out.print("Descuento\t\t");
      System.out.printf("%.2f\n", totaldeldescuento);
      System.out.print("Precio con descuento\t");
      System.out.printf("%.2f\n", precioinicial - totaldeldescuento);
      System.out.print("IVA\t\t\t");
      System.out.printf("%.2f\n", (preciocondescuento * iva) / 100);
      System.out.print("TOTAL\t\t\t");
      System.out.printf("%.2f", total);
    }

  }
}
