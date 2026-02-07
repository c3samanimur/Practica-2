package metodos;

public class persona {
	public String nombre;
	public String apellidos;
	public String dni;
	public String direccion;
	
	public String nombreCompleto() {
		return nombre + " " + apellidos;
	}
}
