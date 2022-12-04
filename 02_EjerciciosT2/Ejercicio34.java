/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_2_34;
import bpc.daw.reproductor.*;
import java.io.*;
/**
 *
 * @author Emilio<emiliojfdez2004@gmail.com>
 */
public class Ejercicio_2_34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {PlayList Musica=null;
            Musica = new PlayList("C:\\Users\\Usuario\\OneDrive\\Playlist\\Musica.txt");
            Reproductor repro = new Reproductor(Musica, true,false);
            repro.play();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
