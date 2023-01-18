
package prueba;

import javax.swing.JOptionPane;

/**
 *
 * @author EQUIPO
 */
public class pruebaa {
    

    int a, b, c,mayor,medio,pequeño;

    public void cap_A() {
        a = Integer.parseInt(JOptionPane.showInputDialog("Ingresa número A: "));
    }

    public void cap_B() {
        b = Integer.parseInt(JOptionPane.showInputDialog("Ingresa número B: "));
    }

    public void cap_c() {
        c = Integer.parseInt(JOptionPane.showInputDialog("Ingresa número c: "));
    }
    
    public void procceso(){
       if (a<b && a<c){
           JOptionPane.showMessageDialog(null,"el menor es a");
       }
       else if (b<a && b<c){
           JOptionPane.showMessageDialog(null,"el menorr es b");
       }
       else if (c<a && c<b){
           JOptionPane.showMessageDialog(null,"el menor es c");
       }
    }
}
