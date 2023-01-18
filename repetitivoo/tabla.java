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
public class tabla {
    public static void main(String[] args){
        Scanner leer=new Scanner(System.in);
        int num = 0,i = 1,mul1 = 0,mul2 = 0,mul3 = 0,mul4 = 0,mul5 = 0,mul6 = 0,mul7 = 0,mul8 = 0,mul9 = 0,mul10 = 0,num2=0;
        while(i<=1){
            System.out.println("ingresar un numero 1");
            num=leer.nextInt();
            
            
            
            if(num>0){
           mul1=num*1;
           mul2=num*2;
           mul3=num*3;
           mul4=num*4;
           mul5=num*5;
           mul6=num*6;
           mul7=num*7;
           mul8=num*8;
           mul9=num*9;
           mul10=num*10;
           
           
            }
            else{
                System.out.println("ingrese un numero positivo");
                i--;
            }
 
           i++;
            
        }
        System.out.println("   tabla de multiplicar del "+num          );
        System.out.println(+num+" x 1 ="+mul1);
         System.out.println(+num+" x 2 ="+mul2);
          System.out.println(+num+" x 3 ="+mul3);
           System.out.println(+num+" x 4 ="+mul4);
            System.out.println(+num+" x 5 ="+mul5);
             System.out.println(+num+" x 6 ="+mul6);
              System.out.println(+num+" x 7 ="+mul7);
               System.out.println(+num+" x 8 ="+mul8);
                System.out.println(+num+" x 9 ="+mul9);
                 System.out.println(+num+" x 10 ="+mul10);
                 
              
    }
}
