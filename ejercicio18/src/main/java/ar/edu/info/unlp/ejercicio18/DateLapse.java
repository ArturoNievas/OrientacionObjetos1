package ar.edu.info.unlp.ejercicio18;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateLapse {

	private LocalDate from;
	private LocalDate to;
	
	public DateLapse(LocalDate from, int sizeInDays) {
		this.from = from;
		this.to = this.from.plusDays(sizeInDays);
	}
	
	public DateLapse(LocalDate from, LocalDate to) {
		this.from = from;
		this.to = to;
	}
	
	public LocalDate getFrom() {
		return this.from;
	}
	public LocalDate getTo() {
		return this.to;
	}
	
	public int sizeInDays() {
		return (int) ChronoUnit.DAYS.between(this.from, this.to);
	}
	
	public boolean includesDate(LocalDate other) {
		return (other.isBefore(this.to) && other.isAfter(this.from)) || other.isEqual(this.from) || other.isEqual(this.to);
	}
	
	public boolean includesDateLapse(DateLapse periodo) {
		return this.includesDate(periodo.getFrom()) && this.includesDate(periodo.getTo());
	}
	
	public boolean overlaps(DateLapse otroPeriodo) {
		return this.includesDate(otroPeriodo.getFrom()) || this.includesDate(otroPeriodo.getTo()) || (this.from.isAfter(otroPeriodo.getFrom()) && this.to.isBefore(otroPeriodo.getTo()));
	}
	
	public int daysOverlaps(DateLapse otroPeriodo) {
		if (this.overlaps(otroPeriodo)) {
			if (this.includesDateLapse(otroPeriodo)) {
				return this.sizeInDays();
			} else {
				if (otroPeriodo.getFrom().isAfter(this.from)) {
					return (int) ChronoUnit.DAYS.between(otroPeriodo.getFrom(), this.to);
				} else {
					return (int) ChronoUnit.DAYS.between(this.from, otroPeriodo.getTo());
				}
			}
		} else {
			return 0;
		}
		
	}
}
