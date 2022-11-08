/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_2_14;
import java.util.Scanner;
/**
 *
 * @author Emilio<emiliojfdez2004@gmail.com>
 */
public class Ejercicio_2_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        String texto;
        System.out.println("Ponga una frase");
        texto=teclado.next();
        int numero=(texto.length()/2);
        System.out.println("El texto que hay a la mitad es: " +texto.charAt(numero));
    }
    
}
