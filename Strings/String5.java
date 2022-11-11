/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package string5;

import java.util.Scanner;

/**
 *
 * @author Emilio<emiliojfdez2004@gmail.com>
 */
public class String5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Di una frase");
        String f1=new Scanner(System.in).nextLine();
        String f2 =f1.replace(" ", "");
        StringBuilder f3=new StringBuilder(f2);
        String f4= f3.reverse().toString();
        System.out.println(f4);
        System.out.println(f2);
        if(f2.equals(f4))
        {
            System.out.println("Es palindromo");
        }
        else {
            System.out.println("No es palindromo");
        }
        
    }
    
}
