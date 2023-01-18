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
public class senangu {
    public static void main(String[] args){
         Scanner leer=new Scanner(System.in);
         double x,f,pot,senx;
         int n,a,signo,i;
         System.out.println("ingresar el maximo exponente: ");
         n=leer.nextInt();
         System.out.println("ingresa x");
         x=leer.nextInt();
         senx=x;
         signo=1;
         for(a=3;a<=n;a+=2){
             f=1;
             i=1;
             pot=1;
             for(i=1;i<=a;i++){
                 f=f*i;
                 pot=pot*x;
             }
             if(signo%2==1){
                 senx=senx-pot/f;
                 
             }
             else{
                    senx=senx+pot/f;
             }
             signo++;
         }
         System.out.println("sen("+x+")= "+senx);
    }
}
