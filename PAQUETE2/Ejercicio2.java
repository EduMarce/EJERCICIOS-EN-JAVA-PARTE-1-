/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PAQUETE2;

/**
 *
 * @author eduardo
 */
public class Ejercicio2 {
    public static void main(String[]args){
      System.out.println("\tUSANDO EL CICLO FOR");
      for(int i=1;i<=4;i++){
        System.out.print("\nTabla de multiplicar del: " + i);
        System.out.println();
        for(int j=0;j<=12;j++){
          System.out.println(i + " * " + j + " = " + (i*j));
        }
      }
      
      System.out.println();
      System.out.println("\tUSANDO EL CICLO WHILE");
      int a = 1;
      while(a<=4){
         System.out.print("\nTabla de multiplicar del: " + a);
         System.out.println();
         int b = 0;
         while(b<=12){         
           System.out.println(a + " * "+ b + " = " + (a*b));
           b++;
         }
         a++;
      }
    }
}
