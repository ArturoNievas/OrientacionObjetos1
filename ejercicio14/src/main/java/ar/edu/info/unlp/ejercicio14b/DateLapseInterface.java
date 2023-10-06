package ar.edu.info.unlp.ejercicio14b;
import java.time.LocalDate;

public interface DateLapseInterface {
	
	int sizeInDays();
	
	boolean includesDate(LocalDate other);
}
