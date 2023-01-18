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
public class Actividad3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float horas_t,tarifa,salario,boni,horas_e,salario_t,rec,salariode;
        Scanner leer=new Scanner(System.in);
        System.out.println("ingresa horas trabajadas");
        horas_t=leer.nextFloat();
        System.out.println("ingresa tarifa horaria");
         tarifa=leer.nextFloat();
         salario=horas_t*tarifa;
      
          
         if(horas_t>=40 && horas_t<48){
             System.out.println("sueldo neto: "+salario);
             
         }
         else if(horas_t>48&&salario>1659){
             
             horas_e=horas_t-40;
             salario_t=(horas_e*tarifa)+(40*tarifa);
             rec=(float) (salario_t*1.20);
             
             System.out.println("salario bruto con recargo de 20%: neto :"+rec);
              salariode=(float) (rec-0.15);
             System.out.println("salario bruto del 20% con descuento del 15% :neto: "+salariode);
         }
         else{
              if(horas_t<40&&salario>1659){
             salariode=(float) (salario-0.15);
             System.out.println("salario bruto con descuento del 15% :neto: "+salariode);
         }
         }
         
    }
    
}
