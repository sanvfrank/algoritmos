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
public class Ejer9 {
    public static void main(String[]args){
        Scanner leer=new Scanner(System.in);
        int personas,tarifa;
        System.out.println("ingrese el numero de personas que asistiran");
        personas=leer.nextInt();
        tarifa=9500;
        if(personas>200 && personas<=300){
            tarifa=tarifa-1000;
            
        }
        else if(personas>300){
            tarifa=tarifa-2000;
        }
        System.out.println("su tarifa es de: $"+tarifa);
    }
}
