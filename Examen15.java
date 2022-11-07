/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen15;

/**
 *
 * @author Usuario
 */
public class Examen15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    boolean x = true;
    boolean y = false;
    boolean z = true;
    System.out.println("A: "+(x || y || x && !z && !y));
    System.out.println("B: "+((x||!y)&&(!x||z)));
    System.out.println("C: "+(!x||!y||z&&x&&!y));
    }
}