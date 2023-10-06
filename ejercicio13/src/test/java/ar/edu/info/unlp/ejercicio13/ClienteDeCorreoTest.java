package ar.edu.info.unlp.ejercicio13;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ClienteDeCorreoTest {

	private ClienteDeCorreo cliente;
	private ClienteDeCorreo cliente2;
	private Email email1;
	private Email email2;
	private Email email3;
	private Email email4;
	private Archivo a1;
	private Archivo a2;
	

	@BeforeEach
	public void setUp() {
		this.cliente = new ClienteDeCorreo();
		this.cliente2 = new ClienteDeCorreo();
		this.cliente.crearCarpeta("Notificaciones");
		this.email1 = new Email("Feliz cumpleaños","Hola Mabel tanto tiempo...");
		this.email2 = new Email("Renovacion cargo AADS","Buenas tardes...");
		this.a1 = new Archivo("Resolucion");
		this.a2 = new Archivo("abcde");
		this.email1.adjuntarArchivo(a1);
		this.email1.adjuntarArchivo(a2);
		this.email3 = new Email("Aafdsfv","Papas fritas...");
		this.email4 = new Email("zdgfcn","zdnxfgmxfghzdfhzd");
		this.cliente.recibir(email1);
		this.cliente.recibir(email2);
		this.cliente.recibir(email3);
		this.cliente.recibir(email4);
	}
	
	@Test
	public void testMover() {
		assertTrue(this.cliente.carpetaPorNombre("Notificaciones").getEmails().isEmpty());
		this.cliente.mover(email1, this.cliente.carpetaPorNombre("Inbox"), this.cliente.carpetaPorNombre("Notificaciones"));
		assertTrue(this.cliente.carpetaPorNombre("Notificaciones").getEmails().contains(email1));
	}
	
	@Test
	public void testBuscar() {
		assertEquals(this.cliente.buscar("cumple"),this.email1);
		assertEquals(this.cliente.buscar("..."),this.email1);
		assertEquals(this.cliente.buscar("frit"),this.email3);
		assertNull(this.cliente.buscar("zzzzzz"));
	}
	
	@Test
	public void testEspacioOcupado() {
		assertEquals(5,this.cliente2.espacioOcupado());
		assertEquals("InboxNotificacionesFeliz cumpleañosHola Mabel tanto tiempo...Renovacion cargo AADSBuenas tardes...ResolucionabcdeAafdsfvPapas fritas...zdgfcnzdnxfgmxfghzdfhzd".length(),this.cliente.espacioOcupado());
	}
	
	
}