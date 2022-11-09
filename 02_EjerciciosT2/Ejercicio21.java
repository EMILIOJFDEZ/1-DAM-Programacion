/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_2_21;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Emilio<emiliojfdez2004@gmail.com>
 */
public class Ejercicio_2_21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ruta del directorio: ");
        
        String f1 = teclado.next();
        
        File f2=new File (f1);
        
        boolean directorio = f2.isDirectory();
        
        if (directorio) {
        File[] lista = f2.listFiles();
        
        int archivos=0;
        int carpetas=0;
        
        for (int i = 0; i < lista.length; i++) 
        
        if (lista[i].isFile())
        archivos++;

        for (int i = 0; i < lista.length; i++) 
        
        if (lista[i].isDirectory())
        carpetas++;
        
        System.out.println("Hay " +archivos + " y "+carpetas+" carpetas en esta ruta");
        } else {
        System.out.println("Error: Ruta no encontrada");
        }
    }
}