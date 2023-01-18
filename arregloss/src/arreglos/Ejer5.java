/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actalgypro3;

import java.util.Scanner;

/**
 *
 * @author Jdms
 */
public class Ejer5 {
    public static void main(String args[]){
     Scanner leer =new Scanner(System.in);
    int arreglo[]={4,1,5,2,3};
    int dato;
    boolean band=false;
    System.out.println("Ingrese numero a buscar;");
    dato=leer.nextInt();
    int i=1;
    while(i<=6 && band==false){
        if(arreglo[i]==dato){
            band=true;
        }
        i++;
    }
    if(band==false){
        System.out.println("El numero no se pudo encontrar");
        
    }else{
        System.out.println("el numero ha sido encontrado en la posicion: "+(i-1));
    }
}
}
