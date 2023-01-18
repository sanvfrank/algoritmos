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
public class letras {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double base, ex = 0, re = 0, x = 1, i = 1;

        System.out.println("ingresar exponente");
        ex = leer.nextDouble();

        System.out.println("ingresar base");
        base = leer.nextDouble();

        while (i <= ex) {
            x = x * base;

            i++;

        }
        System.out.println("el resultado elevado es: " + x);

    }

}
