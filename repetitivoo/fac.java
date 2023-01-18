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
public class fac {
    public static void main(String[] args){
        Scanner leer=new Scanner(System.in);
        int num,contador,resultado=1;
        System.out.println("ingresa un numero");
        num=leer.nextInt();
        for(contador=1;contador<=num;contador++){
           
           resultado=resultado*contador;
           
          
            
            
        }
        System.out.print("el factorial de: "+num+" es: "+resultado);
    }
}
