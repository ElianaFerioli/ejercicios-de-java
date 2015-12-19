/**
 *
 *
 *  @Eliana Ferioli
 */

public class Ex12emfn3 {
  public static void main(String[] args) {
  
      System.out.println("Coloca frutas al final.");
      String[] fruta = new String [8];
      int u = 1;
      int contadorFruta = 0;
    
      //Pide las frutas y cuenta las que valen
      for(int x = 0; x < 8; x++) {
        System.out.print(u + ".Por favor, introduzca una fruta: ");
        fruta[x] = System.console().readLine();
        u++;
        if (fruta[x].equals("manzana")) {
          contadorFruta++;
        }
        if (fruta[x].equals("mandarina")) {
          contadorFruta++;
        }
        if (fruta[x].equals("mango")) {
          contadorFruta++;
        }
        if (fruta[x].equals("chirimoya")) {
          contadorFruta++;
        }
        if (fruta[x].equals("nectarina") ){
          contadorFruta++;
        }
      }
      
    //Lo muestra
    System.out.println("\n\nArray original:");
    for (int x = 0; x < 8; x++) {
      System.out.printf(fruta[x] + "|");
    }
    
    
    //Lo ordena
    String[] arrayNuevo = new String[8];
    int indicefruta = 8 - contadorFruta;
    int i = 0;
    
    for(int x = 0; x < 8; x++) {
      if (fruta[x].equals("manzana")) {
        contadorFruta++;
        arrayNuevo[indicefruta] = fruta[x];
        indicefruta++;
      } else if (fruta[x].equals("mandarina")) {
        contadorFruta++;
        arrayNuevo[indicefruta] = fruta[x];
        indicefruta++;
      } else if (fruta[x].equals("mango")) {
        contadorFruta++;
        arrayNuevo[indicefruta] = fruta[x];
        indicefruta++;
      } else if (fruta[x].equals("chirimoya")) {
        contadorFruta++;
        arrayNuevo[indicefruta] = fruta[x];
        indicefruta++;
      } else if (fruta[x].equals("nectarina")) {
        contadorFruta++;
        arrayNuevo[indicefruta] = fruta[x];
        indicefruta++;
      } else {
        arrayNuevo[i] = fruta[x];
        i++;
      }
    }
    
    //Lo muestra
    System.out.println("\n\nArray final:");
    for (int x = 0; x < 8; x++) {
      System.out.printf(arrayNuevo[x] + "|");
    }
    
  }
}
