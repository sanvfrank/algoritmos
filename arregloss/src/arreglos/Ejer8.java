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
public class Ejer8 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        int n = 0,i,c = 0;
        float notas[],mayor;
        notas=new float[1000000];
        System.out.println("Digite el numero de estudiantes");
        n=leer.nextInt();
        for(i=1;i<=n;i++){
            System.out.println("Estudiante N: "+i);
            System.out.println("Ingrese su nota final: ");
            notas[i]=leer.nextFloat();           
        }
        mayor=0;
                
        for(i=1;i<=n;i++){
             if(notas[i]>mayor){
                mayor=notas[i];
                c++;
                if(mayor==notas[i]){
                     c++;
                }
                }
                   
              }
        System.out.println("la nota final mas alta fue : "+mayor+" y la consiguieron : "+c+" estudiantes");
    }
}
