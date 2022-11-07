/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen10;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Examen10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Numero 1");
        int n1=new Scanner(System.in).nextInt();
        System.out.println("Numero 2");
        int n2=new Scanner(System.in).nextInt();
        System.out.println("Numero 3");
        int n3=new Scanner(System.in).nextInt();
        int Operacion_n1=n1-(n2+n3);
        int Operacion_n1_2=n1+Operacion_n1;
        
        int Operacion_n2=n2-(n1+n3);
        int Operacion_n2_2=n2+Operacion_n2;
        
        if (Operacion_n1_2>1)   {
            System.out.println("El primer numero es el mas grande");
            }
        else    {if (Operacion_n2_2>1)   {
                    System.out.println("El segundo numero es el mas grande");}
                else        {
                    System.out.println("El tercer numero es el mas grande");}
                }
            }
    }
