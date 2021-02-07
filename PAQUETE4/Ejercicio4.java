/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PAQUETE4;

/**
 *
 * @author eduardo
 */
public class Ejercicio4 {
     public static void main(String[]args){
      byte numero = 100;
      
      System.out.println("\tUSANDO EL CICLO WHILE");
      while(numero>=0){
         System.out.println(numero);
         numero-=4;
      }
       
         System.out.println("\tUSANDO EL CICLO FOR");
         for(byte a=100; a>=0;a-=4){
           System.out.println(a);
         }
     }
}
