package edu.femxa.val.ficherosXML;

import java.util.HashMap;

public class MapaLibros {
	
	private static HashMap<String, Libro> hm;

	public static HashMap<String, Libro> getHm() {
		return hm;
	}

	public static void setHm(HashMap<String, Libro> hm) {
		MapaLibros.hm = hm;
	}

	public MapaLibros ()
	{
		MapaLibros.hm = new HashMap<String, Libro>();
	}
}
