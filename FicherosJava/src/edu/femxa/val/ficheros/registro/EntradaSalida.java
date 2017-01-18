package edu.femxa.val.ficheros.registro;

import java.util.Scanner;

public class EntradaSalida {
	
	/**
	 * Muestra el menú con las opciones del programa
	 */
	public static void mostrarMenu ()
	{
		System.out.println("Elija una opción: ");
		System.out.println("1. REGISTRARSE");
		System.out.println("2. ACCEDER");
		System.out.println("3. SALIR");
	}
	
	/**
	 * Pide un número de tipo entero al usuario 
	 * @return El número que el usuario introduce por teclado
	 */
	public static int pedirOpcion ()
	{
		int opcion = 0;
		Scanner sc = null;
		
			sc = new Scanner(System.in);
			opcion = sc.nextInt();
			
		return opcion;
	}
	
	/**
	 * Pide un nombre al usuario
	 * @return La palabra que el usuario introduce por teclado
	 */
	public static String pedirNombre()
	{
		String nombre = null;
		Scanner sc = null;
		
			sc = new Scanner(System.in);
			System.out.println("Introduzca el nombre: ");
			nombre = sc.nextLine(); 
					
		return nombre;
	}
	
	/**
	 * Pide un nombre al usuario
	 * @return La palabra que el usuario introduce por teclado
	 */
	public static String pedirPassword()
	{
		String password = null;
		Scanner sc = null;
		
			sc = new Scanner(System.in);
			System.out.println("Introduzca la contraseña: ");
			password = sc.nextLine(); 
					
		return password;
	}
	
}