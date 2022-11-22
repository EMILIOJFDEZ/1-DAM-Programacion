/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_2_27;
import java.io.*;
import java.util.*;
import java.net.*;
/**
 *
 * @author Emilio<emiliojfdez2004@gmail.com>
 */
public class Ejercicio_2_27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe una IP o enlace a una pagina");
        String ip = teclado.next();
        System.out.println("Escriba el tiempo de timeout em milisegundos");
        int s=new Scanner(System.in).nextInt();
        try {
        Thread.sleep(s);
        InetAddress ping = InetAddress.getByName(ip);
        if(ping.isReachable(5000)){
        System.out.println(ip+" ha respondido con exito");
        } else {
        System.out.println(ip+" no responde!");
        }
        } catch (IOException ex) { System.out.println(ex);}
        catch (InterruptedException z){System.out.println("No pudo realizarse la acción");}
    }
}