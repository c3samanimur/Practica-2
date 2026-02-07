package Ejercicio1;

public class Titular {
	private String nombre;
	private String dni;
	private String telefono;
	private String email;
	
	public Titular(String nombre, String dni) {
		this.nombre = nombre;
		this.dni = dni;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		if(nombre.length() > 0) {
			this.nombre = nombre;
		}
	}
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		if(dni.length() == 9) {
			this.dni = dni;
		}
	}
	
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		if(telefono.length() >= 9) {
			this.telefono = telefono;
		}
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		if(email.length() > 0) {
			this.email = email;
		}
	}
}
