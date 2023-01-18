package votacion;

import javax.swing.JOptionPane;

/**
 *
 * @author EQUIPO
 */
public class vot {

    int e;
    char s;
    char s1= 'M';
    char s2= 'F';
    
    public void caps() {
        e = Integer.parseInt(JOptionPane.showInputDialog("ingrese la edad"));
        
        s= JOptionPane.showInputDialog("ingrese el sexo (M O F)").toUpperCase().charAt(0);
        if(s=='M' || s=='F'){
            if(s1==s && e>=18){
             JOptionPane.showMessageDialog(null,"puede votar y su genero es masculino");
         } 
       else if(e<18 && s1==s){
           JOptionPane.showMessageDialog(null," NO puede votar y su genero es masculino");
       }
       else if(s2==s && e>=18){
           JOptionPane.showMessageDialog(null,"puede votar y su genero es femenino");
       }
       else if(e<18 && s2==s){
           JOptionPane.showMessageDialog(null,"NO puede votar y su genero es femenino");
       }
        }
        else{
            JOptionPane.showMessageDialog(null,"ingresa correctamente tu sexo");
        }
       
       
    }
    
    
    

   
}
