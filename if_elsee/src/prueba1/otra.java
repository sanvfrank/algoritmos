/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba1;

import javax.swing.JOptionPane;

/**
 *
 * @author EQUIPO
 */
public class otra {
    public void caps(){
      int monto=300000,km,ex,ext,montoiva;
     km= Integer.parseInt(JOptionPane.showInputDialog("ingresa kilometros recorridos"));
      if(km<=300){
          monto=monto;
          montoiva=(int) (monto*0.20);
          JOptionPane.showMessageDialog(null,"su monto a pagar es: "+monto+" y su monto de iva es: "+montoiva);
      }
      else if(km>300 && km<=1000){
          ex=km-300;
          ext=ex*15000;
          monto=monto+ext;
          montoiva=(int) (monto*0.20);
          JOptionPane.showMessageDialog(null,"su valor a pagar mas exdente de 300km es : "+monto+" y su monto de iva es :"+montoiva);
      }
      else {
          ex=km-1000;
          ext=ex*10000;
          monto=monto+ext;
          montoiva=(int) (monto*0.20);
          JOptionPane.showMessageDialog(null,"su valor a pagar mas exdente de 1000km es: "+monto+" y su monto de iva es: "+montoiva);
      }
    }
}
