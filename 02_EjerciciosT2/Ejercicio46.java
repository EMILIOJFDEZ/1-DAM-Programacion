/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_2_46;

import java.time.*;

/**
 *
 * @author Emilio<emiliojfdez2004@gmail.com>
 */
public class Ejercicio_2_46 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int s1=(int)(Math.random()*(10-0)+1);
        System.out.println(s1);
        int s2=s1*1000;
        
        Instant instant = Instant.now();
        long epochSecond = instant.getEpochSecond();
        System.out.println("Segundos: " + epochSecond);
        try{
            Thread.sleep(s2);
        }
        catch(InterruptedException z)
        {
            System.out.println("No pudo realizarse la acción");
        }
        Instant instant2 = Instant.now();
        long epochSecond2 = instant2.getEpochSecond();
        long pausa=epochSecond2-epochSecond;
        System.out.println("Segundos de pausa: " + epochSecond2);
        System.out.println("Tiempo pausado: " + pausa);
        System.out.println("Programa finalizado");
    }
}