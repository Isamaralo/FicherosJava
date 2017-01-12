package edu.femxa.val.ficheros;

import java.io.File;

public class MainFicheros {

	public static void listarDirectorio (String nombre)
	{
		File directorio = new File(nombre);
		String[] lista_ficheros = null;

		System.out.println(directorio.getName());
		
		if(directorio.isDirectory())
		{
			lista_ficheros = directorio.list();
			for(int i = 0; i < lista_ficheros.length; i++)
				listarDirectorio(nombre+"\\"+lista_ficheros[i]);
		}
	}
	
	public static void main(String[] args) {
		
		/**
		 * Crear una carpeta en la raíz de nuestro proyecto Java dentro de Eclipse e introducir
		 * algunos ficheros. Hacer después un programa, para que liste el directorio y los ficheros.
		 */
//		File directorio = new File ("C:\\Users\\Administrador.000\\IsabelGrupoTarde\\FicherosJava\\FicherosJava\\Directorio");
//		String[] lista_ficheros = directorio.list();
//		
//		if (lista_ficheros != null)
//			//listarDirectorio(directorio);
//			for(int i = 0; i < lista_ficheros.length; i++)
//				System.out.println(lista_ficheros[i]);
//		else
//			System.out.println("No hay ficheros en el directorio.");
		
		/**
		 * Hacer un programa para que desde el directorio actual (“.”), recorra el árbol de
		 * directorios y muestre todos los directorios, subdirectorios y sus respectivos archivos.
		 */
//		File directorio_actual = new File(".");
//		String[] lista_ficheros_dir_actual = directorio_actual.list();
//		
//		if (lista_ficheros_dir_actual != null)
//		{
//			String nombre = directorio_actual.getName();
//			listarDirectorio(nombre);
//		}
//		else
//			System.out.println("No hay ficheros en el directorio.");
		
		/**
		 * Hacer un programa que dada una ruta, muestre los subdirectorios ocultos.
		 */
		String ruta = "C:/Users/Administrador.000/IsabelGrupoTarde/FicherosJava";
		File directorios_ocultos = new File (ruta);
		String[] lista_ficheros_ocultos = directorios_ocultos.list();
		
		if (lista_ficheros_ocultos != null)
			for(int i = 0; i < lista_ficheros_ocultos.length; i++)
			{
				File sub_directorio = new File (ruta+"\\"+lista_ficheros_ocultos[i]);
				
				if((sub_directorio.isDirectory()) && (lista_ficheros_ocultos[i].charAt(0)=='.'))
				{
					System.out.println("Ocultos: " +lista_ficheros_ocultos[i]);
				}
			}
			
		else
			System.out.println("No hay ficheros ni directorios en el directorio.");
		
		
		
	}
}
