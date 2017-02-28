package edu.femxa.val.ficherosXML;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class ParserLibrosXML extends DefaultHandler{
	
	private HashMap<String, Libro> hm;
	private Libro libro;
	private List<Libro> lista_libros;
	private String valor_actual; //Valor de lo que hay entre las etiquetas de apertura y cierre
	
	@Override
	public void startDocument() throws SAXException {
		// TODO Auto-generated method stub
		//super.startDocument();
		System.out.println("INICIO DEL DOCUMENTO");
		//Tengo el libro vacío
		//this.libro = new Libro(); -> No lo puedo crear aquí, tiene que ser cada vez que haya un nuevo element "libro"
		this.lista_libros = new ArrayList<Libro>();
		this.hm = new HashMap<String, Libro>();
	}
	
	@Override
	public void endDocument() throws SAXException {
		// TODO Auto-generated method stub
		//super.endDocument();
		System.out.println("FIN DEL DOCUMENTO");
		System.out.println("\nINFO LIBRO");
		for (Libro libros : lista_libros) {
			System.out.println("ISBN = " +libros.getIsbn());
			System.out.println("AUTOR = " +libros.getAutor());
			System.out.println("TÍTULO = " +libros.getTitulo());
			System.out.println("AÑO = " +libros.getAnyo());
			System.out.println("EDITORIAL = " +libros.getEditorial());
		}
		for (Libro libro : lista_libros) {
			hm.put(libro.getIsbn(), libro);
		}
		MapaLibros.setHm(hm);
	}
	
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		// TODO Auto-generated method stub
		//super.startElement(uri, localName, qName, attributes);
		System.out.println("StartElement = " + localName);
		if(localName.equals("libro"))
		{
			this.libro = new Libro();
			String valor_isbn = attributes.getValue("isbn");
			this.libro.setIsbn(valor_isbn);
		}
	}
	
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		// TODO Auto-generated method stub
		//super.endElement(uri, localName, qName);
		System.out.println("EndElement = " + localName);
		if(localName.equals("titulo"))
		{
			libro.setTitulo(valor_actual);
		}
		else if(localName.equals("autor"))
		{
			libro.setAutor(valor_actual);
		}
		else if(localName.equals("anyo"))
		{
			libro.setAnyo(valor_actual);
		}
		else if(localName.equals("editorial"))
		{
			libro.setEditorial(valor_actual);
		}
		if(localName.equals("libro"))
		{
			lista_libros.add(libro);
		}
			
	}
	
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		// TODO Auto-generated method stub
		//super.characters(ch, start, length);
		String str = new String(ch, start, length);
		valor_actual = str; 
		
		System.out.println("Start = " + start);
		System.out.println("Length = " + length);
		System.out.println("String = " + str);
	}
}
