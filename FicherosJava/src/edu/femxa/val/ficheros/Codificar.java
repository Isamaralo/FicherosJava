package edu.femxa.val.ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Haced el cuerpo de los métodos
 * y un pequeño main para probarse
 * de forma que luego podamos
 * usar esta clase para codificar
 * decodificar ficheros
 * 
 * Un método codifica el mensaje
 * y llamando al método decodifica,
 * recuperaría el mensaje origina
 * 
 * @author Administrador
 *
 */
public class Codificar {
    
	/**
	 * Dada una cadena, utiliza el cifrado César con clave
	 * 7 para codificarla y se devuelve la cadena codificada.
	 * @param cadena Cadena que recibe
	 * @return La cadena codificada
	 */
    public static String codifica (String cadena)
    {
        String cad_codificada = new String();
        int longi = cadena.length();
        int num_caracter = 0;
        char c = 0;
        char char_codificado = 0;
        
        
        for (int i = 0; i < longi; i++) {
    		c = cadena.charAt(i);
        	if(c != ' ')
			{
        		num_caracter = (int) c;
        		num_caracter += 7;
        		char_codificado = (char) num_caracter;
			}
			else
				char_codificado = ' ';
        	
            cad_codificada += char_codificado;            
        }
        
        return cad_codificada;
    }
    
    /**
     * Dada una cadena, la decodifica utilizando el 
     * cifrado César con clave 7.
     * @param cadena Cadena codificada
     * @return Cadena decodificada
     */
    public static String decodifica (String cadena)
    {
        String cad_decodificada = new String();
        int longi = cadena.length();
        int num_caracter = 0;
        char c = 0;
        char char_codificado = 0;
        
        
        for (int i = 0; i < longi; i++) {
    		c = cadena.charAt(i);
        	if(c != ' ')
			{
        		num_caracter = (int) c;
        		num_caracter -= 7;
        		char_codificado = (char) num_caracter;
			}
			else
				char_codificado = ' ';
        	
            cad_decodificada += char_codificado;            
        }
        
        return cad_decodificada;
    }
    
    public static void main(String[] args) throws IOException {
        
        FileReader file_reader = new FileReader(new File ("prueba.txt"));
        int a = 0;
        String cadena = "";
        String cad_codificada = "";
        String cad_decodificada = "";
        
        while (a != -1)
        {
            char c = (char) a;
            cadena += c;
            a = file_reader.read();
        }
        System.out.println("Contenido del fichero: " +cadena);
       
        cad_codificada = codifica(cadena);
        System.out.println("Cadena codificada: " +cad_codificada);
        
        cad_decodificada = decodifica(cad_codificada);
        System.out.println("Cadena decodificada: " +cad_decodificada);
        
        file_reader.close();
    }

}