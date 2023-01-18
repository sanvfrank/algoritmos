/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mientras;

import javax.swing.JOptionPane;

/**
 *
 * @author EQUIPO
 */
public class mq {
    public void  caps(){
        
    int num=Integer.parseInt(JOptionPane.showInputDialog("Digita un número"));
        int aux=0,sum=0;
        while(aux<num){
            sum+=aux;
            aux++;
        }
        JOptionPane.showMessageDialog(null, "La sumatoria es de: "+sum);
    }
}


