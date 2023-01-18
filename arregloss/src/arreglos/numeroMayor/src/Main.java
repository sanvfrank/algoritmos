/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg01;

import java.util.Scanner;

/**
 *
 * @author EQUIPO
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Scanner leer=new Scanner(System.in);
       int []vector={1,2,7,10,5};
       int []vector1=new int[5];
       int i,j,aux,mayor;
     for(i=0;i<=5-1;i++){
         for(j=0;j<5-1;j++){
             if(vector[j]>vector[j+1]){
                 aux=vector[j];
                 vector[j]=vector[j+1];
                 vector[j+1]=aux;
             }
         }
     }
     mayor=0;
     for(i=0;i<5;i++){
         if(vector[i]>mayor){
             mayor=vector[i];
         }
     }
     for(i=0;i<=5-1;i++){
         System.out.println(""+vector[i]+" -");
     }
     System.out.println("el numero mayor es: "+mayor);
}
}
