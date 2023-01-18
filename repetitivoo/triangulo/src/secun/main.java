/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secun;

import java.util.Scanner;

/**
 *
 * @author EQUIPO
 */
public class main {
    public static double superficie(isoceles ob[]){
        int i,indice = 0;
       double area;
        
       area= ob[0].obarea();
        for(i=1;i<ob.length;i++){
            if(ob[i].obarea()>area){
                area=ob[i].obarea();
                
            }
        }
        return(area);
    }
    public static void main(String[] args){
        Scanner leer=new Scanner (System.in);
        double lado1,base;
        int i,N;
        int areamayor;
        System.out.println("Numero de triangulos: ");
        N=leer.nextInt();
        isoceles ob[]=new isoceles[N];
        for(i=0;i<N;i++){
            System.out.println("Ingresa lados del triangulo: ");
        lado1=leer.nextInt();
        System.out.println("Ingresa base del triangulo: ");
        base=leer.nextInt();
        ob[i]=new isoceles(lado1,base);
        
        
        }
        for(i=0;i<N;i++){
             System.out.println("Triangulo: "+(i+1));
            System.out.println("el perimetro es: "+ob[i].perimetro());
         System.out.println("el area es: "+ob[i].obarea());
           System.out.println("");
        }
        
        System.out.println("area del triangulo con mayor superficie: "+superficie(ob));
    }
}
