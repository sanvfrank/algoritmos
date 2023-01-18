/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otro;
import java.util.Scanner;
/**
 *
 * @author EQUIPO
 */
public class Otro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        char prue;
        System.out.println("ingresa un nombre");
        prue=leer.next().charAt(0);
        System.out.println("el nombre ingresado es : "+prue);
    }
    
}
