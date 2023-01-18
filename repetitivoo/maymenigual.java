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
public class maymenigual {
    public static void main(String[] args){
        Scanner leer=new Scanner(System.in);
        
        String ciudad, menu = "";
        double monto, mt=0, mrpc, rpc, ntdc, L = 0, C = 0, A = 0, T = 0, CH = 0,p1=0,p2=0,p3=0,p4=0,p5=0;
        int I, N, op, i, n = 0, d1 = 0, d2 = 0, d3 = 0, d4 = 0, d5 = 0;
        System.out.println("ingrese numero de personas a donar");
        n=leer.nextInt();
        menu += "elija ciudad de donde proviene la donacion\n"
                + "[1]. LIMA\n"
                + "[2]. CUZCO\n"
                + "[3]. AREQUIPA\n "
                + "[4]. TACNA\n"
                + "[5]. CHICLAYO\n"
                + "[6]. SALIR\n"
                + "\n\n";
        for (i = 1; i <= n; i++) {
            do {
                System.out.println(menu);
                op = leer.nextInt();
                switch (op) {
                    case 1:
                        System.out.println("CIUDAD LIMA");
                        System.out.println("ingrese monto donado");
                        monto = leer.nextDouble();
                        L = L + monto;
                        d1 = d1 + 1;
                        break;
                    case 2:
                        System.out.println("CIUDAD CUZCO");
                        System.out.println("ingrese monto donado");
                        monto = leer.nextDouble();
                        C = C + monto;
                        d2 = d2 + 1;
                        break;
                    case 3:
                        System.out.println("CIUDAD AREQUIPA");
                        System.out.println("ingrese monto donado");
                        monto = leer.nextDouble();
                        A = A + monto;
                        d3 = d3 + 1;
                        break;
                    case 4:
                        System.out.println("CIUDAD TACNA");
                        System.out.println("ingrese monto donado");
                        monto = leer.nextDouble();
                        T = T + monto;
                        d4 = d4 + 1;
                        break;
                    case 5:
                        System.out.println("CIUDAD CHICLAYO");
                        System.out.println("ingrese monto donado");
                        monto = leer.nextDouble();
                        CH = CH + monto;
                        d5 = d5 + 1;
                        break;
                    case 6:
                        break;
                    default:
                        System.out.println("OPCION INCORRECTA");
                }
            } while (op != 6);
        }
        mt=mt+L+C+A+T+CH;
        p1=L/mt;p2=C/mt;p3=A/mt;p4=T/mt;p5=CH/mt;
        System.out.println("total monto recaudado:" + mt);
        System.out.println("\n");
        System.out.println("MONTO RECAUDADO POR CIUDAD:");
        System.out.println("MONTO LIMA:" + L);
        System.out.println("MONTO COZCU:" + C);
        System.out.println("MONTO AREQUIPA:" + A);
        System.out.println("MONTO TACNA:" + T);
        System.out.println("MONTO CHICLAYO:" + CH);
        System.out.println("\n");
        System.out.println("PORCENTAJE DE MONTO SEGUN LA CIUDAD");
        System.out.println("porsentaje monto lima"+p1);
        System.out.println("porsentaje monto cozcu"+p2);
        System.out.println("porsentaje monto arequipa"+p3);
        System.out.println("porsentaje monto tacna"+p4);
        System.out.println("porsentaje monto chiclayo"+p5);
        System.out.println("\n");
        System.out.println("DONACIONES POR CIUDAD");
        System.out.println("lima"+d1);
        System.out.println("cozcu"+d2);
        System.out.println("arequipa"+d3);
        System.out.println("tacna"+d4);
        System.out.println("chiclayo"+d5);
        
    }
}
