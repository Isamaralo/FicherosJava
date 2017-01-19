package edu.femxa.val.ficheros.serializacion;

import java.io.Serializable;

public class Persona implements Serializable{
	
	//sección atributos
	private String nombre;
	private int edad;
	//fin sección atributos
	
	//sección métodos
	public Persona()
	{
		
	}
	public Persona(String nombre_r, int edad_r)
	{
		this.nombre = nombre_r;
		this.edad = edad_r;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void mostrarPersona()
	{
		System.out.println("Nombre = " +this.nombre);
		System.out.println("Edad = " +this.edad);
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean son_iguales = false;
		
		Persona p1 = (Persona) obj;
		
			if((this.nombre == p1.nombre) && (this.edad == p1.edad))
				son_iguales = true;
		
		return son_iguales;
	}
	//fin sección métodos
}