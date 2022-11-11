/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package string7;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Emilio<emiliojfdez2004@gmail.com>
 */
public class String7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Introduzca un texto entre 4-10 caracteres:");
        String texto = new Scanner(System.in).nextLine();
        
           
        if(texto.length()>10 || texto.length()<=3){
           System.out.println("Su texto esta fuera del rango establecido.");
        }else{
             
            StringBuilder Cadena0 = new StringBuilder(texto);
            char guardado;
      
            guardado= texto.charAt(0);
            Cadena0.deleteCharAt(0).insert(0,texto.charAt(1));
            Cadena0.deleteCharAt(1).insert(1, guardado);
         
            guardado= texto.charAt(2);
            Cadena0.deleteCharAt(2).insert(2,texto.charAt(3));
            Cadena0.deleteCharAt(3).insert(3, guardado);
      
            if(texto.length()>=6){
               guardado = texto.charAt(4);
               Cadena0.deleteCharAt(4).insert(4, texto.charAt(5));
               Cadena0.deleteCharAt(5).insert(5, guardado);
            }
            
            if(texto.length()>=8){
               guardado = texto.charAt(6);
               Cadena0.deleteCharAt(6).insert(6, texto.charAt(7));
               Cadena0.deleteCharAt(7).insert(7, guardado);
            }
            
            if(texto.length()==10){
            guardado = texto.charAt(8);
            Cadena0.deleteCharAt(8).insert(8,texto.charAt(9));
            Cadena0.deleteCharAt(9).insert(9, guardado);
            }
          
            System.out.println(Cadena0);    
          
        }           
    }
}
