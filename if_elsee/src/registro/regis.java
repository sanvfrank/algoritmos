
package registro;

import javax.swing.JOptionPane;

/**
 *
 * @author EQUIPO
 */
public class regis {
    String nom,sex,es;
    int ed;
    
    public void cap(){
      nom=  JOptionPane.showInputDialog("ingrese el nombre");
       ed= Integer.parseInt(JOptionPane.showInputDialog("ingrese la edad"));
       sex= JOptionPane.showInputDialog("ingrese el sexo");
       es= JOptionPane.showInputDialog("ingrese el estado civil");
    }
    public void processo(){
        if(sex=h && es=cs && ed>40){
            JOptionPane.showMessageDialog(null,"su nombres es"+nom);
            
        }
        else
            if (sex=m && es=s && ed>50){
                  JOptionPane.showMessageDialog(null,"su nombres es"+nom);
            }
            else{
                 JOptionPane.showMessageDialog(null,"no cumple las condiciones");
            }
    }
}
