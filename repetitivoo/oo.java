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
public class oo {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
      int i=1,num = 0,u,p = 0,sum;
      System.out.println("ingrese un numero");
              num=leer.nextInt();
              
             
      while(num!=-1){
          if(num%2==0){
                  p=p+1;
              }
          sum=0;
          while(num!=0){
              
              u=num%10;
              num=num/10;
              sum=sum+u;
              
              
          }
          
          System.out.println("la suma del numero: con sus digitos fue de: "+sum);
          
          
           System.out.println("ingrese un numero");
              num=leer.nextInt();
               
              
      }
      System.out.println("la cantidad de pares fueron: "+p);
    }
}

