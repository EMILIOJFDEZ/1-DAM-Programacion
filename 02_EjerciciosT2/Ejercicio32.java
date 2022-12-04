

package ejercicio_2_32;

import java.util.Scanner;
import bpc.daw.reproductor.*;
/**
 *
 * @author javier granizo <javiercelia123@gmail.com>
 */
public class Ejercicio_2_32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] a={"KordHell - Murder in my mind","Daddy Yankee, El Alfa - Bombon","Estopa - Vino Tinto",
            "Queen - Killer Queen","Xiao Rong - Super Idol"};
        
        ArchivoMP3 b=new ArchivoMP3("C:\\Users\\Usuario\\Downloads\\Cancion1.mp3");
        ArchivoMP3 c=new ArchivoMP3("C:\\Users\\Usuario\\Downloads\\Cancion2.mp3");
        ArchivoMP3 d=new ArchivoMP3("C:\\Users\\Usuario\\Downloads\\Cancion3.mp3");
        ArchivoMP3 f=new ArchivoMP3("C:\\Users\\Usuario\\Downloads\\Cancion4.mp3");
        ArchivoMP3 e=new ArchivoMP3("C:\\Users\\Usuario\\Downloads\\Cancion5.mp3");
        
        System.out.println("**************************************");
        System.out.println("*        Playlist       Diaria        *");
        System.out.println("***************************************");
        System.out.println("* 1- KordHell - Murder in my mind     *");
        System.out.println("* 2- Daddy Yankee, El Alfa - Bombon   *");
        System.out.println("* 3- Estopa - Vino Tinto              *");
        System.out.println("* 4- Queen - Killer Queen             *");
        System.out.println("* 5- Xiao Rong - Super Idol           *");
        System.out.println("***************************************");
        
        System.out.println("Reproduce una de estas 5 canciones");
        int n=new Scanner(System.in).nextInt();
        switch(n){
        case 1:
            System.out.println("Reproduciendo: "+a[n-1]);
            Reproductor g=new Reproductor(b,false,true);
            g.play();
            break;
        case 2:
            System.out.println("Reproduciendo: "+a[n-1]);
            Reproductor h=new Reproductor(c,false,true);
            h.play();
            break;
        case 3:
            System.out.println("Reproduciendo: "+a[n-1]);
            Reproductor i=new Reproductor(d,false,true);
            i.play();
            break;
        case 4:
            System.out.println("Reproduciendo: "+a[n-1]);
            Reproductor j=new Reproductor(e,false,true);
            j.play();
            break;
        case 5:
            System.out.println("Reproduciendo: "+a[n-1]);
            Reproductor k=new Reproductor(f,false,true);
            k.play();
            break;
        }
    }
}





