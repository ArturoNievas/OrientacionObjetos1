package ar.edu.info.unlp.ejercicio19;

public class Producto {

	private Vendedor vendedor;
	private String nombre;
	private String descripcion;
	private double precio;
	private int cantidadDisponible;
	
	public Producto(Vendedor vendedor, String nombre, String descripcion, double precio, int cantidadDisponible) {
		this.vendedor = vendedor;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.cantidadDisponible = cantidadDisponible;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCantidadDisponible() {
		return cantidadDisponible;
	}

	public void setCantidadDisponible(int cantidadDisponible) {
		this.cantidadDisponible = cantidadDisponible;
	}
	
	public Vendedor getVendedor() {
		return vendedor;
	}

	public boolean disponible(int x) {
		return this.cantidadDisponible>=x;
	}
	
	public void retirarUnidades(int x) {
		this.cantidadDisponible -= x;
	}
}
