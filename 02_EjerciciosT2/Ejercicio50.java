/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_2_50;

import java.util.*;

/**
 *
 * @author Emilio<emiliojfdez2004@gmail.com>
 */
public class Ejercicio_2_50 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Introduzca un mensaje");
        String mensaje1=new Scanner(System.in).nextLine();
        System.out.println("Introduzca otro mensaje");
        String mensaje2=new Scanner(System.in).nextLine();
        System.out.println("Introduzca otro mensaje mas");
        String mensaje3=new Scanner(System.in).nextLine();
        System.out.println("Introduzca un mensaje mas");
        String mensaje4=new Scanner(System.in).nextLine();
        System.out.println("Introduzca un ultimo mensaje");
        String mensaje5=new Scanner(System.in).nextLine();
        
        List<String> mensajes = new ArrayList<>();
        
        mensajes.add(mensaje1);
        mensajes.add(mensaje2);
        mensajes.add(mensaje3);
        mensajes.add(mensaje4);
        mensajes.add(mensaje5);

        System.out.println("Tamano de la lista: "+mensajes.size());

        System.out.println("Palabra en la posición 3: "+mensajes.get(3));

        System.out.println("Metodo toString: "+mensajes.toString());

        mensajes.remove(0);

        System.out.println("Tamano de la lista: "+mensajes.size());

        System.out.println("Palabra en la posición 3: "+mensajes.get(3));

        System.out.println("Metodo toString: "+mensajes.toString());
    }
    
}