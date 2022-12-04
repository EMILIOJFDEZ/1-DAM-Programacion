/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_2_48;
import bpc.daw.objetos.MarcadorMejorado;
import static bpc.daw.objetos.MarcadorMejorado.*;
/**
 *
 * @author Emilio<emiliojfdez2004@gmail.com>
 */
public class Ejercicio_2_48 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                MarcadorMejorado mm=null;
        mm=new MarcadorMejorado("Estudiandes","CB Granada");
        mm.anotarCanasta(CANASTA_LOCAL,TRIPLE);
        mm.anotarCanasta(CANASTA_VISITANTE, TRIPLE);
        mm.anotarCanasta(CANASTA_LOCAL, NORMAL);
        mm.anotarCanasta(CANASTA_VISITANTE, NORMAL);
        mm.anotarCanasta(CANASTA_LOCAL, TRIPLE);
        mm.anotarCanasta(CANASTA_VISITANTE, TIRO_LIBRE);
        mm.anotarCanasta(CANASTA_LOCAL, TIRO_LIBRE);
        mm.anotarCanasta(CANASTA_VISITANTE, NORMAL);
        
        System.out.println("El equipo local es : " +mm.getNombreLocal());
        System.out.println("El equipo visitante es : " +mm.getNombreVisitante());
        System.out.println("Los puntos de estudiantes son: " +mm.getPuntosLocal());
        System.out.println("Los puntos de CB Granada son: " +mm.getPuntosVisitante());
        System.out.println("El equipo ganador es: " +mm.getNombreEquipoGanador());
    }
    
}
