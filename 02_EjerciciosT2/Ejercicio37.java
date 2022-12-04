/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_2_37;

import java.util.Scanner;

/**
 *
 * @author Emilio<emiliojfdez2004@gmail.com>
 */
public class Ejercicio_2_37 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            System.out.println("Ponga un numero");
        int num = new Scanner(System.in).nextInt();
        
        Integer numero = num;
        
        System.out.println(num+"\nbinario: "+Integer.toBinaryString(numero)+"\nhexadecimal: "+Integer.toHexString(numero));
        
        
    }

}
