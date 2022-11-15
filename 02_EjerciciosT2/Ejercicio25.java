/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_2_25;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Emilio<emiliojfdez2004@gmail.com>
 */
public class Ejercicio_2_25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
        File f= new File("C:\\Users\\Usuario\\Downloads\\texto.txt");
        Scanner e=new Scanner(f);
        System.out.println(e.nextLine());
        System.out.println(e.nextLine());
        }
        catch(FileNotFoundException z) {
        System.out.println("No se pudo leer nada");
        }
    }
}