/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package string4;

import java.util.Scanner;

/**
 *
 * @author Emilio<emiliojfdez2004@gmail.com>
 */
public class String4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    System.out.println("Dime una frase:");
    String f1 =new Scanner(System.in).nextLine();
    String f2 =f1.replace("A", "67 ").replace("B","68 ")
    .replace("C","69 ").replace("D","70 ").replace("E","71 ").replace("F","72 ")
    .replace("G","73 ").replace("H","74 ").replace("I","75 ").replace("J","76 ")
    .replace("K","77 ").replace("L","78 ").replace("M","79 ").replace("N","80 ")
    .replace("O","81 ").replace("P","82 ").replace("Q","83 ").replace("R","84 ")
    .replace("S","85 ").replace("T","86 ").replace("U","87 ").replace("V","88 ")
    .replace("W","89 ").replace("X","90 ").replace("Y","91 ").replace("Z","92 ")        
    .replace("a", "99 ").replace("b","100 ").replace("c","101 ").replace("d","102 ")
    .replace("e","103 ").replace("f","104 ").replace("g","105 ").replace("h","106 ")
    .replace("i","107 ").replace("j","108 ").replace("k","109 ").replace("l","110 ")
    .replace("m","111 ").replace("n","112 ").replace("o","113 ").replace("p","114 ")
    .replace("q","115 ").replace("r","116 ").replace("s","117 ").replace("t","118 ")
    .replace("u","119 ").replace("v","120 ").replace("w","121 ").replace("x","122 ")
    .replace("y","123 ").replace("z","124 ");
    System.out.println(f2);
    String f3 =f2.replace("67 ","C").replace("68 ","D")
    .replace("69 ","E").replace("70 ","F").replace("71 ","G").replace("72 ","H")
    .replace("73 ","I").replace("74 ","J").replace("75 ","K").replace("76 ","L")
    .replace("77 ","M").replace("78 ","N").replace("79 ","O").replace("80 ","P")
    .replace("81 ","Q").replace("82 ","R").replace("83 ","S").replace("84 ","T")
    .replace("85 ","U").replace("86 ","V").replace("87 ","W").replace("88 ","X")
    .replace("89 ","Y").replace("90 ","Z").replace("91 ","[").replace("92 ", "\\")
    .replace("99 ","c").replace("100 ","d").replace("101 ","e").replace("102 ","f")
    .replace("103 ","g").replace("104 ","h").replace("105 ","i").replace("106 ","j")
    .replace("107 ","k").replace("108 ","l").replace("109 ","m").replace("110 ","n")
    .replace("111 ","o").replace("112 ","p").replace("113 ","q").replace("114 ","r")
    .replace("115 ","s").replace("116 ","t").replace("117 ","u").replace("118 ","v")
    .replace("119 ","w").replace("120 ","x").replace("121 ","y").replace("122 ","z")
    .replace("123 ","{").replace("124 ", "|");
    System.out.println(f3);
    }
}