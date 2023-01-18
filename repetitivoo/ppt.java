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
public class ppt {
    public static void main (String[] args){
        Scanner leer=new Scanner (System.in);
       int num,con = 0 ,i=1,n;
       String pir="";
           System.out.println("ingrese un numero");
      n=leer.nextInt();
      if(n>0){
           while(i<=n){
               if(i%2==1){
                 
                        pir = pir + i + ",";
                       
                  }
                   
           
               
               i++;
                
       }
            System.out.println(". "+pir);
      }
      System.out.println("ingrese un numero positivo");
          
      /*System.out.println("ingresa un numero mayor a 1");
       num=leer.nextInt();
      
             while(num!=0){
           while(i<=num){
              
               if(num%i==0){
                   con=con+1;
               }
                i++;
              
               if(con==2){
                   p=p+1;
               }
           }
            
          
            System.out.println("ingresa un numero mayor a 1");
       num=leer.nextInt();
       }
           System.out.println("cantidad de numeros primos: "+p);
       
      
         
       
       */
       
            }
            
        }
       
    


