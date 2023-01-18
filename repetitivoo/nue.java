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
public class nue {
    public static void main(String[] args) {
          Scanner leer=new Scanner(System.in);
        int par = 0,impar = 0,sumpar,sumin,num,ulti;
       System.out.println("ingresa un numero");
       num=leer.nextInt();
       sumpar=0;
       sumin=0;
       while(num!=0){
           par=0;
           impar=0;
           while(num!=0){
               ulti=num%10;
               if(ulti%2==0){
                   par=par+1;
             sumpar=sumpar+1;
               }
               else{
                   impar=impar+1;
                    sumin=sumin+1;
               }
               num=num/10;
           }
            System.out.println("los pares fueron: "+par);
         System.out.println("los impares fueron: "+impar);
         
         System.out.println("ingresa un numero");
       num=leer.nextInt();
       }
        System.out.println("los pares totales fueron:"+sumpar);
         System.out.println("los impares totales fueron:"+sumin);
        }
        }
       

