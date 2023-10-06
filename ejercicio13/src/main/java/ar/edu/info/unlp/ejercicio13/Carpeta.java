package ar.edu.info.unlp.ejercicio13;

import java.util.*;

public class Carpeta {

	private String nombre;
	private List<Email> emails;
	
	public Carpeta(String nombre) {
		this.nombre = nombre;
		this.emails = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public List<Email> getEmails() {
		return emails;
	}

	public void agregarCorreo(Email email) {
		this.emails.add(email);
	}
	
	public void eliminarCorreo(Email email) {
		this.emails.remove(email);
	}
	
	public Email buscar(String texto) {
		return this.emails.stream().filter(e -> e.buscar(texto)).findFirst().orElse(null);
	}
	
	public int tamanio() {
		int retorno = this.nombre.length();
		if (!this.emails.isEmpty()) {
			retorno += this.emails.stream().mapToInt(e -> e.tamanio()).sum();
		}
		return retorno;
	}
}
