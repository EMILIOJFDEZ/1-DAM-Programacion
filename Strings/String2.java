/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package string2;

import java.util.Scanner;

/**
 *
 * @author Emilio<emiliojfdez2004@gmail.com>
 */
public class String2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Pon comentarios hasta 50 caracteres");
        String texto=new Scanner(System.in).nextLine();
        texto = texto.replaceAll("\\s+", "");
        int t50=texto.length();
        if (t50>50){
            System.out.println ("Su texto tiene mas de 50 caracteres");
        }
        else System.out.println (texto);
    }
}
