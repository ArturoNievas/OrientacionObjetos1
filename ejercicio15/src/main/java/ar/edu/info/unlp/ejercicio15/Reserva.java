package ar.edu.info.unlp.ejercicio15;

public class Reserva {

	private DateLapse periodo;
	private Usuario usuario;
	
	public Reserva(DateLapse periodo,Usuario usuario) {
		this.periodo = periodo;
		this.usuario = usuario;
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

	public double calcularPrecio(double precioPorNoche) {
		return this.periodo.sizeInDays()*precioPorNoche;
	}
}
