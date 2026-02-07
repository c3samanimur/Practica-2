package Classes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EstudianteTest {
	private Estudiante e1;
    private Estudiante e2;
    private Estudiante e3;
    
    @BeforeEach
    public void crearEstudiante() {
    	e1 = new Estudiante("Paco Nicolás", 19, 9);
    	e2 = new Estudiante("María Dolores", 25, 6);
    	e3 = new Estudiante("Basilio Mateo", 18, 4);
    }
    
    
	@Test
	void testGetNombre() {
		assertEquals("Paco Nicolás", e1.getNombre());
		assertEquals("María Dolores", e2.getNombre());
		assertEquals("Basilio Mateo", e3.getNombre());
	}
	
	@Test
	void testGetEdad() {
		assertEquals(19, e1.getEdad());
		assertEquals(25, e2.getEdad());
		assertEquals(18, e3.getEdad());
	}
	
	@Test
	void testGetNota() {
		assertEquals(9, e1.getNota());
		assertEquals(6, e2.getNota());
		assertEquals(4, e3.getNota());
	}
	
	@Test
	void obtenerEstadoAcademico() {
		assertEquals("Sobresaliente", e1.obtenerEstadoAcademico());
		assertEquals("Aprobado", e2.obtenerEstadoAcademico());
		assertEquals("Suspenso", e3.obtenerEstadoAcademico());
	}
	
	
	
	

}
