/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_2_26;

import java.util.Scanner;

/**
 *
 * @author Emilio<emiliojfdez2004@gmail.com>
 */
public class Ejercicio_2_26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Cuantos segundos quiere esperar");
        int s1=new Scanner(System.in).nextInt();
        int s2=s1*1000;
        try{
            Thread.sleep(s2);
        }
        catch(InterruptedException z)
        {
            System.out.println("No pudo realizarse la acción");
        }   
     System.out.println("Programa finalizado");
    }
}
