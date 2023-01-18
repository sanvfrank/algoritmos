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
public class vocal {
    public static void main(String[] args){
        Scanner leer=new Scanner(System.in);
        String caracter = "a";
        while(!" ".equals(caracter)){
            System.out.println("introduce un caracter");
            caracter=leer.nextLine();
            
         if(!"a".equals(caracter)&& !"e".equals(caracter)&& !"i".equals(caracter)&& !"o".equals(caracter)&& !"u".equals(caracter) ) {
             System.out.println(" NO VOCAL");
                     
             
         }  
         
         else{
             System.out.println("VOCAL");
         }
        
        }
        System.out.println("se acabo");
    }
}
