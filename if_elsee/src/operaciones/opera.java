
package operaciones;

import javax.swing.JOptionPane;

/**
 *
 * @author EQUIPO
 */
public class opera {
    float n1,n2,n3,s,n,m,d;
    public void n1(){
        n1=Float.parseFloat(JOptionPane.showInputDialog("ingresar primer numero"));
        n2=Float.parseFloat(JOptionPane.showInputDialog("ingresar segundo numero"));
    }
   public void processo (){
       s=(n1+n2);
       n=(n1-n2);
       m=(n1*n2);
       d=(n1/n2);
   }
   public void mostrar(){
       JOptionPane.showMessageDialog(null,"la suma es"+s);
       JOptionPane.showMessageDialog(null,"la resta es"+n);
       JOptionPane.showMessageDialog(null,"la multiplicacion es"+m);
       JOptionPane.showMessageDialog(null,"la divicion es"+d);
   }
    
}
