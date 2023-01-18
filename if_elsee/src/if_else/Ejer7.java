/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paciente;


import javax.swing.JOptionPane;

/**
 *
 * @author EQUIPO
 */
public class Ejer7 {
    public static void main(String[] args){
       
        int i,repeticiones;
        repeticiones=Integer.parseInt(JOptionPane.showInputDialog("ingresa las veces que quieres que se repita"));
       
       i=1;
       while(i<=repeticiones){
           JOptionPane.showMessageDialog(null,"i= "+i);
           i++;
       }
        
    }
}
