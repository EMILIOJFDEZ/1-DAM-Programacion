/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_2_36;

/**
 *
 * @author Emilio<emiliojfdez2004@gmail.com>
 */
public class Ejercicio_2_36 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double resultado;
        
        resultado= Math.sqrt(150);
        System.out.println("Raiz cuadrada de 150 = "+resultado+"\n");
        
        resultado= Math.pow(2, 9)/ Math.log(6);
        System.out.println("2^9 / log 6 = "+resultado+"\n");
        
        resultado=  Math.cos(0.16);
        System.out.println("Coseno de 0.16 radianes = "+resultado+"\n");
        
        resultado = Math.sin(Math.toRadians(45));
        System.out.println("Seno de 45 grados = "+resultado+"\n");
                
    }

}