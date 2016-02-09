/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones;


/**
 *
 * @author eliana
 */
public class Varias {
    /**
    * Devuelve el dígito que está en la posición n de un número entero. Se
    * empieza contando por el 0 y de izquierda a derecha.
    *
    * @param x un número entero positivo
    * @param p un número entero positivo
    * @return un entero
    */
    
    //Dígito N/////////////////////////////////////////////////////
    public static int digitoN(int x, int p) {
    int pos = p;
    int num = x;
    int contador = 0;
    
    //Cuenta cuántas veces sepuede dividir hasta llegar a cero
    while(num > 0) {
        num = num/10;
        contador++;
    }
    //Crea el divisor
    int divisor = 1;
    while(contador > 1){
        divisor = divisor * 10;
        contador--;
    }
    contador = -1;
    //Busca la pos
    while(contador != pos) {
        num = x / divisor;
        x = x % divisor;
        divisor = divisor / 10;
        contador++;
    }
    
    //El numero digito es num
    return num;
    }
    
    /**
    * Devuelve verdadero si el número que se pasa como parámetro es capicúa
    * y falso en caso contrario.
    *
    * @param x un número entero positivo
    * @return verdadero o falso
    */
    
    //Es Capicúa/////////////////////////////////////////////////////
    
    public static boolean esCapicua(int x) {
        int numeroOriginal = x;
        int volteado = 0;
        boolean  esCapicua =  false;
        
        //Le da la vuelta al número
        while (x > 0) {
          volteado = (volteado * 10) + (x % 10);
          x /= 10;
        }
        
        //Comprueba si es capicúa
        if(numeroOriginal == volteado) {
            esCapicua = true;
        }
        
        return esCapicua;
    }

    /**
    * Devuelve verdadero si el número que se pasa como parámetro es primo y
    * falso en caso contrario.
    *
    * @param num un número entero positivo
    * @return verdadero o falso
    */
    
    //Es primo////////////////////////////////////////////////////////
    public static boolean esPrimo(int num) {
        int x = 1;
        int resto = 0;
        int suma = 0;
        boolean esPrimo = false;

        //Verifica cuántas veces da de resto 0
        do {
          resto = num % x;
          if (resto == 0) {
            suma++;
          }
          x++;
        } while ((x <= num) && (num != 2));

        //Establece si es o no primo
        if ((suma == 2)||(num == 1)) {
            esPrimo = true;
        } 
        return esPrimo;
    }
    /**
    * Devuelve el menor primo que es mayor al número que se pasa
    * como parámetro.
    *
    * @param num un número entero positivo
    * @return un entero
    */
    
    //Siguiente primo/////////////////////////////////////////////////////
    public static int siguientePrimo(int num) {
       //Le va sumando 1 al número introducido hasta que sea primo
        do {
            num++;
        } while (!Varias.esPrimo(num));
        
        return num;
    }
    
    /**
    * Dada una base y un exponente devuelve la potencia.
    *
    * @param base un número entero positivo
    * @param exponente un número entero positivo
    * @return un entero
    */
    
    //Potencia/////////////////////////////////////////////////////
    public static int potencia(int base, int exponente) {
        int potencia = 1;
        //Calcula la potencia
        if (base == 0) {
           potencia = 0;
        } else {
            for (int i = 0; i < exponente; i++) {
                potencia = potencia * base;
            }
        }
        return potencia;
    }
    
    /**
    * Cuenta el número de dígitos de un número entero.
    *
    * @param num un número entero positivo de tipo long
    * @return un entero
    */
    
    //Cuenta dígitos/////////////////////////////////////////////////////
    public static int cuentaDigitos (long num) {
        int contador = 0;
        int digitos = 0;
        //Cuenta cuántas veces sepuede dividir hasta llegar a cero
        while(num > 0) {
            num = num/10;
            contador++;
        }

        //Establece cuántos dígitos tiene
        digitos = contador;
        return digitos;
    }
    
    /**
    * Cuenta el número de dígitos de un número entero.
    *
    * @param num un número entero positivo de tipo int
    * @return un entero
    */
    
    //Cuenta dígitos/////////////////////////////////////////////////////
    public static int cuentaDigitos (int num) {
        int contador = 0;
        int digitos = 0;
        //Cuenta cuántas veces sepuede dividir hasta llegar a cero
        while(num > 0) {
            num = num/10;
            contador++;
        }

        //Establece cuántos dígitos tiene
        digitos = contador;
        return digitos;
    }
    
    /**
    * Le da la vuelta a un número.
    *
    * @param numero un número entero positivo
    * @return un entero
    */
    
    //Vuelta/////////////////////////////////////////////////////
     public static int vuelta (int numero) {
         int volteado = 0;
    
        while (numero > 0) {
          volteado = (volteado * 10) + (numero % 10);
          numero /= 10;
        }
        return volteado;
     }
     
    /**
    * Da la posición de la primera ocurrencia de un dígito dentro de
    * un número entero. Si no se encuentra, devuelve -1.
    *
    * @param num un número entero positivo
    * @param dig un número entero positivo
    * @return un entero
    */
    
