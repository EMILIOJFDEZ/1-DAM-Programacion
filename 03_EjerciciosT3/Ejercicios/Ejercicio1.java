/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

import java.util.Scanner;
import bpc.daw.reproductor.*;
/**
 *
 * @author Emilio<emiliojfdez2004@gmail.com>
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("***************************************");
        System.out.println("*    Ponga el numero de una cancion   *");
        System.out.println("* 1- KordHell - Murder in my mind     *");
        System.out.println("* 2- Daddy Yankee, El Alfa - Bombon   *");
        System.out.println("* 3- Estopa - Vino Tinto              *");
        System.out.println("* 4- Queen - Killer Queen             *");
        System.out.println("* 5- Xiao Rong - Super Idol           *");
        System.out.println("***************************************");
        int cancion=new Scanner(System.in).nextInt();
        
        switch(cancion) {
        case 1:
        ArchivoMP3 cancion1=new ArchivoMP3 ("C:/Users/Usuario/Downloads/Cancion1.mp3");
        Reproductor can1=new Reproductor(cancion1,false,false);
        can1.play();
        System.out.println("Reproduciendo: KordHell - Murder in my mind");
        break;
        
        case 2:
        ArchivoMP3 cancion2=new ArchivoMP3 ("C:/Users/Usuario/Downloads/Cancion2.mp3");
        Reproductor can2=new Reproductor(cancion2,false,false);
        can2.play();
        System.out.println("Reproduciendo: Daddy Yankee, El Alfa - Bombon");
        break;
        
        case 3:
        ArchivoMP3 cancion3=new ArchivoMP3 ("C:/Users/Usuario/Downloads/Cancion3.mp3");
        Reproductor can3=new Reproductor(cancion3,false,false);
        can3.play();
        System.out.println("Reproduciendo: Estopa - Vino Tinto");
        break;
        
        case 4:
        ArchivoMP3 cancion4=new ArchivoMP3 ("C:/Users/Usuario/Downloads/Cancion4.mp3");
        Reproductor can4=new Reproductor(cancion4,false,false);
        can4.play();
        System.out.println("Reproduciendo: Queen - Killer Queen");
        break;
        
        case 5:
        ArchivoMP3 cancion5=new ArchivoMP3 ("C:/Users/Usuario/Downloads/Cancion5.mp3");
        Reproductor can5=new Reproductor(cancion5,false,false);
        can5.play();
        System.out.println("Reproduciendo: Xiao Rong - Super Idol");
        
        }
    } 
}
