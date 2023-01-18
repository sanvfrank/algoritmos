/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sueldos;

import java.util.Scanner;

/**
 *
 * @author EQUIPO
 */
public class Sueldos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      double ht,tarifa,hex,hexd,hext,sb,sn,vhexd,vhext,hedoble;
       Scanner leer=new Scanner(System.in);
      System.out.println("ingresa horas trabajadas");
      ht=leer.nextDouble();
      System.out.println("ingresa tarifa por hora");
      tarifa=leer.nextDouble();
      sb=ht*tarifa;
      if(ht>40){
          hex=ht-40;
          
          if(hex>8){
              hext=hex-8;
              hexd=hex-hext;
              vhexd=2*tarifa*hexd;
              vhext=3*tarifa*hext;
              sn=sb+vhexd+vhext;
              System.out.println("total horas extras: "+hex);
              System.out.println("total horas extras pagadas doble: "+hexd);
              System.out.println("total horas extras pagadas triple: "+hext);
              System.out.println("detallado valor total horas extras ");
              System.out.println("valor total horas extras pagadas doble: "+vhexd);
              System.out.println("valor total horas extras pagadas triple: "+vhext);
              System.out.println("valor total horas extras: "+(vhexd+vhext));
              System.out.println("valor sueldo bruto: "+sb);
              System.out.println("valor sueldo neto: "+sn);
  
              
          }
          
          else if(hex<=8){
              hext=hex-8;
              hexd=hex-hext;
              vhexd=2*tarifa*hex;
              System.out.println("horas extras doble: "+hex);
               System.out.println("valor total horas extras pagadas doble: "+vhexd);
                       
    
    }
    
}
      else{
          sb=ht*tarifa;
          sn=sb;
           System.out.println("valor sueldo neto: "+sn);
      }
    }
    }
