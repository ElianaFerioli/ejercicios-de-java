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
public class Ejercicio03Prueba {
    public static void main(String[] args) {
        System.out.println("Este programa gestiona una colección de discos.");
        Scanner s = new Scanner(System.in);
        ColeccionDiscos coleccionUno[] = new ColeccionDiscos[5];
        int menu = 0; 
        int x = 0; //Variable para el índice del array
        
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
                    if(x > 4) {
                        System.out.println("Lo siento, no hay más espacio.");
                    } else {                    
                        //Crea el nuevo disco de la coleccion
                        System.out.print("Introduce el Codigo: ");
                        String cod = s.nextLine();
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
                            for(int i = 0; i <= 4; i++) {
                                if(coleccionUno[i].getCodigo().equals(buscaCod)) {
                                    System.out.println(coleccionUno[i]);
                                }
                            }
                        break;
                        case 2:
                            System.out.print("Introduce el autor que quieres buscar: ");
                            String buscaAut = s.nextLine();
                            for(int i = 0; i <= 4; i++) {
                                if(coleccionUno[i].getAutor().equals(buscaAut)) {
                                    System.out.println(coleccionUno[i]);
                                }
                            }
                        break;
                        case 3:
                            System.out.print("Introduce el título que quieres buscar: ");
                            String buscaTit = s.nextLine();
                            for(int i = 0; i <= 4; i++) {
                                if(coleccionUno[i].getTitulo().equals(buscaTit)) {
                                    System.out.println(coleccionUno[i]);
                                }
                            }
                        break;
                        case 4:
                            System.out.print("Introduce la discográfica que quieres buscar: ");
                            String buscaDis = s.nextLine();
                            for(int i = 0; i <= 4; i++) {
                                if(coleccionUno[i].getDiscografica().equals(buscaDis)) {
                                    System.out.println(coleccionUno[i]);
                                }
                            }
                        break;
                        case 5:
                            System.out.print("Introduce el año que quieres buscar: ");
                            int buscaAn = Integer.parseInt(s.nextLine());
                            for(int i = 0; i <= 4; i++) {
                                if(coleccionUno[i].getAnio()==buscaAn) {
                                    System.out.println(coleccionUno[i]);
                                }
                            }
                        break;
                        case 6:
                            System.out.print("Introduce el año que quieres buscar: ");
                            int buscaDur = Integer.parseInt(s.nextLine());
                            for(int i = 0; i <= 4; i++) {
                                if(coleccionUno[i].getDuracion()==buscaDur) {
                                    System.out.println(coleccionUno[i]);
                                }
                            }
                        break;
                        case 7 :
                            for(int i = 0; i <= 4; i++) {
                                System.out.println(coleccionUno[i]);
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
                            coleccionUno[indice].setCodigo(nuevoCod);
                        break;
                        case 2:
                            System.out.print("Introduzca el nuevo autor: ");
                            String nuevoAut = s.nextLine();
                            coleccionUno[indice].setAutor(nuevoAut);
                        break;
                        case 3:
                            System.out.print("Introduzca el nuevo título: ");
                            String nuevoTit = s.nextLine();
                            coleccionUno[indice].setTitulo(nuevoTit);
                        break;
                        case 4:
                            System.out.print("Introduzca la nueva discográfica: ");
                            String nuevaDisc = s.nextLine();
                            coleccionUno[indice].setDiscografica(nuevaDisc);
                        break;
                        case 5:
                            System.out.print("Introduzca el nuevo año: ");
                            int nuevoAnio = Integer.parseInt(s.nextLine());
                            coleccionUno[indice].setAnio(nuevoAnio);
                        break;
                        case 6:
                            System.out.print("Introduzca la nueva duración: ");
                            int nuevaDur = Integer.parseInt(s.nextLine());
                            coleccionUno[indice].setDuracion(nuevaDur);
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
                    int indiceDelete = Funciones.buscaObjeto(codDel, coleccionUno);
                    coleccionUno[indiceDelete] = new ColeccionDiscos();
                break;
                default:
                    System.out.println("Opción incorrecta.");
                break;           
            }
        }   
    }    
}
