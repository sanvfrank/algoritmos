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
public class horas {
    public static void main(String[] args){
        Scanner leer=new Scanner(System.in);
        int hd,th = 0, t, i=1;
        float st = 0,ta;
        System.out.println("ingrese numero de trabajadores a revisar");
        t=leer.nextInt();
        while(i<=t){
            System.out.println("ingrese horas trabajadas");
            hd=leer.nextInt();
             System.out.println("ingrese tarifa horaria");
            ta=leer.nextInt();
            th=hd*6;
            st=th*ta;
            i++;
            System.out.println("total de horas trabajadas durante la semana: "+th);
        System.out.println("sueldo total: "+st);
        }
        
        
    }
}
