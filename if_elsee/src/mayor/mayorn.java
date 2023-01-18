package mayor;

/**
 *
 * @author EQUIPO
 */
import javax.swing.JOptionPane;

public class mayorn {

    int a, b, c,mayor,medio,menor;

    public void cap_A() {
        a = Integer.parseInt(JOptionPane.showInputDialog("Ingresa número A: "));
    }

    public void cap_B() {
        b = Integer.parseInt(JOptionPane.showInputDialog("Ingresa número B: "));
    }

    public void cap_c() {
        c = Integer.parseInt(JOptionPane.showInputDialog("Ingresa número c: "));
    }

   
    public void cap1(){
     if (a>b && a>c){
         mayor=a;
     }
     else if (b>a && b>c){
         mayor=b;
     }
     else if (c>a && c>b){
         mayor=c;
     }
         
        }
    
    public void cap2(){
        if (a > b && a<c || a>c && a<b){
            medio=a;
        }
        else if (b > a && b < c || b<a && b>c){
            medio=b;
        }
        else if (c > a && c < b || c<a && c>b ){
            medio=c;
        }
    }
    
    public void cap3(){
        if (a<b && a<c){
            menor=a;
        }
        else if (b<a && b<c){
            menor=b;
        }
        else if (c<a && c<b){
            menor=c;
        }
    }
    
    public void ascendencia(){
        JOptionPane.showMessageDialog(null,"orden ascendente:\n el mayor es : "+mayor+"\nel mediano es : "+medio+"\nel menor es : "+menor);
    }
    }
    

