package edu.femxa.val.excepciones;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedVsUnchecked {

	public static void main(String[] args) {
		
		/*******  UNCHECKED EXCEPTIONS    *******/
		
		/* NullPointerException   */
		String cadena = null;
		
//		int tamanio = cadena.length();
//		
//		/**
//		 * La variable cadena está a null => la siguiente instrucción me da
//		 * una excepción: NullPointerException. No me ha obligado a capturarla,
//		 * es una excepción de tipo Unchecked.
//		 * Cuando llamo a un método que me devuelve una excepción, es obligatorio
//		 * recogerla, estas excepciones son de tipo Checked. 
//		 */
//		System.out.println(tamanio);
		
		//Para capturar la excepción
//		try {
//			int tamanio = cadena.length();
//			System.out.println(tamanio);
//			
//		} catch (Exception e) {
//			
//			System.out.println("EXCEPCIÓN PRODUCIDA");
//			e.printStackTrace(); //La variable e contiene el tipo de la excepción, en este caso NullPointer
//		}
		
		/* ArrayIndexOutOfBoundsException */
		
		int ae[] = new int[4];
		
		try {
			int longi = ae.length;
			ae[longi] = 3;
			System.out.println("Hola Mundo"); //Esta línea no se llega a ejecutar porque la excepción se produce antes
			
//		} catch (Exception e) { //Si lo sustituyo por catch (ArrayIndexOutOfBoundsException e) se ejecuta, si es otra excepción, no
//			
//			System.out.println("EXCEPCIÓN PRODUCIDA");
//			e.printStackTrace();
//		}
		//Se pueden poner varias cláusulas catch para capturar diferentes excepciones
		} catch (ArrayIndexOutOfBoundsException e) { 
			
			System.out.println("EXCEPCIÓN ARRAY");
			e.printStackTrace();
		}	
		 catch (NullPointerException e) { 
			
			System.out.println("EXCEPCIÓN NULL");
			e.printStackTrace();
		}
		 catch (Exception e) { 
				
			System.out.println("EXCEPCIÓN GENERAL");
			e.printStackTrace();
		}
		
		/*******  CHECKED EXCEPTIONS    *******/
		
		File f = new File("fulanito");
		if(f.exists())
		{
			System.out.println("Existe");
			try {
				FileReader fr = new FileReader(f);
				
			} catch (FileNotFoundException e) {
				
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
