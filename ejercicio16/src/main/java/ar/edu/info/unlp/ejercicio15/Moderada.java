package ar.edu.info.unlp.ejercicio15;

import java.time.LocalDate;

public class Moderada extends PoliticaCancelacion {

	@Override
	public double montoReembolsoCancelacion(Reserva reserva, LocalDate fecha) {
		DateLapse t = new DateLapse(LocalDate.now(),reserva.getPeriodo().getFrom());
		if (t.sizeInDays()<=7) {
			return reserva.calcularPrecio();
		} else {
			return 0;
		}
	}

}
