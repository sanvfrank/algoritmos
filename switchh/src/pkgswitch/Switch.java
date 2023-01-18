/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgswitch;
import java.util.Scanner;
/**
 *
 * @author EQUIPO
 */
public class Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer=new Scanner(System.in);
       int num;
       System.out.println("ingresa un mes por su numero correspondiente");
       num=leer.nextInt();
       switch(num){
           case 1:
               System.out.println("enero");
               break;
               
           case 2: 
           System.out.println("febrero");
               break;
               

               case 3: 
           System.out.println("marzo");
               break;
               
               
               case 4: 
           System.out.println("abril");
               break;
               
               
               case 5: 
           System.out.println("mayo");
               break;
               
               
               case 6: 
           System.out.println("junio");
               break;
               
               case 7: 
           System.out.println("julio");
               break;
               
               
               case 8: 
           System.out.println("agosto");
               break;
               
               
               case 9: 
           System.out.println("septiembre");
               break;
               
               
               case 10: 
           System.out.println("octubre");
               break;
               
               
               case 11: 
           System.out.println("noviembre");
               break;
               
               
               case 12: 
           System.out.println("diciembre");
               break;
               
       }
      
       
    }
    
}
