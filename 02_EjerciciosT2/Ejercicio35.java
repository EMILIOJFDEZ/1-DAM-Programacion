/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_2_35;

import bpc.daw.reproductor.*;

/**
 *
 * @author Emilio<emiliojfdez2004@gmail.com>
 */
public class Ejercicio_2_35 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            String ruta1 = "C:\\Users\\Usuario\\OneDrive\\Playlist\\Kickback.mp3";
        
        
        
        ArchivoMP3 a = new ArchivoMP3(ruta1);
        ArchivoMP3 a2 = new ArchivoMP3(ruta1);
        
        System.out.println(a==a2);
        
        //Nos dice "false", ya que esta comprobando si son
        //iguales dentro de la memoria del ordenador
        
        System.out.println(a.equals(a2));
        
        //Nos dice "true", esta viendo que es literalmente
        //el mismo archivo
        
        //Hashcode de dichos objetos
        
        System.out.println(a.hashCode());
        System.out.println(a2.hashCode());
        
        //Coinciden
        
        
         ArchivoMP3 eyeless= new ArchivoMP3(ruta1);
         Reproducible r = eyeless;
         boolean sincrono = true;
         boolean info = false;

        Reproductor b = new Reproductor(r,sincrono,info);
        
        //Metodo toString en Reproductor
        
        System.out.println(b.toString());
        
        //Metodo toString en archivo MP3
        
        System.out.println(a2.toString());
    }
    
}
