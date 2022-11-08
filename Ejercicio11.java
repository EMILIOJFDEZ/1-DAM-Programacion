/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_2_11;
import bpc.daw.objetos.*;
/**
 *
 * @author Emilio<emiliojfdez2004@gmail.com>
 */
public class Ejercicio_2_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Caja c1,c2=null;
        c1=new Caja("Mamahuevo");
        c1.cerrarCaja();
        String b1=c1.getMensaje();
        c1.abrirCaja();
        String b2=c1.getMensaje();
        System.out.println(b2);
        
        c2=new Caja("Glugluglu");
        c2.cerrarCaja();
        String b3=c2.getMensaje();
        c2.abrirCaja();
        String b4=c2.getMensaje();
        System.out.println(b4);
        
        c1.cambiarMensaje(b4);
        String b5=c1.getMensaje();
        System.out.println(b5);
        
        c2.cambiarMensaje(b2);
        String b6=c2.getMensaje();
        System.out.println(b6);
       
    }
    
}
