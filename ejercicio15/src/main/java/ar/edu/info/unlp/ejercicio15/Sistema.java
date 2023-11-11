package ar.edu.info.unlp.ejercicio15;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Sistema {

	private List<Usuario> usuarios;
	private List<Propiedad> propiedades;
	
	public Sistema() {
		this.propiedades = new ArrayList<>();
		this.usuarios = new ArrayList<>();
	}	

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public List<Propiedad> getPropiedades() {
		return propiedades;
	}

	public Usuario registrarUsuario(String nombre, String direccion, int dni) {
		Usuario nuevoUsuario = new Usuario(nombre,direccion,dni);
		this.usuarios.add(nuevoUsuario);
		return nuevoUsuario;
	}
	
	// Suponemos que el usuario ya esta registrado, sino hay que preguntar si está registrado y de no ser así registrarlo
	public Propiedad registrarPropiedad(String nombre, String descripcion, double precioPorNoche, String direccion, Usuario usuario) {
		Propiedad nuevaPropiedad = new Propiedad(nombre,descripcion,precioPorNoche,direccion);
		this.propiedades.add(nuevaPropiedad);
		usuario.registrarPropiedad(nuevaPropiedad);
		return nuevaPropiedad;
	}
	
	public List<Propiedad> propiedadesDisponibles(DateLapse periodo){
		return this.propiedades.stream().filter(p -> p.disponible(periodo)).collect(null);
	}
	
	public Reserva reservar(Propiedad propiedad, DateLapse periodo, Usuario usuario) {
		Reserva nuevaReserva = null;
		if (propiedad.disponible(periodo)) {
			nuevaReserva = new Reserva(periodo,usuario);
			propiedad.reservar(nuevaReserva);
		}
		return nuevaReserva;
	}
	
	public double precioReserva(Reserva reserva) {
		return reserva.calcularPrecio(this.propiedades.stream().filter(p -> p.reservaCorresponde(reserva)).findFirst().orElse(null).getPrecioPorNoche());
	}
	
	public void cancelarReserva(Reserva reserva) {
		if (reserva.getPeriodo().getFrom().isAfter(LocalDate.now())){
			this.propiedades.stream().filter(p -> p.reservaCorresponde(reserva)).findFirst().orElse(null).cancelarReserva(reserva);
		}
	}
	
	public List<Reserva> getReservasUsuario(Usuario usuario){
		return this.propiedades.stream().map(p -> p.getReservasUsuario(usuario)).flatMap(List::stream).collect(Collectors.toList());
	}
	
	public double ingresosPropietarioPorPeriodo(Usuario usuario, DateLapse periodo) {
		return usuario.ingresosPorPeriodo(periodo);
	}
}
