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
public class Ejer10 {
    public static void main(String[]args){
        Scanner leer=new Scanner(System.in);
        double precio,vt = 0,tamaño = 0;
        String tipo;
        
        System.out.println("digite el precio del kilo de uva");
        precio=leer.nextDouble();
        System.out.println("digite el tipo");
        tipo=leer.nextLine().toLowerCase();
        while(!"a".equals(tipo)&& (!"b".equals(tipo))){
            
        }
        if((!"a".equals(tipo))&& (!"b".equals(tipo))){
            System.out.println("tipo incorrecto");
        }
        else{
            System.out.println("digite el tamaño");
            tamaño=leer.nextDouble();
            
        }
        if(tamaño<1 || tamaño>2){
            System.out.println("tamaño incorrecto");
        }
        else if("a".equals(tipo)&& tamaño==1){
            vt=precio*1.20;
        }
        if("a".equals(tipo)&& tamaño==2){
            vt=precio*1.30;
        }
        if("b".equals(tipo)&& tamaño==1){
            vt=precio*0.30;
            vt=precio-vt;
        }
        if("b".equals(tipo)&& tamaño==2){
            vt=precio*0.50;
            vt=precio-vt;
            
        }
        System.out.println("la ganancia total obtenido es de: $"+vt);
        
    }
}
