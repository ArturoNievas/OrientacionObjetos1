package ar.edu.info.unlp.ejercicio14;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DateLapseTest {

	private DateLapse d1;
	private DateLapse d2;
	private LocalDate date1;
	private LocalDate date2;
	private LocalDate date3;
	private LocalDate date4;
	private LocalDate date5;
	
	@BeforeEach
	public void setUp() {
		this.date1 = LocalDate.of(1998, 5, 9);
		this.date2 = LocalDate.of(2001,12,10);
		this.date3 = LocalDate.of(2002, 8, 5);
		this.date4 = LocalDate.of(1998, 3, 25);
		this.date5 = LocalDate.of(2018, 10, 4);
		this.d1 = new DateLapse(this.date1,this.date3);
		this.d2 = new DateLapse(this.date5,5000);
		System.out.print(this.d2.getTo());
	}

	@Test
	public void testDateLapse() {
		assertEquals(this.date1 , this.d1.getFrom());
		assertEquals(this.date3 , this.d1.getTo());
	}
	
	@Test
	public void testSizeInDays() {
		assertEquals(1549, this.d1.sizeInDays());
	}
	
	@Test
	public void testIncludesDate() {
		assertTrue(this.d1.includesDate(date2));
		assertFalse(this.d1.includesDate(date4));
	}
	
}
