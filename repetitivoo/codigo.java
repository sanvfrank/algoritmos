
package codi;

import javax.swing.JOptionPane;

/**
 *
 * @author EQUIPO
 */
public class codigo {
    int i,n,k,sw=0;
    int cod[]=new int[10];
    public void cap(){
        n=Integer.parseInt(JOptionPane.showInputDialog("ingrese dimenciones"));
        for(i=1; i<=n; i++){
            cod[i]=Integer.parseInt(JOptionPane.showInputDialog("ingrese codigo "+i));
        }
    }
    public void cap2(){
        k=Integer.parseInt(JOptionPane.showInputDialog("ingrese codigo ha encontrar"));
        i=1;
        while(i<=n ){
            if(cod[i]==k ){
              JOptionPane.showMessageDialog(null,"el codigo ha sido encontrado"); 
                i=n+1;
                
            }
            else{
                i++;
              
                
            }
        }
            
        if(cod[i]!=k){
           JOptionPane.showMessageDialog(null,"el codigo no ha sido encontrado");  
        }
        
                
        
            
        
         
    }
   
}
