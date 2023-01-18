
package posi_nega;

import javax.swing.JOptionPane;

/**
 *
 * @author EQUIPO
 */
public class posi {
    int num,posi,neg;
    public void cap_num(){
        num=Integer.parseInt(JOptionPane.showInputDialog("ingresa el numero"));
    
    }
    public void processo(){
        if (num<0){
            neg= num*(-1);
            JOptionPane.showMessageDialog(null,"el equivalente de "+num+" a positivo es:" +neg );
        }
        
        else{
            
           posi=num*(-1);
            JOptionPane.showMessageDialog(null,"el equivalente de "+num+" a negativo es:" +posi );
        }
    }
    
    }
    
    
        
    

}
