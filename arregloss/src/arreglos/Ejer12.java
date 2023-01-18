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
public class Ejer12 {

    void quicksort(double vector[], int izq, int der) {
        double pivote, temp;
        int i = izq, j = der;
        pivote = vector[(int) ((izq + der) / 2)]; //Podría ser vector[(izq+der) div 2]
        do {
            while (vector[i] < pivote) {
                i++;
            }
            while (vector[j] > pivote) {
                j--;
            }
            if (i <= j) {
                temp = vector[i];
                vector[i] = vector[j];
                vector[j] = temp;
                i++;
                j--;
            }
        } while (i <= j);
        if (izq < j) {
            quicksort(vector, izq, j);
        }
        if (i < der) {
            quicksort(vector, i, der);
        }
    }

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int e[] = new int[100], op = 0, nt, i, suma = 0, hom = 0, j, aux;
        String s[] = new String[100], n[] = new String[100], menu = "", nm = "";
        double su[] = new double[100], ms = 0, pro = 0;
        boolean sw = false;
        menu += "MENU \n"
                + "1)Mostrar el nombre del trabajador que tiene el sueldo más alto y el promedio del sueldo de todos los trabajadores redondeado a dos decimales\n"
                + "2)Indicar el número de trabajadores mayores entre 20 y 30 años que son hombres\n"
                + "3) Ordenar la lista de trabajadores por medio del sueldo de mayor a menor\n"
                + "4)Mostrar la lista de empleados\n"
                + "5)Salir\n"
                + "\n";
        System.out.println("digite numero de trabajadores");
        nt = leer.nextInt();
        for (i = 1; i <= nt; i++) {
            System.out.println("ingrese nombre del trabajador");
            n[i] = leer.next();
            System.out.println("ingrese su sexo[M/H]");
            s[i] = leer.next().toLowerCase();
            System.out.println("ingrese su edad");
            e[i] = leer.nextInt();
            System.out.println("ingrese su sueldo");
            su[i] = leer.nextDouble();
            suma = (int) (suma + su[i]);
            if (e[i] >= 20 && e[i] <= 30) {
                if (s[i].equals("h")) {
                    hom = hom + 1;
                }
            }
        }

        do {
            System.out.println(menu);
            op = leer.nextInt();
            switch (op) {
                case 1:
                    ms = 0;
                    for (i = 1; i <= nt; i++) {
                        if (su[i - 1] > ms) {
                            ms = su[i];
                            nm = n[i];

                        }
                        pro = suma / nt;
                    }

                    System.out.println("Empleado con mayor sueldo: " + nm);
                    System.out.println("Sueldo: " + ms);
                    System.out.println("el promedio de el sueldo de todos los empleados es: " + pro);
                    break;
                case 2:
                    System.out.println("numero de trabajadores entre 20 y 30 años: " + hom);
                    break;
                case 3:

                    for (i = 0; i <= (nt - 1); i++) {
                        for (j = 0; j < (nt - 1); j++) {
                            if (su[j] > su[j + 1]) {
                                aux = (int) su[j];
                                su[j] = su[j + 1];
                                su[j + 1] = aux;
                            }
                        }
                    }
                    for (i = 0; i < nt; i++) {
                        System.out.println("");
                        System.out.println(su[i] + " - " + n[i]);

                    }
                    break;
                case 4:

                    System.out.println("lista de trabajadores: ");
                    for (i = 1; i <= nt; i++) {
                        System.out.println("nombre de el trabajador");
                        System.out.print("| " + n[i] + " |");
                        System.out.print("\n");

                    }
                    break;
            }
        } while (op != 5);
    }
}
