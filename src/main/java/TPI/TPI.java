
package TPI;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class TPI {

    public static void main(String[] args)throws FileNotFoundException,IOException 
    {
   
    // Leer Archivo Resultados   
        
    Collection<Partido> partidos = new ArrayList<>();    // Coleccion para guardar todos los partidos
    
    String rutaAMiArchivo = "C:\\Users\\Violeta\\Documents\\NetBeansProjects\\TPI\\Partidos.csv";
    List <String> lineas1 = Files.readAllLines(Paths.get(rutaAMiArchivo));
    
    boolean primera = true;
     for (String unaLinea:lineas1){
         if (primera) {
         primera = false;
         }
        else {
          System.out.println(unaLinea);
          String[] campos = unaLinea.split(";");
          Equipo equipo1 = new Equipo(campos[2]);
          Equipo equipo2 = new Equipo(campos[5]);
          Partido partido = new Partido(equipo1, equipo2);
          partido.setGolesEquipo1(Integer.parseInt (campos[3]));
          partido.setGolesEquipo2(Integer.parseInt (campos[4]));
          partidos.add(partido);
     }
     
     } 
     
     // Leer archivo Pronosticos y calcular los puntos
     int puntos = 0;
    
    String rutaAMiArchivo2 = "C:\\Users\\Violeta\\Documents\\NetBeansProjects\\TPI\\pronosticos.csv";
    List <String> lineas2 = Files.readAllLines(Paths.get(rutaAMiArchivo2));
    
    primera = true;
      for (String unaLinea: lineas2){
          if (primera) {
         primera = false;
         }
        else { 
          System.out.println(unaLinea);
          String[] campos = unaLinea.split(";");
          Equipo equipo1 = new Equipo(campos[2]);
          Equipo equipo2 = new Equipo(campos[6]);
          Partido partido = null;
          
          for (Partido partidoCol: partidos){                //Comparo con los partidos de la coleccion
             if (partidoCol.getEquipo1().getNombre().equals(equipo1.getNombre()) &&
                partidoCol.getEquipo2().getNombre().equals(equipo2.getNombre())) {
                 
                 partido = partidoCol;                        //Asigna el partido
                 
             }    
          }
          
          Equipo equipo = null;
          NewEnum resultado = null;
          if ("x".equals(campos[3])) {
              equipo = equipo1;
              resultado = NewEnum.GANADOR;
             }
          if ("x".equals(campos[4])) {
              equipo = equipo1;
              resultado = NewEnum.EMPATE;
             }
           if ("x".equals(campos[5])) {
              equipo = equipo1;
              resultado = NewEnum.PERDEDOR;
             }
          
          
          Pronostico pronostico = new Pronostico(partido, equipo, resultado);
          puntos += pronostico.puntos();
          
    }  
    
        
    }
      
  
      System.out.println ("Los puntos obtenidos por el participante son: " + (puntos)) ;
      
      
}
}