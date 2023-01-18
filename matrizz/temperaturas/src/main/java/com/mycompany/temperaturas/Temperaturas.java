/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.temperaturas;

import java.util.Scanner;

/**
 *
 * @author frank
 */
public class Temperaturas {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        double suma = 0;
        int hora=0;
      
       Double promedioDia[]=new Double[7];
       System.out.println("ingresa fila");
       int fila=leer.nextInt();
       System.out.println("ingresa colu");
       int colum=leer.nextInt();
        String dias[]={"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};
      Double matriz[][]=new Double[fila][colum];
      for(int j=0;j<matriz.length;j++){
          suma=0;
          for(int i=0;i<matriz[0].length;i++){
              matriz[i][j]=Math.random()*65-15;
              suma+=matriz[i][j];
          }
        promedioDia[j]=suma/24;
      }
        System.out.println("Promedio de la temperatura los dias de la semana\n");
       for(int j=0;j<7;j++){
              System.out.println(dias[j]+" = "+promedioDia[j]);
              
    }
       System.out.println(" ");
       System.out.println("Ingresa una hora");
        int i=leer.nextInt();
       double promedioHora=0;
       int suma2=0;
       for(int j=0;j<7;j++){
         suma2+=matriz[i][j];
       }
       System.out.println(" ");
       promedioHora=suma2/7;
        System.out.println("Promedio de la temperatura de los dias de la semana a las: "+i);
       
              System.out.println("Promedio: "+promedioHora);

}
}
