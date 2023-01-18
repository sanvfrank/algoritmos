/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jea;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author EQUIPO
 */
public class Jea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        Random rand=new Random();
        int num ,i=10,aleatorio;
        aleatorio=rand.nextInt(6);
        
        while(i>=1){
            System.out.println("intenta adivinar el numero");
            System.out.println("tienes "+i+" intentos para acertarlo");
            num=leer.nextInt();
            
        
        
            if(num>aleatorio){
                System.out.println("el numero ingresado es mayor al buscado");
                
                
            }
            else if(num<aleatorio){
                System.out.println("el numero ingresado es menor al buscado");
               
            }
                    
            else{
                System.out.println("¡has acertado¡ el numero si era "+num);
                i=0;
            }
            i--;
        }
        
            
            
            
       
    
}
}

