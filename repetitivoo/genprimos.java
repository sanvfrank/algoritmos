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
public class genprimos {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean esPrimo;
        int contador = 0;
        int cantidad;
        int[] numero = new int[100];
        System.out.print("Ingresa N numeros primos a generar");
        cantidad = scanner.nextInt();     
        scanner.close();
        for (int n = 2; contador < cantidad; n ++) {
            esPrimo = true;
            for (int i = 2; i <= Math.sqrt(n) && esPrimo; i ++) {
                if ((n % i) == 0) {
                    esPrimo = false;
                }
            }
            if (esPrimo) {
                numero[contador] = n;
                contador ++;
            } 
        }
        System.out.println("numeros primos ");
        for (int n = contador - 1; n >= 0; n --) {
            System.out.println(+ numero[n]);
        }
    }
}


   