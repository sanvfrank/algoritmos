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
public class limites {
    public static void main(String[]args){
        Scanner leer=new Scanner(System.in);
        double limin = 1,limsup=2,i=2,num,suma = 0;
        while(limin!=0 ){
        System.out.println("introduce limite inferior");
        limin=leer.nextDouble();
        System.out.println("introduce limite superior ");
        limsup=leer.nextDouble();
        if(limin>limsup){
            limin--;
        }
        else{
            while(limin<=limsup){
                
                suma=suma+limin;
           limin=limin+1;
            }
         
           System.out.println("la suma de los intervalos es: "+suma);
            
               limin=0;
            
        }
         
        
       
        
        
    }
         
        
    }
}
