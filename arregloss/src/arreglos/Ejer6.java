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
public class Ejer6 {
    public static void main(String args[]) {
        Scanner leer = new Scanner(System.in);
     int i,numero,n,j,aux;
    System.out.println("ingresa dimencion del arreglo: ");
    n=leer.nextInt();
    int vector[]=new int[n];
    for(i=0;i<n;i++){
    System.out.println("ingresa un numero");
    vector[i]=leer.nextInt();
    
    }
    for(i=0;i<=(n-1);i++){
      for(j=0;j<(n-1);j++){
          if(vector[j]>vector[j+1]){
              aux=vector[j];
              vector[j]=vector[j+1];
              vector[j+1]=aux;
          }
      }  
    }
    for(i=0;i<n;i++){
        System.out.println("");
        System.out.println(vector[i]+" - ");
         }
    }
}
