/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package o2;

import java.util.Scanner;

/**
 *
 * @author EQUIPO
 */
public class O2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Scanner sc=new Scanner(System.in);
      
     
        Scanner leer = new Scanner(System.in);
        String menu = "",resp="";
        String []nom=new String[100];
        int []ced=new int[100];
        int op = 0;
        int N = 0, i, Z[], Val, X, Nuevo, k; //Declaramos un vector de tipo entero
        Z = new int[100]; //Dimensionamos un vector con 100 posicicones.
        boolean sw, Band;
        menu += "  MENU PRINCIPAL \n"
                + "[1]. LEER DATOS EN EL VECTOR\n"
                + "[2]. INSERTAR DATOS EN EL VECTOR\n"
                + "[3]. MODIFICAR DATOS EN EL VECTOR\n"
                + "[4]. ELIMINAR DATOS EN EL VECTOR\n"
                + "[5]. IMPRIMIR DATOS EN EL VECTOR\n"
                + "[6]. SALIR\n"
                + "DIGITE UNA OPCION: \n"
                + "\n\n";
        sw = false;
        do {
            System.out.println(menu);
            op = leer.nextInt();
            switch (op) {
                case 1:
                    if (N == 0) {
                        System.out.println("Digite hasta qué número");
                        N = leer.nextInt();
                        for (i = 1; i <= N; i++) {
                            System.out.println("Digite nombre en la posición [" + i + "]: ");
                            nom[i] = leer.next();
                            System.out.println("Digite seguro en la posición [" + i + "]: ");
                            Z[i] = leer.nextInt();
                             System.out.println("Digite su cedula [" + i + "]: ");
                            ced[i] = leer.nextInt();
                        }
                        sw = true;
                    } else {
                        System.out.println("Sólo se leen datos una vez.");
                    }
                    break;
                case 2:
                    if (sw) 
                        if (N < 100) {
                            do {
                                System.out.println("Digite el valor a ingresar: ");
                                Val = leer.nextInt();
                                N++;
                                Z[N] = Val;
                                System.out.println("Deseas ingresar más datos [S/N]: ");
                                resp = leer.next().toUpperCase();
                            } while (resp.equals("S"));
                        }
                     else {
                        System.out.println("Por favor debe ingresar un número");
                    }
                    break;
                case 3:
                    if (sw) {
                        System.out.println("Digite el número a modificar: ");
                        X = leer.nextInt();
                        System.out.println("Por cuál número deseas modficar a " + X + " : ");
                        Nuevo = leer.nextInt();
                        i = 1;
                        Band = false;
                        while (i <= N) {
                            if (Z[i] == X) {
                                Z[i] = Nuevo;
                                Band = true;
                            } else {
                                i++;
                            }
                        }
                        if (Band) {
                            System.out.println("Los datos han sido modificados.");
                            System.out.println("Este es el vector resultante.");
                            for (i = 1; i <= N; i++) {
                                System.out.print("|" + Z[i] + "|");
                            }
                            System.out.println("");
                        } else {
                            System.out.println("El dato " + X + " no está en el vector.");
                        }
                    } else {
                        System.out.println("Por favor debe ingresar un número");
                    }
                    break;
                case 4:
                    if (sw) {
                        System.out.println("Qué número de cedula deseas eliminar?: ");
                        X = leer.nextInt();
                        i = 1;
                        Band = false;
                        while (i <= N) {
                            if (ced[i] == X) {
                                Band = true;
                                k = i;
                                while (k <= N) {
                                    Z[k] = Z[k + 1];
                                    ced[k]=ced[k+1];
                                    nom[k]=nom[k+1];
                                    k++;
                                }
                                Z[N] = -1;
                                N--;
                            } else {
                                i++;
                            }
                        }
                        if (Band) {
                            System.out.println("Los datos han sido eliminados.");
                            System.out.println("Este es el vector resultante.");
                            for (i = 1; i <= N; i++) {
                                System.out.print("|" + ced[i] + "|");
                            }
                            System.out.println("");
                        } else {
                            System.out.println("El dato " + X + " no está en el vector.");
                        }
                    } else {
                        System.out.println("Por favor debe ingresar un número");
                    }
                    break;
                case 5:
                    if (sw) {
                        System.out.println("Este es el vector:");
                        for (i = 1; i <= N; i++) {
                            System.out.print("|" + Z[i] + "|");
                        }
                        System.out.println("");
                    } else {
                        System.out.println("Por favor debe ingresar un número");
                    }
                    break;
                case 6:
                    System.out.println("Nos vemos...");
                    break;
                default:
                    System.out.println("Opción errada.");
                    break;
            }
        } while (op != 6);
    }
}


