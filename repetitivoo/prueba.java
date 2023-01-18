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
public class prueba {
    public static void main(String[] args){
         Scanner leer = new Scanner(System.in);
        double a,v;
    int op = 0, op2=0, lados=0 ,volumen=0 , altura=0;
    boolean sw;
    String menu="",submenu="";
    menu+="Menu Principal \n"
           +"[1]. Elegir el solido \n"
           +"[2]. Calcular y mostrar el area del solido \n"
           +"[3]. Calcular y mostar el volumen del solido \n"
           +"[4]. Salir \n"
           +"Digite una opciÃ³n \n"
           +"\n\n";
    submenu+="Sub menu \n"
            +"[1] Prisma. \n"
            +"[2] PirÃ¡mide.\n"
            +"[3] Tronco de PirÃ¡mide.\n"
            +"[4] Cilindro.\n"
            +"[5] Cono.\n"
            +"[6] Tronco de cono.\n"
            +"[7] Esfera.\n"
            +"[8] Volver a MenÃº Principal.\n"
           +"[9]. Salir \n"
           +"Digite una opciÃ³n \n"
           +"\n\n";
     sw=false;
     do{
        System.out.println(menu); 
        op= leer.nextInt();
        switch(op){
            case 1:
                do{
                System.out.println(submenu);
                op2= leer.nextInt();
                switch(op2){
                    case 1:
                      System.out.println("digite la suma de los lados ");   
                       lados =leer.nextInt();
                        System.out.println("digite la suma de la base" );   
                        v=leer.nextInt();
                       a = lados+v;
                        System.out.println("el area de la prisma es igual a  "+a); 
                         System.out.println("digite la altura"); 
                         altura=leer.nextInt();
                         volumen=(int) (a*altura);
                        break;
                    case 2:
                        
                                
                                
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
                        break;
                    case 7:
                        break;
                    case 8:
                        break;
                    case 9:
                        break;
                }
                
                }while(op2 !=9);
                
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
     }while(op !=4);
    }
}
