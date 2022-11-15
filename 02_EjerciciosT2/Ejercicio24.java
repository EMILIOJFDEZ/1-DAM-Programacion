/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_2_24;

import java.io.*;

import java.util.Scanner;

/**
 *
 * @author Emilio<emiliojfdez2004@gmail.com>
 */
public class Ejercicio_2_24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime una frase");
        String f1 = teclado.next();
        System.out.println("Dime ahora otra");
        String f2 = teclado.next();
    
         try {
            PrintWriter t1 = new PrintWriter("C:\\Users\\Usuario\\Downloads\\texto.txt", "UTF-8");
            t1.println(f1);
            t1.println(f2);
            t1.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}