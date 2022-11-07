/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen12;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Examen12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Cuantos anos tienes?");
        int n1=new Scanner(System.in).nextInt();
        if (n1>=18) {
            System.out.println("Eres mayor de edad");
        }   else    {
            System.out.println("Eres menor de edad");
        }
    }
    
}
