package ar.edu.info.unlp.ejercicio17;

public class PersonaJuridica extends Persona {

	private int cuit;
	private String tipo;
	
	public PersonaJuridica(String nombre, String direccion, Telefono telefono, int cuit, String tipo) {
		super(nombre, direccion,telefono);
		this.cuit = cuit;
		this.tipo = tipo;
	}
	
	public int getCuit() {
		return cuit;
	}

	public void setCuit(int cuit) {
		this.cuit = cuit;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public Factura facturarPeriodo(DateLapse periodo) {
		// TODO Auto-generated method stub
		return null;
	}

}
