/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if_else;

import java.util.Scanner;

/**
 *
 * @author EQUIPO
 */
public class Calcularpromedio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double pc,sc,cf,t2,t1t2,pc1;
       
        Scanner leer=new Scanner(System.in);
        System.out.println("Digite la nota del primer corte");
        pc1=leer.nextDouble();
        
        
        pc=pc1*0.30;
        sc=(1.5-pc);
        sc=sc/0.3;
        t2=sc*0.3;
        t1t2=pc+t2;
        
        
        cf=((3.0-(t1t2))/0.4);
        

        
        if(sc<=5.0 && cf<=5.0){
           
           System.out.println("para pasar necesita sacar: \n"+sc+" en el segundo parcial\n"+cf+" en el tercer parcial\n"+pc1+" x 0.3 + "+sc+" x 0.3 + "+cf+" x 0.4 = 3.0");
        }
        else if(sc>5.0){
            System.out.println("no tiene posibilidad de pasar necesita en segundo parcial:\n"+sc+ "nota mayor a lo permitido ");
        }
        else if(sc>5.0 && cf>5.0){
            System.out.println("no tiene posibilidad de pasar necesita en:\nsegundo parcial: "+sc+ "\ntercer parcial: "+cf+"\nNOTAS MAYOR A LO PERMITIDO");
        }
        else if(cf>5.0){
            System.out.println("no tiene posibilidad de pasar necesita en tercer parcial:\n"+cf+ "nota mayor a lo permitido ");
        }
          
        
    }
    
}
