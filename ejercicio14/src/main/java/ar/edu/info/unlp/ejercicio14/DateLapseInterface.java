package ar.edu.info.unlp.ejercicio14;
import java.time.LocalDate;

public interface DateLapseInterface {
	
	int sizeInDays();
	
	boolean includesDate(LocalDate other);
}
