/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_2_15;

import java.util.Scanner;

/**
 *
 * @author Emilio<emiliojfdez2004@gmail.com>
 */
public class Ejercicio_2_15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        String clave,contrasena;
        System.out.println("Ponga una clave");
        clave=teclado.next();
        System.out.println("Confirme contrasena");
        contrasena=teclado.next();
        boolean resultado=clave.equals(contrasena);
        System.out.println(resultado);
    }
    
}
