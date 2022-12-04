/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_2_47;

import java.awt.Desktop;
import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Emilio<emiliojfdez2004@gmail.com>
 */
public class Ejercicio_2_47 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Introduce la ruta");
        String a = new Scanner(System.in).nextLine();
        File b = new File(a);
        
        Desktop c = Desktop.getDesktop();
        try{
        c.open(b);
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }

}