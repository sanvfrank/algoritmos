/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notas;

import javax.swing.JOptionPane;

/**
 *
 * @author EQUIPO
 */
public class prueba {
   float not1,not2,not3,def;
   String nom=" ";
   
   public void caps (){
      
           nom= JOptionPane.showInputDialog("ingresar nombre de estudiante");
       not1=Float.parseFloat(JOptionPane.showInputDialog("ingresar nota 1"));
        not2=Float.parseFloat(JOptionPane.showInputDialog("ingresar nota 2"));
         not3=Float.parseFloat(JOptionPane.showInputDialog("ingresar nota 3"));
         
        
   }
   
   public void processo (){
        def = (float) ((not1 * 0.30) + (not2 * 0.30) + (not3 * 0.40));
         if(def>=3.0){
             
       JOptionPane.showMessageDialog(null,"el estudiante "+nom+" gano con nota: "+def);
       }
         else{
             JOptionPane.showMessageDialog(null,"el estudiante "+nom+" perdio con nota: "+def);
         }
      
           
       }
   }
   
   

