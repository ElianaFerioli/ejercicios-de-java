/**
* Examen
*Escribe un programa que pida dos números por teclado y que luego mezcle en dos números
*diferentes los dígitos pares y los impares. Se van comprobando los dígitos de la siguiente manera:
*primer dígito del primer número, primer dígito del segundo número, segundo dígito del primer número,
*segundo dígito del segundo número, tercer dígito del primer número... Para facilitar el ejercicio,
*podemos suponer que el usuario introducirá dos números de la misma longitud y que siempre habrá al
*menos un dígito par y uno impar. Usa long en lugar de int donde sea necesario para admitir números
*largos.
*Ejemplo 1:
*Por favor, introduzca un número: 9402
*Introduzca otro número: 6782
*El número formado por los dígitos pares es 640822
*El número formado por los dígitos impares es 97
*Ejemplo 2:
*Por favor, introduzca un número: 137
*Introduzca otro número: 909
*El número formado por los dígitos pares es 0
*El número formado por los dígitos impares es 19379
* 
* 
* @author Jesús Delgado Gallego
*/
public class Ejercicio04 {
  public static void main(String[] args){
  
    long num1 = 0;
    long num2 = 0;
    String num1String = "";
    int longitud = 0;
    long pares = 0;
    long impares = 0;

    
    System.out.println("Introduzca un número, por favor:");
    num1String = System.console().readLine();
    //Medimos la longitud del pirmer número, que será igual a la longitud del segundo para saber las iteraciones que tendrán bucles posteriores
    longitud = num1String.length();
    num1 = Long.parseLong(num1String);
    
    
    System.out.println("Introduzca un segundo ńumero con la misma longitud que el primero, por favor:");
    num2 = Long.parseLong(System.console().readLine());
    
    //Le damos la vuelta a ambos números para poder trabajar con ellos más fácilmente
    //Hacemos copias de la variable num1, que contiene el primer número introducido, para no modificarlo en caso
    //de querer recuperarlo posteriormente.
    long num1a = num1;
    long num1DelReves = 0;
    while (num1a > 0){
      
      num1DelReves = (num1DelReves * 10) + (num1a % 10);
      num1a /= 10;
      
    }
    
    long num2a = num2;
    long num2DelReves = 0;
    while (num2a > 0){
      
      num2DelReves = (num2DelReves * 10) + (num2a % 10);
      num2a /= 10;
      
    }
    
    
    // Con este bucle vamos comprobando cada dígito de los números dados la vuelta. Dependiendo de si son pares impares los vamos colocando 
    //en el número correspondiente.
    long num1b = num1DelReves;
    long num2b = num2DelReves;
    
    for (int i = 0; i < longitud; i++){
      
      
      
      if ( (num1b % 10) % 2 == 0){
        
        pares = pares * 10 + (num1b % 10);
        
      } else {
        
        impares = impares * 10 + (num1b % 10);
        
      }
      
      
      if ( (num2b % 10) % 2 == 0){
        
        pares = pares * 10 + (num2b % 10);
        
      } else {
        
        impares = impares * 10 + (num2b % 10);
        
      }
      
      num1b /= 10;
      num2b /= 10;
    }//FOR
    
    
    System.out.println("Números pares : " + pares);
    System.out.println("Números impares : " + impares);
    

  
  }
}
