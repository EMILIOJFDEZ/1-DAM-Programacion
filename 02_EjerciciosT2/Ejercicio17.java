/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_2_17;

import java.util.Scanner;

/**
 *
 * @author Emilio<emiliojfdez2004@gmail.com>
 */
public class Ejercicio_2_17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        String nombre,dominio;
        System.out.println("Ponga su nombre");
        nombre=teclado.next();
        System.out.println("Ponga su dominio");
        dominio=teclado.next();
        System.out.println("Su correo es: " +nombre.toLowerCase() +"@"+dominio.toLowerCase());
    }
    
}
