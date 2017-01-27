package edu.femxa.val.ficherosDePropiedades;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Cuento {

	public static void main(String[] args) throws IOException {

		Properties fichero_propiedades = null;
		
		fichero_propiedades = new Properties();
		
		FileReader fr = null;
		
		if(args[0].equals("ES"))
		{
			fr = new FileReader("story_es.properties");
		}
		else if(args[0].equals("EN"))
		{
			fr = new FileReader("story_en.properties");
		}
		else if(args[0].equals("IT"))
		{
			fr = new FileReader("story_it.properties");
		}

		fichero_propiedades.load(fr);
		
		String[] valores = new String[3];
		valores[0] = fichero_propiedades.getProperty("start");
		valores[1] = fichero_propiedades.getProperty("body");
		valores[2] = fichero_propiedades.getProperty("end");
		
		String nombre_cuento = fichero_propiedades.getProperty("outfile");
		
		BufferedWriter bw = new	BufferedWriter(new FileWriter(new File(nombre_cuento)));
		String linea = null;
		
		for (int i = 0; i < valores.length; i++) {
			linea = valores[i];
			try {
				bw.write(linea);
				if(i < valores.length-1)
					bw.newLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		fr.close();
		bw.close();
	}
}
