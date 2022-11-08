/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_2_8;
import bpc.daw.objetos.*;
/**
 *
 * @author Emilio<emiliojfdez2004@gmail.com>
 */
public class Ejercicio_2_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DepositoAgua da1,da2=null;
        int ci=15;
        int cm=20;
        int ci1=ci-5;
        int ci2=ci+10;
        da1=new DepositoAgua(ci1,cm);
        da2=new DepositoAgua(ci2,cm);
        da1.dibujar();
        da2.dibujar();
    }
    
}
