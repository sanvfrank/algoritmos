/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicion;

import javax.swing.JOptionPane;

/**
 *
 * @author EQUIPO
 */
public class condi {

    int num;
  String hola;
    public void Comp_num() {
        num = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero"));
        if (num > 0) {
            JOptionPane.showMessageDialog(null, "el numero " + num + " es positivo");
        } else {
            JOptionPane.showMessageDialog(null, "el numero " + num + " es negativo");
        }

    }
}
