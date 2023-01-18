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
public class ahorro {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int i=1,objetivo = 0,total,suma=0,monto;
        String p;
        
        System.out.println("ingrese monto a ahorrar");
            objetivo=leer.nextInt();
        if(objetivo>0){
            while(i<=12){
            
             System.out.println("ingrese consignacion mes: "+i);
            monto=leer.nextInt();
            
                suma=suma+monto;
           System.out.println("monto ahorrado: "+suma);
            
            if(suma>=objetivo){
               
                System.out.println("alcanzaste el objetivo,en el mes: "+i);
                System.out.println("ahorraste: "+suma);
                i=13;
            }
            else if(i==12 && suma<objetivo){
                 System.out.println("no alcanzaste el objetivo en el tiempo estipulado");
                
            }
            i++; 
            }
         System.out.println("fin del pograma");

            
            
    }
        else{
             System.out.println("ingrese monto positivo");
        
        }
         
        }
       
        
}

