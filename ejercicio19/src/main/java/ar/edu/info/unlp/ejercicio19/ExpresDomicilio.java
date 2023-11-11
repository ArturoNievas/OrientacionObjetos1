package ar.edu.info.unlp.ejercicio19;

public class ExpresDomicilio extends MecanismoDeEnvio {

	public double costoEnvio(Trayecto trayecto) {
		return 0.5*trayecto.distancia();
	}
}
