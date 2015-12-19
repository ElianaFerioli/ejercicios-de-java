/**
 * 
 *
 *  @Eliana Ferioli
 */

public class Ex12emfn4{
  public static void main(String[] args) {
  
      System.out.println("Asigna mesas a grupos.");
      int[] num = new int [10];
      int u = 1;
      int min = 0;
    
      //Gnera  los números de los ocupantes
      for(int x = 0; x < 10; x++) {
        num[x] = (int)((Math.random()) * 5);
      }
      
    //Los muestra
    System.out.println("\n\nOcupación original:");
    System.out.println("\n┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
    System.out.print("│ Mesa   ");
    for (int x = 1; x <= 10; x++) {
      System.out.printf("│%4d ", x);
    }
    System.out.println("│\n├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");    
    System.out.print("│ Ocup   ");
    for (int x = 0; x < 10; x++) {
      System.out.printf("│%4d ", num[x]);
    }
    System.out.println("│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
    
    int grupo = 1;
    while (grupo > 0) {
      //Pide número del grupo
      System.out.print("\n¿Cuantos son? (introduzca -1 para salir del programa): ");
      grupo = Integer.parseInt(System.console().readLine());
      
      //Asigna mesa
      boolean esCompleto = false;
      int x = 0;
      int mesaAsignada = -1;
      if (grupo > 4) {
        System.out.print("Lo sentimos, no admitimos grupos de " + grupo + " tendrá que ver la gala de pie.");
      } else {
        x = 0;
          while ((!esCompleto) && (x < 10)) {
            if (num[x] == 0) {
              num[x] = num[x] + grupo;
              mesaAsignada = x;
              esCompleto = true;
            } else {
              if ((num[x] + grupo) <= 4) {
                num[x] = num[x] + grupo;
                mesaAsignada = x;
                esCompleto = true;
              } 
            }
            x++;
          }
          if(mesaAsignada == -1) {
            System.out.print("Lo sentimos no queda sitio, tendrá que ver la gala de pie.");
          } else if (grupo > 0) {
            System.out.print("La mesa asignada es: " + (mesaAsignada + 1));
          }
          mesaAsignada = -1;
        
      }
    }
    System.out.print("Hasta pronto!");
  }
}
