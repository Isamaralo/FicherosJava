package edu.femxa.val.ficheros.serializacion;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class PrincipalSerializacion {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		ArrayPersonas lista_personas = new ArrayPersonas();

		Persona p1 = new Persona("Susana", 23);
		Persona p2 = new Persona("Cristina", 22);
		Persona p3 = new Persona("Dante", 22);
		Persona p4 = new Persona("Manuel", 21);
		Persona p5 = new Persona("Diego", 23);
		Persona p_aux = new Persona();
		
		lista_personas.insertarPersona(p1);
		lista_personas.insertarPersona(p2);
		lista_personas.insertarPersona(p3);
		lista_personas.insertarPersona(p4);
		lista_personas.insertarPersona(p5);
		
		ObjectOutputStream salida=new ObjectOutputStream(new FileOutputStream("fichPersonas.dat"));
		for (int i = 0; i < lista_personas.TAMANIO_LISTA; i++) {
			salida.writeObject (lista_personas.obtenerPersona(i)); 
		}
		salida.close();
		
		ObjectInputStream entrada =new ObjectInputStream (new FileInputStream("fichPersonas.dat"));
		for (int i = 0; i < lista_personas.TAMANIO_LISTA; i++) {
			p_aux= (Persona)entrada.readObject();
			System.out.print(p_aux);
		}
		
		entrada.close();


				
	}
}
