/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package no;

import java.util.Scanner;

/**
 *
 * @author EQUIPO
 */
public class No {

    /**
     * @param args the command line arguments
     */
    public static void main(String arsg[]){
         Scanner leer=new Scanner(System.in);
        System.out.println("*************************************************************************************************");
        System.out.println("bienvenido al programa donde podra verificar su sueldo,cantidad de empleados y muschas cosas mas ");
        System.out.println("*************************************************************************************************");
        System.out.println();
        System.out.println();
        String nombre = null,apellido = null,modeloe = null,cargo = null;
        int n=0,ter,teg,tea,te,teo,cm12,ce1225,cm25,ht;
        double vh=0,bonificacion=0,sb=0 ,sn = 0;
        System.out.println("numero de empleados");
        n=leer.nextInt();
        ter=0;
        teg=0;
        tea=0;
        te=0;
        teo=0;
        cm12=0;
        ce1225=0;
        cm25=0;
        for(int i=1; i<=n;i++){
            System.out.println("digite el nombre del empleado "+i);
            nombre=leer.next().toLowerCase();
            System.out.println("digite el apellido del empleado "+i);
            apellido=leer.next().toLowerCase();
            System.out.println("digite el numero de horas trabajadas  del empleado "+1);
            ht=leer.nextInt();
            System.out.println("digite el cargo de empleo del empleado "+i);
            cargo=leer.next().toLowerCase();
            System.out.println("digite el modelo de empleo del  empleado "+i);
            modeloe=leer.next().toLowerCase();
            switch(cargo){
                case "gerente" :
                    teg= teg+1;
                    sb=ht*20;
                    break;
                case "administrativo" :
                    tea=tea+1;
                    sb=ht*10;
                    break;
                case "jefe":
                    te=te+1;
                    sb=ht*8;
                    break;
                case "operario":
                    teo=teo+1;
                    sb=ht*3.5;
                    break;
                default : System.out.println("cargo no encontrado");
            
            }switch(modeloe){
                case "tiempo completo":
                    bonificacion=sb*0.2;
                    break;
                case "tiempo parcial":
                    bonificacion=sb*00.5;
                    break;
                default: System.out.println("modelo de trabajo no identificado");
                
            } sn=bonificacion;
            if(sn<1200){
                cm12=cm12+1;
                
            }else if(sn>=1200&&sn<=2500){
                ce1225=ce1225+1;
 
            }else{
                cm25=cm25+1;
            }
        }
        String lista=nombre+apellido+cargo+modeloe+sn+sb+bonificacion;
            System.out.println("total empleado registrado"+n);
            System.out.println("total empleado como gerente"+teg);
            System.out.println("total empleado como administrador"+tea);
            System.out.println("total empleado como jefes"+te);
            System.out.println("total empleado como operario"+teo);
            System.out.println("total empleado que ganan mas de 1200 dolares"+cm12);
            System.out.println("total empleado que ganan entre 1200 y 2500 dolares "+ce1225);
            System.out.println("total empleado  que cagan mas de 2500 dolares "+cm25);
            System.out.println("lista de empleados"+lista);
    }
}
