package edu.femxa.val.ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Array2Fichero {
	
	/**
	 * Método que recibe un fichero y lo recorre para
	 * saber cuántas líneas tiene.
	 * @param file Ficheo que hay que recorrer
	 * @return Número de líneas que tiene el fichero
	 * @throws IOException
	 */
	public static int cuentaLineas (File file) throws IOException
	{
		int num_lineas = 0;
		BufferedReader br = new BufferedReader(new FileReader(new File(file.getName())));
			
			while(br.readLine() != null)
			{
				num_lineas++;
			}
			br.close();
			
		return num_lineas;
	}
	
	/**
	 * Método que lee un fichero de texto y guarda el contenido
	 * en un array. Primero llama al método cuentaLineas para saber
	 * cuántas líneas tiene y reserva espacio en el array.
	 * Luego recorre el fichero y guarda en cada posición del array
	 * una línea.
	 * @param file Fichero que hay que leer
	 * @return Array con el contenido del fichero
	 * @throws IOException
	 */
	public static String[] fromFichero2Array (File file) throws IOException
	{
		String[] lista_cadena = null;
		int num_lineas = 0;
		BufferedReader br = new BufferedReader(new FileReader(new File(file.getName())));
		String linea = "";
		
			num_lineas = cuentaLineas(file);
			lista_cadena = new String[num_lineas];
			br.close();
			BufferedReader br2 = new BufferedReader(new FileReader(new File(file.getName())));

			int i = 0;
			linea = br2.readLine();
			while(linea != null)
			{
				lista_cadena[i] = linea;
				linea = br2.readLine();
				i++;
			}
			
			br2.close();
		
		return lista_cadena;		
	}
	
	/**
	 * Método que escribe en un fichero el contenido de un array.
	 * @param array Objeto en el que está el contenido que hay que guardar en el fichero
	 * @return True si se ha escrito el fichero correctamente y false si no
	 * @throws IOException
	 */
	public static boolean fromArray2Fichero (String[] array) throws IOException 
	{
		boolean ok = false;
		File file = new File("pepe2");
		file.createNewFile();
		BufferedWriter bw = new	BufferedWriter(new FileWriter(file));
		String linea = null;
		
			for (int i = 0; i < array.length; i++) {
				linea = array[i];
				try {
					bw.write(linea);
					bw.newLine();
					ok = true;
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			bw.close();
			
		return ok;
	}
	
	public static void main(String[] args) throws IOException {
		
		File file = new File("pepe");
		String[] lista_cadena = new String[5];
		
		lista_cadena = fromFichero2Array(file);
		System.out.println("El contenido del fichero " +file.getName()+ " es: ");
		for (int i = 0; i < lista_cadena.length; i++) {
			System.out.println(lista_cadena[i]);
		}
		if(fromArray2Fichero(lista_cadena))
			System.out.println("\nEl fichero \"pepe2\" se ha creado correctamente.");
		
	}

}
