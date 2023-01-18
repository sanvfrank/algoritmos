/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menuarreglos;

import java.util.Scanner;

/**
 *
 * @author EQUIPO
 */
public class Menuarreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
       
		int c,n;
		String nombre;
		String vector[];
		int x;
                System.out.println("ingrese dimenciones del arreglo ");
                n=leer.nextInt();
		vector = new String[n];
		for (x=1;x<=n;x++) {
			System.out.println("ingresa un nombre");
			vector[x-1] =leer.next();
		}
		System.out.println("ingrese el nombre a buscar");
		nombre = leer.next();
		c = 0;
		for (x=1;x<=n;x++) {
			if (nombre.equals(vector[x-1])) {
				System.out.println("el nombre "+nombre+" se encuentra en la posicion "+x);
				c = c+1;
			}
		}
		if (c==0) {
			System.out.println("el nombre "+nombre+" no se encuentra");
		}
	}


}

      

    

