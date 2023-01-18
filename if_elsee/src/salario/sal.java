/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salario;

import javax.swing.JOptionPane;

/**
 *
 * @author EQUIPO
 */
public class sal {
    int horas_t,salario_h,salario,salario_m,salario_a,salario_d;
    String nomb;
    public void Caps(){
        nomb=JOptionPane.showInputDialog("ingresa el nombre del trabajador");
        horas_t=Integer.parseInt(JOptionPane.showInputDialog("ingrese horas trabajadas "));
        salario_h=Integer.parseInt(JOptionPane.showInputDialog("ingresa el salario por hora"));
        
    }
    public void processo(){
        salario=horas_t*salario_h;
        if(horas_t<24){
           JOptionPane.showMessageDialog(null,""+nomb+ "trabajo durante: " +horas_t+ " horas y su salario por estas es de :" +salario);
        }
        else if(horas_t>24){
            salario_d=horas_t/24;
            JOptionPane.showMessageDialog(null,""+nomb+" trabajo durante: "+salario_d+ " dias y su salario por estas es de: "+salario);
        }
        else if(horas_t>730){
            salario_m=horas_t/8760;
            JOptionPane.showMessageDialog(null,""+nomb+" trabajo durante: "+salario_m+ " dias y su salario por estas es de: "+salario);
        }
        else if(horas_t>8760){
            salario_a=horas_t/8760;
            JOptionPane.showMessageDialog(null,""+nomb+" trabajo durante: "+salario_a+ " años y su salario por estas es de: "+salario);
        }
        
        salario=horas_t*salario_h;
        
    }
   
}
