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
public class AZ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer=new Scanner (System.in);
       int i,da = 0,n,suma = 0,c = 0,mayor = 0;
       System.out.println("Ingresar dimenciones del arreglo: ");
        n=leer.nextInt();
        int[] vector=new int[n];
        
        
    for(i=1;i<=vector.length;i++){
        System.out.println("Ingresar datos: ");
        vector[i]=(int) (Math.random()*20);
        for(i=1;i<=vector[i];i++){
            if(vector[i]%i==0){
            c++;
              
        } 
        }
       
       
    }
     if(c==2){
            mayor=0;
            for(i=1;i<=n;i++){
                if(vector[i-1]>mayor){
                    mayor=vector[i];
                }
            }
            
       }
      System.out.println("El numero mayor es: "+mayor);
       
           
        
      
       
        
    }
   
   
    
    }
      
       
    
    

