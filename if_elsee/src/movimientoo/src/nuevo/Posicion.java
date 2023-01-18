/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nuevo;

/**
 *
 * @author EQUIPO
 */
class Posicion {
     private static int ejex;
 private static int ejey;
 private String p;
 private boolean s=false;
 //constructor
 public Posicion(String p) {
  this.p=p;
 }
 public void ImprimirPos() {
  switch (p) {
  case "W":
   ejey++;
   break;
  case "S" :
   ejey--;
   break;
  case "A":
   ejex--;
   break;
  case "D":
   ejex++;
   break;
  default:
   System.out.println("saliendo");
   s=true;
   break;
  }
  System.out.println("La posicion final es  : "+ejex+","+ejey);
 }
 public boolean saliendo() {
  return s;
}
}
