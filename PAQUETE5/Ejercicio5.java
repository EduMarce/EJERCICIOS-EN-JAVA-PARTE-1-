/*
    De un arreglo lleno con 10 números, almacenar en otro arreglo,
    sólo los números comprendidos entre 1 y 50.
 */
package PAQUETE5;

import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        //Creamos un objeto de tipo Scanner
        Scanner sc = new Scanner(System.in);
        //Declaramos el prime arreglo
        int posiciones = 0;
        int arreglo1[] = new int[10];
        System.out.println("Ingresar el arreglo:  ");
        for (int i = 0; i < arreglo1.length; i++) {
            System.out.print("Posición "+ (i+1) +": " );
            arreglo1[i] = sc.nextInt();
            if(arreglo1[i]>1 || arreglo1[i]<=50){
              posiciones++;
            }
        }
        
        //Mostrando el Primer arreglo
        System.out.println("\tMOSTRAMOS EL PRIMER ARREGLO");
        for(int i=0;i<arreglo1.length;i++){
          System.out.println(arreglo1[i] + "");
        }
        
        //Declaramos el segundo arreglo
        int j = 0;
        int arreglo2[] = new int[posiciones];
        for(int i=0;i<=arreglo2.length;i++){
          if(arreglo1[j]>1 || arreglo1[j]<=50){
              arreglo2[j] = arreglo1[i];
            }
          j++;
        }
        
        //Mostramos el segundo arreglo
        System.out.println("\tMOSTRAMOS EL SEGUNDO ARREGLO");
        for( j=0;j<arreglo2.length;j++){
          System.out.println(arreglo2[j] + "");
        }
        
        

    }
}
