/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actalgypro3;

import java.util.Scanner;

/**
 *
 * @author alejo
 */
public class Ejer7 {
     public static void main(String args[]) {
        Scanner leer = new Scanner(System.in);
    int i;
       String nombre[],apellido[],usu1="",usu2="";
        nombre=new String[10];
        apellido=new String[10];
        
        for(i=1;i<=2;i++){
            System.out.println("Ingresa nombre y apellido N: "+i);
            System.out.println("nombre del docente: ");
            nombre[i-1]=leer.next();
            System.out.println("apellido del docente: ");
            apellido[i-1]=leer.next();
            System.out.println("");
             System.out.println("");
             
        }
        for(i=1;i<=2;i++){
            System.out.println("crear nombre de usuario");
        System.out.println("Ingresa primera letra del nombre");
        usu1=leer.next().toLowerCase();
         System.out.println("Ingresa primera letra del apellido");
        usu2=leer.next().toLowerCase();
        if(usu1.equals(nombre[i].charAt(0))&& usu2.equals(apellido[i].charAt(0))){
            
                System.out.println("su nombre de usuario es: "+usu1+"-"+usu2+"docente@gmail.com");
            
        }
        else{
             System.out.println("no se pudo");
        }
        }
        
    }
}
