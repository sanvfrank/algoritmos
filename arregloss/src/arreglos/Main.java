/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

import java.util.Scanner;

/**
 *
 * @author EQUIPO
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer=new Scanner(System.in);
       int n,i;
      String []vector2=new String[10];
      String []vector3=new String[10];
      float []vector1=new float[10];
      for(i=1;i<=3;i++){
          System.out.println("Ingresar nombre ");
          vector2[i]=leer.next();
          System.out.println("Ingresar notas [0-10]");
          vector1[i]=leer.nextFloat();
          if(vector1[i]>=0 && vector1[i]<=10){
              if(vector1[i]>=0 && vector1[i]<=4.99){
              vector3[i]="Suspenso";
          }
              else if (vector1[i]>=5 && vector1[i]<=6.99){
              vector3[i]="bien";
          }
              else if(vector1[i]>=7 && vector1[i]<=8.99){
              vector3[i]="notable";
          }
              else if(vector1[i]>=9 && vector1[i]<=10){
              vector3[i]="Sobresaliente";
          }
              
          }else{
              System.out.println("ingrese notas en el rango correcto: ");
          }
         
      }
      for(i=1;i<=3;i++){
           System.out.println("nombre del estudiante: "+vector2[i]);
          System.out.println("nota: "+vector1[i]);
          System.out.println(""+vector3[i]);
      }
}
}
