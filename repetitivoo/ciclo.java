
package repetitivo;

import javax.swing.JOptionPane;
 
/**
 *
 * @author EQUIPO
 */
public class ciclo {
    int i, num;
    String peg="";
   public void caps (){
       i=2;
       while(i<=20){
           //JOptionPane.showMessageDialog(null," "+i);
           System.out.print(i+"");
           peg+=i+ " ";
           
         i+=2;
         JOptionPane.showMessageDialog(null,"numeros "+peg);
      
          
         
       }
       
           
       }
    
}
