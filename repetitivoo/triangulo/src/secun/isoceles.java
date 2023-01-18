/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secun;

/**
 *
 * @author EQUIPO
 */
public class isoceles {
     double lado1,base;

double area;

    public isoceles(double lado1, double base) {
        this.lado1= lado1;
       
        this.base = base;
    }
    
    
    public double perimetro(){
         double perimetro=2*(lado1+base);
        return(perimetro);
    }
    public double obarea(){
        
      area=(base*Math.sqrt((lado1*lado1)-((base*base)/4)))/2;
        return(area);
    }

   
    
    public String mostrar(){
        obarea();
        return("area del triangulo con mayor superficie: "+area);
    }
}
