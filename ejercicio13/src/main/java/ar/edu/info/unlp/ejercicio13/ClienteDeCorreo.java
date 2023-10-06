package ar.edu.info.unlp.ejercicio13;

import java.util.*;

public class ClienteDeCorreo {

	// Acá podría haber puesto un solo atributo que sea carpetas y hacer que Inbox sea el primer elemento, pero siento que el enunciado pedía esto
	/*
	Habría que cambiar la implementación de los siguientes métodos si se implementa de la manera anterior
	
	public void recibir(Email email) {
		this.carpetas.get(0).agregarCorreo(email);
	}
	
	public Email buscar(String texto) {
		return this.carpetas.stream().map(c -> c.buscar(texto)).filter(e -> e != null).findFirst().orElse(null);
	}
	
	public Carpeta carpetaPorNombre(String nombre) {
		return this.carpetas.stream().filter(c -> c.getNombre().equals(nombre)).findFirst().orElse(null);
	}
	
	public int espacioOcupado() {
		return this.carpetas.stream().mapToInt(c -> c.tamanio()).sum();
	}
	
	Como se ve los métodos quedan más prolijos
	*/
	private Carpeta inbox;
	private List<Carpeta> carpetas;
	
	public ClienteDeCorreo() {
		this.inbox = new Carpeta("Inbox");
		this.carpetas = new ArrayList<>();
	}
	
	public void recibir(Email email) {
		this.inbox.agregarCorreo(email);
	}
	
	public void mover(Email email, Carpeta origen, Carpeta destino) {
		origen.eliminarCorreo(email);
		destino.agregarCorreo(email);
	}
	
	public Email buscar(String texto) {
		Email retorno = this.inbox.buscar(texto);
		if (retorno ==  null) {
			retorno = this.carpetas.stream().map(c -> c.buscar(texto)).filter(e -> e != null).findFirst().orElse(null);
		}
		return retorno;
	}
	
	public Carpeta carpetaPorNombre(String nombre) {
		if (nombre.equals("Inbox")) {
			return this.inbox;
		} else {
			return this.carpetas.stream().filter(c -> c.getNombre().equals(nombre)).findFirst().orElse(null);
		}
	}
	
	public void crearCarpeta(String nombre) {
		this.carpetas.add(new Carpeta(nombre));
	}
	
	public void agregarCarpeta(Carpeta carpeta) {
		this.carpetas.add(carpeta);
	}
	
	public int espacioOcupado() {
		return this.inbox.tamanio() + this.carpetas.stream().mapToInt(c -> c.tamanio()).sum();
	}
}
