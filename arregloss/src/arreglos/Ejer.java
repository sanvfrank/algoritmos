/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

import java.util.Scanner;

/**
 *
 * @author EQUIPO
 */
public class Ejer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer= new Scanner (System.in);
     
     int N,i,dato,j,aux,mayor = 0;
     System.out.println("ingresar dimenciones");
     N=leer.nextInt();
     int []Z=new int [N];
     for(i=0;i<Z.length;i++){
         System.out.println("ingresa dato");
         Z[i]=leer.nextInt();
     }
      for(i=0;i<=Z.length-1;i++){
           for(j=0;j<Z.length-1;j++){
               if(Z[j]>Z[j+1]){
                   aux=Z[j];
                   Z[j]=Z[j+1];
                   Z[j+1]=aux;
               }
           }
           mayor=0;
           if(Z[i]>mayor){
               mayor=Z[i];
           }
      }
      
      for(i=0;i<Z.length;i++){
          System.out.println("|"+Z[i]+"|");
      }
      System.out.println("valor mayor es: "+mayor);
    }
}
       
