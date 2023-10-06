package ar.edu.info.unlp.ejercicio11;

import java.util.*;

public class Inversor {

	private String nombre;
	private List<Inversion> inversiones;
	
	public Inversor() {
		this.inversiones = new ArrayList<>();
	}
	
	public Inversor(String nombre) {
		this.nombre = nombre;
		this.inversiones = new ArrayList<>();
	}
	
	public void agregarInversion(Inversion inversion) {
		this.inversiones.add(inversion);
	}
	
	public double valorActual() {
		return this.inversiones.stream().mapToDouble(i -> i.valorActual()).sum();
	}

}
