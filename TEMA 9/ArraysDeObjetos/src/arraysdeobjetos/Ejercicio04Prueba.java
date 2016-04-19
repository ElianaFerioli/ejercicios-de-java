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
public class Ejercicio04Prueba {
    public static void main(String[] args) {
        System.out.println("Este programa gestiona una colección de discos.");
        Scanner s = new Scanner(System.in);
        ColeccionDiscos coleccionUno[] = new ColeccionDiscos[5];
        int menu = 0; 
        
        //Crea los cinco discos vacios
        for(int i = 0; i <= 4; i++) {
            coleccionUno[i] = new ColeccionDiscos();
        }
        
        //Menú principal
        while(menu != 5) {
            System.out.println("Menú Principal");
            System.out.println("1. Añadir un nuevo disco.");
            System.out.println("2. Mostrar información del disco.");
            System.out.println("3. Modificar datos del disco.");
            System.out.println("4. Borrar disco.");
            System.out.println("5. Salir.");
            System.out.print("¿Que gestión desea realizar?: ");
            menu = Integer.parseInt(s.nextLine());
            
            //Switch para el menú principal
            switch(menu) {
                case 1:
                    //Primero comprueba que haya sitio en la colección
                    boolean hayLibre = Funciones.buscaLibre(coleccionUno);
                    
                    if(!hayLibre) {
                        System.out.println("Lo siento, no hay más espacio.");
                        System.out.println("Es necesario borrar algún disco para introducir uno nuevo.");
                    } else {
                        //Busca el índice del espacio del array que este vacío y lo rellena
                        int x = Funciones.buscaObjeto("Vacio", coleccionUno);
                        //Crea el nuevo disco de la coleccion
                        System.out.print("Introduce el Codigo: ");
                        String cod = s.nextLine();
                            //Verifica si el código ya existe
                        if(Funciones.buscaCodigo(coleccionUno, cod)) {
                            while(Funciones.buscaCodigo(coleccionUno, cod)) {
                                System.out.println("El código ya existe.");
                                System.out.println("Por favor, introduzca un nuevo código.");
                                System.out.print("Introduce el Codigo: ");
                                cod = s.nextLine();
                            }
                        }
                        coleccionUno[x].setCodigo(cod);
                        System.out.print("Introduce el Autor: ");
                        String aut = s.nextLine();
                        coleccionUno[x].setAutor(aut);
                        System.out.print("Introduce el Título: ");
                        String tit = s.nextLine();
                        coleccionUno[x].setTitulo(tit);
                        System.out.print("Introduce la Discográfica: ");
                        String dis = s.nextLine();
                        coleccionUno[x].setDiscografica(dis);
                        System.out.print("Introduce el Año: ");
                        int an = Integer.parseInt(s.nextLine());
                        coleccionUno[x].setAnio(an);
                        System.out.print("Introduce la Duración: ");
                        int dur = Integer.parseInt(s.nextLine());
                        coleccionUno[x].setDuracion(dur);
                        x++;
                    }
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
                            int listaCod = Funciones.buscaObjeto(buscaCod, coleccionUno);
                            System.out.println(coleccionUno[listaCod]);
                        break;
                        case 2:
                            System.out.print("Introduce el autor que quieres buscar: ");
                            String buscaAut = s.nextLine();
                            for(ColeccionDiscos x: coleccionUno) {
                                if(!x.getCodigo().equals("Vacio")) {
                                    if(x.getAutor().equals(buscaAut)) {
                                        System.out.println(x);
                                    }
                                }
                            }
                        break;
                        case 3:
                            System.out.print("Introduce el título que quieres buscar: ");
                            String buscaTit = s.nextLine();
                            for(ColeccionDiscos x: coleccionUno) {
                                if(!x.getCodigo().equals("Vacio")) {
                                    if(x.getTitulo().equals(buscaTit)) {
                                        System.out.println(x);
                                    }
                                }
                            }
                        break;
                        case 4:
                            System.out.print("Introduce la discográfica que quieres buscar: ");
                            String buscaDis = s.nextLine();
                            for(ColeccionDiscos x: coleccionUno) {
                                if(!x.getCodigo().equals("Vacio")) {
                                    if(x.getDiscografica().equals(buscaDis)) {
                                        System.out.println(x);
                                    }
                                }
                            }
                        break;
                        case 5:
                            System.out.print("Introduce el año que quieres buscar: ");
                            int buscaAn = Integer.parseInt(s.nextLine());
                            for(ColeccionDiscos x: coleccionUno) {
                                if(!x.getCodigo().equals("Vacio")) {
                                    if(x.getAnio()==buscaAn) {
                                        System.out.println(x);
                                    }
                                }
                            }
                        break;
                        case 6:
                            System.out.println("Introduce el rango de duración que quieres buscar. ");
                            System.out.print("Duración mínima: ");
                            int buscaDurMin = Integer.parseInt(s.nextLine());
                            System.out.print("Duración máxima: ");
                            int buscaDurMax = Integer.parseInt(s.nextLine());
                            for(ColeccionDiscos x: coleccionUno) {
                                if(!x.getCodigo().equals("Vacio")) {
                                    if((x.getDuracion() >= buscaDurMin)&&(x.getDuracion() <= buscaDurMax)) {
                                        System.out.println(x);
                                    }
                                }
                            }
                        break;
                        case 7 :
                            for(ColeccionDiscos x: coleccionUno) {
                                if(!x.getCodigo().equals("Vacio")) {
                                    System.out.println(x);
                                }
                            }
                        break;
                        default:
                            System.out.println("Opción no válida.");
                        break;                        
                    }
                break;
                case 3:
                    //Menú del update
                    System.out.println("Modificar disco");
                    System.out.println("-------------");
                    System.out.print("Introduzca el código del disco que quiere modificar: ");
                    String codUpd = s.nextLine();
                    if(Funciones.buscaCodigo(coleccionUno, codUpd)) {
                        System.out.println("1. Modificar código.");
                        System.out.println("2. Modificar autor.");
                        System.out.println("3. Modificar título.");
                        System.out.println("4. Modificar discográfica.");
                        System.out.println("5. Modificar año.");
                        System.out.println("6. Modificar duración.");
                        System.out.print("¿Qué dato desea modificar?: ");
                        int menuUp = Integer.parseInt(s.nextLine());

                        //Switch del Update
                        int indice = Funciones.buscaObjeto(codUpd, coleccionUno);

                        switch(menuUp) {
                            case 1:
                                System.out.print("Introduzca el nuevo código: ");
                                String nuevoCod = s.nextLine();
                                //Verifica si el código ya existe
                                if(Funciones.buscaCodigo(coleccionUno, nuevoCod)) {
                                    while(Funciones.buscaCodigo(coleccionUno, nuevoCod)) {
                                        System.out.println("El código ya existe.");
                                        System.out.println("Por favor, introduzca un nuevo código.");
                                        System.out.print("Introduce el Codigo: ");
                                        nuevoCod = s.nextLine();
                                    }
                                }
                                coleccionUno[indice].setCodigo(nuevoCod);
                                System.out.println("El disco ha sido modificado.");
                            break;
                            case 2:
                                System.out.print("Introduzca el nuevo autor: ");
                                String nuevoAut = s.nextLine();
                                coleccionUno[indice].setAutor(nuevoAut);
                                System.out.println("El disco ha sido modificado.");
                            break;
                            case 3:
                                System.out.print("Introduzca el nuevo título: ");
                                String nuevoTit = s.nextLine();
                                coleccionUno[indice].setTitulo(nuevoTit);
                                System.out.println("El disco ha sido modificado.");
                            break;
                            case 4:
                                System.out.print("Introduzca la nueva discográfica: ");
                                String nuevaDisc = s.nextLine();
                                coleccionUno[indice].setDiscografica(nuevaDisc);
                                System.out.println("El disco ha sido modificado.");
                            break;
                            case 5:
                                System.out.print("Introduzca el nuevo año: ");
                                int nuevoAnio = Integer.parseInt(s.nextLine());
                                coleccionUno[indice].setAnio(nuevoAnio);
                                System.out.println("El disco ha sido modificado.");
                            break;
                            case 6:
                                System.out.print("Introduzca la nueva duración: ");
                                int nuevaDur = Integer.parseInt(s.nextLine());
                                coleccionUno[indice].setDuracion(nuevaDur);
                                System.out.println("El disco ha sido modificado.");
                            break;
                            default:
                                System.out.println("Opción incorrecta.");
                            break;                            
                        }
                    } else {
                        System.out.println("El código introducido no existe.");
                    }
                break;
                case 4:
                    //Menú del delete
                    System.out.println("Borrar disco");
                    System.out.println("-------------");
                    System.out.print("Introduzca el código del disco que quiere borrar: ");
                    String codDel = s.nextLine();
                    
                    //Borra el disco
                    if(Funciones.buscaCodigo(coleccionUno, codDel)) {
                        int indiceDelete = Funciones.buscaObjeto(codDel, coleccionUno);
                        coleccionUno[indiceDelete] = new ColeccionDiscos();
                        System.out.println("El disco fue borrado de la colección.");                                
                    } else {
                        System.out.println("El código introducido no existe.");
                    }
                break;                
                default:
                    System.out.println("Opción incorrecta.");
                break;           
            }
        }   
    } 
    
}
