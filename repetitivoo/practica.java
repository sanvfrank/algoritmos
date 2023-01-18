
package prac;

import javax.swing.JOptionPane;

/**
 *
 * @author EQUIPO
 */
public class practica {
    int i,votantes,votos,ced,pedro,pablo,blanco,vot;
    public void caps(){
        ced=1;
        while(ced!=0){
            ced=Integer.parseInt(JOptionPane.showInputDialog("ingrese cedula"));
            
            vot=Integer.parseInt(JOptionPane.showInputDialog("¿por quien votara?"));
            
            if(vot==1){
                pedro++;
             }
                else if(vot==2){
                    pablo++;  
                        }
                else if (vot==3){
                    blanco++;
                }
                        
               
                       
             }
        
    }
    public void processo(){
        votantes=pedro+pablo+blanco;
        
        JOptionPane.showMessageDialog(null,"la cantidad de votos fue de; "+votantes);
         JOptionPane.showMessageDialog(null,"votos para pedro: "+pedro+"\n"
         + "votos para pablo: "+pablo+"\n"
         + "votos en blanco; "+blanco);
        if(pedro>pablo && pedro>blanco){
             JOptionPane.showMessageDialog(null,"pedro gano las votaciones con: "+pedro);
        }
        else if(pablo>pedro && pablo>blanco){
             JOptionPane.showMessageDialog(null,"pablo gano las votaciones con: "+pablo);
        }
        else if(blanco>pedro && blanco>pablo){
            
             JOptionPane.showMessageDialog(null,"el voto en blanco gano las votaciones con : "+blanco);
        }
        else{
             JOptionPane.showMessageDialog(null,"hubo un empate de: "+pedro);
        }
            
    }
    
}
