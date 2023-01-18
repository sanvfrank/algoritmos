package pares;

import javax.swing.JOptionPane;

/**
 *
 * @author EQUIPO
 */
public class par {

    int i, num, par = 0, impar = 0;
    String pir = "", in = "";

    public void cap() {
        i = 1;
        while (i <= 5) {
            num = Integer.parseInt(JOptionPane.showInputDialog("ingresa un numero"));
            if (num % 2 == 0) {

                par++;
                pir = pir + num + " ";
            } else {

                impar++;
                in = in + num + " ";
            }

            i++;
        }
        JOptionPane.showMessageDialog(null, "cantidad de pares:" + par);
            JOptionPane.showMessageDialog(null, "cantidad de impares:" + impar);
            JOptionPane.showMessageDialog(null, "los pares fueron; " + pir + "\n" + "los impares fueron: " + in);

    }
}
