/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repetitivos;

import java.util.Scanner;

/**
 *
 * @author EQUIPO
 */
public class nperfecto {
    public static void main(String[] args){
         Scanner leer = new Scanner(System.in);
         int i, suma = 0, n, j;
       
        System.out.println("Introduce un número: ");
        n = leer.nextInt();
        for (i = 1; i < n; i++) {                           
            if (n % i == 0) {
                suma = suma + i;   
            }
        }
        if (suma == n) {                        
            System.out.println("Perfecto");
        } else {
            System.out.println("No es perfecto");

        }
        
        System.out.println("Números perfectos entre 1 y 10000: ");
        for(i=1;i <= 10000;i++){     
            suma = 0;
            for(j = 1;j < i;j++){                       
                 if(i % j==0){
                    suma = suma + j; 
                 }
            }
          if(i == suma){                      
             System.out.println(i);
          }
    }
    }
}
    
     
