/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actalgypro3;

import java.util.Scanner;

/**
 *
 * @author alejo
 */
public class Ejer11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int Pf[] = new int[100], C[] = new int[100], op = 0, i = 0, N = 0, da, dato, x, nuevo, k, ap = 0, de = 0, pa, pd, u = 0, j, aux,temp;
        String Z[] = new String[100], nuevo1, nom;
        String menu = "", re = "";
        boolean sw, band;

        menu += "MENU DE ARREGLOS\n"
                + "1)Ingresar datos de los estudiantes\n"
                + "2)Mostrar los datos de los estudiantes\n"
                + "3)Porcentajes de estudiantes aprobados y desaprobados\n"
                + "4)Modificar datos\n"
                + "5)Eliminar la lógica de Datos\n"
                + "6)Mostrar Lista de Estudiante\n"
                + "7)Ordenar los datos de los estudiantes por su código de forma ascendente\n"
                + "8)Buscar un dato\n"
                + "9)Mostrar la nota más baja y las más alta con la información de los estudiantes correspondiente\n"
                + "10)Salir\n"
                + "\n";
        sw = false;
        do {
            System.out.println(menu);
            op = leer.nextInt();
            switch (op) {
                case 1:
                    if (N == 0) {
                        System.out.println("Ingresa dimenciones del arreglo");
                        N = leer.nextInt();
                        for (i = 1; i <= N; i++) {
                            System.out.println("digite el nombre del estudiante");
                            Z[i] = leer.next();
                            System.out.println("ingrese nota del promedio final");
                            Pf[i] = leer.nextInt();
                            System.out.println("ingrese codigo del estudiante");
                            C[i] = leer.nextInt();

                        }
                        sw = true;
                    } else {
                        System.out.println("Solo puede ingresar N una vez");
                    }
                    break;

                case 2:
                    if (sw) {

                        System.out.println("Vector resultante: ");
                        for (i = 1; i <= N; i++) {
                            System.out.println("nombre de el estudiantes");
                            System.out.print("| " + Z[i] + " |");
                            System.out.print("\n");
                            System.out.println("su promedio es");
                            System.out.print("| " + Pf[i] + " |");
                            System.out.print("\n");
                            System.out.println("su codigo es");
                            System.out.print("| " + C[i] + " |");
                            System.out.print("\n");
                        }
                    } else {
                        System.out.println("Debe Leer datos primero");
                    }
                    break;

                case 3:
                    if (sw) {
                        for (i = 1; i <= N; i++) {

                            if (Pf[i] > 3.0) {
                                ap = ap + 1;
                            } else if (Pf[i] < 3.0) {
                                de = de + 1;
                            }

                        }
                        System.out.println("numero aprobados" + ap);
                        System.out.println("numero desaprobados" + de);
                        pa = ap / N * 100;
                        pd = de / N * 100;
                        System.out.println("porcentaje de aprobados es: " + pa);
                        System.out.println("porcentaje de desaprobados es: " + pd);
                    } else {
                        System.out.println("Debe Leer datos primero");
                    }
                    break;

                case 4:
                    if (sw) {
                        System.out.println("Ingrese nota a modificar");
                        x = leer.nextInt();
                        System.out.println("Porque nota desea modificar a: |" + x + "| ?");
                        nuevo = leer.nextInt();
                        i = 1;
                        band = false;
                        while (i <= N) {
                            if (Pf[i] == x) {
                                band = true;
                                Pf[i] = nuevo;
                            } else {
                                i++;
                            }
                        }
                        if (band) {
                            System.out.println("nota modificada");
                            System.out.println("Vector resultante: ");
                            for (i = 1; i <= N; i++) {
                                System.out.print("| " + Pf[i] + " |");
                                System.out.println("");
                            }
                            System.out.println("Ingrese nombre a modificar");
                            nom = leer.next();
                            System.out.println("Porque nombre desea modificar a: |" + nom + "| ?");
                            nuevo1 = leer.next();
                            i = 1;
                            band = false;
                            while (i <= N) {
                                if (Z[i].equals(nom)) {
                                    band = true;
                                    Z[i] = nuevo1;
                                } else {
                                    i++;
                                }
                            }
                            if (band) {
                                System.out.println("nombre modificado");
                                System.out.println("Vector resultante: ");
                                for (i = 1; i <= N; i++) {
                                    System.out.print("| " + Z[i] + " |");
                                    System.out.println("");
                                }
                            } else {
                                System.out.println("Dato no encontrado");
                            }
                        }
                    } else {
                        System.out.println("Debe Leer datos primero");
                    }
                    break;
                case 5:
                    if (sw) {
                        System.out.println("Ingrese dato a eliminar: ");
                        x = leer.nextInt();
                        i = 1;
                        band = false;
                        while (i <= N) {
                            if (Z[i] == X) {
                                band = true;
                                k = i;
                                while (k <= N) {
                                    Z[k] = Z[k + 1];
                                    k++;
                                }
                                
                                N--;
                            } else {
                                i++;
                            }
                        }
                        if (band) {
                            System.out.println("Vector eliminado...");
                            System.out.println("Vector resultante: ");
                            for (i = 1; i <= N; i++) {
                                System.out.print("| " + Z[i] + " |");
                                System.out.print("");
                            }
                        } else {
                            System.out.println("dato no encontrado");
                        }
                    } else {
                        System.out.println("Debe Leer datos primero");
                    }
                    break;

                case 6:
                    if (sw) {

                        System.out.println("lista de estudiantes: ");
                        for (i = 1; i <= N; i++) {
                            System.out.println("nombre de el estudiante");
                            System.out.print("| " + Z[i] + " |");
                            System.out.print("\n");
                        }
                    } else {
                        System.out.println("Debe Leer datos primero");
                    }
                    break;
                case 7:
for(i=0;i<N;i++){
    System.out.println("ingresa un numero");
    C[i]=leer.nextInt();
    
    }
    for(i=0;i<=(N-1);i++){
      for(j=0;j<(N-1);j++){
          if(C[j]>C[j+1]){
              aux=C[j];
              C[j]=C[j+1];
              C[j+1]=aux;
          }
      }  
    }
    for(i=0;i<N;i++){
        System.out.println("");
        System.out.println(C[i]+" - ");
        
    }
                default:
                    System.out.println("Ingrese una opcion valida");
        } 

        } while (op != 10);
    }
}
