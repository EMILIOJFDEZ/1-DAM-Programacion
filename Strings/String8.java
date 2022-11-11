/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package string8;

import java.util.Scanner;

/**
 *
 * @author Emilio<emiliojfdez2004@gmail.com>
 */
public class String8 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu nombre");
        String nombre = sc.nextLine();
        System.out.println("Ahora tus apellidos");
        String apellidos = sc.nextLine();
        int largo = nombre.length();
        String iniciales=" ";
        String x1=nombre.substring(0, 1);
        String x2;
        String x3;
        for (int i = 0; i <largo; i++) {
            x2=nombre.substring(i,i+1);
        
          if (x2.equals(iniciales)) {
              x3=nombre.substring(i+1, i+2);
                x1=x1+x3;
            }
        }
        System.out.println(apellidos+" "+x1.toUpperCase());
    }
}
