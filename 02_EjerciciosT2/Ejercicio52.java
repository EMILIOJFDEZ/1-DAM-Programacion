/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicicio_2_52;
import java.awt.*;
import java.util.*;
/**
 *
 * @author Emilio<emiliojfdez2004@gmail.com>
 */
public class Ejercicicio_2_52 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                Map<String,Color> mapa = new HashMap<>();
        mapa.put("12535ABC", Color.RED);
        mapa.put("98525KWX",Color.YELLOW);
        mapa.put("17632MSE", Color.GREEN);
        mapa.put("85321ABC", Color.YELLOW);
        
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