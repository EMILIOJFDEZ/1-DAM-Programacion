/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_2_22;
import bpc.daw.objetos.*;

/**
 *
 * @author Emilio<emiliojfdez2004@gmail.com>
 */
public class Ejercicio_2_22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TarjetaCredito tc=null;
        tc=new TarjetaCredito(5000,1111);
        try {int saldo=tc.getSaldo(1111);
        System.out.println("Su saldo es de: "+saldo);
        } catch (Exception saldo) {
            System.out.println("Su saldo es de: "+saldo);
        }
                    
        try {tc.ingresarDinero(2000);
        int saldo=tc.getSaldo(1111);
        System.out.println("Ha ingresado 2000 euros, su saldo ahora es de: "+saldo);
        } catch (Exception saldo) {
            System.out.println("Su saldo es de: "+saldo);
    }
        
        try {tc.sacarDinero(2000, 1111);
        int saldo=tc.getSaldo(1111);
        System.out.println("Ha sacado 2000 euros, su saldo ahora es de: "+saldo);
        } catch (Exception saldo) {
            System.out.println("Su saldo es de: "+saldo);
    }
}
}
