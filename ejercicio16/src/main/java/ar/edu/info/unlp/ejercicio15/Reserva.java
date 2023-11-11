package ar.edu.info.unlp.ejercicio15;

public class Reserva {

	private DateLapse periodo;
	private Usuario usuario;
	private double precioPorNoche;
	
	public Reserva(DateLapse periodo, Usuario usuario, double precioPorNoche) {
		this.periodo = periodo;
		this.usuario = usuario;
		this.precioPorNoche = precioPorNoche;
	}

	public DateLapse getPeriodo() {
		return periodo;
	}

	public void setPeriodo(DateLapse periodo) {
		this.periodo = periodo;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public double getPrecioPorNoche() {
		return precioPorNoche;
	}

	public void setPrecioPorNoche(double precioPorNoche) {
		this.precioPorNoche = precioPorNoche;
	}

	public double calcularPrecio() {
		return this.periodo.sizeInDays()*this.precioPorNoche;
	}
}
