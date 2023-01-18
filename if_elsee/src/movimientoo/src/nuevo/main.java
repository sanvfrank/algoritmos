/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nuevo;

import java.util.Scanner;

/**
 *
 * @author EQUIPO
 */
public class main {
    public static void main (String[] args){
        Scanner leer=new Scanner (System.in);
        Scanner entrada=new Scanner(System.in);
  boolean x=false;
  
  do {
  System.out.print("Introduzca una accion : ");
  String d=entrada.nextLine();
  Posicion op=new Posicion(d.toUpperCase());
  op.ImprimirPos();
  if(op.saliendo()==true) {
   x=true;
   break;
  }
  
  }while(x==false);
  System.out.println("Fin");
  
 }
    }
       
        

