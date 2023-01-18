
package calcularcompra;

import javax.swing.JOptionPane;
public class Compra {
    int vrl_compra,vlr_a,valor_u;
    public void comp(){
        vlr_a=Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de productos"));
        valor_u=Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor"));
        
        
    }
    public void processo(){
        vrl_compra=vlr_a*valor_u;
    }
    public void muestra(){
        JOptionPane.showMessageDialog(null,"el valor de la compra es : "+vrl_compra);
    }
}
