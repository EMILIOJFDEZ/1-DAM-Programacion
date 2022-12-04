/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_2_41;

/**
 *
 * @author Emilio<emiliojfdez2004@gmail.com>
 */
public class Ejercicio_2_41 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double operacion=(0.38*4.93);
        double resultado=Math.pow(operacion,0.36);
        double redondeado = Math.floor(resultado);
        System.out.println("El resultado de la operación es: "+resultado);
        System.out.println("Su resultado en numeros enteros es: "+redondeado);
    }
}
