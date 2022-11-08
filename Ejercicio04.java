/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_2_4;
import bpc.daw.mario.*;
/**
 *
 * @author Emilio<emiliojfdez2004@gmail.com>
 */
public class Ejercicio_2_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            Mario m1=null;
            Luigi l1=null;
            Seta s1=null;
            Cañon c1=null;
            Disparo d1=null;
            Planta p1, p2, p3=null;
            
            //Modo Constructor
            
            m1=new Mario(650,0);

            l1=new Luigi(600,0);          
            s1=new Seta(1875,1000);
            c1=new Cañon(0,0);
            d1=new Disparo(0,0,200,0);
            p1=new Planta(400,500);
            p2=new Planta(450,500);
            p3=new Planta(500,500);
            s1.andarHacia(100, 100);
            p1.comer(true);
            p2.comer(true);
            p3.comer(true);
            
            int luigix=l1.getX();
            int luigiy=l1.getY();
            int mariox=m1.getX();
            int marioy=m1.getY();
            
            System.out.println("La ubicacion de Luigi es " +luigix +"x y " +luigiy +"y");
            System.out.println("La ubicacion de Mario es " +mariox +"x y " +marioy +"y");
    }
    
}
