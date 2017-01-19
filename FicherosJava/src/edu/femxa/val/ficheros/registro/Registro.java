package edu.femxa.val.ficheros.registro;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import edu.femxa.val.ficheros.Array2Fichero;

public class Registro {
	
	/**
	 * Método que registra un usuario en el sistema. Escribe en el fichero
	 * users.txt el nombre del usuario y en el fichero pwd.txt la contraseña
	 * del usuario.
	 * @param nombre Nombre del nuevo usuario
	 * @param password Contraseña del nuevo usuario
	 * @return True si se han almacenado los datos del nuevo usuario y false si 
	 * ya existe un usuario en el fichero users.txt con ese nombre
	 * @throws IOException
	 */
	public static boolean registrarse(String nombre, String password) throws IOException
	{
		boolean ok = true;
		String[] lista_users = null;
		String pwd_cifrada = null;
		File file_users = new File("users.txt");
		File file_pwd = new File("pwd.txt");
		BufferedWriter bw = new	BufferedWriter(new FileWriter(file_users));
		BufferedWriter bw2 = new BufferedWriter(new FileWriter(file_pwd));
		
			lista_users = Array2Fichero.fromFichero2Array(file_users);
			for (int i = 0; i < lista_users.length; i++) {
				if (lista_users[i].equals(nombre))
					ok = false;
			}
			
			if(ok)
			{
				bw.write(nombre);
				pwd_cifrada = Codificar.codifica(password);
				bw2.write(pwd_cifrada);
				ok = true;
			}
			
			bw.close();
			bw2.close();
		
		return ok;
	}
	
	/**
	 * Método que verifica el acceso al sistema a un usuario. Comprueba que el 
	 * nombre introducido está en el fichero users.txt y coincide con la contraseña que 
	 * está en el fichero pwd.txt.
	 * @param nombre Nombre del usuario que quiere acceder al sistema
	 * @param password Constraseña del usuario que quiere acceder al sistema
	 * @return True si el usuario y la contraseña son correctos y false si alguno de los dos no es correcto
	 * @throws IOException
	 */
	public static boolean acceder (String nombre, String password) throws IOException
	{
		boolean ok = false;
		String[] lista_users = null;
		String[] lista_pwd = null;
		String pwd_descifrada = null;
		File file_users = new File("users.txt");
		File file_pwd = new File("pwd.txt");
		
			lista_users = Array2Fichero.fromFichero2Array(file_users);
			for (int i = 0; i < lista_users.length; i++) {
				if (lista_users[i].equals(nombre))
					ok = true;
				else
					ok = false;
			}
		
			lista_pwd = Array2Fichero.fromFichero2Array(file_pwd);
			for (int i = 0; i < lista_users.length; i++) {
				pwd_descifrada = Codificar.decodifica(lista_pwd[i]);
				if (pwd_descifrada.equals(password))
					ok = true;
				else
					ok = false;
			}
			
		return ok;
	}

}
