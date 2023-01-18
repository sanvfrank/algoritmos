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
public class Ejer4 {

    public static void main(String args[]) {
        Scanner leer = new Scanner(System.in);
        int i, a = 0, b = 1, c, n;
        int vector[] = new int[100];

        System.out.println("Ingrese la dimencion fibonacci: ");
        n = leer.nextInt();

        for (i = 0; i < n; i++) {
            vector[i] = a;
            System.out.println(+vector[i]);

            c = a + b;
            a = b;
            b = c;
        }
    }
}
