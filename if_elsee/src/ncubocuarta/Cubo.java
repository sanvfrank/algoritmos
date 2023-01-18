/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ncubocuarta;

/**
 *
 * @author EQUIPO
 */
import javax.swing.JOptionPane;
public class Cubo {
    int num,cubo,cuarta;
    public void cap_num(){
        num=Integer.parseInt(JOptionPane.showInputDialog("ingresa el numero"));
    }
    public  void Processo(){
        cubo=num*num*num;
        cuarta=(int)Math.pow(num,4);
        
    }
    public void salida(){
        JOptionPane.showMessageDialog(null,"el cubo es:"+cubo+"\nla cuarta es:"+cuarta);
    }
}
