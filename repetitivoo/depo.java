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
public class depo {
    public static void main(String[] args){
        double num,ahorro = 0,dep,i = 0,p = 0;
        int x = 0;
        Scanner leer=new Scanner(System.in);
        
        
        while(i<=3){
         x=x+1;
            System.out.println("deposito del mes: "+x);
        dep=leer.nextDouble();
        p=p+dep;
        
         System.out.println("en este mes lleva ahorrado: "+p);
        ahorro= ahorro+p;
        i++;
        
        }
          System.out.println("en este año lleva ahorrado: "+ahorro);
        
    }
}
