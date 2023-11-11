package ar.edu.info.unlp.ejercicio17;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

public class Telefono {

	private int numero;
	private List<Llamada> llamadas;
	
	public Telefono(int numero) {
		this.numero = numero;
		this.llamadas = new ArrayList<>();
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public Llamada registrarLlamadaLocal(LocalDate fecha, LocalTime hora, int duracion, Telefono telefonoDestino) {
		LlamadaLocal l = new LlamadaLocal(fecha,hora,duracion,telefonoDestino);
		this.llamadas.add(l);
		return l;
	}
	
	public Llamada registrarLlamadaInterurbana(LocalDate fecha, LocalTime hora, int duracion, Telefono telefonoDestino, double distanciaKilometros) {
		LlamadaInterurbana l = new LlamadaInterurbana(fecha,hora,duracion,telefonoDestino,distanciaKilometros);
		this.llamadas.add(l);
		return l;
	}
	
	public Llamada registrarLlamadaInternacional(LocalDate fecha, LocalTime hora, int duracion, Telefono telefonoDestino, String paisOrigen, String paisDestino) {
		LlamadaInternacional l = new LlamadaInternacional(fecha,hora,duracion,telefonoDestino,paisOrigen,paisDestino);
		this.llamadas.add(l);
		return l;
	}
	
	public double gastosPeriodo(DateLapse periodo) {
		return this.llamadas.stream().mapToDouble(l -> l.monto()).sum();
	}
}
