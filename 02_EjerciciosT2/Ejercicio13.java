/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_2_13;
import java.util.Scanner;

/**
 *
 * @author Emilio<emiliojfdez2004@gmail.com>
 */
public class Ejercicio_2_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        String nombre;
        System.out.println("Escribe tu nombre:");
        nombre=teclado.next();
        System.out.println("Texto en mayuscula: " +nombre.toUpperCase());
        System.out.println("Texto en minuscula: " +nombre.toLowerCase());
        System.out.println("Su numero de caracteres es: " +nombre.length());
    }
}
