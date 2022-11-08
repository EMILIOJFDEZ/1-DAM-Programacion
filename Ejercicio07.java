/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_2_7;
import bpc.daw.objetos.*;
/**
 *
 * @author Emilio<emiliojfdez2004@gmail.com>
 */
public class Ejercicio_2_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DepositoAgua da=null;
        da=new DepositoAgua(15,50);
        da.dibujar();
        int porcentaje=(15*100)/50;
        System.out.println("El porcentaje de agua es: " +porcentaje);
        
    }
    
}
