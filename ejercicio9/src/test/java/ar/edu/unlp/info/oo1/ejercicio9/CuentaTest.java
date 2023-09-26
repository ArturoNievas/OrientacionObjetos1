package ar.edu.unlp.info.oo1.ejercicio9;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CuentaTest {

	private CajaDeAhorro ca1, ca2;
	private CuentaCorriente cc1, cc2;

	@BeforeEach
	public void setUp() {
		ca1 = new CajaDeAhorro();
		ca2 = new CajaDeAhorro();

		cc1 = new CuentaCorriente();
		cc2 = new CuentaCorriente();
	}

	/**
	 * Pedido en las tareas del ejercicio, puede verse como iniciar el sistema.
	 */
	@Test
	public void testConstructor() {
		assertEquals(0d, this.ca1.getSaldo());
		assertEquals(0d, this.cc1.getSaldo());
		assertEquals(0d, this.cc1.getDescubierto());
	}

	/**
	 * Pedido en las tareas del ejercicio.
	 */
	@Test
	public void testDepositar() {
		ca1.depositar(100);
		cc1.depositar(200);

		assertEquals(98d, this.ca1.getSaldo());
		assertEquals(200d, this.cc1.getSaldo());
	}

	/**
	 * Pedido en las tareas del ejercicio.
	 */
	@Test
	public void testExtraer() {
		ca1.depositar(100);
		cc1.depositar(200);
		cc1.setDescubierto(100);

		assertFalse(this.ca1.extraer(100));
		assertEquals(98d, this.ca1.getSaldo());
		assertTrue(this.ca1.extraer(50));
		assertEquals(47d,this.ca1.getSaldo());

		assertFalse(this.cc1.extraer(400));
		assertEquals(200d, this.cc1.getSaldo());
		assertTrue(this.cc1.extraer(250));
		assertEquals(-50d,this.cc1.getSaldo());
	}

	/**
	 * Pedido en las tareas del ejercicio.
	 */
	@Test
	public void testTransferirACuenta() {
		ca1.depositar(100);
		ca2.depositar(1000);
		cc1.depositar(200);
		cc1.setDescubierto(100);
		cc2.depositar(2000);
		cc2.setDescubierto(1000);

		assertFalse(this.ca1.transferirACuenta(100, ca1));
		assertEquals(98d, this.ca1.getSaldo());
		assertEquals(980d, this.ca2.getSaldo());
		assertTrue(this.ca1.transferirACuenta(50, ca1));
		assertEquals(47d, this.ca1.getSaldo());
		assertEquals(1030d, this.ca2.getSaldo());

		assertFalse(this.cc1.transferirACuenta(400, cc2));
		assertEquals(200d, this.cc1.getSaldo());
		assertEquals(2000d, this.cc2.getSaldo());
		assertTrue(this.cc1.transferirACuenta(250, cc2));
		assertEquals(-50d, this.cc1.getSaldo());
		assertEquals(1250d, this.cc2.getSaldo());
	}

	/**
	 * Pedido en las tareas del ejercicio.
	 */
	@Test
	public void testTransferirACuentaDeCajaDeAhorroACuentaCorriente() {
		ca1.depositar(100);
		cc1.depositar(200);
		cc1.setDescubierto(100);

		assertTrue(this.ca1.transferirACuenta(50, cc1));
		assertEquals(47d, this.ca1.getSaldo());
		assertEquals(250d, this.cc1.getSaldo());
	}

	/**
	 * Pedido en las tareas del ejercicio.
	 */
	@Test
	public void testTransferirACuentaDeCuentaCorrienteACajaDeAhorro() {
		ca1.depositar(100);
		cc1.depositar(200);
		cc1.setDescubierto(100);

		assertTrue(this.cc1.transferirACuenta(250, ca1));
		assertEquals(343d, this.ca1.getSaldo());
		assertEquals(-50d, this.cc1.getSaldo());
	}

}