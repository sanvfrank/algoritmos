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
public class primo {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int costo, n = 0, i, np, s = 0, costos = 0, costod = 0, costom = 0, d = 0, m = 0, total, suma = 0, t = 0, promedio = 0, promedio1 = 0, promedio2 = 0, st = 0, dt = 0, mt = 0, alquiler = 0, alquiler1 = 0, alquiler2 = 0;
        String tp;
        System.out.println("digite el numero de personas que se van a hospedar  ");
            np = leer.nextInt();
            System.out.println("que tipo de habitacion de sea *simple,Doble o matrimonial");
            tp = leer.next().toLowerCase();
        for (i = 1; i <= np; i++) {
            
            if (tp.equals("simple")) {
                costo = 20000;
                costos = costos + costo;
                s = s + 1;
                st = st + np;
                alquiler = costos * st;
            } else if (tp.equals("doble")) {
                costo = 40000;
                costod = costod + costo;
                d = d + 1;
                dt = dt + np;
                alquiler1 = costod * dt;
            } else if (tp.equals("matrimonial")) {
                costo = 100000;
                costom = costom + costo;
                m = m + 1;
                mt = mt + np;
                alquiler2 = costom * mt;
            }
            t = s + d + m;
            promedio = costos / t;
            promedio1 = costod / t;
            promedio2 = costom / t;

        }
        costo = costos + costod + costom;

        System.out.println("costo por alquiler :" + alquiler + alquiler1 + alquiler2);
        System.out.println("Total de Alquileres por tipo de habitación \n Costo Simple" + costos + "\n Costo Doble" + costod + " \n Costo Matrimonial \n" + costom);
        System.out.println("Reporte porcentual de alquileres por tipo de habitación \n promedio Simple" + promedio + "\n promedio Doble" + promedio1 + " \n promedio Matrimonial \n" + promedio2);
        System.out.println("Reporte de personas hospedadas por tipo de habitación \n hospedaje Simple" + st + "\n hospedaje Doble" + dt + " \n hospedaje Matrimonial \n" + mt);
        System.out.println("Reporte de montos acumulados por tipo de habitación \n montos Simple" + alquiler + "\n hospedaje Doble" + alquiler1 + " \n hospedaje Matrimonial \n" + alquiler2);

    }

}
