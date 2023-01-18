/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudiantes;

import java.util.Scanner;

/**
 *
 * @author EQUIPO
 */
public class Estudiantes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
       int canalu,i;
       System.out.println("Ingrese cantidad de alumnos: ");
        canalu=leer.nextInt();
        double[] notas[]=new double[canalu][3];
        double suma=0,prom=0,progeneral=0,pmenor=0,sumtp = 0;
        for(i=0;i<canalu;i++){
             System.out.println("");
            System.out.println("Alumno N:"+(i+1)+" Ingrese examen parcial: ");
            notas[i][0]=leer.nextDouble();
            System.out.println("Alumno N:" + (i + 1) + " Ingrese examen final: ");
            notas[i][1]=leer.nextDouble();
            System.out.println("Alumno N:"+(i+1)+" Ingrese promedio de practicas: ");
            notas[i][2]=leer.nextDouble();
            
             if(notas[i][0]>notas[i][1]){
                  System.out.println("");
                System.out.println("Su nota de examen mas alta fue de: "+notas[i][0]);
            }
            else{
                 System.out.println("");
                 System.out.println("Su nota de examen mas alta fue de: "+notas[i][1]);
            }
              suma=notas[i][0]+notas[i][1]+notas[i][2];
            prom=suma/3;
            sumtp=sumtp+prom;
            System.out.println("El promedio del alumno "+(i+1)+" es: "+prom);
            System.out.println("");
            if(prom<4.0){
                
                
            }
            if(prom<progeneral){
                pmenor=pmenor+1;
            }
             
        }
        progeneral=sumtp/canalu;
             System.out.println("El promedio general de todos los estudiantes fue de: "+progeneral);
             System.out.println("Numero de alumnos con un promedio menor a 4.0: "+pmenor);
    }
}

      