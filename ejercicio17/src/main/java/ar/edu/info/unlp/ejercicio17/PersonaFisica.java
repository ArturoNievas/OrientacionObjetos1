package ar.edu.info.unlp.ejercicio17;

public class PersonaFisica extends Persona {

	private int dni;
	
	public PersonaFisica(String nombre, String direccion, Telefono telefono, int dni) {
		super(nombre, direccion,telefono);
		this.dni = dni;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	@Override
	public double montoAFacturar(DateLapse periodo) {
		return this.telefonos.stream().mapToDouble(t -> t.gastosPeriodo(periodo)).sum()*0.9;
	}
}
