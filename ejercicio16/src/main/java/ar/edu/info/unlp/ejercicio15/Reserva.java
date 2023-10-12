package ar.edu.info.unlp.ejercicio15;

public class Reserva {

	private DateLapse periodo;
	private Propiedad propiedad;
	private Usuario usuario;
	
	public Reserva(DateLapse periodo, Propiedad propiedad, Usuario usuario) {
		this.periodo = periodo;
		this.propiedad = propiedad;
		this.usuario = usuario;
	}

	public DateLapse getPeriodo() {
		return periodo;
	}

	public void setPeriodo(DateLapse periodo) {
		this.periodo = periodo;
	}

	public Propiedad getPropiedad() {
		return propiedad;
	}

	public void setPropiedad(Propiedad propiedad) {
		this.propiedad = propiedad;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public double calcularPrecio() {
		return this.periodo.sizeInDays()*this.propiedad.getPrecioPorNoche();
	}
}
