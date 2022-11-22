/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_3_prueba_03;

/**
 *
 * @author Emilio<emiliojfdez2004@gmail.com>
 */
public class Ejercicio_3_Prueba_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombreSO="os.name";
        String versionSO="os.version";
        String arquitecturaSO="os.arch";
        System.out.println("\nNombre del SO: " +System.getProperty(nombreSO));
        System.out.println("\nVersion del SO: " +System.getProperty(versionSO));
        System.out.println("\nArquitectura del SO: " +System.getProperty(arquitecturaSO));
    }
}
