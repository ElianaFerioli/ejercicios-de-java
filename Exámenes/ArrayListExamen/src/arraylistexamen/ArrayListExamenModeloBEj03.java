/*
 * Modifica la aplicación Gestisimal realizada en clase añadiendo las siguientes mejoras:
 * a Cada artículo debe tener un campo - variable de instancia - que indique el tipo de
 * producto: “hogar y jardín”, “electrónica”, “perfumería”, etc. Se debe actualizar el listado,
 * alta, modificación y borrado para tener en cuenta esta información.
 * b El listado debe aparecer ordenado por el código del artículo (en orden alfabético si se
 * trata de una cadena de caracteres o de menor a mayor si se trata de un dato numérico)
 * c El programa debe permitir hacer un listado por tipo de producto (se pide por teclado).
 */
package arraylistexamen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author eliana
 */
public class ArrayListExamenModeloBEj03 {
    public static void main(String[] args) {
         System.out.println("GESTISIMAL");
         System.out.println("Este programa lleva la gestión simplificada de un almacén.");
         Scanner s = new Scanner(System.in);
         ArrayList<ArticuloB> almacenUno = new ArrayList();
         int menu = 0;
         
        //Carga artículos previos
        almacenUno.add(new ArticuloB("111", "Ratón", "Informática", 5.55, 55.55, 5));
        almacenUno.add(new ArticuloB("222", "Pen Drive", "Papelería", 6.66, 66.66, 6));
        almacenUno.add(new ArticuloB("333", "Altavoces", "Sonido", 2.22, 22.55, 8));
        
        //Menú principal
        while(menu != 7) {
            System.out.println("Menú Principal");
            System.out.println("1. Listado de artículos.");
            System.out.println("2. Alta de artículo.");
            System.out.println("3. Baja de artículo.");
            System.out.println("4. Modificación de artículo.");
            System.out.println("5. Entrada de mercancía.");
            System.out.println("6. Venta de mercancía.");
            System.out.println("7. Salir.");
            System.out.print("¿Que gestión desea realizar?: ");
            menu = Integer.parseInt(s.nextLine());
            
            //Switch del menú principal
            switch(menu) {
                case 1:
                     Collections.sort(almacenUno);
                    //Presunta si se quiere listar por tipo
                     String r = "n";
                     System.out.print("¿Desea listar por tipo? (s/n):");
                     r = s.nextLine();
                     if(r.equals("n")) {
                        //Listado completo de los artículos
                        System.out.println("Listado de artículos--------------");
                        for(ArticuloB x: almacenUno) {
                            System.out.println(x);
                        }
                     } else { //Listado por tipo
                         System.out.print("¿Qué tipo de artículo desea listar?: ");
                         String tipo = s.nextLine();
                         for(ArticuloB x: almacenUno) {
                            if(x.getTipo().equals(tipo)) {
                                System.out.println(x);
                            }
                        }
                     }
                break;
                case 2:
                    //Alta de artículo (verifica que no se repita el código)
                    System.out.print("Introduce el Codigo: ");
                    String cod = s.nextLine();
                    while(almacenUno.contains(new Articulo(cod,"", "", 0.0, 0.0, 0))) {
                        System.out.println("El código ya existe.");
                        System.out.println("Por favor, introduzca un nuevo código.");
                        System.out.print("Introduce el Codigo: ");
                        cod = s.nextLine();
                    }
                    System.out.print("Intorduzca una descripción: ");
                    String desc = s.nextLine();
                    System.out.print("Intorduzca el tipo de artículo: ");
                    String tip = s.nextLine();
                    System.out.print("Intorduzca el precio de compra: ");
                    double precComp = Double.parseDouble(s.nextLine());
                    System.out.print("Intorduzca el precio de venta: ");
                    double precVent = Double.parseDouble(s.nextLine());
                    System.out.print("Intorduzca el stock del artículo: ");
                    int stock = Integer.parseInt(s.nextLine());
                    //Crea el artículo
                    almacenUno.add(new ArticuloB(cod, desc, tip, precComp, precVent, stock));
                    System.out.println("Su artículo ha sido dado de alta con éxito.");
                break;
                case 3:
                    //Baja del artículo
                    System.out.print("Introduzca el código del artículo que desea dar de baja: ");
                    String codBaja = s.nextLine();
                    //Borra el artículo
                    while (!almacenUno.contains(new ArticuloB(codBaja,"", "", 0.0, 0.0, 0))) {
                        System.out.print("Ese código no existe.\nIntroduzca otro código: ");
                        codBaja = s.nextLine();
                    }
                    int i = almacenUno.indexOf(new ArticuloB(codBaja,"", "", 0.0, 0.0, 0));
                    almacenUno.remove(i);
                    System.out.println("El artículo ha sido retirado del almacén.");
                break;
                case 4:
                    //Modificación del artículo
                    System.out.println("Modificación de artículos--------------");
                    System.out.print("Introduzca el código del artículo que quiere modificar: ");
                    String codUp = s.nextLine();
                    while (!almacenUno.contains(new ArticuloB(codUp,"", "", 0.0, 0.0, 0))) {
                        System.out.print("Ese código no existe.\nIntroduzca otro código: ");
                        codUp = s.nextLine();
                    }                    
                    //Submenú del Update
                    System.out.println("Menú UPDATE");
                    System.out.println("1. Modificar código.");
                    System.out.println("2. Modificar descripción.");
                    System.out.println("3. Modificar precio de compra.");
                    System.out.println("4. Modificar precio de venta.");
                    System.out.println("5. Modificar stock.");
                    System.out.println("6. Modificar el tipo.");
                    System.out.print("¿Qué es lo que desea modificar?: ");
                    int menuUp = Integer.parseInt(s.nextLine());
                    int x = almacenUno.indexOf(new ArticuloB(codUp,"", "", 0.0, 0.0, 0));
                    switch(menuUp) {
                        case 1:
                            System.out.print("Introduzca el nuevo código: ");
                            String codUpNuevo = s.nextLine();
                            //Verifica si el código ya existe
                            while (almacenUno.contains(new ArticuloB(codUpNuevo,"", "", 0.0, 0.0, 0))) {
                                System.out.print("Ese código existe.\nIntroduzca otro código: ");
                                codUpNuevo = s.nextLine();
                            }
                            almacenUno.get(x).setCodigo(codUpNuevo);
                            System.out.println("El artículo fue modificado con éxito.");
                        break;                            
                        case 2:
                            System.out.print("Introduzca la nueva descripción: ");
                            String desUp = s.nextLine();
                            almacenUno.get(x).setDescripcion(desUp);
                            System.out.println("El artículo fue modificado con éxito.");
                        break;
                        case 3:
                            System.out.print("Introduzca el nuevo precio de compra: ");
                            double preComUp = Double.parseDouble(s.nextLine());
                            almacenUno.get(x).setPrecioCompra(preComUp);
                            System.out.println("El artículo fue modificado con éxito.");
                        break;
                        case 4:
                            System.out.print("Introduzca el nuevo precio de venta: ");
                            double preVentUp = Double.parseDouble(s.nextLine());
                            almacenUno.get(x).setPrecioVenta(preVentUp);
                            System.out.println("El artículo fue modificado con éxito.");
                        break;
                        case 5:
                            System.out.print("Introduzca el nuevo stock: ");
                            int stockUp = Integer.parseInt(s.nextLine());
                            almacenUno.get(x).setStock(stockUp);
                            System.out.println("El artículo fue modificado con éxito.");
                        break;
                        case 6:
                            System.out.print("Introduzca el tipo de artículo: ");
                            String tipUp = s.nextLine();
                            almacenUno.get(x).setTipo(tipUp);
                            System.out.println("El artículo fue modificado con éxito.");
                        break;
                        default:
                            System.out.println("Opción incorrecta.");
                        break;
                    }
                break;
                case 5:
                    //Compra de artículos
                    System.out.println("Entrada de artículos--------------");
                    System.out.print("Introduzca el código del artículo que ha comprado: ");
                    String codCompra = s.nextLine();
                    while (!almacenUno.contains(new ArticuloB(codCompra,"", "", 0.0, 0.0, 0))) {
                        System.out.print("Ese código no existe.\nIntroduzca otro código: ");
                        codCompra = s.nextLine();
                    } 
                    System.out.print("Introduzca la cantidad comprada: ");
                    int cantidadComp = Integer.parseInt(s.nextLine());
                    int j = almacenUno.indexOf(new ArticuloB(codCompra,"", "", 0.0, 0.0, 0));
                    almacenUno.get(j).compra(cantidadComp);
                    System.out.println("El nuevo stock de tu artículo es: " + almacenUno.get(j).getStock());
                break;
                case 6:
                    //Venta de artículos
                    System.out.println("Venta de artículos--------------");
                    String sigue = "s";
                    //Crea un HashMap para guardar los artículos que apareceran en la factura y la cantidad vendida
                    HashMap<String, Integer> factura = new HashMap<>();
                    
                    while(sigue.equals("s")) {
                        System.out.print("Introduzca el código del artículo que quiere vender: ");
                        String codVenta = s.nextLine();
                        while (!almacenUno.contains(new ArticuloB(codVenta,"", "", 0.0, 0.0, 0))) {
                            System.out.print("Ese código no existe.\nIntroduzca otro código: ");
                            codVenta = s.nextLine();
                        }
                        System.out.print("Introduzca la cantidad vendida: ");
                        int cantidadVent = Integer.parseInt(s.nextLine());
                        int p = almacenUno.indexOf(new ArticuloB(codVenta,"", "", 0.0, 0.0, 0));
                        almacenUno.get(p).venta(cantidadVent);
                        if(almacenUno.get(p).venta(cantidadVent)){
                            factura.put(codVenta, cantidadVent);
                        }
                        System.out.print("¿Desea vender otro atrículo(s/n)?: ");
                        sigue = s.nextLine();                     
                    }
                    ArticuloB.generaFactura(factura, almacenUno);
                break;
                default:
                    System.out.println("Opción incorrecta.");
                break;
            }
        }
    }
}
