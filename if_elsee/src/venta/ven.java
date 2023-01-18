package venta;

import javax.swing.JOptionPane;

/**
 *
 * @author EQUIPO
 */
public class ven {

    float mon, des, ven = 0, total;

    public void caps() {

        mon = Integer.parseInt(JOptionPane.showInputDialog("ingrese monto"));

        while (mon != 0) {
mon = Integer.parseInt(JOptionPane.showInputDialog("ingrese monto"));
            if (mon < 0) {
                JOptionPane.showMessageDialog(null, "el valor no es valido");
            } 
            else if (ven > 1000) {
                des = (int) (ven * 0.10);
                total = ven - des;
                JOptionPane.showMessageDialog(null, "el total a pagar es: " + total + " porque tuvo un descuento de " + des);
            } 
            else  {

               
                ven = ven + mon;

            }
            else {

                JOptionPane.showMessageDialog(null, "el total a pagar es " + ven + " ya que no hubo descuento");
            }

        }

    }
}
