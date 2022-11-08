/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_2_16;

import java.util.Scanner;

/**
 *
 * @author Emilio<emiliojfdez2004@gmail.com>
 */
public class Ejercicio_2_16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        String frase,palabra;
        System.out.println("Ponga una frase");
        frase=teclado.next();
        System.out.println("Ponga una palabra");
        palabra=teclado.next();
        
        boolean resultado = frase.contains(palabra);

        if  (resultado) {
        System.out.println("Palabra encontrada");
        }   else    {
            System.out.println("Palabra no encontrada");
        }
    }
}