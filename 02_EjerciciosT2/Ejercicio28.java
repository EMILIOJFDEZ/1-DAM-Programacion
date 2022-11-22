/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_2_28;
import java.net.*;
import java.util.Scanner;

/**
 *
 * @author Emilio<emiliojfdez2004@gmail.com>
 */
public class Ejercicio_2_28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe una IP o enlace a una pagina");
        String enlace = teclado.next();
        try{
        InetAddress ip=InetAddress.getByName(enlace);
        System.out.println("Nombre Host: "+ip.getHostName());
        System.out.println("La IP de su pagina es: "+ip.getHostAddress());
        
        } catch (Exception e) {System.out.println(e);}
    }  
}
