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
public class Ejer2 {
    public static void main(String args[]) {
        Scanner leer = new Scanner(System.in);
     int i,n,par=0;
    String pir="";
    int vector[]=new int[10];
    
       System.out.println("ingrese dimenciones del arrelgo");
       n=leer.nextInt();
    
    for(i=1; i<=n; i++){
       System.out.println("ingresa un numero");
       vector[i]=leer.nextInt();
       
        if(vector[i]%2==0){
                
            
                System.out.println("el numero: "+vector[i]+" es par");
            }
    }
}
}
