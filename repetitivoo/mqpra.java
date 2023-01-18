/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repetitivo;

import java.util.Scanner;

/**
 *
 * @author EQUIPO
 */
public class mqpra {
    public static void main(String[] args) {
           Scanner leer=new Scanner(System.in);
           int n,i,c;
           double x,e,f,pot1;
           System.out.println("ingresar las repeticiones de la serie");
           n=leer.nextInt();
           System.out.println("ingresar el valor de x");
           x=leer.nextDouble();
           e=0;
           for(i=1;i<=n;i++){
               c=1;
               f=1;
               while(c<=i){
                   f=f*c;
                   c++;
               }
               
               e=e+(Math.pow(x, i))/f;
               
           }
            System.out.println("el resultado de la funcion es: "+e+1+x);
    }
     
}
