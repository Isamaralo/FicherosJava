package edu.femxa.val.ficheros;

import java.io.File;

public class MainFicheros {

	public static void listarDirectorio (File directorio)
	{
		String[] ficheros = directorio.list();
		for(int i = 0; i < ficheros.length; i++)
		{
			File sub_directorio = new File (ficheros[i]);
			
			if(sub_directorio.isDirectory())
				listarDirectorio(sub_directorio);
			
			else
				System.out.println(ficheros[i]);
		}
	}
	
	public static void main(String[] args) {
		
		/**
		 * Crear una carpeta en la raíz de nuestro proyecto Java dentro de Eclipse e introducir
		 * algunos ficheros. Hacer después un programa, para que liste el directorio y los ficheros.
		 */
		File directorio = new File ("C:\\Users\\Administrador.000\\IsabelGrupoTarde\\FicherosJava\\FicherosJava\\Directorio");
		String[] lista_ficheros = directorio.list();
		
		if (lista_ficheros != null)
			for(int i = 0; i < lista_ficheros.length; i++)
				System.out.println(lista_ficheros[i]);
		else
			System.out.println("No hay ficheros en el directorio.");
		
		/**
		 * Hacer un programa para que desde el directorio actual (“.”), recorra el árbol de
		 * directorios y muestre todos los directorios, subdirectorios y sus respectivos archivos.
		 */
		File directorio_actual = new File(".");
		String[] lista_ficheros_dir_actual = directorio_actual.list();
		
		if (lista_ficheros_dir_actual != null)
				listarDirectorio(directorio_actual);
		
		else
			System.out.println("No hay ficheros en el directorio.");
		
		
		
		
	}
}
