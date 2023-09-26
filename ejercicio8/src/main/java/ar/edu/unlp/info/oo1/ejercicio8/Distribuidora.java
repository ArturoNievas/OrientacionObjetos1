package ar.edu.unlp.info.oo1.ejercicio8;

import java.util.*;
import java.util.stream.*;

public class Distribuidora {

	private double precioKWh;
	private List<Usuario> usuarios;

	public Distribuidora(double precioKWh) {
		this.precioKWh = precioKWh;
		this.usuarios = new ArrayList<Usuario>();
	}

	public void agregarUsuario(Usuario usuario) {
		this.usuarios.add(usuario);
	}

	public List<Factura> facturar(){
		return this.usuarios.stream().map(u -> u.facturarEnBaseA(precioKWh)).collect(Collectors.toList());
	}

	public void precioKWh(double precioKWh) {
		this.precioKWh = precioKWh;
	}

	public double getPrecioKWh() {
		return this.precioKWh;
	}

	public double consumoTotalActiva() {
		return this.usuarios.stream().mapToDouble(u -> u.ultimoConsumoActiva()).sum();
	}

	public List<Usuario> getUsuarios() {
		return this.usuarios;
	}
}
