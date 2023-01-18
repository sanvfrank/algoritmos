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
public class forr {
    public static void main(String[] args){
        Scanner leer=new Scanner(System.in);
        String nombre,apellido,motoemp,cargo;
        double descuento,monto,ht,bonificacion,vh,sb = 0,sn;
        int teg=0,tea=0,tej=0,ter=0,cm12=0,ce1225=0,cm25=0,teo=0,n,i;
        
        System.out.println(" digitar numeros de empleados");
        n=leer.nextInt();
        for(i=1;i<=n;i++){
            System.out.println(" digite el nombre de empleado");
            nombre=leer.next();
            System.out.println(" digite el apellido del empleado");
            apellido=leer.next();
            System.out.println(" digite las horas trabajadas");
            ht=leer.nextDouble();
             System.out.println(" digite su cargo");
            cargo=leer.next();
             System.out.println(" digite su tipo de contrato");
            motoemp=leer.next();
            switch(cargo){
                case "gerente":
                    teg=teg+1;
                    sb=ht*20;
                    break;
                    
                    
                     case "administrativo":
                    tea=tea+1;
                     sb=ht*10;
                    break;
                     case "jefe":
                    tej=tej+1;
                     sb=ht*8;
                    break;
                     case "operario":
                    teo=teo+1;
                     sb=ht*35;
                    break;
                     default: System.out.println("cargo inexistente");
                     
                     switch(motoemp){
                         case "tc":
                             bonificacion=sb*0.2;
                             break;
                         case "tp":
                             bonificacion=sb*0.05;
                             break;
                         default: 
                             bonificacion=0;
                             System.out.println("tipo de contrato no ");
                             
                     }
                     sn=sb+bonificacion;
                     
                    if(sn<1200){
                        cm12=cm12+1;
                        
                    }
                    else if(sn>=1200 && sn<=2500){
                        ce1225=ce1225+1;
                    }
                    else{
                        cm25=cm25*1;
                    }
                    
            }
           
        }
         System.out.println("total empleados registrados: "+n);
            System.out.println("total empleados como gerente: "+teg);
             System.out.println("total empleados como administrativo: "+tea);
             System.out.println("total empleados registrados como jefe: "+tej);
              System.out.println("total empleados registrado como operario: "+teo);
               System.out.println("total empleados que ganan menos de 1200: "+cm12);
                 System.out.println("total empleados que ganan entre 1200 y 2500: "+ce1225);
                   System.out.println("total empleados que ganan mas de 2500: "+cm25);
    }
}
