/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen9;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Examen9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Di un numero entre 10 y 56");
        int n1=new Scanner(System.in).nextInt();
        if (n1<10){
            System.out.println("Numero demasiado pequeno");}
                else {if(n1>56){
                    System.out.println("Numero demasiado grande");}
                else {
                    System.out.println("Numero aceptado");}
        }
    }
    
}
