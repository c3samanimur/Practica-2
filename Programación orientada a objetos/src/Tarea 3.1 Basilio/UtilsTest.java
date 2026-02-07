import static org.junit.Assert.*;

import org.junit.Test;

public class UtilsTest {

	@Test
	public void pruebaTipoTruangulo() {
		assertEquals("EQUILATERO", Utils.tipoTriangulo(5, 5, 5));
		
		assertEquals("ERROR", Utils.tipoTriangulo(1, 1, 100));
		
		assertEquals("ISOSCELES", Utils.tipoTriangulo(5, 5, 6));
		
		assertEquals("ESCALENO", Utils.tipoTriangulo(4, 5, 6));
		
	}

	
	@Test
	public void pruebaMasFrecuenteInt() {
		int[] numeros = {4,1,1,4,2,3,4,4,1,2,4,9,4,7,1};
		
		int resultado = Utils.masFrecuenteInt(numeros);
		assertEquals(4, resultado);
	}
	@Test
	public void pruebaBuscarInt() {
	    int[] datos = {1, 20, 30, 40};
	    
	    
	    assertEquals(2, Utils.buscarInt(datos, 30));
	    
	    assertEquals(-1, Utils.buscarInt(datos, 99));
	}

}
