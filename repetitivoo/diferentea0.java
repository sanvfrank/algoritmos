/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repetitivos;

import java.util.Scanner;

/**
 *
 * @author EQUIPO
 */
public class diferentea0 {

    public static void main(String[] args) {
        Scanner leer=new Scanner (System.in);
       int ht,i,n;
       double t,sn,sn2 = 0,t1 = 0,sb;
         System.out.println("ingrese numero de trabajadores");
       n=leer.nextInt();
       for(i=1;i<=n;i++){
            System.out.println("ingresa horas trabajadas");
       ht=leer.nextInt();
         System.out.println("ingrese tarifa horaria");
       t=leer.nextInt();
       sb=ht*t*1.15;
      
        if(ht<48 && sb>1600000 && sb<=3500000){
           sn=sb*0.90;
            System.out.println("sueldo a cobrar:  "+sn);
             System.out.println("sueldo bruto:  "+sb);
       }
        else if(ht<48 && sb>3500000){
           sn=sb*0.85;
           System.out.println("sueldo a cobrar:  "+sn);
             System.out.println("sueldo bruto:  "+sb);
       }
        else if(ht<48 && sb<=1600000 && sb<=3500000){
           System.out.println("sueldo a cobrar:  "+sb);
           
       }
      
            if(ht>48 && sb>1600000 && sb<=3500000){
                sn2=ht*t1*1.15;
                sn=sn2*0.90;
            System.out.println("sueldo a cobrar:  "+sn);
             System.out.println("sueldo bruto:  "+sb);
           }
          
       else if(ht>48 && sb>3500000){
           sn=sn2*0.85;
           System.out.println("sueldo a cobrar:  "+sn);
             System.out.println("sueldo bruto:  "+sb);
       }
       else if(ht>48 && sb<=1600000 && sb<=3500000){
           t1=t*1.25;
            sn=ht*t1*1.15;
           System.out.println("sueldo a cobrar  "+sn);
             System.out.println("sueldo bruto:  "+sb);
       }
           
           
       }
       }
      
       
    }

