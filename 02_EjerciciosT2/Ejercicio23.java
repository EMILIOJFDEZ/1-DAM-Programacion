/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_2_23;

import bpc.daw.objetos.TarjetaCredito;

/**
 *
 * @author Emilio<emiliojfdez2004@gmail.com>
 */
public class Ejercicio_2_23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TarjetaCredito tc=null;
        tc=new TarjetaCredito(1000,2222);
        try {int saldo=tc.getSaldo(2222);
        System.out.println("Su saldo es de: "+saldo);
        } catch (Exception saldo) {
            System.out.println("Su saldo es de: "+saldo);
        }
                    
        try {tc.ingresarDinero(100);
        int saldo=tc.getSaldo(2222);
        System.out.println("Ha ingresado 100 euros, su saldo ahora es de: "+saldo);
        } catch (Exception saldo) {
            System.out.println("Su saldo es de: "+saldo);
    }
        
        try {tc.sacarDinero(2800, 2222);
        int saldo=tc.getSaldo(2222);
        int verificacion=saldo-saldo;
        if (verificacion>0){System.out.println("Ha sacado 2800 euros, su saldo ahora es de: "+saldo);}
        else {System.out.println("Operacion cancelada, no tiene saldo suficiente para sacar tanto dinero");}
        } catch (Exception saldo) {
            System.out.println("Su saldo es de: "+saldo);
    }
}
}

