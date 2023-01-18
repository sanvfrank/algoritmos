package medio;

import javax.swing.JOptionPane;

/**
 *
 * @author EQUIPO
 */
public class num_medio {

    int a, b, c, medio;

    public void caps() {
        a = Integer.parseInt(JOptionPane.showInputDialog("ingrese primer numero"));
        b = Integer.parseInt(JOptionPane.showInputDialog("ingrese segundo numero"));
        c = Integer.parseInt(JOptionPane.showInputDialog("ingrese tercer numero"));
    }

    public void processo() {
        if (a > b && a < c || a < b && a > c) {
            medio = a;
        } else if (b > a && b < c || b < a && b > c) {
            medio = b;
        } else {
            medio = c;
        }

    }

    public void mostrar() {

        JOptionPane.showMessageDialog(null, "el numero del medio es: " + medio);
    }
}
