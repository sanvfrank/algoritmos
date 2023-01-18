/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgswitch;
import java.util.Scanner;
/**
 *
 * @author EQUIPO
 */
public class switch6 {
    public static void main(String[] args){
        Scanner leer=new Scanner(System.in);
        double cn,pi,s,num,numm;
        String o;
        System.out.println("ingresa operacion a realizar:");
        System.out.println("cn=cubo de un numero");
         System.out.println("pi= ¿numero par o impar?");
          
        o=leer.nextLine();
        
           
          switch(o){
              case "cn":
                   System.out.println("ingresa un numero");
                   num=leer.nextDouble();
                   num=Math.pow(num, 3);
                    System.out.println("su elevado al cubo es: "+num);
                    break;
              case "pi":
                   System.out.println("ingresa un numero");
                   numm=leer.nextDouble();
                   if(numm%2==0){
                       System.out.println("el numero es par");
                   }
                   else{
                       System.out.println("el numero no es par");
                       
                   }
                   break;
              case "s":
                  
                  break;
              default:System.out.println("opcion incorrecta");
                  
          }
    }
}
