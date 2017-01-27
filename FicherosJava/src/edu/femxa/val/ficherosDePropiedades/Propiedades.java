package edu.femxa.val.ficherosDePropiedades;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Propiedades {

	public static void main(String[] args) throws IOException 
	{		
		Properties fichero_propiedades = null;
		
		fichero_propiedades = new Properties();
		
		FileReader fr = new FileReader("db.properties");
		
		fichero_propiedades.load(fr);
		
		String valor_driver = fichero_propiedades.getProperty("driver");
		String valor_cadena_conexion = fichero_propiedades.getProperty("cadena_conexion");
		String valor_user = fichero_propiedades.getProperty("user");
		String valor_password = fichero_propiedades.getProperty("password");
		
		System.out.println(valor_driver);
		System.out.println(valor_cadena_conexion);
		System.out.println(valor_user);
		System.out.println(valor_password); 
		
		fichero_propiedades.setProperty("user", "Isabel"); //No lo escribe en el fichero
		System.out.println(fichero_propiedades.getProperty("user")); 
		
		fr.close();
	}
}
