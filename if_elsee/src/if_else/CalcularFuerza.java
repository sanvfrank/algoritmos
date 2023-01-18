/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if_else;

import java.util.Scanner;

/**
 *
 * @author EQUIPO
 */
public class CalcularFuerza {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int m,a,di,f;
         Scanner leer=new Scanner(System.in);
         System.out.println("ingresa masa");
         m=leer.nextInt();
         System.out.println("ingresar acceleracion");
         a=leer.nextInt();
         
         f=m*a;
         
         System.out.println("fuerza es: "+f+ "(N)" );
         System.out.println("la fuerza es: "+(f*100000)+"(Dn)");
         System.out.println("la fuerza es: "+(f/9.81)+"(kgf)");
         
         
         
         
         
          if(ht>40){
          hex=ht-40;
          
          if(hex>8){
              hext=hex-8;
              hexd=hex-hext;
              vhexd=2*tarifa*hexd;
              vhext=3*tarifa*hext;
              sn=sb+vhexd+vhext;
              
  
              
          }
          else if(hex<=8){
              hext=hex-8;
              hexd=hex-hext;
              vhexd=2*tarifa*hexd;
              System.out.println("horas extras doble: "+hexd);
               System.out.println("valor total horas extras pagadas doble: "+vhexd);
                       
    
    }
    
}
    
    }
}
