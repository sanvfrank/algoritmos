
package bienvenido;

import javax.swing.JOptionPane;


/**
 *
 * @author EQUIPO
 */
public class frank {
  int lado,area;

   public void varia()  {
       lado= Integer.parseInt(JOptionPane.showInputDialog("ingrese el lado"));
       
   }
   public void proceso(){
       area=(int) Math.pow(lado,4);
   }
   
   public void salida(){
       JOptionPane.showMessageDialog(null,"el area del cuadrado es"+ area );
   }
}
