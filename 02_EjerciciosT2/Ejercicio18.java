/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_2_18;

import java.util.Scanner;

/**
 *
 * @author Emilio<emiliojfdez2004@gmail.com>
 */
public class Ejercicio_2_18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        String correo;
        System.out.println("Ponga su nombre");
        correo=teclado.next();
        String[] separacion = correo.split("@");
        String nombre = separacion[0];
        String dominio = separacion[1];
        System.out.println("Nombre: " +nombre);
        System.out.println("Dominio: "+dominio);
    }
    
}
