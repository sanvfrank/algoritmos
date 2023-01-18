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
public class Nuevo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double precio, vt = 0, tamaño = 0;
        String tipo;
        int v, i = 1, e = 1, b;

        System.out.println("digite el precio del kilo de uva");
        precio = leer.nextDouble();
        tipo = leer.nextLine().toLowerCase();
        while (i <= 1) {
            System.out.println("digite el tipo");
            tipo = leer.nextLine().toLowerCase();

            if ((!"a".equals(tipo)) && (!"b".equals(tipo))) {
                v = 0;
                while (v < 1) {
                    System.out.println("tipo incorrecto");
                    v = 2;
                }

            } else {
                i = 2;
            }
        }

        while (e <= 1) {
            System.out.println("digite el tamaño");
            tamaño = leer.nextDouble();

            if (tamaño < 1 || tamaño > 2) {
                b = 0;
                while (b < 1) {
                    System.out.println("tamaño incorrecto");
                    b = 2;
                }
            } else {

                e = 2;
            }

        }
        if ("a".equals(tipo) && tamaño == 1) {
            vt = precio * 1.20;
        } else if ("a".equals(tipo) && tamaño == 2) {
            vt = precio * 1.30;
        } else if ("b".equals(tipo) && tamaño == 1) {
            vt = precio * 0.30;
            vt = precio - vt;
        } else if ("b".equals(tipo) && tamaño == 2) {
            vt = precio * 0.50;
            vt = precio - vt;

        }
        System.out.println("la ganancia total obtenido es de: $" + vt);
    }

}
