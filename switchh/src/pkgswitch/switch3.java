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
public class switch3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int hijos;
        System.out.println("ingresar el numero de hijos");
        hijos = leer.nextInt();
        switch (hijos) {
            case 0:
                System.out.println("no le corresponde asignacion familiar");
                break;
            case 1:
                System.out.println("le corresponde 50 soles");
                break;
            case 2:
                System.out.println("le corresponde 75 soles por sus dos hijos");
                break;

            default:
                System.out.println("le corresponde 100 soles");
        }

    }
}
