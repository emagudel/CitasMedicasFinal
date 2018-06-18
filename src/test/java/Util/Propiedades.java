package Util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Propiedades {

    static Properties propiedades;
    
    public static Properties getPropiedades() 
    {
         propiedades = new Properties();
         File origen = new File("serenity.properties");
         
         try
         {
        	 InputStream in = new FileInputStream(origen);
        	 propiedades.load(in);
         }
         catch (IOException e) 
         {
             e.printStackTrace();
         }
         return propiedades;
    }
    
}
