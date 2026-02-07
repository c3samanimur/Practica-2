import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SesionTest {
	Sesion sesion = new Sesion();
	
	@Test
	void testTrue1() {
		boolean resultado = sesion.login("pepe", "654321");
		assertTrue(resultado);
	}
	
	@Test
	void testTrue2() {
		boolean resultado = sesion.login("dmunuera", "123456");
		assertTrue(resultado);
	}
	
	@Test
	void testFalse1() {
		boolean resultado = sesion.login("pep3", "654321");
		assertFalse(resultado);
	}
	
	@Test
	void testFalse2() {
		boolean resultado = sesion.login("maria", "null");
		assertFalse(resultado);
	}

}
