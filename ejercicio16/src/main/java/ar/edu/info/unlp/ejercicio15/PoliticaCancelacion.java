package ar.edu.info.unlp.ejercicio15;

import java.time.LocalDate;

public abstract class PoliticaCancelacion {

	public abstract double montoReembolsoCancelacion(Reserva reserva, LocalDate fecha);
}
