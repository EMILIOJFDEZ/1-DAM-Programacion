/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package string3;

import java.util.Scanner;

/**
 *
 * @author Emilio<emiliojfdez2004@gmail.com>
 */

public class String3 {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        System.out.println("Introduzca el texto a traducir");
        String a=new Scanner(System.in).nextLine();
            if (a.endsWith("a"))
            {
            String b=a.substring(0, a.length()-1);
            System.out.println(b+"us");
            }
            else {
                if(a.endsWith("e"))
                {
                String c=a.substring(0, a.length()-1);
                System.out.println(c+"us");
                }
                else
                {
                if(a.endsWith("i")) { String d=a.substring(0, a.length()-1);
                    System.out.println(d+"us");
                    } else {if(a.endsWith("o")) {
                    String e=a.substring(0, a.length()-1);
                    System.out.println(e+"us");
                    } else{if(a.endsWith("u")) {
                        String f=a.substring(0, a.length()-1);
                        System.out.println(f+"us"); } else {
                            System.out.println(a+"us");
                            }
                }
                } 

            }


                 }
    }

}