/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_2_51;
import java.util.*;
/**
 *
 * @author Emilio<emiliojfdez2004@gmail.com>
 */
public class Ejercicio_2_51 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HashSet mensajes=new HashSet();
    
        mensajes.add("silla");
        mensajes.add("mesa");
        mensajes.add("ninio");
        mensajes.add("mesa");
        mensajes.add("casa");
        mensajes.add("silla");
        mensajes.add("lapiz");
        
    System.out.println("El tamano de sus mensajes es de: "+mensajes.size());
        
    System.out.println("Si le ponemos un toString sale: "+mensajes.toString());
    }

}