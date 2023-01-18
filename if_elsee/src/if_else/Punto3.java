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
public class Punto3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer=new Scanner(System.in);
        String color = null,modelo;
        double precio=0,tiempo = 0,edad = 0;
        System.out.println("Digite el modelo de su auto [a,b,c]");
        modelo=leer.nextLine().toLowerCase();
      
            System.out.println("Digite el color de su auto [claro,oscuro]");
        color=leer.nextLine().toLowerCase();
        
       
                System.out.println("Digite su edad");
                edad=leer.nextDouble();
            
        System.out.println("Digite el tiempo que lleva conduciendo");
                tiempo=leer.nextDouble();
                if("a".equals(modelo) && "claro".equals(color)){
                    precio=3800;
            }
                if("a".equals(modelo) && "oscuro".equals(color)){
                    precio=4340;
            }
                if("b".equals(modelo) && "claro".equals(color)){
                   precio=4930; 
            }
                if("b".equals(modelo) && "oscuro".equals(color)){
                    precio=5600;
            }
                if("c".equals(modelo) && "claro".equals(color)){
                    precio=7570;
            }
                if("c".equals(modelo) && "oscuro".equals(color)){
                    precio=8250;
            }
                if(edad<20){
                precio=precio*1.25;
        }
                if(edad>=20 && edad<=30){
                    precio=precio*1.1;
                }
                if(edad>=31 && edad<=65){
                        precio=precio;
                }
                if(edad>65){
                            precio=precio*1.15;
                        }
                if(tiempo<2) {
            precio=precio*1.25; 
            }  
                System.out.println("Su modelo de auto es: "+modelo);
         System.out.println("Su color de auto es: "+color);
         System.out.println("Su precio total es: "+precio);
                
    }
    
}
