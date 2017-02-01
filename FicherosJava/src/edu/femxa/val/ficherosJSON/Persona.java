package edu.femxa.val.ficherosJSON;

public class Persona {

	private String nombre;
	private boolean casada;
	private boolean parado;
	private int nhijos;
	
	public Persona(String nombre, boolean casada, boolean parado, int nhijos) {
		super();
		this.nombre = nombre;
		this.casada = casada;
		this.parado = parado;
		this.nhijos = nhijos;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public boolean isCasada() {
		return casada;
	}
	public void setCasada(boolean casada) {
		this.casada = casada;
	}
	public boolean isParado() {
		return parado;
	}
	public void setParado(boolean parado) {
		this.parado = parado;
	}
	public int getNhijos() {
		return nhijos;
	}
	public void setNhijos(int nhijos) {
		this.nhijos = nhijos;
	}
}
