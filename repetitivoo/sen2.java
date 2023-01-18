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
public class sen2 {
    public static void main(String[] args){
         Scanner leer=new Scanner(System.in);
         double f1,pot1,pot2,pot3,pot4,pot5,f2,x,sum;
         int n,N,i;
         
         System.out.println("ingresa N");
         N=leer.nextInt();
          System.out.println("ingresa x");
         x=leer.nextInt();
         sum=0;
         for(n=0;n<=N;n++){
             pot1=1;
               for(i=1;i<=n;i++){
                   pot1=pot1*(-1);
               }
               f1=1;
               for(i=1;i<=2*n;i++){
                  f1=f1*i; 
               }
               pot2=1;
                for(i=1;i<=2*n+1;i++){
                  pot2=pot2*x;
         }
                pot3=1;
                 for(i=1;i<=n;i++){
                      pot3=pot3*4;
                 }
                 pot4=1;
                 f2=1;
                  for(i=1;i<=n;i++){
                      f2=f2*i;
                       for(i=1;i<=2;i++){
                           pot4=pot4*f2;
                       }
                  }
                  pot5=1;
                   for(i=1;i<=1;i++){
                       pot5=pot5*(2*n+1);
                   }
                   sum=sum+(pot1*f1*pot2)/(pot3*pot4*pot5);
    }
          System.out.println("sen("+x+") = "+sum);
}
}
