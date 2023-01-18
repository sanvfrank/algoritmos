 
package edad;

import javax.swing.JOptionPane;

/**
 *
 * @author EQUIPO
 */
public class ed {
    int edad;
    public void laedad (){
       edad= Integer.parseInt(JOptionPane.showInputDialog("ingresar la edad"));
        
    }
    public void processo(){
        if(edad>=18 && edad!=30){
            JOptionPane.showMessageDialog(null,"es mayor de edad");
            
        }
        else if(edad==30){
        JOptionPane.showMessageDialog(null,"buena edad");
    }
        else {
            JOptionPane.showMessageDialog(null,"es menor de edad");
        }
    }
    
}
   

