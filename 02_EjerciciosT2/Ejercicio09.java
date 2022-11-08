/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_2_9;
import bpc.daw.objetos.*;
/**
 *
 * @author Emilio<emiliojfdez2004@gmail.com>
 */
public class Ejercicio_2_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Caja c1=null;
        c1=new Caja("Bienvenido al instituto");
        c1.cerrarCaja();
        String b1=c1.getMensaje();
        c1.abrirCaja();
        String b2=c1.getMensaje();
        System.out.println(b2);
    }
    
}
