package edu.femxa.val.ficherosXML;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

public class MainSaxListaLibros {

	public static void main(String[] args) throws SAXException, FileNotFoundException, IOException {
		
		XMLReader reader = XMLReaderFactory.createXMLReader();
		ParserLibrosXML parserLibros = null;
		parserLibros = new ParserLibrosXML();
		
		//Según va leyendo el xml avisa a la clase que he creado ParserLibroXML
		reader.setContentHandler(parserLibros);
		//Le paso el fichero que quiero parsear
		reader.parse(new InputSource(new FileInputStream("libros.xml"))); //InputSource se utiliza cuando utilizo Sax para leer el fichero XML
		
	}
}
