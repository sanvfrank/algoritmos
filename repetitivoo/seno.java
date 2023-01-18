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
public class seno {
     public static void main(String[] args){
          Scanner leer=new Scanner(System.in);
          double x,pot1,pot2,s,f;
          int n,m,i,t;
          System.out.println("ingrese n");
          m=leer.nextInt();
           System.out.println("ingrese x");
          x=leer.nextDouble();
          s=0;
          for(n=0;n<=m;n++){
              pot1=1;
              for(i=1;i<=n;i++){
                  pot1=pot1*(-1);
              }
              pot2=1;
              for(i=1;i<=2*n+1;i++){
                  pot2=pot2*x;
              }
              f=1;
              t=2*n+1;
              for(i=1;i<=t;i++){
                  f=f*i;
              }
              s=s+pot1*pot2/f;
          }
           System.out.println("sen("+x+")= "+s);
          
     }
        
}
