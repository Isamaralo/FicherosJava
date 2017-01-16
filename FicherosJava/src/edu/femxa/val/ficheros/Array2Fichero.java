package edu.femxa.val.ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Array2Fichero {
	
	public static String[] fromFichero2Array (File file) throws IOException
	{
		String[] lista_cadena = null;
		lista_cadena = new String[5];
		BufferedReader br = new BufferedReader(new FileReader(new File(file.getName())));
		int i = 0;
		String linea = null;
		
			linea = br.readLine();
			while(linea != null)
			{
				lista_cadena[i] = linea;
				linea = br.readLine();
			}
			
			br.close();
		
		return lista_cadena;		
	}
	
	public static boolean fromArray2Fichero (String[] array)
	{
		boolean ok = false;
		File file = new File("pepe2");
		
		
			
		
		return ok;
	}
	
	public static void main(String[] args) throws IOException {
		
		File file = new File("pepe");
		String[] lista_cadena = new String[5];
		
		lista_cadena = fromFichero2Array(file);
		
		
	}

}
