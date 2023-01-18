
package arreglo;

import javax.swing.JOptionPane;

/**
 *
 * @author EQUIPO
 */
public class arre {
    int i,l,par=0,impar=0,cero=0;
    int A[]=new int[10];
    public void caps (){
        l=Integer.parseInt(JOpionPane.showInputDialog("ingrese dimensiones del arreglo"));
    }
    public void cap2 (){
    for(i=1; i<=l; i++){
        A[i]=Integer.parseInt(JOpionPane.showInputDialog("ingrese elemento"));
    }
}
    public void cap3 (){
        for(i=1; i<=l; i++){
            if(A[i]==0){
                cero++;
            }
            else if(A[i]%2==0){
                par++;
            }
            else{
                impar++;
            }
        }
    }
    public void resu(){
        JOptionPane.showMessageDialog(null,"numeros pares: "+par+"\n"+"numeros impares: "+impar+"\n"+"numeros ceros: "+cero);
    }
}
