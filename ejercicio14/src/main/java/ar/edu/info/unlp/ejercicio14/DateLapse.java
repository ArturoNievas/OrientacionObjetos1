package ar.edu.info.unlp.ejercicio14;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateLapse implements DateLapseInterface {

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
}
