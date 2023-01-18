package aprobo;

import javax.swing.JOptionPane;

/**
 *
 * @author EQUIPO
 */
public class aprob {

    int i, ed, est, pes;

    public void caps() {
        i = 1;
        while (i <= 2) {
            ed = Integer.parseInt(JOptionPane.showInputDialog("ingrese edad"));
            est = Integer.parseInt(JOptionPane.showInputDialog("ingrese estatura"));
            pes = Integer.parseInt(JOptionPane.showInputDialog("ingrese peso"));
            
            if (ed < 18 && est > 180 && pes <= 80) {
                JOptionPane.showMessageDialog(null, "aprobo los requisitos\n"
                        + "edad: " + ed + "\n"
                        + "estatura:" + est + "\n"
                        + "peso: " + pes);
            } else {
                JOptionPane.showMessageDialog(null, "no cumplio los requisitos");
            }
i++;
        }
    }
}
