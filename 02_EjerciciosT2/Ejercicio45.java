/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_2_45;

import java.time.*;

/**
 *
 * @author Emilio<emiliojfdez2004@gmail.com>
 */
public class Ejercicio_2_45 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LocalDate dia=LocalDate.of(2100,2,28);
        DayOfWeek semana = dia.getDayOfWeek();
        System.out.println("Fecha seleccionada: "+dia);
        System.out.println("Dia de la semana: "+semana);
  }    
}