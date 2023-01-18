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
public class menu_anidado {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int op,op2;
        double arealat,areat,areab,altura,v,ab2,ab1,abM,abm,r,g,R;

        do {

            System.out.println("[1] Elegir el sólido.\n"
                    + "[2]Calcular y mostrar el área del sólido.\n"
                    + "[3]Calcular y mostrar el volumen del sólido.\n"
                    + "[4] Salir.");
            System.out.println("ingrese una opcion");
            op = leer.nextInt();
            switch (op) {
                case 1:
                    do {

                        System.out.println("[1] Prisma.\n"
                                + "[2] Pirámide.\n"
                                + "[3] Tronco de Pirámide.\n"
                                + "[4] Cilindro.\n"
                                + "[5] Cono.\n"
                                + "[6] Tronco de cono.\n"
                                + "[7] Esfera.\n"
                                + "[8] Volver a Menú Principal");

                        System.out.println("ingrese una opcion");
                        op = leer.nextInt();
                       
                        switch (op) {
                            case 1: 
                                do{
                                     System.out.println("has elegido el prisma");
                                    System.out.println("[1] Elegir el sólido.\n"
                    + "[2]Calcular y mostrar el área del sólido.\n"
                    + "[3]Calcular y mostrar el volumen del sólido.\n"
                    + "[4] Salir.");
                                  
                                   op = leer.nextInt();
                                  switch(op){
                                      case 1: 
                                       case 2: 
                                         System.out.println("ingresa area de sus caras leterales");
                                        arealat=leer.nextDouble();
                                        System.out.println("ingresa area base");
                                        areab=leer.nextDouble();
                                        areat=arealat+2*areab;
                                        System.out.println("area total del prisma es : "+areat);
                                        break;
                                        
                                    case 3: 
                                         System.out.println("ingresa area base");
                                        areab=leer.nextDouble();
                                        System.out.println("ingresa altura del prisma");
                                        altura=leer.nextDouble();
                                        v=areab*altura;
                                        System.out.println("el volumen del prisma es: "+v);
                                        break;
                            
                                  }
                                }
                                   while(op!=8);
                                 
                                
                                
                                
                             case 8:   
                                 break;
                             default: 
                                 System.out.println("opcion invalidaa");
                        }
                        
                                
                                  
                        
                        
                        
                    } while (op!=8);
                    

               

                case 4:
                    break;
                default:
                    System.out.println("opcion invalidad");
            }

        } while (op != 4);
    }

}
