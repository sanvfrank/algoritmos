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
public class switch5 {
    public static void main(String[] args){
        Scanner leer=new Scanner(System.in);
        int hts,pagoh,total;
        String clase ;
        System.out.println("ingresa horas trabajadas a la semana");
        hts=leer.nextInt();
        System.out.println("ingrese la clase a la que pertenece");
        clase=leer.next();
        switch(clase){
            case "A":
              pagoh=25;
              total=hts*pagoh;
               System.out.println("su sueldo es: "+total);
               break;
               
            case "B":
                pagoh=20;
                total=hts*pagoh;
                 System.out.println("su sueldo es: "+total);
                 break;
                 
            case "C":
                pagoh=15;
                total=hts*pagoh;
                System.out.println("su sueldo es: "+total);
                break; 
            case "D":
                 pagoh=10;
                total=hts*pagoh;
                System.out.println("su sueldo es: "+total);
                break;
                
            default:  System.out.println("clase incorrecta");
        }
    }
}
