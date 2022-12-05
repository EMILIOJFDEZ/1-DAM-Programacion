/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_2_54;
import java.util.*;

/**
 *
 * @author Emilio<emiliojfdez2004@gmail.com>
 */
public class Ejercicio_2_54 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] li = {"videojuego","anime","manga","serie","comic",
        "comida","animal","cocina","musica",""};
        
        System.out.println(li.toString());

        Arrays.sort(li);

        for (int i = 0; i < li.length; i++) {
            
            System.out.println(li[i]);
            
        }
    
    }   
}
