package ar.edu.info.unlp.ejercicio14b;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import ar.edu.info.unlp.ejercicio14.DateLapseInterface;

public class DateLapse implements DateLapseInterface {

	private LocalDate from;
	private int sizeInDays;
	
	public DateLapse(LocalDate from, int sizeInDays) {
		this.from = from;
		this.sizeInDays = sizeInDays;
	}
	
	public DateLapse(LocalDate from, LocalDate to) {
		this.from = from;
		this.sizeInDays = (int) ChronoUnit.DAYS.between(from, to);;
	}
	
	public LocalDate getFrom() {
		return this.from;
	}
	public LocalDate getTo() {
		return this.from.plusDays(this.sizeInDays);
	}
	
	public int sizeInDays() {
		return this.sizeInDays;
	}
	
	public boolean includesDate(LocalDate other) {
		return (other.isBefore(this.getTo()) && other.isAfter(this.from)) || other.isEqual(this.from) || other.isEqual(this.getTo());
	}
}
