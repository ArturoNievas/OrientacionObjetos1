package ar.edu.info.unlp.ejercicio17;

import java.time.*;
import java.util.*;

public class Sistema {

	private List<Telefono> telefonosDisponibles;
	private List<Persona> clientes;
	
	public Sistema() {
		this.clientes = new ArrayList<>();
		this.telefonosDisponibles = new ArrayList<>();
	}
	
	public void altaNumero(int numero) {
		this.telefonosDisponibles.add(new Telefono(numero));
	}
	
	public void altaPersonaFisica(String nombre, String direccion, int dni) {
		this.clientes.add(new PersonaFisica(nombre,direccion,this.telefonosDisponibles.remove(-1),dni));
	}
	
	public void altaPersonaJuridica(String nombre, String direccion, int cuit, String tipo) {
		this.clientes.add(new PersonaJuridica(nombre,direccion,this.telefonosDisponibles.remove(-1),cuit,tipo));
	}
	
	public void altaLineaCliente(Persona cliente) {
		cliente.altaLinea(this.telefonosDisponibles.remove(-1));
	}
	
	public void bajaLineaCliente(Persona cliente, Telefono telefono) {
		cliente.bajaLinea(telefono);
		this.telefonosDisponibles.add(telefono);
	}
	
	public Llamada registrarLlamadaLocal(LocalDate fecha, LocalTime hora, int duracion, Telefono telefonoOrigen, Telefono telefonoDestino) {
		return telefonoOrigen.registrarLlamadaLocal(fecha, hora, duracion, telefonoDestino);
	}
	
	public Llamada registrarLlamadaInterurbana(LocalDate fecha, LocalTime hora, int duracion, Telefono telefonoOrigen, Telefono telefonoDestino, double distanciaKilometros) {
		return telefonoOrigen.registrarLlamadaInterurbana(fecha, hora, duracion, telefonoDestino,distanciaKilometros);
	}
	
	public Llamada registrarLlamadaInternacional(LocalDate fecha, LocalTime hora, int duracion, Telefono telefonoOrigen, Telefono telefonoDestino, String paisOrigen, String paisDestino) {
		return telefonoOrigen.registrarLlamadaInternacional(fecha, hora, duracion, telefonoDestino,paisOrigen,paisDestino);
	}

	public Factura facturarCliente(Persona cliente, LocalDate fechaInicio, LocalDate fechaFin) {
		return cliente.facturarPeriodo(new DateLapse(fechaInicio,fechaFin));
	}

	public List<Telefono> getTelefonosDisponibles() {
		return telefonosDisponibles;
	}

	public List<Persona> getClientes() {
		return clientes;
	}
	
}
