/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgswitch;

import java.util.Scanner;

/**
 *
 * @author EQUIPO
 */
public class switch2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int año, mes;
        System.out.println("ingresar año");
        año = leer.nextInt();
        System.out.println("ingresar mes");
        mes = leer.nextInt();

        switch (mes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case12:
                System.out.println("año "+año);
                 System.out.println("31 dias");
                break;

            case 4: case 6: case 9: case 11:
                System.out.println("febrero del "+año);
                System.out.println("28 dias");
                break;

            
            default: System.out.println("error ");
        }
    }
}
