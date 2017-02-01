package edu.femxa.val.ficherosJSON;

import com.google.gson.Gson;

public class PrincipalPersonaJSON {

	public static void main(String[] args) {
		
		Gson gson = new Gson();
		
		Persona p = new Persona("Mikel", false, false, 4);
		
		//Quiero transformar el objeto p en JSON
		String jsonpersona = gson.toJson(p);
		System.out.println(jsonpersona);
		
		//Ahora transformo un String a un objeto de la clase Persona
		Persona p2 = gson.fromJson(jsonpersona, Persona.class);
		
		System.out.println("Nombre = " +p2.getNombre());
		System.out.println("Nhijos = " +p2.getNhijos());
		System.out.println("Casada = " +p2.isCasada());
		System.out.println("Parado = " +p2.isParado());
		
	}
}
