/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repetitivos;

import java.util.Scanner;

/**
 *
 * @author EQUIPO
 */
public class minmultiplo {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        int num1,num2,mcm,i;
        System.out.println("Ingrese primer numero:");
        num1=leer.nextInt();
        System.out.println("Ingrese segundo numero:");
        num2=leer.nextInt();
        mcm=1;
        i=2;
        if(num1>0 && num2>0){
            while(i <= num1 || i <= num2)
        {
            if(num1%i==0 || num2%i==0)
            {
            mcm=mcm*i;
            if(num1%i==0) num1=num1/i;
            if(num2%i==0) num2=num2/i;
            }
            else
                i=i+1;               
        }                        
        System.out.println("El MCM es =" +mcm);   
        }
        else{
            System.out.println("Digite un numero entero positivo" ); 
        }
                                               
        }         
    }
    

