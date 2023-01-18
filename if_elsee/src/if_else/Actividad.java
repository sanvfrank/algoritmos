/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if_else;

import javax.swing.JOptionPane;

/**
 *
 * @author EQUIPO
 */
public class Actividad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int altura,numasterisco,i;
       altura=Integer.parseInt(JOptionPane.showInputDialog("ingresa la altura de tu escalera"));
       for(numasterisco=1;numasterisco<=altura;numasterisco++){
           for(i=0;i<numasterisco;i++){
               System.out.print("*");
           }
           
            System.out.println("");
       }
       
    }
    
}
