/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen4;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Examen4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    System.out.println("Dime la edad de Pepe");
    int Pepe=new Scanner(System.in).nextInt();
    System.out.println("Dime la edad de Antonio");
    int Antonio=new Scanner(System.in).nextInt();
    boolean EdadPepe = Pepe>=18;
    boolean EdadAntonio = Antonio>=18;
    boolean Edad= Pepe>Antonio;
    System.out.println("Pepe es mayor de edad? "+EdadPepe);
    System.out.println("Antonio es mayor de edad? "+EdadAntonio);
    System.out.println("Es Pepe mayor que Antonio? "+Edad);
    }
    
}