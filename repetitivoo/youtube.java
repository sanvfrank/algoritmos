package yutu;

import javax.swing.JOptionPane;

/**
 *
 * @author EQUIPO
 */
public class youtube {

    int i, num, des, f, total, sum = 0;

    public void caps() {
        i=1;

        f = Integer.parseInt(JOptionPane.showInputDialog("ingresar numero de productos"));
        while (i <= f) {
            
            num = Integer.parseInt(JOptionPane.showInputDialog("ingresar valor de producto"));
            sum = sum + num;
            total = sum - des;
            i++;
        }
        if (sum > 100) {
            des = (int) (sum * 0.2);
            JOptionPane.showMessageDialog(null, "la factura de productos tiene un descuento de " + des + " y el total a pagar es: " + total);
        } else {
            JOptionPane.showMessageDialog(null, "la factura no tiene descuento\n su valor a pagar es: " + sum);
        }

    }
}
