/**
 *Genera el precio (bien desglosado) de un pedido a un almacén en función de las siguientes
condiciones:
- Se pregunta el precio del artículo, el número de unidades y el código de descuento.
- El precio inicial del pedido se calcula multiplicando el precio unitario por la cantidad.
- El código 685 hace que se resten 15 euros.
- El código 778 aplica un 5% de descuento a las 20 primeras unidades.
- El código 219 hace que las primeras 5 unidades salgan gratis (válido solo si se piden más de 5
unidades).
- Al final se suma el 21% de IVA.
Cualquier código diferente a los anteriormente mencionados no tiene ningún efecto sobre el precio.
 *
 * @author Eliana Ferioli
 */
public class Ejercicio03 {
  public static void main(String[] args) {
    System.out.println("Este programa genera el precio de un pedido a un almacén.");
    System.out.print("Por favor, introduzca el precio del artículo: ");
    double precio = Double.parseDouble(System.console().readLine());
    System.out.print("Por favor, introduzca el número de unidades: ");
    double unidadesIniciales = Double.parseDouble(System.console().readLine());
    double unidades = unidadesIniciales;
    System.out.println("Por favor, introduzca el código del descuento: ");
    System.out.println("1. Código 685.");
    System.out.println("1. Código 778.");
    System.out.println("1. Código 219.");
    int descuento = Integer.parseInt(System.console().readLine());
    
    double precioInicial = precio * unidades;
    double precioDescuento = 0;
    double precioIva = 0;
    boolean error = false;
    
    switch (descuento) {
      case 685:
      precioDescuento = precioInicial - 15;
      break;
      case 778:
        if (unidades > 20) {
          unidades = unidades - 20;
          precioDescuento = precio - ((precio * 5) / 100);
          precioDescuento = precio * 20;
          precioDescuento = precioDescuento + (unidades * precio);
        } else {
          System.out.println("Usted no ha comprado las unidades suficientes para este descuento.");
          error = true;
        }
      break;
      case 219:
        if (unidades > 5) {
            unidades = unidades - 5;
            precioDescuento = precio * unidades;
          } else {
            System.out.println("Usted no ha comprado las unidades suficientes para este descuento.");
            error = true;
          }
      break;
      default:
      break;
    }
    
    precioIva = precioDescuento - ((precioDescuento * 21) / 100);
    
    if (!error) {    
      System.out.println("FACTURA");
      System.out.println("La cantidad de unidades: " + (int)unidadesIniciales);
      System.out.println("El precio del artículo es : " + precioDescuento);
      System.out.println("El precio total es: " + precioInicial);
      System.out.println("El descuento aplicado es: " + precioDescuento);
      System.out.println("La total a pagar (con IVA) es: " + precioIva);
    }
  }
}
