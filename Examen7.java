/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen7;

/**
 *
 * @author Usuario
 */
public class Examen7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    String n1 = "123";
    String n2 = "69";

    int suma;

    suma = Integer.parseInt(n1) + Integer.parseInt(n2);
    System.out.println("La suma es: " + Integer.toString(suma));
    
    int resta;

    resta = Integer.parseInt(n1) - Integer.parseInt(n2);
    System.out.println("La resta es: " + Integer.toString(resta));
    
    int multiplicacion;

    multiplicacion = Integer.parseInt(n1) * Integer.parseInt(n2);
    System.out.println("La resta es: " + Integer.toString(multiplicacion));
    
    double division;

    division = Double.parseDouble(n1) / Double.parseDouble(n2);
    System.out.println("La division es: " + (division));
    
    }
    
}