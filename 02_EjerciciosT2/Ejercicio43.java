/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_2_43;
import java.text.*;
/**
 *
 * @author Emilio<emiliojfdez2004@gmail.com>
 */
public class Ejercicio_2_43 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double pi=4*Math.atan(1);
        System.out.println();
        NumberFormat a=NumberFormat.getInstance();
        a.setMaximumFractionDigits(4);
        System.out.println(a.format(pi));
    }

}
