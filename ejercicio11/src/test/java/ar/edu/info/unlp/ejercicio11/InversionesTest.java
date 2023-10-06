package ar.edu.info.unlp.ejercicio11;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InversionesTest {
    protected Inversor inversor;
    protected PlazoFijo plazo1;
    protected PlazoFijo plazo2;
    protected InversionEnAcciones acciones1;

    private void initializeInversiones() {

    	inversor = new Inversor("Arturo");
    	plazo1 = new PlazoFijo (1000,0.25);
    	plazo2 = new PlazoFijo (1000,1);
    	acciones1 = new InversionEnAcciones (100);
    	acciones1.setValorUnitario(2);
    	inversor.agregarInversion(acciones1);
    	inversor.agregarInversion(plazo1);
    	inversor.agregarInversion(plazo2);
    }

    @BeforeEach
    void setUp() {
        this.initializeInversiones();
    }

    @Test
    void testValorActual() {
        assertEquals(inversor.valorActual(), 200 + 2000);
    }
}
