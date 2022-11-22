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
        String fileseparator="file.separator";
        String classpath="java.class.path";
        String javahome="java.home";
        String javavendor="java.vendor";
        String javavendorurl="java.vendor.url";
        String javaversion="java.version";
        String lineseparator="line.separator";
        String osarch="os.arch";
        String osname="os.name";
        String osversion="os.version";
        String pathseparator="path.separator";
        String userdir="user.dir";
        String userhome="user.home";
        String username="user.name";
        
        System.out.println("Separador de lineas: "+System.getProperty(fileseparator));
        System.out.println("Ubicacion del proyecto: "+System.getProperty(classpath));
        System.out.println("Ubicacion home de java: "+System.getProperty(javahome));
        System.out.println("Distribuidor del programa: "+System.getProperty(javavendor));
        System.out.println("Enlace del distribuidor: "+System.getProperty(javavendorurl));
        System.out.println("Version java: "+System.getProperty(javaversion));
        System.out.println("Separador: "+System.getProperty(lineseparator));
        System.out.println("Arquitectura del SO: "+System.getProperty(osarch));
        System.out.println("Nombre del SO: "+System.getProperty(osname));
        System.out.println("Version del SO: "+System.getProperty(osversion));
        System.out.println("Separador de comando: "+System.getProperty(pathseparator));
        System.out.println("Ubicacion del directorio: "+System.getProperty(userdir));
        System.out.println("Ubicacion home: "+System.getProperty(userhome));
        System.out.println("Ubicacion nombre de usuario: "+System.getProperty(username));
        
    }
    
}
