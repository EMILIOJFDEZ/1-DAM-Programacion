/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_2_38;

/**
 *
 * @author Emilio<emiliojfdez2004@gmail.com>
 */
public class Ejercicio_2_38 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Calcular las soluciones de x^2 ? 5? + 6\n");
        double r1, r2;
        int a = 1, b = -5, c =6;
        
        double Discriminante;
        Discriminante = Math.sqrt(Math.pow(b, 2)-4*a*c);
        
        if(Discriminante > 0){
            System.out.println("Tiene 2 soluciones:\n");
            
            r1= (-1*b + Math.sqrt(Math.pow(b, 2)-4*a*c))/2.0*a;
            r2= (-1*b - Math.sqrt(Math.pow(b, 2)- 4*a*c))/2.0*a;
            
            System.out.println("Solucion 1 = "+r1);
            System.out.println("Solucion 2 = "+r2);
            
        } else {
               if(Discriminante == 0){
                  System.out.println("Tiene una solucion:\n");
                
                  r1= (-1*b + Math.sqrt(Math.pow(b, 2)-4*a*c))/2.0*a;
                  System.out.println("Solución 1 = "+r1);   
               } else {
                      System.out.println("No hay solucion");
                     }
             } 
        
    }
}
