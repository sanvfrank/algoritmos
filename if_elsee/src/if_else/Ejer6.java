/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paciente;
import java.util.Scanner;
/**
 *
 * @author EQUIPO
 */
public class Ejer6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int dias,e;
       double vt = 0;
               Scanner leer=new Scanner(System.in);
               System.out.println("ingrese su tipo de enfermedad");
               e=leer.nextInt();
               if(e<11 || e>14){
        System.out.println("enfermedad invalida");
    }
     else{
                   System.out.println("digite los dias que estuvo internado");
                   dias=leer.nextInt();
                   if(e==11){
                       vt=dias*200;
                   }
                   if(e==12){
                       vt=dias*350;
                   }
                   if(e==13){
                       vt=dias*420;
                   }
                   if(e==14){
                       vt=dias*550;    
                   }
                   else{
                       
                   }
                   System.out.println("su valor total es de: "+vt);
         }
    }
    
}
