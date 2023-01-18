/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hola;
import javax.swing.JOptionPane;
/**
 *
 * @author EQUIPO
 */
public class holi { 
    int i,n,par=0,impar=0,cero=0;
    String in="",pir="",cir="";
    int A[]=new int[10];
    public void caps (){
        n=Integer.parseInt(JOptionPane.showInputDialog("ingrese dimensiones del arreglo"));
    }
    public void cap2 (){
    for(i=1; i<=n; i++){
        A[i]=Integer.parseInt(JOptionPane.showInputDialog("ingrese elemento"));
    }
}
    public void cap3 (){
        for(i=1; i<=n; i++){
            if(A[i]==0){
                cero++;
                cir=cir+A[i]+",";
            }
            else if(A[i]%2==0){
                par++;
            
                pir=pir+A[i]+",";
            }
            else{
                impar++;
                in=in+A[i]+",";
            }
            
        }
    }
    public void resu(){
        JOptionPane.showMessageDialog(null,"numeros pares: "+par+"\n"+"numeros impares: "+impar+"\n"+"numeros ceros: "+cero);
        JOptionPane.showMessageDialog(null,"los pares fueron; "+pir+"\n"+"los impares fueron: "+in);
    }
}
