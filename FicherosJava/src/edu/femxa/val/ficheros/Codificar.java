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
    
    public static String codifica (String cadena)
    {
        String cad_codificada = new String();
        int longi = cadena.length();
        
        for (int i = longi-1; i >= 0; i--) {
            
            cad_codificada += cadena.charAt(i);            
        }
        
        return cad_codificada;
    }
    
    public static String decodifica (String cadena)
    {
        String cad_decodificada = new String();
        int longi = cadena.length();
        
        for (int i = longi-1; i >= 0; i--) {
            
            cad_decodificada += cadena.charAt(i);            
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