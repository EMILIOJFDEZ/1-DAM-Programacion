/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_2_19;
import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Emilio<emiliojfdez2004@gmail.com>
 */
public class Ejercicio_2_19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Ruta del archivo: ");
        String f1=new Scanner(System.in).nextLine();
        
        File f2=new File (f1);
        double b=f2.length();
        double mb=b/1000000;
        System.out.println("Su espacio en bytes es: " +b);
        System.out.println("Su espacio en megabytes es: " +mb);
        
        
    }
    
}
