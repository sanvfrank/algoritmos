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
public class Ejer8 {
    public static void main(String[] args){
        Scanner leer=new Scanner(System.in);
        double precio,descuento,vt;
        System.out.println("digite el precio de su traje");
        precio=leer.nextDouble();
        if(precio>250000){
            descuento=precio*0.15;
            vt=precio-descuento;
            System.out.println("su descuento de 15% y su valor descontado es de: $"+descuento);
            System.out.println("su valor total es de: $"+vt);
        }
        else{
            descuento=precio*0.08;
            vt=precio-descuento;
            System.out.println("su descuento es de 8% y su valor descontado es de: $"+descuento);
            System.out.println("su valor total es de: $"+vt);
                    
        }
        
    }
}
