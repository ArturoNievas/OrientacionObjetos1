package ar.edu.unlp.info.oo1.ejercicio8;

import java.util.*;
import java.util.stream.*;

public class Usuario {

	private String domicilio;
	private String nombre;
	private List<Factura> facturas;
	private List<Consumo> consumos;

	public Usuario(String nombre, String domicilio) {
		this.domicilio = domicilio;
		this.nombre = nombre;
		this.facturas = new ArrayList<Factura>();
		this.consumos = new ArrayList<Consumo>();
	}

	public void agregarMedicion(Consumo consumo) {
		this.consumos.add(consumo);
		this.consumos = this.consumos.stream().sorted((c1,c2) -> c1.getFecha().compareTo(c2.getFecha())).collect(Collectors.toList());
	}

	public double ultimoConsumoActiva() {
		double ultimoConsumoActiva = 0;
		Consumo ultimoConsumo = this.ultimoConsumo();
		if (ultimoConsumo != null) {
			ultimoConsumoActiva = ultimoConsumo.getConsumoEnergiaActiva();
		}
		return ultimoConsumoActiva;
	}

	public Factura facturarEnBaseA(double precioKWh){
		Consumo ultimoConsumo = this.ultimoConsumo();
		Factura factura = null;
		if (ultimoConsumo != null) {
			double descuento = 0;
			if (ultimoConsumo.factorDePotencia()>0.8) {
				descuento = 10;
			}
			factura = new Factura(this.ultimoConsumoActiva()*precioKWh,descuento,this);
		} else {
			factura = new Factura(0,0,this);
		}
		this.facturas.add(factura);
		return factura;
	}

	public List<Factura> facturas() {
		return this.facturas;
	}

	public Consumo ultimoConsumo() {
		Consumo ultimoConsumo = null;
		if (!this.consumos.isEmpty()) {
			ultimoConsumo = this.consumos.get(this.consumos.size()-1);
		}
		return ultimoConsumo;
	}

	public List<Consumo> getConsumos() {
		return this.consumos;
	}

	public String getNombre() {
		return this.nombre;
	}

	public String getDomicilio() {
		return this.domicilio;
	}
}
