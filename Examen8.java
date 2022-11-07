/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen8;

/**
 *
 * @author Usuario
 */
public class Examen8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    String[] vo = {"a","e","i","o","u"};
    double[] num = {0.2, 0.3, 0.4, 0.5, 0.6};
    String[] ldp = {"java","html","xml","pyton","json"};
    ldp[0] = "cobol";
   System.out.println("La ultima vocal es: : "+vo[vo.length-1]);
   System.out.println("El ultimo numero es: : "+num[num.length-1]);
   System.out.println("El ultimo lenguaje es: : "+ldp[ldp.length-1]);
   System.out.println(".El primer lenguaje es: : "+ldp[0]); 
    }
}
