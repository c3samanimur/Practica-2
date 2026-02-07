import java.util.Scanner;

public class Ejemplo1 {

	public static void main(String[] args) {
		Persona p1 = new Persona();

		p1.nombre = "Basilio";
		p1.apellidos = "Mateo Gabaldon";
		p1.dni = "58454479W";
		p1.fechaNac = "20/07/2007";

		System.out.println("Nombre completo: " + p1.nombre + " " + p1.apellidos);
		System.out.println("DNI: " + p1.dni);
		System.out.println("Fecha de nacimiento: " + p1.fechaNac);

	}

}

	class Persona {
		public String nombre;
		public String apellidos;
		public String dni;
		public String fechaNac;

}
