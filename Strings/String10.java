/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package string10;

/**
 *
 * @author Emilio<emiliojfdez2004@gmail.com>
 */
public class String10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String exampleString = "nosotros no somos como los orozco, yo los conozco, son ocho los monos";
        
        int t = 0;
        char temp;
        for (int i = 0; i < exampleString.length(); i++) {

            temp = exampleString.charAt(i);
            if (temp == 'o')
                t++;
        }
        
        int t0 = 0;
        char temp0;
        for (int i = 0; i < exampleString.length(); i++) {

            temp0 = exampleString.charAt(i);
            if (temp0 == ' ')
                t0++;
        }
        
        int t1 = 0;
        char temp1;
        for (int i = 0; i < exampleString.length(); i++) {

            temp1 = exampleString.charAt(i);
            if (temp1 == 's')
                t1++;
        }
        
        int t2 = 0;
        char temp2;
        for (int i = 0; i < exampleString.length(); i++) {

            temp2 = exampleString.charAt(i);
            if (temp2 == 'n')
                t2++;
        }
        
        int t3 = 0;
        char temp3;
        for (int i = 0; i < exampleString.length(); i++) {

            temp3 = exampleString.charAt(i);
            if (temp3 == 'c')
                t3++;
        }
        
        int t4 = 0;
        char temp4;
        for (int i = 0; i < exampleString.length(); i++) {

            temp4 = exampleString.charAt(i);
            if (temp4 == 'm')
                t4++;
        }
        
        int t5 = 0;
        char temp5;
        for (int i = 0; i < exampleString.length(); i++) {

            temp5 = exampleString.charAt(i);
            if (temp5 == 'l')
                t5++;
        }

        int t6 = 0;
        char temp6;
        for (int i = 0; i < exampleString.length(); i++) {

            temp6 = exampleString.charAt(i);
            if (temp6 == 'z')
                t6++;
        }
        
        int t7 = 0;
        char temp7;
        for (int i = 0; i < exampleString.length(); i++) {

            temp7 = exampleString.charAt(i);
            if (temp7 == 'r')
                t7++;
        }
        
        int t8 = 0;
        char temp8;
        for (int i = 0; i < exampleString.length(); i++) {

            temp8 = exampleString.charAt(i);
            if (temp8 == ',')
                t8++;
        }
        
        int t9 = 0;
        char temp9;
        for (int i = 0; i < exampleString.length(); i++) {

            temp9 = exampleString.charAt(i);
            if (temp9 == 'y')
                t9++;
        }
        
        int t10 = 0;
        char temp10;
        for (int i = 0; i < exampleString.length(); i++) {

            temp10 = exampleString.charAt(i);
            if (temp10 == 't')
                t10++;
        }
        
        int t11 = 0;
        char temp11;
        for (int i = 0; i < exampleString.length(); i++) {

            temp11 = exampleString.charAt(i);
            if (temp11 == 'h')
                t11++;
        }
        
        System.out.println("En este texto salen un total de " +t +" o, "+ t0 +" espacios, "+t1+" s, " +t2 +" n, " +t3 +" c, "
        +t4 +" m, " +t5 +" l, " +t6 +" z, " +t7 +" r, " +t8 +" comas, " +t9 +" y, " +t10 +" t, " +t11 +" h, ");
    }
}