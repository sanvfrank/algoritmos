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
public class pago {
    public static void main(String[] args){
        Scanner leer=new Scanner(System.in);
        int x = 0,mes = 0;
        while(x<=20){
            if(x==1){
               mes=10;

            }
            else{
                mes=mes*2;
            }
            System.out.println("el valor a pagar del mes: "+x+" es: "+mes);
            x++;
        }
        System.out.println("el valor total pagado fue: "+mes);
        
        
    }
        
    }
