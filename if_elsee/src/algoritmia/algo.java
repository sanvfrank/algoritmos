/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmia;

import javax.swing.JOptionPane;

/**
 *
 * @author EQUIPO
 */
public class algo {
   float pc,sc,pf;
    public void caps(){
       pc = Float.parseFloat(JOptionPane.showInputDialog("ingresa nota del primer parcial"));
       sc = Float.parseFloat(JOptionPane.showInputDialog("ingresa nota del segundo parcial"));
    }
    public void processo(){
        pf=(float) ((3-(pc*0.3+sc*0.3))/0.4);
        
        
        if (pf<=5.0){
            JOptionPane.showMessageDialog(null,"tiene posibilidad de pasar solo necesita un "+pf );
        }
        else{
            JOptionPane.showMessageDialog(null,"no tiene posibilidad de pasar ya que necesita un "+pf);
        }
    }
    
}
