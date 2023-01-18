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
public class otro {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n,num,x,contador;
        System.out.println("ingresa N");
        n = leer.nextInt();
        num=0;
	while(n>0){
            num=num+1;
            x=1;
            contador=0;
            while(x<=num){
                if(num%x==0){
                    contador=contador+1;
                }
                x=x+1;
            }
            if(contador==2){
                 System.out.println("el numero "+num+" es primo");
                 n=n-1;
            }
        }
	
    }
    
}
