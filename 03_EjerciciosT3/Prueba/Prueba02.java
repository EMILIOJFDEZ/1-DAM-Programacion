/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_3_prueba_02;

import java.util.Scanner;

/**
 *
 * @author Emilio<emiliojfdez2004@gmail.com>
 */
public class Ejercicio_3_Prueba_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Dime un numero");
        double n1=new Scanner(System.in).nextDouble();
        System.out.println("Dime un numero");
        double n2=new Scanner(System.in).nextDouble();
        System.out.println("Selecciona un simbolo (+ * - /)");
        String sim=new Scanner(System.in).nextLine();
        switch(sim) {
            
        case "+":
        double n4=n1+n2;
        System.out.println("Su resultado es: "+n4);
        break;
        
        case "-":
        double n5=n1-n2;
        System.out.println("Su resultado es: "+n5);
        break;
        
        case "*":
        double n6=n1*n2;
        System.out.println("Su resultado es: "+n6);
        break;
        
        case "/":
        if (n1==0) {System.out.println("No se puede dividir entre 0");}
        else if (n2==0) {System.out.println("No se puede dividir entre 0");}
        else {double n7=n1/n2; System.out.println("Su resultado es: "+n7); break;}
        }
    }
    
}