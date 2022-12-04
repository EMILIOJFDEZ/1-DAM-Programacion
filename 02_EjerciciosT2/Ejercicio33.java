/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_2_33;
import bpc.daw.reproductor.*;
import java.io.*;
/**
 *
 * @author Emilio<emiliojfdez2004@gmail.com>
 */
public class Ejercicio_2_33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here    
        PlayList m=null;
        m=new PlayList();
        ArchivoMP3 m1=new ArchivoMP3("C:\\Users\\Usuario\\OneDrive\\Playlist\\Kickback.mp3");
        
        ArchivoMP3 m2=new ArchivoMP3("C:\\Users\\Usuario\\OneDrive\\Playlist\\Serrucho.mp3");
        
        ArchivoMP3 m3=new ArchivoMP3("C:\\Users\\Usuario\\OneDrive\\Playlist\\Boca_yo_te_amo.mp3");
        
        m.añadir(m1);
        
        m.añadir(m2);
        
        m.añadir(m3);
        
        m.setTitulo("Musica");
        try {
            m.guardar("C:\\Users\\Usuario\\OneDrive\\Playlist\\Musica.txt");
            
            Reproductor r=new Reproductor(m,true,false);
            r.play();
        }
        catch (IOException IOException){
        System.out.println("No pudo realizarse la accion");
        }
    }
}