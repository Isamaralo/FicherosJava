package edu.femxa.val.ficheros;

import java.io.File;

public class ListarArchivosConA {

	public static void main(String[] args) {
		
		/**
		 * Dado un directorio, listar todos los archivos que contengan una "a".
		 */
		
		String ruta = "C:\\Users\\Administrador.000\\IsabelGrupoTarde\\FicherosJava\\FicherosJava\\Directorio";
		File dir = new File(ruta);
		String[] ficheros = dir.list();
		
		if(ficheros != null)
		{
			for (int i = 0; i < ficheros.length; i++) {
				File file = new File(ruta +"\\" +ficheros[i]);
				
				if(file.isFile())
				{
					boolean encontrado = false;
					int j = 0;
					do
					{
						if((ficheros[i].charAt(j) == 'a') || (ficheros[i].charAt(j) == 'A') )
						{
							System.out.println(ficheros[i]);
							encontrado = true;
						}
						j++;
					}
					while((j<ficheros[i].length()) && !encontrado);
				}
			}
		}
		else
			System.out.println("No hay ficheros en este directorio.");
		
	}
}
