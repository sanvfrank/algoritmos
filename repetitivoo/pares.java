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
public class pares {
    public static void main(String[]args){
        Scanner leer=new Scanner(System.in);
        int num1,num2,i=1;
        String par="",impar="";
        while(i<=3){
            System.out.println("ingresa numero 1");
            num1=leer.nextInt();
            
            System.out.println("ingresa numero 2");
            num2=leer.nextInt();
            
            if(num1%2==0){
                 par = par+ num1+" ";
                 
            }
            else {
                impar=impar+num1+" ";
            }
            if(num2%2==0){
                par=par+num2+" ";
            
               }
             else 
                impar=impar+num2+" ";
            
          
            
        i++;
    }
        System.out.println("los pares fueron : "+par);
        System.out.println("los impares fueron : "+impar);
}
}
