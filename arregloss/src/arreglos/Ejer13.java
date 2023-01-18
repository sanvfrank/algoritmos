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
public class Ejer13 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int ID[] = new int[100], edad[] = new int[100], op = 0, N = 0, i, hombre = 0, d = 0, f = 0, m = 0, actual, j, aux,oro = 0,plata = 0,bronce = 0;
        String menu = "", direc[] = new String[100], nombre[] = new String[100], email[] = new String[100], ct[] = new String[100], sexo[] = new String[100], a[] = new String[100];
        double tel[] = new double[100];
        menu += "MENU \n"
                + "1) Ingresar datos de los socios, el sistema debe validar todos los datos de entrada por el usuario\n"
                + "2)Mostrar los datos de los socios\n"
                + "3) Indicar el número de socios mayores 50 y 80 de edad que son hombres\n"
                + "4)Indicar el número de socios cuyo nombre comienza con la letra “D”\n"
                + "5) Mostrar cuántos socios son de sexo femenino y masculino\n"
                + "6) Ordenar los datos de los socios por su código de forma ascendente. (Utilice el algoritmo de Inserción para ordenarlos).\n"
                + "7) Buscar un dato. (Para buscar los datos de un socio, se debe hacer por su código)\n"
                + "8)Mostrar el número de socios por categorías\n"
                + "9) salir\n"
                + "\n";
        do {
            System.out.println(menu);
            op = leer.nextInt();
            switch (op) {
                case 1:
                    System.out.println("ingrese numero de socios");
                    N = leer.nextInt();
                    for (i = 1; i <= N; i++) {
                        System.out.println("ingrese nombre del socio");
                        nombre[i] = leer.next().toLowerCase();
                        a[i] = nombre[i];
                        char charAt = a[i].charAt(0);
                        if (a[i].equals("d")) {
                            d = d + 1;
                        }
                        System.out.println("ingrese su sexo[M/F]");
                        sexo[i] = leer.next().toLowerCase();
                        if (sexo[i].equals("m")) {
                            m = m + 1;
                        } else if (sexo[i].equals("f")) {
                            f = f + 1;
                        }
                        System.out.println("ingrese su edad");
                        edad[i] = leer.nextInt();
                        System.out.println("ingrese su telefono");
                        tel[i] = leer.nextInt();
                        System.out.println("ingrese su direccion");
                        direc[i] = leer.next();
                        System.out.println("ingrese su Email");
                        email[i] = leer.next();
                        System.out.println("ingrese su categuria de socio[ORO, PLATA Y BRONCE]");
                        ct[i] = leer.next();
                        if(ct[i].equals("oro")){
                            oro=oro+1;
                        }else if(ct[i].equals("plata")){
                            plata=plata+1;
                        }else if(ct[i].equals("bronce")){
                            bronce=bronce+1;
                        }
                        System.out.println("ingrese su ID");
                        ID[i] = leer.nextInt();
                        if (edad[i] >= 50 && edad[i] <= 80) {
                            if (sexo[i].equals("h")) {
                                hombre = hombre + 1;
                            }
                        }
                    }
                    break;
                case 2:
                    for (i = 1; i <= N; i++) {
                        System.out.println("datos socios");
                        System.out.println("nombre del socio");
                        System.out.print("| " + nombre[i] + " |");
                        System.out.print("\n");
                        System.out.println("sexo de el socio");
                        System.out.print("| " + sexo[i] + " |");
                        System.out.print("\n");
                        System.out.println("edad del socio");
                        System.out.print("| " + edad[i] + " |");
                        System.out.print("\n");
                        System.out.println("telefono del socio");
                        System.out.print("| " + tel[i] + " |");
                        System.out.print("\n");
                        System.out.println("direccion de el socio");
                        System.out.print("| " + direc[i] + " |");
                        System.out.print("\n");
                        System.out.println("Email del socio");
                        System.out.print("| " + email[i] + " |");
                        System.out.print("\n");
                        System.out.println("categoria del socio");
                        System.out.print("| " + ct[i] + " |");
                        System.out.print("\n");
                    }
                    break;
                case 3:
                    System.out.println("numero de socios hombres entre 50 y 80: " + hombre);
                    break;
                case 4:
                    System.out.println("numero de socios coyo nombre comienza con d: " + d);
                    break;
                case 5:
                    System.out.println("cantidad de socios masculinos: " + m);
                    System.out.println("cantidad de socios femenino: " + f);
                    break;
                case 6:
                    for (i = 1; i < 20; i++) {
                        actual = ID[i];
                        for (j = i; j > 0 && ID[j - 1] > actual; j--) {
                            ID[j] = ID[j - 1];
                        }
                        ID[j] = actual;
                    }
                    System.out.println("|" + ID[i] + "|");
                    break;
                case 7:
                    for (i = 0; i < N; i++) {
                        System.out.println("ingresa un numero");
                        ID[i] = leer.nextInt();

                    }
                    for (i = 0; i <= (N - 1); i++) {
                        for (j = 0; j < (N - 1); j++) {
                            if (ID[j] > ID[j + 1]) {
                                aux = ID[j];
                                ID[j] = ID[j + 1];
                                ID[j + 1] = aux;
                            }
                        }
                    }
                    for (i = 0; i < N; i++) {
                        System.out.println("");
                        System.out.println(ID[i] + " - ");

                    }
                    break;
                case 8:
                    System.out.println("cantidad de socios clase oro: "+oro);
                     System.out.println("cantidad de socios clase plata: "+plata);
                      System.out.println("cantidad de socios clase bronce: "+bronce);
                    break;
            }

        } while (op != 9);
    }
}
