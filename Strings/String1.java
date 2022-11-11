/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package string1;

import java.util.Scanner;

/**
 *
 * @author Emilio<emiliojfdez2004@gmail.com>
 */
public class String1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Ponga una frase");
        String texto=new Scanner(System.in).nextLine();
        if (texto.startsWith(" "))
            {
            String espacio =texto.trim();
            System.out.println(espacio);
            }
        else System.out.println(texto);
    }
}
