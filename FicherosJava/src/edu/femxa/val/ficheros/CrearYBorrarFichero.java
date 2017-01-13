package edu.femxa.val.ficheros;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CrearYBorrarFichero {
	
	/**
	 * Pide al usuario que introduzca un nombre por teclado.
	 * @return La cadena que ha introducido el usuario
	 */
	public static String pedirNombreFichero()
	{
		String nombre_fichero = null;
		Scanner sc = null;
		
			sc = new Scanner(System.in);
			System.out.println("Introduzca el nombre del fichero: ");
			nombre_fichero = sc.nextLine(); 
					
		return nombre_fichero;
	}
	
	public static void main(String[] args) throws IOException  {
		
		String nombre_fichero = null;
		String ruta = null;
		Scanner sc = new Scanner(System.in);
		
		nombre_fichero = pedirNombreFichero();
		ruta = ".\\"+nombre_fichero;
		File file = new File(ruta);
		
		if(file != null)
		{
			if(file.createNewFile())
				System.out.println(file.getName());
			else
				System.out.println("No se ha creado el fichero.");
		}
		
		System.out.println("¿Quiere borrar el fichero?(si/no)");
		
		if(sc.nextLine().equals("si"))
		{
			file.delete();
			System.out.println(file.delete());
			if(file.delete())
				System.out.println("El fichero se ha borrado.");
		}
		
	}
}
