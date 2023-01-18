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
public class switch4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double at, ac, aci, ar, b, a, l1, l2, r;
        String op;
        System.out.println("¿que operacion deseas realizar?");
        System.out.println("at=area de un triangulo");
        System.out.println("ac=area de un cuadrado");
        System.out.println("aci=area de un circulo");
        System.out.println("ar=area de un rectangulo");
        op = leer.nextLine();

        switch (op) {
            case "at":
                System.out.println("ingresa base");
                b = leer.nextDouble();
                System.out.println("ingresa altura");
                a = leer.nextDouble();
                at = b * a;
                System.out.println("el area del triangulo es: " + at);
                break;

            case "ac":
                System.out.println("ingresa lado 1");
                l1 = leer.nextDouble();
                System.out.println("ingresa lado 2");
                l2 = leer.nextDouble();
                ac = l1 * l2;
                System.out.println("el area del cuadrado es: " + ac);
                break;

            case "aci":
                System.out.println("ingresa radio");
                r = leer.nextDouble();
                aci = Math.PI * Math.sqrt(r);
                System.out.println("el area del circulo es: " + aci);
                break;
            case "ar":
                System.out.println("ingresa base");
                b = leer.nextDouble();
                System.out.println("ingresa altura");
                a = leer.nextDouble();
                ar = b * a;
                System.out.println("el area del rectangulo es: " + ar);
                break;
            default:
                System.out.println("no se puede realizar esa operacion");
        }

    }
}
