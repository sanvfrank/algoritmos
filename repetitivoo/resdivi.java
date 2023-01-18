/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repetitivo;

import java.util.Scanner;

/**
 *
 * @author EQUIPO
 */
public class resdivi {
    public static void main(String[] args) {
         Scanner leer=new Scanner(System.in);
         double dividendo = 0,divisor,cont,rest;
         System.out.println("ingrese el dividendo");
         dividendo=leer.nextDouble();
          System.out.println("ingrese el divisor");
         divisor=leer.nextDouble();
         cont=0;
         rest=dividendo;
         while(rest-divisor>=0){
             rest=rest-divisor;
              System.out.println (+(rest+divisor)+" -"+divisor+" ="+rest);
              cont=cont+1;
         }
         System.out.println("la divicion "+dividendo+" / "+divisor+" es "+cont);
         
    }
       
    
}
