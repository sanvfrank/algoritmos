package tercero;

import javax.swing.JOptionPane;

/**
 *
 * @author EQUIPO
 */
public class usuycontra {

    int i = 1,v;
    String usuario, contraseña, nom, usu, con;

    public void caps() {
        v=0;
        
        usuario="frankxd";
        contraseña="frankeldios";
        nom = JOptionPane.showInputDialog("ingrese su nombre");
        while(i<=4){
            usu = JOptionPane.showInputDialog("ingrese usuario");
        con = JOptionPane.showInputDialog("ingrese contraseña");
         if (usu.equals(usuario)&& con.equals(contraseña)) {
            JOptionPane.showMessageDialog(null, "bienvenido señor " + nom);
            i=5;
        }
         else{
             while(v<1){
                 JOptionPane.showMessageDialog(null, "credenciales incorrectas tiene 3 intentos");
                 v++;
                 
             }
             
             i++;
             
            
             while(i==5){
                 JOptionPane.showMessageDialog(null, "intentos agotados");
                 i=6;
             }
                         
           
         }
        
}
        
        
       
        
    }

}
