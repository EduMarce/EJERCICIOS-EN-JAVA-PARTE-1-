/*
    Mostrar en pantalla la tabla del 4, a partir del valor 5. Ejemplo
    4*5 = 20
    4*6 = 24
    4*7 = 28 .....
*/
package PAQUETE1;

/**
 *
 * @author eduardo
 */
public class EJERCICIO1 {
    public static void main(String[]args){

        //Variables
        int producto = 1;
        System.out.println("\tTABLA DEL 4");
        for(int i=5;i<=12;i++){
           producto = 4 * i;
           System.out.println(4 + " * " + i  + " = "+ producto );
        }
        
    }
}
