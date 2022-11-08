/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio__2_12;
import bpc.daw.objetos.*;
/**
 *
 * @author Emilio<emiliojfdez2004@gmail.com>
 */
public class Ejercicio__2_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MarcadorBaloncesto mb=null;
        mb=new MarcadorBaloncesto("Estudiandes","CB Granada");
        mb.anotarCanasta('L', 2);
        mb.anotarCanasta('V', 3);
        mb.anotarCanasta('L', 2);
        mb.anotarCanasta('V', 2);
        mb.anotarCanasta('V', 3);
        mb.anotarCanasta('L', 1);
        mb.anotarCanasta('L', 1);
        mb.anotarCanasta('V', 2);
        System.out.println(mb);
        System.out.println("El equipo ganador es: " +mb.getNombreEquipoGanador());
    }
    
}
