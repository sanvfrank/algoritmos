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
public class contra {
    public static void main(String[] args){
        Scanner leer=new Scanner(System.in);
        String contra,con="holamundo";
        int i=1,v=0;
        while(i<=4){
            System.out.println("ingrese su contraseña");
                contra=leer.next();
                if(con.equals(contra)){
                      System.out.println("contraseña correcta");
                      i=5;
                }
                
                else{
                    while(v<1){
                         System.out.println("contraseña incorrecta");
                          System.out.println("tiene tres intentos ");
                          v++;
                    }
                    i++;
                    
               while(i==5){
                    System.out.println("intentos agotados");
               
                i=6;
               }
                    
                   
                
                }
                 
                
        }
                
    } 
}
