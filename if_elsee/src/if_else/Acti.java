/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acti;

import java.util.Scanner;

/**
 *
 * @author EQUIPO
 */
public class Acti {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double a,b,c,x1,x2,D = 0,R,NC;
               Scanner leer=new Scanner(System.in);
System.out.println("Digite a");
a=leer.nextDouble();
System.out.println("Digite b");
b=leer.nextDouble();
System.out.println("Digite c");
c=leer.nextDouble();
if (a==0){
   System.out.println("no es una ecuacion cuadratica");

}
else{
    D=Math.pow(b, 2)-4*a*c;

}
if (D>=0){
    x1=(-b+rc(b^2-4*a*c))/(2*a);
x2<-(-b-rc(b^2-4*a*c))/(2*a);
Escribir "X1 = ",x1;
Escribir "X2 = ",x2;
}



Fin Si
Si (D<0) Entonces
D<-D*(-1);
NC<-rc(D)/(2*a);
R<--b/(2*a);
Si (a>0) Entonces
Escribir "X1 = ",R,"+",NC,"i";
Escribir "X2 = ",R,"-",NC,"i";
Fin Si
Si (a<0) Entonces
Escribir "X1 = ",R,"+",(NC*(-1)),"i";
Escribir "X2 = ",R,"-",(NC*(-1)),"i";
Fin Si
Fin Si
Fin Si
    }
    
}
