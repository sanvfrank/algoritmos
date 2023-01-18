/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actalgypro3;

import java.util.Scanner;

/**
 *
 * @author alejo
 */
public class Ejer3 {
        public static void main(String args[]) {
        Scanner leer = new Scanner(System.in);
      int par,i,vector[]=new int [100],n,c;
      String impir="";
       System.out.println("Ingresa n");
       n=leer.nextInt();
              
      for(i=1;i<=n;i++){
           System.out.println("Ingrese un numero: ");
           vector[i]=leer.nextInt();
          
           
           if(vector[i]%2!=0){
                
                System.out.println("el numero: "+vector[i]+" es impar");
           }
                   
             }         
                
      }
}
