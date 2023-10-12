package ar.edu.info.unlp.ejercicio15;

import java.time.LocalDate;

public class Flexible extends PoliticaCancelacion {

	public double montoReembolsoCancelacion(Reserva reserva, LocalDate fecha) {
		return reserva.calcularPrecio();
	}

}
