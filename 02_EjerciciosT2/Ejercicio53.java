/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_2_53;
import java.util.*;
/**
 *
 * @author Emilio<emiliojfdez2004@gmail.com>
 */
public class Ejercicio_2_53 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TreeMap mapa = new TreeMap<>();

        mapa.put("12535ABC", "Color rojo");
        mapa.put("98525KWX", "Color amarillo");
        mapa.put("17632MSE", "Color verde");
        mapa.put("85321ABC", "Color amarillo");

        System.out.println("Tamano del map: "+mapa.size());
        System.out.println(mapa.toString());
        
        System.out.println("Dime la matricula del coche");
        String matricula = new Scanner(System.in).nextLine();
        
        if(mapa.containsKey(matricula)){
        System.out.println("Color del coche: "+mapa.get(matricula));
        }else{
            System.out.println("Esta matricula no existe");
        }
    }
}