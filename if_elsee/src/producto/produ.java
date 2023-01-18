
package producto;

import javax.swing.JOptionPane;

/**
 *
 * @author EQUIPO
 */
public class produ {
    String nom,tip;
    float preci,des,descu;
    
    
    public void caps(){
        nom=JOptionPane.showInputDialog("ingresa el nombre");
       tip= JOptionPane.showInputDialog("ingresa el tipo de producto");
    }
    public void caps2(){
      preci= Float.parseFloat(JOptionPane.showInputDialog("ingresa el precio")); 
    }
    public void processo(){
        if (preci>100){
          des=(float) (preci*0.25);
           preci=preci-des;
           JOptionPane.showMessageDialog(null,"el total a pagar de " +nom+ " tipo " +tip+ "\ncon 25% ddesc es :" +preci);
        }
        else{
            if (preci<100 && preci>=80){
                descu=(float)(preci*0.06);
                preci=preci-descu;
                JOptionPane.showMessageDialog(null,"el total a pagar de " +nom+ " tipo " +tip+ "\ncon 6% ddesc es :" +preci);
            }
            else{
                if (preci<80){
                   JOptionPane.showMessageDialog(null,"no tiene descuento"); 
                }
                
            }
        }
    }
}
