/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_2_1;
import bpc.daw.mario.*;

public class Ejercicio_2_1 {

    public static void main(String[] args) {
            
            String str1="Hola";
            Mario m1, m2, m3=null;
            Luigi l1=null;
            Seta s1=null;
            Cañon c1=null;
            Disparo d1=null;
            Planta p1, p2, p3=null;
            
            //Modo Constructor
            
            m1=new Mario(100,100);
            m2=new Mario(640,320);
            m3=new Mario(250,0);
            l1=new Luigi(200,0);          
            s1=new Seta(1875,1000);
            c1=new Cañon(100,320);
            d1=new Disparo(100,320,320,320);
            p1=new Planta(400,500);
            p2=new Planta(450,500);
            p3=new Planta(500,500);
    
    }
    
}
