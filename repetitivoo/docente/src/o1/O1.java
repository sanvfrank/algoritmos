/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package o1;

import java.util.Scanner;

/**
 *
 * @author EQUIPO
 */
public class O1 {

    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
      int cantidad = 2,n,u = 1;
        String[] nombre = new String[cantidad];
        System.out.println("Ingresa numero de docentes: ");
         n=sc.nextInt();
         while(u<=n){
             System.out.println("Nombre completo del docente: ");
        for (int i = 0; i < cantidad; i++) {
         
            nombre[i] = sc.next();
             System.out.println("");
        }

       
        System.out.println("Nombre de usuario del docente ");
        System.out.println("" + "Usuario: " + printInitials(nombre)+"@unisimon.edu.co");
         }
    
}
    public static String printInitials(String [] full){
         String primerCaracter = "";
        for (String x : full){
           primerCaracter += x.toLowerCase().charAt(0);
              
}   
           return primerCaracter;
    }
}
    
