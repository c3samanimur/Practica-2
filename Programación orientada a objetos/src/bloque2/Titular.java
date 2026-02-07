package bloque2;

public class Titular {
	private String nombre;
	private String dni;
	private String telefono;
	private String email;
	

	public Titular(String nombre, String dni, String telefono, String email) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.telefono = telefono;
		this.email = email;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String toString() {
		return nombre +  " (" + dni + ") ";
	}

	
	
	
	
	
}
