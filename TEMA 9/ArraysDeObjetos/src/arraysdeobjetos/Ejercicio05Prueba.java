/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysdeobjetos;

import java.util.Scanner;

/**
 *
 * @author eliana
 */
public class Ejercicio05Prueba {
     public static void main(String[] args) {
         System.out.println("GESTISIMAL");
         System.out.println("Este programa lleva la gestión simplificada de un almacén.");
         Scanner s = new Scanner(System.in);
         Articulo almacenUno[] = new Articulo[5];
         int menu = 0;
         
         //Crea los articulos vacíos
        for(int i = 0; i <= 4; i++) {
            almacenUno[i] = new Articulo();
        }
        
        //Menú principal
        while(menu != 7) {
            System.out.println("Menú Principal");
            System.out.println("1. Listado de artículos.");
            System.out.println("2. Alta de artículo.");
            System.out.println("3. Baja de artículo.");
            System.out.println("4. Modificación de artículo.");
            System.out.println("5. Entrada de mercancía.");
            System.out.println("6. Salida de mercancía.");
            System.out.println("7. Salir.");
            System.out.print("¿Que gestión desea realizar?: ");
            menu = Integer.parseInt(s.nextLine());
            
            //Switch del menú principal
            switch(menu) {
                case 1:
                    //Listado de los artículos que NO están vacíos
                    System.out.println("Listado de artículos--------------");
                    int i = 0;
                    for(Articulo x: almacenUno) {
                        if(!x.getCodigo().equals("Vacio")) {
                            System.out.println(x);
                            i++;
                        }
                    }
                    if(i==0){
                        System.out.println("Lo siento, no existen artículos dados de alta.");
                    }
                break;
                case 2:
                    //Alta de artículo (verifica que no se repita el código)
                    boolean hayLugar = Funciones.buscaLibreArticulo(almacenUno);
                    if(hayLugar) {
                        int x = Funciones.buscaObjetoArticulo("Vacio", almacenUno);
                        System.out.print("Intorduzca el código: ");
                        String cod = s.nextLine();
                        if(Funciones.buscaCodigoArticulo(almacenUno, cod)) {
                            while(Funciones.buscaCodigoArticulo(almacenUno, cod)) {
                                System.out.println("Lo siento, ese codigo ya existe.");
                                System.out.print("Introduzca un nuevo código: ");
                                cod = s.nextLine();
                            }
                        }
                        almacenUno[x].setCodigo(cod);
                        System.out.print("Intorduzca una descripción: ");
                        String desc = s.nextLine();
                        almacenUno[x].setDescripcion(desc);
                        System.out.print("Intorduzca el precio de compra: ");
                        double precComp = Double.parseDouble(s.nextLine());
                        almacenUno[x].setPrecioCompra(precComp);
                        System.out.print("Intorduzca el precio de venta: ");
                        double precVent = Double.parseDouble(s.nextLine());
                        almacenUno[x].setPrecioVenta(precVent);
                        System.out.print("Intorduzca el stock del artículo: ");
                        int stock = Integer.parseInt(s.nextLine());
                        almacenUno[x].setStock(stock);
                        System.out.println("Su artículo ha sido dado de alta con éxito.");
                    } else {
                        System.out.println("Lo siento, el almacén está completo.");
                    }
                break;
                case 3:
                    //Baja del artículo
                    System.out.print("Introduzca el código del artículo que desea dar de baja: ");
                    String codBaja = s.nextLine();
                    almacenUno[Funciones.buscaObjetoArticulo(codBaja, almacenUno)] = new Articulo();
                    System.out.println("El artículo ha sido retirado del almacén.");
                break;
                case 4:
                    //Modificación del artículo
                    System.out.println("Modificación de artículos--------------");
                    System.out.print("Introduzca el código del artículo que quiere modificar: ");
                    String codUp = s.nextLine();
                    //Submenú del Update
                    System.out.println("Menú UPDATE");
                    System.out.println("1. Modificar código.");
                    System.out.println("2. Modificar descripción.");
                    System.out.println("3. Modificar precio de compra.");
                    System.out.println("4. Modificar precio de venta.");
                    System.out.println("5. Modificar stock.");
                    System.out.print("¿Qué es lo que desea modificar?: ");
                    int menuUp = Integer.parseInt(s.nextLine());
                    switch(menuUp) {
                        case 1:
                            System.out.print("Introduzca el nuevo código: ");
                            String cod = s.nextLine();
                            if(Funciones.buscaCodigoArticulo(almacenUno, cod)) {
                                while(Funciones.buscaCodigoArticulo(almacenUno, cod)) {
                                    System.out.println("Lo siento, ese codigo ya existe.");
                                    System.out.print("Introduzca un nuevo código: ");
                                    cod = s.nextLine();
                                }
                            }
                            almacenUno[Funciones.buscaObjetoArticulo(codUp, almacenUno)].setCodigo(cod);
                            System.out.println("El artículo fue modificado con éxito.");
                        break;                            
                        case 2:
                            System.out.print("Introduzca la nueva descripción: ");
                            String desUp = s.nextLine();
                            almacenUno[Funciones.buscaObjetoArticulo(codUp, almacenUno)].setDescripcion(desUp);
                            System.out.println("El artículo fue modificado con éxito.");
                        break;
                        case 3:
                            System.out.print("Introduzca el nuevo precio de compra: ");
                            double preComUp = Double.parseDouble(s.nextLine());
                            almacenUno[Funciones.buscaObjetoArticulo(codUp, almacenUno)].setPrecioCompra(preComUp);
                            System.out.println("El artículo fue modificado con éxito.");
                        break;
                        case 4:
                            System.out.print("Introduzca el nuevo precio de venta: ");
                            double preVentUp = Double.parseDouble(s.nextLine());
                            almacenUno[Funciones.buscaObjetoArticulo(codUp, almacenUno)].setPrecioVenta(preVentUp);
                            System.out.println("El artículo fue modificado con éxito.");
                        break;
                        case 5:
                            System.out.print("Introduzca el nuevo stock: ");
                            int stockUp = Integer.parseInt(s.nextLine());
                            almacenUno[Funciones.buscaObjetoArticulo(codUp, almacenUno)].setStock(stockUp);
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
                    if(Funciones.buscaCodigoArticulo(almacenUno, codCompra)) {
                        System.out.print("Introduzca la cantidad comprada: ");
                        int cantidadComp = Integer.parseInt(s.nextLine());
                        almacenUno[Funciones.buscaObjetoArticulo(codCompra, almacenUno)].compra(cantidadComp);
                    } else {
                        System.out.println("El código introducido es incorrecto.");
                    }
                break;
                case 6:
                    //Venta de artículos
                    System.out.println("Venta de artículos--------------");
                    System.out.print("Introduzca el código del artículo que quiere vender: ");
                    String codVenta = s.nextLine();
                    if(Funciones.buscaCodigoArticulo(almacenUno, codVenta)) {
                        System.out.print("Introduzca la cantidad vendida: ");
                        int cantidadVent = Integer.parseInt(s.nextLine());
                        almacenUno[Funciones.buscaObjetoArticulo(codVenta, almacenUno)].venta(cantidadVent);
                    } else {
                        System.out.println("El código introducido es incorrecto.");
                    }
                    
                break;
                default:
                    System.out.println("Opción incorrecta.");
                break;
            }
            
        }
     }
    
}
