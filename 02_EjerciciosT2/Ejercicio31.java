/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_2_31;
import bpc.daw.musica.*;
/**
 *
 * @author javier granizo <javiercelia123@gmail.com>
 */
public class ejercicio_2_31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cancion a=null;
        a=new Cancion("si");
        NotaMusical DO=null;
        DO=new NotaMusical(0,1);
        NotaMusical RE=null;
        RE=new NotaMusical(1,1);
        NotaMusical MI=null;
        MI=new NotaMusical(2,1);
        NotaMusical FA=null;
        FA=new NotaMusical(3,1);
        NotaMusical SOL=null;
        SOL=new NotaMusical(4,1);
        NotaMusical LA=null;
        LA=new NotaMusical(5,1);
        NotaMusical SI=null;
        SI=new NotaMusical(6,1);
        
        a.añadir(SOL);
        a.añadir(RE);
        a.añadir(SI);
        a.añadir(SOL);
        a.añadir(SI);
        a.añadir(LA);
        a.añadir(SOL);
        
        Instrumento p=null;
        p=new Piano();
        p.reproducir(a);
        Instrumento g=null;
        g=new Guitarra();
        g.reproducir(a);
    }
}
