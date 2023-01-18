package caldefi;

import javax.swing.JOptionPane;

/**
 *
 * @author EQUIPO
 */
public class defi {

    double pp, sp, fn, def;
    String nom;

    public void cap() {
        nom = JOptionPane.showInputDialog("ingresa nombre");

    }

    public void cap2() {
        pp = Double.parseDouble(JOptionPane.showInputDialog("ingrese el primer parcial"));
        sp = Double.parseDouble(JOptionPane.showInputDialog("ingrese el segundo parcial"));
        fn = Double.parseDouble(JOptionPane.showInputDialog("ingrese el tercer parcial"));
    }

    public void processo() {
        def = (pp * 0.30) + (sp * 0.30) + (fn * 0.40)/3;

        if (def >= 3.0) {
            JOptionPane.showMessageDialog(null, "el estudiante " + nom + " paso porque su nota es: " + def);
        } else {
            JOptionPane.showMessageDialog(null, "el estudiante " + nom + " no paso porque su nota es: " + def);
        }
    }
}