    //Dice la posición de un dígito/////////////////////////////////////////////
    public static int posicionDeDigito (int num, int dig) {
        int contador = Varias.cuentaDigitos(num);

        //Crea un array para guardar los dígitos
        int[] array =  new int[contador];
        int indice = 0;

        //Crea el divisor
        int divisor = 1;
        while(contador > 1){
            divisor = divisor * 10;
            contador--;
        }

        //Guarda el dígito en un array
        contador = Varias.cuentaDigitos(num);
        int numeroIntroducido = num;
        while(contador > 0) {
            num = numeroIntroducido / divisor;
            numeroIntroducido = numeroIntroducido % divisor;
            divisor = divisor / 10;
            array[indice] = num;
            indice++;
            contador--;
        }

        //Busca el dígito
        indice = indice - 2;
        int x = 0;
        boolean aparece = false;
        while((dig != array[x])&&(x <= indice)) {
            x++;
        }
        if(dig == array[x]) {
            aparece = true;
        }

        //Establece la primer ocurrencia y devuelve -1 si no se encuentra
        int ocurrencia = -1;
        if(aparece) {
            ocurrencia = x;
        }
        return ocurrencia;
    }
    
    /**
    * Le quita a un número n dígitos por detrás (por la derecha).
    *
    * @param num un número entero positivo
    * @param dig un número entero positivo
    * @return un entero
    */
    
    //Quita dígitos por detrás/////////////////////////////////////////////
    public static int quitaPorDetras(int num, int dig) {

    //Crea el divisor
    int divisor = 1;
    while(dig > 0){
        divisor = divisor * 10;
        dig--;
    }
    //Crea un nuevo número quitandole lo que el usuario pide
    num = num / divisor;
    
    return num;
    
    }
    
    /**
    * Le quita a un número n dígitos por delante (por la izquierda).
    *
    * @param num un número entero positivo
    * @param dig un número entero positivo
    * @return un entero
    */
    
    //Quita dígitos por delante/////////////////////////////////////////////
    public static int quitaPorDelante(int num, int dig) {

    int divisor = 1;
    int contador = Varias.cuentaDigitos(num);
    //Crea el divisor
    while(contador > 1){
        divisor = divisor * 10;
        contador--;
    }
    
    
    //Crea un nuevo número quitandole lo que el usuario pide
    while(dig > 0){
        num = num % divisor;
        divisor = divisor / 10;
        dig--;
    }
    
    return num;
    }
    
    /**
    * Le añade a un número n un dígitos por detrás (por la derecha).
    *
    * @param num un número entero positivo
    * @param dig un número entero positivo
    * @return un entero
    */
    
    //Añade dígito por detrás/////////////////////////////////////////////
    public static int agregaPorDetras(int num, int dig) {

     //Crea un nuevo número poniéndole lo que el usuario pide
    num = (num * 10) + dig;
    return num;
    }
    
    /**
    * Le añade a un número n un dígitos por delante (por la izquierda).
    *
    * @param num un número entero positivo
    * @param dig un número entero positivo
    * @return un entero
    */
    //Añade dígito por delante/////////////////////////////////////////////
    public static int agregaPorDelante(int num, int dig) {

        int x = num;
        int contador = 0;
        int divisor = 1;

        //Crea el divisor
        while(x > 0){
            x = x / 10;
            contador++;
        }
        while(contador > 0) {
            divisor = divisor *10;
            contador--;
        }

        //Crea un nuevo número poniéndole lo que el usuario pide
        x = (dig * divisor) + num;
        
        return x;
    }
    
    /**
    * Toma como parámetros las posiciones inicial y final dentro de un
    * número y devuelve el trozo correspondiente.
    *
    * @param num un número entero positivo
    * @param ini un número entero positivo
    * @param fin un número entero positivo
    * @return un entero de tipo long
    */
    //Selecciona un trozo de un número/////////////////////////////////////////
    public static long trozoDeNumero(int num, int ini, int fin) {
        fin = Varias.cuentaDigitos(num) - fin;
        //Quita los de delante
        int divisor = 1;
        int contador = Varias.cuentaDigitos(num);
        //Crea el divisor
        while(contador > 1){
            divisor = divisor * 10;
            contador--;
        }
        //Crea un nuevo número quitandole lo que el usuario pide
        while(ini > 1){
            num = num % divisor;
            divisor = divisor / 10;
            ini--;
        }
        //Quita por detras
        //Crea el divisor
        divisor = 1;
        
        while(fin > 0){
            divisor = divisor * 10;
            fin--;
        }
        //Crea un nuevo número quitandole lo que el usuario pide
        num = num / divisor;
        
        
        return num;
    }
    
    /**
    * Pega dos números para formar uno.
    *
    * @param numUno un número entero positivo
    * @param numDos un número entero positivo
    * @return un entero de tipo long
    */
    //Junta dos números/////////////////////////////////////////
     public static int juntaNumeros(int numUno, int numDos) {
         int x = Varias.cuentaDigitos(numDos);
         int multiplo = 1;
         while (x > 0) {
             multiplo = multiplo * 10;
             x--;
         }
         
         numUno = numUno * multiplo;
         numUno = numUno + numDos;
         
         return numUno;
     }
    
    
}
