/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeje;
import java.util.Scanner;
/**
 *
 * @author EQUIPO
 */
public class Jeje {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        double dias,e;
        int r=1,t;
        int vt;
       
        while(r<=1){
             System.out.println("digite su tipo de enfermedad");
        System.out.println(" ");
        e=leer.nextDouble();
        
         if(e<11 || e>14){
                t=0;
                while(t<1){
                    System.out.println("enfermedad invalida");
                    System.out.println(" ");
                    t=2;
                }
            }
            else{
                r=2;
                System.out.println("digite los dias que estuvo internado");
                dias=leer.nextDouble();
                if(e==11){
                    vt=(int) (dias*200);
                }
                else if(e==12){
                    vt=(int) (dias*350);
                }
                else if(e==13){
                    vt=(int) (dias*420);
                }
                else{
                    vt=(int) (dias*550);
                }
                
                  System.out.println("su valor total es de: "+vt);     
            }
        }
           
    }
    
}
