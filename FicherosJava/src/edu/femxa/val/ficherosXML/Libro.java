package edu.femxa.val.ficherosXML;

public class Libro {
	
	private String isbn;
	private String titulo;
	private String autor;
	private int anyo;
	private String editorial;
	
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getAnyo() {
		return anyo;
	}
	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
}
