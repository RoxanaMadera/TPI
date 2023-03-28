
package TPI;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TPI {

    public static void main(String[] args)throws FileNotFoundException,IOException 
    {
    String rutaAMiArchivo = "C:\\Users\\Violeta\\Documents\\NetBeansProjects\\TPI\\Partidos.csv";
    Files.readAllLines(Paths.get(rutaAMiArchivo));
    
    String rutaAMiArchivo2 = "C:\\Users\\Violeta\\Documents\\NetBeansProjects\\TPI\\pronostico.csv";
    Files.readAllLines(Paths.get(rutaAMiArchivo2));
    
    
    
    for (String unaLinea: Files.readAllLines(Paths.get(rutaAMiArchivo))){
         
     
     
        
        
        
        
        System.out.println(unaLinea);
    }
        
    
        
       
    }
}
