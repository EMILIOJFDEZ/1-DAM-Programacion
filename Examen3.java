/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen3;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Examen3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Horas");
        double horas=new Scanner(System.in).nextDouble();
        System.out.println("Minutos");
        double minutos=new Scanner(System.in).nextDouble();
        System.out.println("Segundos");
        double segundos=new Scanner(System.in).nextDouble();
        double resultado=((horas*3600)+(minutos*60)+segundos);
        System.out.println("En total son: "+resultado+" segundos");
    }
    
}
