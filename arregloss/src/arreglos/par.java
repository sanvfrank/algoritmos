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
public class par {
    public static void main (String [] args){
        Scanner leer = new Scanner (System.in);
       
       int[]arreglo=new int[8];
       for(int c=0;c<8;c++){
           arreglo[c]=leer.nextInt();
       }
        
          System.out.println("invertido");
          for(int c=7;c>=0;c--)     {
            System.out.println(+arreglo[c]);
          } 
             
          
       }
       
}

