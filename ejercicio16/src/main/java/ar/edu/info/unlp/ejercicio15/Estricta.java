package ar.edu.info.unlp.ejercicio15;

import java.time.LocalDate;

public class Estricta extends PoliticaCancelacion {

	@Override
	public double montoReembolsoCancelacion(Reserva reserva, LocalDate fecha) {
		return 0;
	}

}
