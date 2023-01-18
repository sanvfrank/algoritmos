
package compa;

import javax.swing.JOptionPane;

/**
 *
 * @author EQUIPO
 */
public class compi {
    int num,n,i, neg=0,pos=0;
    public void caps(){
        i=1;
        n=Integer.parseInt(JOptionPane.showInputDialog("ingresa la cantidad de numeros"));
        while (i<=n){
          num=  Integer.parseInt(JOptionPane.showInputDialog("ingresa un numero"));
            if(num>=0){
                JOptionPane.showMessageDialog(null,"el numero "+num+ " es positivo");
                pos++;
            }
            else{
                JOptionPane.showMessageDialog(null,"el numero "+num+" es negativo");
                neg++;
            }  
            i++;
        }
    }
    public void re (){
        JOptionPane.showMessageDialog(null,"cantidad de positivos= "+pos+"\n cantidad de negativos= "+neg);
    }
}
