/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j;

import java.util.Scanner;

/**
 *
 * @author EQUIPO
 */
public class J {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner (System.in);
       int Z[],op = 0,i,N = 0,da,dato,x,nuevo,k;
       Z = new int[100];
       String menu="",re="";
       boolean sw,band;
       
       menu+="MENU DE OPCIONES \n"
       +     "1)Leer datos\n"
       +     "2) Incertar datos\n"
       +     "3)Modificar datos\n"
       +     "4)Eliminar datos\n"
       +     "5)Mostrar datos\n"
       +     "6) Salir\n";
       sw=false;
       do{
           System.out.println(menu);
           op=leer.nextInt();
           switch(op){
               case 1: 
                   if(N==0){
                       System.out.println("Ingresa dimenciones del arreglo");
                       N=leer.nextInt();
                       for(i=1;i<=N;i++){
                           System.out.println("Ingresa un dato");
                           Z[i]=leer.nextInt();
                       }
                           sw=true;
                       } else{
                       System.out.println("Solo puede ingresar N una vez");
                   }break;
                   
               case 2:
                   if(sw){
                       if(N<100){
                       do{
                       System.out.println("Ingresa un dato");
                       dato=leer.nextInt();
                       N++;
                       Z[N]=dato;
                        System.out.println("Desea seguir ingresando datos? S o N ");
                        re=leer.next().toUpperCase();
                       }while(re.equals("S"));
                       }
                      
                   }else{
                       System.out.println("Debe Leer datos primero");
                   }break;
                   
               case 3:
                   if(sw){
                       System.out.println("Ingrese dato a modificar");
                       x=leer.nextInt();
                        System.out.println("Porque dato desea modificar a: |"+x+"| ?");
                       nuevo=leer.nextInt();
                       i=1;
                       band=false;
                       while(i<=N){
                           if(Z[i]==x){
                               band=true;
                               Z[i]=nuevo;
                           }else{
                               i++;
                           }
                       
                         if(band){
                               System.out.println("Valor modificado");
                               System.out.println("Vector resultante: ");
                               for(i=1;i<=N;i++){
                                   System.out.print("| "+Z[i]+" |");
                                   System.out.println("");
                               }
                               }else{
                               System.out.println("Dato no encontrado");
                           }
                           }
                   
                   }else{
                       System.out.println("Debe Leer datos primero");
                   }break;
                   
               case 4:
                   if(sw){
                        System.out.println("Ingrese dato a eliminar: ");
                        x=leer.nextInt();
                        i=1;
                        band=false;
                        while(i<=N){
                            if(Z[i]==x){
                                band=true;
                                k=i;
                                while(k<=N){
                                    Z[k]=Z[k+1];
                                    k++;
                                }
                                Z[N]=-1;
                                    N--;
                            }else{
                                i++;
                            }
                        }
                        if(band){
                             System.out.println("Vector eliminado...");
                              System.out.println("Vector resultante: ");
                              for(i=1;i<=N;i++){
                                   System.out.print("| "+Z[i]+" |");
                                   System.out.print("");
                               }
                        }else{
                             System.out.println("dato no encontrado");
                            }
                   }else{
                         System.out.println("Debe Leer datos primero");
                   }break;
                   
               case 5: 
                    System.out.println("Vector resultante: ");
                              for(i=1;i<=N;i++){
                                   System.out.print("| "+Z[i]+" |");
                                   System.out.print("\n");
                               }break;
               case 6: 
                    System.out.println("Se termino");
                    break;
               default:      
                    System.out.println("Ingrese una opcion valida");
           }
       
    }while(op!=6);
    }
    
}
