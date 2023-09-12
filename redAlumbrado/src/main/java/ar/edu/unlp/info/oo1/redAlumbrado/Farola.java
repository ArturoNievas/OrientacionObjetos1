package ar.edu.unlp.info.oo1.redAlumbrado;

import java.util.*;

public class Farola {

	private boolean encendida;
	private List<Farola> farolasVecinas;
	
	/*
	* Crear una farola. Debe inicializarla como apagada
	*/
	public Farola() {
		this.encendida = false;
		this.farolasVecinas = new ArrayList<Farola>();
	}
	
	/*
	* Crea la relación de vecinos entre las farolas. La relación de vecinos
	entre las farolas es recíproca, es decir el receptor del mensaje será vecino
	de otraFarola, al igual que otraFarola también se convertirá en vecina del
	receptor del mensaje
	*/
	public void pairWithNeighbor(Farola otraFarola) {
		if (!this.farolasVecinas.contains(otraFarola)) {
			this.farolasVecinas.add(otraFarola);
			otraFarola.pairWithNeighbor(this);
		}
	}
	
	/*
	* Retorna sus farolas vecinas
	*/
	public List<Farola> getNeighbors() {
		return this.farolasVecinas;
	}
	
	/*
	* Si la farola no está encendida, la enciende y propaga la acción.
	*/
	public void turnOn() {
		if (!this.encendida) {
			this.encendida = true;
			for (Farola farola: this.farolasVecinas) {
				farola.turnOn();
			}
		}
	}
	
	/*
	* Si la farola no está apagada, la apaga y propaga la acción.
	*/
	public void turnOff() {
		if (this.encendida) {
			this.encendida = false;
			for (Farola farola: this.farolasVecinas) {
				farola.turnOff();
			}
		}
	}
	
	/*
	* Retorna true si la farola está encendida.
	*/
	public boolean isOn() {
		return this.encendida;
	}
}
