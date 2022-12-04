/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_2_29;
import java.util.*;
/**
 *
 * @author Emilio<emiliojfdez2004@gmail.com>
 */
public class Ejercicio_2_29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        try {
        int num=0;
        System.out.println("Introduzca un numero");
        num = teclado.nextInt();
        System.out.println(num);
        } catch (InputMismatchException ex) {
            System.out.println("Error, no se ha encontrado ningun numero");
        }
    }
}