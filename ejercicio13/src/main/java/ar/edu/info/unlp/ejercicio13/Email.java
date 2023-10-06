package ar.edu.info.unlp.ejercicio13;

import java.util.*;

public class Email {

	private String titulo;
	private String cuerpo;
	private List<Archivo> adjuntos;
	
	public Email(String titulo, String cuerpo) {
		this.titulo = titulo;
		this.cuerpo = cuerpo;
		this.adjuntos = new ArrayList<>();
	}

	public String getTitulo() {
		return titulo;
	}

	public String getCuerpo() {
		return cuerpo;
	}
	
	public void adjuntarArchivo(Archivo archivo) {
		this.adjuntos.add(archivo);
	}

	public List<Archivo> adjuntos() {
		return adjuntos;
	}
	
	public int tamanio() {
		int retorno = this.titulo.length() + this.cuerpo.length();
		if (!this.adjuntos.isEmpty()) {
			retorno += this.adjuntos.stream().mapToInt(a -> a.tamanio()).sum();
		}
		return retorno;
	}
	
	public boolean buscar(String texto) {
		return this.titulo.contains(texto) || this.cuerpo.contains(texto);
	}
}
