/*
 * Realiza de nuevo el ejercicio de la colección de discos pero utilizando esta vez una lista para
 * almacenar la información sobre los discos en lugar de un array convencional. Comprobarás
 * que el código se simplifica notablemente ¿Cuánto ocupa el programa original hecho con
 * un array? ¿Cuánto ocupa este nuevo programa hecho con una lista?
 */
package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author eliana
 */
public class Ejercicio05Prueba {
    public static void main(String[] args) {
        System.out.println("Este programa almacena objetos de la clase discos un un ArrayList");
        Scanner s = new Scanner(System.in);
        ArrayList<ColeccionDiscos> colec = new ArrayList<ColeccionDiscos>();
        int menu = 0; 

        //Menú principal
        while(menu != 5) {
            Funciones.muestraMenuPrincipal();
            menu = Integer.parseInt(s.nextLine());            
            //Switch para el menú principal
            switch(menu) {
                case 1:
                    //Crea el nuevo disco de la coleccion
                    System.out.print("Introduce el Codigo: ");
                    String cod = s.nextLine();
                    //Verifica si el código ya existe
                    while(colec.contains(new ColeccionDiscos(cod,"", "", "", 0, 0))) {
                        System.out.println("El código ya existe.");
                        System.out.println("Por favor, introduzca un nuevo código.");
                        System.out.print("Introduce el Codigo: ");
                        cod = s.nextLine();
                    }
                    System.out.print("Introduce el Autor: ");
                    String aut = s.nextLine();
                    System.out.print("Introduce el Título: ");
                    String tit = s.nextLine();
                    System.out.print("Introduce la Discográfica: ");
                    String dis = s.nextLine();
                    System.out.print("Introduce el Año: ");
                    int an = Integer.parseInt(s.nextLine());
                    System.out.print("Introduce la Duración: ");
                    int dur = Integer.parseInt(s.nextLine());
                    //Crea el disco
                    colec.add(new ColeccionDiscos(cod, aut, tit, dis, an, dur));
                break;
                case 2:
                    //Menú de la opción read
                    System.out.println("Mostrar disco");
                    System.out.println("-------------");
                    System.out.println("1. Buscar por código.");
                    System.out.println("2. Buscar por autor.");
                    System.out.println("3. Buscar por título.");
                    System.out.println("4. Buscar por discográfica.");
                    System.out.println("5. Por año.");
                    System.out.println("6. Por duración.");
                    System.out.println("7. Mostrar todos.");
                    System.out.print("¿Qué opción desea?: ");
                    int opcionRead = Integer.parseInt(s.nextLine());
                    //Switch del menú del read
                    switch(opcionRead) {
                        case 1:
                            System.out.print("Introduce el código que quieres buscar: ");
                            String buscaCod = s.nextLine();
                            for(ColeccionDiscos d : colec) {
                                if(d.getCodigo().equals(buscaCod)) {
                                  System.out.println(d);
                                }
                            }
                        break;
                        case 2:
                            System.out.print("Introduce el autor que quieres buscar: ");
                            String buscaAut = s.nextLine();
                            for(ColeccionDiscos d : colec) {
                                if(d.getAutor().equals(buscaAut)) {
                                  System.out.println(d);
                                }
                            }
                        break;
                        case 3:
                            System.out.print("Introduce el título que quieres buscar: ");
                            String buscaTit = s.nextLine();
                            for(ColeccionDiscos d : colec) {
                                if(d.getTitulo().equals(buscaTit)) {
                                  System.out.println(d);
                                }
                            }
                        break;
                        case 4:
                            System.out.print("Introduce la discográfica que quieres buscar: ");
                            String buscaDis = s.nextLine();
                            for(ColeccionDiscos d : colec) {
                                if(d.getDiscografica().equals(buscaDis)) {
                                  System.out.println(d);
                                }
                            }
                        break;
                        case 5:
                            System.out.print("Introduce el año que quieres buscar: ");
                            int buscaAn = Integer.parseInt(s.nextLine());
                            for(ColeccionDiscos d : colec) {
                                if(d.getAnio()==(buscaAn)) {
                                  System.out.println(d);
                                }
                            }
                        break;
                        case 6:
                            System.out.println("Introduce el rango de duración que quieres buscar. ");
                            System.out.print("Duración mínima: ");
                            int buscaDurMin = Integer.parseInt(s.nextLine());
                            System.out.print("Duración máxima: ");
                            int buscaDurMax = Integer.parseInt(s.nextLine());
                            for(ColeccionDiscos d: colec) {
                                if((d.getDuracion() >= buscaDurMin)&&(d.getDuracion() <= buscaDurMax)) {
                                   System.out.println(d);
                                }
                            }
                        break;
                        case 7 :
                            for(ColeccionDiscos d : colec) {
                                System.out.println(d);
                            }
                        break;
                        default:
                            System.out.println("Opción no válida.");
                        break;                        
                    }
                break;
                case 3:
                    
                    System.out.println("Modificar disco");
                    System.out.println("-------------");
                    System.out.print("Introduzca el código del disco que quiere modificar: ");
                    String codUpd = s.nextLine();
                    while (!colec.contains(new ColeccionDiscos(codUpd,"", "", "", 0, 0))) {
                        System.out.print("Ese código no existe.\nIntroduzca otro código: ");
                        codUpd = s.nextLine();
                    }
                    int i = colec.indexOf(new ColeccionDiscos(codUpd,"", "", "",0, 0));
                    
                    //Menú del update
                    Funciones.muestraMenuUpdate();
                    int menuUp = Integer.parseInt(s.nextLine());
                    
                    //Switch del Update
                    switch(menuUp) {
                        case 1:
                            System.out.print("Introduzca el nuevo código: ");
                            String nuevoCod = s.nextLine();
                            //Verifica si el código ya existe
                            if (!!colec.contains(new ColeccionDiscos(codUpd,"", "", "", 0, 0))) {
                                colec.get(i).setCodigo(nuevoCod);
                            }
                            System.out.println("El disco ha sido modificado.");
                        break;
                        case 2:
                            System.out.print("Introduzca el nuevo autor: ");
                            String nuevoAut = s.nextLine();
                            colec.get(i).setAutor(nuevoAut);
                            System.out.println("El disco ha sido modificado.");
                        break;
                        case 3:
                            System.out.print("Introduzca el nuevo título: ");
                            String nuevoTit = s.nextLine();
                            colec.get(i).setTitulo(nuevoTit);
                            System.out.println("El disco ha sido modificado.");
                        break;
                        case 4:
                            System.out.print("Introduzca la nueva discográfica: ");
                            String nuevaDisc = s.nextLine();
                            colec.get(i).setDiscografica(nuevaDisc);
                            System.out.println("El disco ha sido modificado.");
                        break;
                        case 5:
                            System.out.print("Introduzca el nuevo año: ");
                            int nuevoAnio = Integer.parseInt(s.nextLine());
                            colec.get(i).setAnio(nuevoAnio);
                            System.out.println("El disco ha sido modificado.");
                        break;
                        case 6:
                            System.out.print("Introduzca la nueva duración: ");
                            int nuevaDur = Integer.parseInt(s.nextLine());
                            colec.get(i).setDuracion(nuevaDur);
                            System.out.println("El disco ha sido modificado.");
                        break;
                        default:
                            System.out.println("Opción incorrecta.");
                        break;                            
                    }
                break;
                case 4:
                    //Menú del delete
                    System.out.println("Borrar disco");
                    System.out.println("-------------");
                    System.out.print("Introduzca el código del disco que quiere borrar: ");
                    String codDel = s.nextLine();
                    
                    //Borra el disco
                    while (!colec.contains(new ColeccionDiscos(codDel,"", "", "", 0, 0))) {
                        System.out.print("Ese código no existe.\nIntroduzca otro código: ");
                        codUpd = s.nextLine();
                    }
                    i = colec.indexOf(new ColeccionDiscos(codDel,"", "", "",0, 0));
                    colec.remove(i);
                break;                
                default:
                    System.out.println("Opción incorrecta.");
                break;           
            }
        }   
        
    }    
}
