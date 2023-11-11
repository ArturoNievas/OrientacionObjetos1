package ar.edu.info.unlp.ejercicio19;

/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public abstract class Persona {

	protected String nombre;
	protected String direccion;

	public Persona(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	

}
