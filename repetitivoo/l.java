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
public class l {
    public static void main(String[] args){
         Scanner leer = new Scanner (System.in);
       int i,n,ne,cv,cedula,tp,h = 0,s=0,nv=0,ntv=0,op=0,MAX = 0,nu=0;
       double sueldo=850000, tvc = 0,total,rt = 0;
       String nombre,menu="",lista="",lista2="",lista3="",nn="";
       System.out.println("Digite el numero de empleados");
       n= leer.nextInt();
      menu+= "\n"
              +  "1) correr mas rapido\n"
              + "2) saltar mas rapido\n"
              + "3) tener mas resistencia\n"
              + "4) pelear mejor\n"
              + "5) ser mas alto\n";
                
       for(i=1;i<=n;i++){
           System.out.println("Digite la cedula del empleado");
           cedula= leer.nextInt();
           System.out.println("Digite los nombres y apellidos del empleado");
           nombre= leer.next();
           System.out.println("Digite el numero total de ventas");
           nv=leer.nextInt();
           System.out.println("Digite el valor total de ventas");
           total=leer.nextInt();
           System.out.println("Digite el codigo de venta 1-Hardware o 2-Software");
           tp= leer.nextInt();
           
           if(tp==1){
              tvc=total*0.04;
              h=h+nv;
              if(MAX < nv){
                MAX = nv;
               nn=nombre;
               MAX=MAX;
                }
           }else if (tp==2){
               tvc=total*0.02;
               s=s+nv;
           }
           ntv=ntv+nv;
           rt=rt+total;
           sueldo=sueldo+tvc;

           nn=nombre;
           nu=nv;
           lista2 += "---------------------------------------\n"
           + "Nombre y apellido del empleado " + nombre + "\n"
           + "Ventas realizadas: " + nv + "\n"
           + "---------------------------------------"
           + "\n\n";
           lista += "---------------------------------------\n"
           + "Nombre y apellido del empleado " + nombre + "\n"
           + "Cedula del empleado: " + cedula + "\n"
           + "Sueldo + Comisiones " + sueldo + "\n"
           + "---------------------------------------"
           + "\n\n";
       }
       do{
        System.out.println(menu);
         op=leer.nextInt();
         switch(op){
             case 1:
                 System.out.println("La recaudación total es de "+rt);
                 System.out.println("Cantidad de ventas de hardware " +h);
                 System.out.println("Cantidad de ventas de software " +s);
                 break;
             case 2:
                 System.out.println(lista2);
                 break;
             case 3:
                 System.out.println(lista);
                 break;
             case 4:
                 System.out.println(""+nn);
                  System.out.println(""+MAX);
                 break;
         }
       }while(op != 5);
    }
}
    
        
    