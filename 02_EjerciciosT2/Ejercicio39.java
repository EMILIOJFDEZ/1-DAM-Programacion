/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_2_39;

/**
 *
 * @author Emilio<emiliojfdez2004@gmail.com>
 */
public class Ejercicio_2_39 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Información sobre el ordenador:");
        System.out.println("Sistema Operativo: "+System.getProperty("os.name"));
        System.out.println("Versión del Sistema Operativo: "+System.getProperty("os.version" ));
        System.out.println("Arquitectura del Sistema Operativo: "+System.getProperty("os.arch"));
        System.out.println("Usuario Actual: "+System.getProperty("user.name"));
        System.out.println("Carpeta de Archivos Temporales: "+System.getenv("TMP"));
    }

}